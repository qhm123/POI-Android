package com.libsvg;

/**
 * 
 * @author Pavel.B.Chernov (based on ideas of kushnarev)
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.util.EncodingUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.widget.ImageView;

import com.poi.poiandroid.R;

/**
 * A Drawable that wraps an Svg image and can be stretched or aligned. You can create a
 * SvgDrawable from a file path, an input stream, through XML inflation.
 * <p>It can be defined in an XML file with the <code>&lt;com.libsvg.SvgDrawable></code> element.</p>
 * <p>
 * Also see the {@link com.libsvg.SvgImageView} class, which cares about loading and operating 
 *  with svg graphics inside view container.
 * </p>
 *
 * @attr ref android.R.styleable#SvgDrawable_src
 * @attr ref android.R.styleable#SvgDrawable_antialias
 * @attr ref android.R.styleable#SvgDrawable_filter
 * @attr ref android.R.styleable#SvgDrawable_dither
 * @attr ref android.R.styleable#SvgDrawable_gravity
 */
public class SvgDrawable extends Drawable {
    private static final int DEFAULT_PAINT_FLAGS = Paint.FILTER_BITMAP_FLAG | Paint.DITHER_FLAG;

    // Load native libraries
	static {
		System.loadLibrary("svgandroid");
	}    

    // libsvg-android rasterizer id
    private long mSvgId;    	
    private Bitmap mBitmap;

    private int mGravity = Gravity.FILL;
    private Paint mPaint = new Paint(DEFAULT_PAINT_FLAGS);

    // These are scaled to match the target density.
    private int mWidth = -1;
    private int mHeight = -1;
    private double mOriginalAspectRatio = 1.0;
    private final Rect mDstRect = new Rect();   // Gravity.apply() sets this
    private boolean mApplyGravity;
    private ImageView.ScaleType mScaleType = ImageView.ScaleType.FIT_CENTER; 
    
    // TODO
    // Native libsvgandroid SHOULD USE this value to calculate width and height in pixels
    // Because size in SVG image can be written in mm, cm, inches, feets ....
    private float mRealDPI = 0;

    /**
     * Creates a new SvgDrawable object and loads SVG by resource ID
     */
    static public SvgDrawable getDrawable(Resources res, int id) {
        InputStream inStream = res.openRawResource(id);
    	if (inStream == null) {
    		return null;
    	}

    	SvgDrawable obj = new SvgDrawable(res, inStream);
    	return obj;
    }

    /**
     * Create an empty drawable, not dealing with density.
     * @deprecated Use {@link #SvgDrawable(Resources)} to ensure
     * that the drawable has correctly set its target density.
     */
    @Deprecated
    public SvgDrawable() {
    }

    /**
     * Create an empty drawable.
     */
    public SvgDrawable(Resources res) {
        if (res != null) {
        	mRealDPI = (res.getDisplayMetrics().xdpi + res.getDisplayMetrics().ydpi) / 2;
        }
    }

    /**
     * Create a drawable by opening a given file path and decoding the SVG.
     * @throws FileNotFoundException 
     * @deprecated Use {@link #SvgDrawable(Resources, String)} to ensure
     * that the drawable has correctly set its target density.
     */
    @Deprecated
    public SvgDrawable(String filepath) throws FileNotFoundException {
    	FileInputStream f = new FileInputStream(filepath);
    	LoadSvg(null, f);
    }

    /**
     * Create a drawable by opening a given file path and decoding the bitmap.
     * @throws FileNotFoundException 
     */
    public SvgDrawable(Resources res, String filepath) throws FileNotFoundException {
    	FileInputStream f = new FileInputStream(filepath);
    	LoadSvg(res, f);
    }

    /**
     * Create a drawable by decoding SVG from the given input stream.
     * @deprecated Use {@link #SvgDrawable(Resources, java.io.InputStream)} to ensure
     * that the drawable has correctly set its target density.
     */
    @Deprecated
    public SvgDrawable(java.io.InputStream is) {
        LoadSvg(null, is);
    }

    /**
     * Create a drawable by decoding a bitmap from the given input stream.
     */
    public SvgDrawable(Resources res, java.io.InputStream is) {
    	LoadSvg(res, is);
    }
    
    /**
     * Decodes a drawable from the given input stream.
     */
    public boolean LoadSvg(Resources res, java.io.InputStream is) {
    	try {
            if (res != null) {
                // TODO
            	mRealDPI = (res.getDisplayMetrics().xdpi + res.getDisplayMetrics().ydpi) / 2;
            }

            // Read into the buffer
            if (is != null) {
		    	byte[] buffer = new byte[is.available()];
		    	is.read(buffer);
		    	is.close();
		
		    	// And make a string
		    	String content = EncodingUtils.getString(buffer, "UTF-8");
		    	buffer = null;
		
		    	// Parse it
		    	mSvgId = SvgRaster.svgAndroidCreate();
		    	if (SvgRaster.svgAndroidParseBuffer(mSvgId, content) != 0) {
		    		android.util.Log.w("SvgDrawable", "SvgDrawable cannot decode " + is);
		    	}
	
		    	SvgRaster.svgAndroidSetAntialiasing(mSvgId, true);
		
				mWidth = SvgRaster.svgAndroidGetWidth(mSvgId);
				mHeight = SvgRaster.svgAndroidGetHeight(mSvgId);
				mOriginalAspectRatio = ((double)mWidth) / ((double)mHeight); 
				return true;
            }
	    }
	    catch (IOException e) {
	    	e.printStackTrace();
	    }                	
    	return false;
    }

    public final Paint getPaint() {
        return mPaint;
    }
    
    public final Bitmap getBitmap() {
        return mBitmap;
    }

    /** Get the gravity used to position/stretch the bitmap within its bounds.
     * See android.view.Gravity
     * @return the gravity applied to the bitmap
     */
    public int getGravity() {
        return mGravity;
    }
    
    /** Set the gravity used to position/stretch the bitmap within its bounds.
        See android.view.Gravity
     * @param gravity the gravity
     */
    public void setGravity(int gravity) {
        mApplyGravity = (mGravity != gravity);
        mGravity = gravity;
    }

	public void setAntiAlias(boolean aa) {
		com.libsvg.SvgRaster.svgAndroidSetAntialiasing(mSvgId, aa);
    }
    
    @Override
    public void setFilterBitmap(boolean filter) {
        mPaint.setFilterBitmap(filter);
    }

    @Override
    public void setDither(boolean dither) {
        mPaint.setDither(dither);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    	mScaleType = scaleType;
    	invalidateSelf();
    }

	/*
	 * This is essential for correct transformation of SVG image
	 * It is called from SvgImageView.onSizeChanged , .setImageDrawable, .setScaleType
	 * Actual processing of scaleType is in private void ImageView.configureBounds()
	 * But this procedure is called before that.
	 * So we can adopt our width and height respectively to scaleType
	 */

    public void adjustToParentSize(int vWidth, int vHeight) {
	   	// Reload original width and height
		mWidth = SvgRaster.svgAndroidGetWidth(mSvgId);
		mHeight = SvgRaster.svgAndroidGetHeight(mSvgId);

		switch (mScaleType) {
		case FIT_XY:
			mWidth = vWidth;
			mHeight = vHeight;
			break;
		case CENTER: // No scaling
			break;
		case CENTER_CROP: // Scale so that both width and height of the image will be equal to or larger than view
			if (mWidth * vHeight > vWidth * mHeight) {
				mHeight = vHeight;
				mWidth = (int)(((double)mHeight) * mOriginalAspectRatio);
			}
			else {
				mWidth = vWidth;
				mHeight = (int)(((double)mWidth) / mOriginalAspectRatio);
			}
			break;
		case CENTER_INSIDE: // No scale if image fits, otherwise - scale to fit whole image
			if (mWidth <= vWidth && mHeight <= vHeight) {
				break;
			}
			if (vWidth < vHeight) {
				mWidth = vWidth;
				mHeight = (int)(((double)mWidth) / mOriginalAspectRatio);
			}
			else {
				mHeight = vHeight;
				mWidth = (int)(((double)mHeight) * mOriginalAspectRatio);
			}
			break;
		case FIT_CENTER: // Scale so that both width and height of the image will be equal to or lesser than view
		case FIT_START: // Scale like FIT_CENTER but place bitmap in top left corner
		case FIT_END: // Scale like FIT_CENTER but place bitmap in bottom right corner
		default:
			if (vWidth < vHeight) {
				mWidth = vWidth;
				mHeight = (int)(((double)mWidth) / mOriginalAspectRatio);
			}
			else {
				mHeight = vHeight;
				mWidth = (int)(((double)mHeight) * mOriginalAspectRatio);
			}
			break;
		}
    }

	/*
	 * When bounds do change we should render the Bitmap from SVG image
	 * You should notice that at this moment we have only two cases for mScaleType:
	 *  1. when we should render image disturbing original aspect ratio
	 *  2. when we should render image with respect of original aspect ration 
	 * All other processing of scaleType was done before in private void ImageView.configureBounds()
	 */
    
	@Override 
	protected void onBoundsChange(Rect bounds) {
		super.onBoundsChange(bounds);
		if (bounds == null || bounds.width() <= 0 || bounds.height() <= 0) {
			return;
		}
        mApplyGravity = true;

		// Create the bitmap to raster svg to
		Canvas canvas = new Canvas();
		mBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
		canvas.setBitmap(mBitmap);
		// Render SVG with use of libandroidsvg
		switch (mScaleType) {
		case FIT_XY:
			SvgRaster.svgAndroidRenderToArea(mSvgId, canvas, 0, 0,
					canvas.getWidth(), canvas.getHeight());
			break;
		case CENTER: // No scaling
		case CENTER_INSIDE: // No scale if image fits, otherwise - scale to fit whole image
		case CENTER_CROP: // Scale so that both width and height of the image will be equal to or larger than view
		case FIT_CENTER: // Scale so that both width and height of the image will be equal to or lesser than view
		case FIT_START: // Scale like FIT_CENTER but place bitmap in top left corner
		case FIT_END: // Scale like FIT_CENTER but place bitmap in bottom right corner
		default:
			SvgRaster.svgAndroidRenderToAreaUniform(mSvgId, canvas, 0, 0,
					canvas.getWidth(), canvas.getHeight());
			break;
		}
	}

    @Override
    public void draw(Canvas canvas) {
       	if (mApplyGravity) {
       		Gravity.apply(mGravity, mWidth, mHeight, getBounds(), mDstRect);
       		mApplyGravity = false;
       	}
       	Log.d("SVG", "mBitmap: " + mBitmap);
        if (mBitmap == null) {
        	return;
        }
       	canvas.drawBitmap(mBitmap, null, mDstRect, mPaint);
       	
    }

    @Override
    public void setAlpha(int alpha) {
        mPaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        mPaint.setColorFilter(cf);
    }

    @Override
    public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs)
            throws XmlPullParserException, IOException {
        super.inflate(r, parser, attrs);

        TypedArray a = r.obtainAttributes(attrs, R.styleable.SvgDrawable);

        // Getting a file name
        CharSequence cs = a.getText(R.styleable.SvgDrawable_android_src);
        String file = cs.toString();

        // Is it SVG file?
        if (! file.endsWith(".svg")) {
            throw new XmlPullParserException(parser.getPositionDescription() +
            	": <svg> not .svg file as source");
        }

        final int id = a.getResourceId(R.styleable.SvgDrawable_android_src, 0);
        if (id == 0) {
            throw new XmlPullParserException(parser.getPositionDescription() +
                    ": <svg> requires a valid src attribute");
        }

        InputStream inStream = r.openRawResource(id);
    	if (inStream == null) {
    		return;
    	}

    	LoadSvg(null, inStream);
    	
        mPaint.setAntiAlias(a.getBoolean(R.styleable.SvgDrawable_android_antialias,
        		mPaint.isAntiAlias()));
        mPaint.setFilterBitmap(a.getBoolean(R.styleable.SvgDrawable_android_filter,
        		mPaint.isFilterBitmap()));
        mPaint.setDither(a.getBoolean(R.styleable.SvgDrawable_android_dither,
        		mPaint.isDither()));
        setGravity(a.getInt(R.styleable.SvgDrawable_android_gravity, Gravity.FILL));

        a.recycle();
    }

    @Override
    public int getIntrinsicWidth() {
        return mWidth;
    }

    @Override
    public int getIntrinsicHeight() {
        return mHeight;
    }

    @Override
    public int getOpacity() {
        return (mBitmap == null || mBitmap.hasAlpha() || mPaint.getAlpha() < 255) ?
                PixelFormat.TRANSLUCENT : PixelFormat.OPAQUE;
    }

    @Override
	public void finalize() throws Throwable{
		SvgRaster.svgAndroidDestroy(mSvgId);
		super.finalize();
	}
}
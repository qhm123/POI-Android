package com.libsvg;

import java.io.InputStream;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.poi.poiandroid.R;

/**
 * 
 * @author Pavel.B.Chernov - some improvements
 * @author kushnarev - original idea
 *
 */

/**
 * Image View class with SVG format support
 */
public class SvgImageView extends ImageView {
    // Load native libraries
	static {
		System.loadLibrary("svgandroid");
	}    

	private boolean mIsSvg = false;
	
    public SvgImageView(Context context) {
        super(context);
    }
    
    public SvgImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }	
 
	public SvgImageView(Context context, AttributeSet attrs, int defStyle) {
		// Let's try load supported by ImageView formats
		super(context, attrs, defStyle);
        
        if (getDrawable() != null) {
        	return;
        }
        //  Get defined attributes
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SvgImageView, defStyle, 0);

        // Getting a file name
        CharSequence cs = a.getText(R.styleable.SvgImageView_android_src);
        String file = cs.toString();

        // Is it SVG file?
        if (! file.endsWith(".svg")) {
        	return;
        }

        // Retrieve ID of the resource
        int id = a.getResourceId(R.styleable.SvgImageView_android_src, -1);
        if (id == -1 || id == 0) {
        	return;
        }

        // Get the input stream for the raw resource
        InputStream inStream = getResources().openRawResource(id);
        if (inStream == null) {
        	return;
        }

        SvgDrawable svg = new SvgDrawable(getResources(), inStream);
        if (svg == null) {
        	return;
        }
        mIsSvg = true;

		svg.setScaleType(this.getScaleType());
        int vWidth = getWidth() - getPaddingLeft() - getPaddingRight();
        int vHeight = getHeight() - getPaddingTop() - getPaddingBottom();
		svg.adjustToParentSize(vWidth, vHeight);
        
        this.setImageDrawable(svg);
	}   

	@Override
	public void setScaleType (ImageView.ScaleType scaleType) {
		super.setScaleType(scaleType);
		if (! mIsSvg) {
			return;
		}
		SvgDrawable svg = (SvgDrawable) getDrawable(); 
		// FIXME
		// We use dirty hack here, to avoid scalings of bitmaps
		// Let SVG scale itself!
		super.setImageDrawable(null);
        svg.setScaleType(scaleType);
        int vWidth = getWidth() - getPaddingLeft() - getPaddingRight();
        int vHeight = getHeight() - getPaddingTop() - getPaddingBottom();
        svg.adjustToParentSize(vWidth, vHeight);
        super.setImageDrawable(svg);
	}
	
	@Override
	public void setImageDrawable(Drawable drawable) {
		if (! (drawable instanceof SvgDrawable)) {
			super.setImageDrawable(drawable);
			mIsSvg = false;
			return;
		}
		if (getDrawable() == drawable) {
			return;
		}
		SvgDrawable svg = (SvgDrawable) drawable;
		svg.setScaleType(this.getScaleType());
        int vWidth = getWidth() - getPaddingLeft() - getPaddingRight();
        int vHeight = getHeight() - getPaddingTop() - getPaddingBottom();
		svg.adjustToParentSize(vWidth, vHeight);
		super.setImageDrawable(svg);
		mIsSvg = true;
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		if (! mIsSvg)
			return;
		SvgDrawable svg = (SvgDrawable) getDrawable(); 
		// FIXME
		// We use dirty hack here, to avoid scalings of bitmaps
		// Let SVG scale itself!
		super.setImageDrawable(null);
        int vWidth = getWidth() - getPaddingLeft() - getPaddingRight();
        int vHeight = getHeight() - getPaddingTop() - getPaddingBottom();
        svg.adjustToParentSize(vWidth, vHeight);
        super.setImageDrawable(svg);
	}
	
}

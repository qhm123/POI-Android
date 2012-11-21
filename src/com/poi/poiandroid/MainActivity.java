package com.poi.poiandroid;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.pbdavey.awt.Graphics2D;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

import and.awt.Dimension;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getSimpleName();

	ViewPager mViewPager;
	PagerAdapter mPagerAdapter;
	
	private GestureDetector mGestureDetector;
	private ScaleGestureDetector mScaleGestureDetector;

	private boolean mPaused;
	private boolean mOnScale = false;
	private boolean mOnPagerScoll = false;
	private boolean mControlsShow = false;
	private int mPosition;
	
	private ProgressDialog mProgressDialog;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_PROGRESS);
		
		setContentView(R.layout.activity_main);
		
		setProgressBarVisibility(true);
		setProgressBarIndeterminate(true);
//		setProgressBarIndeterminateVisibility(true);

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setPageMargin(10);
		mViewPager.setPageMarginDrawable(new ColorDrawable(Color.BLACK));
		mViewPager.setOffscreenPageLimit(1);
		mViewPager.setOnPageChangeListener(mPageChangeListener);
		setupOnTouchListeners(mViewPager);

		Logger.getLogger("org.teleal.cling").setLevel(Level.FINEST);

		String path = "/sdcard/socket.ppt";
		Intent i = getIntent();
		if (i != null) {
			Uri uri = i.getData();
			if (uri != null) {
				Log.d(TAG, "uri.getPath: " + uri.getPath());
				path = uri.getPath();
			}
		}
		
		mProgressDialog = new ProgressDialog(this);
		mProgressDialog.setIndeterminate(true);
		
		try {
			ppt2png(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	HashMap<Integer, View> mCache = new HashMap<Integer, View>();
	
	public View getView(int position) {
		return mCache.get(position);
	}
	
	int slideCount = 0;
	Slide[] slide;
	SlideShow ppt;

	private void ppt2png(String path) throws IOException {
//		FileInputStream is = new FileInputStream(path);
//		SlideShow ppt = new SlideShow(is);
//		is.close();
		
		final long cur = System.currentTimeMillis();
		
		mProgressDialog.show();
		
		ppt = new SlideShow(new File(path));

		final Dimension pgsize = ppt.getPageSize();

		slide = ppt.getSlides();
		
		slideCount = slide.length;
		
		Log.d("TIME", "new SlideShow: " + (System.currentTimeMillis() - cur));
		
		mProgressDialog.dismiss();
		
		final ExecutorService es = Executors.newSingleThreadExecutor();
		
		final Handler handler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				super.handleMessage(msg);
				if (mViewPager == null) {
					return;
				}
				switch (msg.what) {
				case 0: {
					Log.d(TAG, "draw finish");
					View v = (View) msg.obj;
					v.invalidate();
					int position = msg.arg1;
					if (position == mViewPager.getCurrentItem()) {
//						setProgressBarVisibility(false);
						setProgress(10000);
					}
				}
					break;
				case 1: {
					int progress = msg.arg1;
					int max = msg.arg2;
					int p = (int) ((float)progress / max * 10000);
					int position = (Integer) msg.obj;
					Log.d(TAG, "update progress: " + progress + ", max: " + max
							+ ", p: " + p + ", position: " + position);
					if (position == 1) {
						setProgressBarIndeterminate(false);
					}
					if (position == mViewPager.getCurrentItem()) {
						if (position != 0 && progress == 0) {
							setProgressBarIndeterminate(false);
						}
						setProgress(p);
					}
				}
					break;
				default:
					break;
				}
			}
		};

		mPagerAdapter = new PagerAdapter() {

			@Override
			public boolean isViewFromObject(View view, Object object) {
				return view == ((ImageView) object);
			}

			@Override
			public int getCount() {
				return slide.length;
			}

			@Override
			public void startUpdate(View container) {
			}

			@Override
			public Object instantiateItem(View container, final int position) {
//				ImageView imageView = new ImageView(MainActivity.this);
//				imageView.setLayoutParams(new LayoutParams(
//						LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
				
				
				
				if (position == mViewPager.getCurrentItem()) {
//					setProgressBarVisibility(true);
					setProgressBarIndeterminate(true);
				}
				
				final ImageViewTouch imageView = new ImageViewTouch(
						MainActivity.this);
				imageView.setLayoutParams(new LayoutParams(
						LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
				imageView.setBackgroundColor(Color.BLACK);
				imageView.setFocusableInTouchMode(true);

				String title = slide[position].getTitle();
				System.out.println("Rendering slide " + (position + 1)
						+ (title == null ? "" : ": " + title));
				System.out.println("pgsize.width: " + pgsize.getWidth()
						+ ", pgsize.height: " + pgsize.getHeight());

				Bitmap bmp = Bitmap.createBitmap((int) pgsize.getWidth(),
						(int) pgsize.getHeight(), Config.RGB_565);
				Canvas canvas = new Canvas(bmp);
				Paint paint = new Paint();
				paint.setColor(android.graphics.Color.WHITE);
				paint.setFlags(Paint.ANTI_ALIAS_FLAG);
				canvas.drawPaint(paint);

				final Graphics2D graphics2d = new Graphics2D(canvas);
				
				final AtomicBoolean isCanceled = new AtomicBoolean(false);
				// render
				Runnable runnable = new Runnable() {
					@Override
					public void run() {
						slide[position].draw(graphics2d, isCanceled, handler, position);
						
						handler.sendMessage(Message.obtain(handler, 0, position, 0, imageView));
					}
				};
				
				Future<?> task = es.submit(runnable);
				imageView.setTag(task);
				imageView.setIsCanceled(isCanceled);
				
//				try {
//					task.get();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				} catch (ExecutionException e) {
//					e.printStackTrace();
//				}
				

//				imageView.setImageBitmap(bmp);
				imageView.setImageBitmapResetBase(bmp, true);

				((ViewGroup) container).addView(imageView);
				
				mCache.put(position, imageView);

				// return super.instantiateItem(container, position);
				return imageView;
			}

			@Override
			public void destroyItem(View container, int position, Object object) {
				ImageViewTouch view = (ImageViewTouch) object;
				
				view.getCanceled().set(true);
				Future<?> task = (Future<?>) view.getTag();
				task.cancel(false);

				((ViewGroup) container).removeView(view);

				BitmapDrawable bitmapDrawable = (BitmapDrawable) view
						.getDrawable();
				if (!bitmapDrawable.getBitmap().isRecycled()) {
					bitmapDrawable.getBitmap().recycle();
				}
				
				mCache.remove(position);
			}

			@Override
			public void finishUpdate(View container) {
			}

			@Override
			public Parcelable saveState() {
				return null;
			}

			@Override
			public void restoreState(Parcelable state, ClassLoader loader) {
			}
		};

		mViewPager.setAdapter(mPagerAdapter);
	}
	
	Toast mPreToast;
	
	ViewPager.OnPageChangeListener mPageChangeListener = new ViewPager.OnPageChangeListener() {
		@Override
		public void onPageSelected(int position, int prePosition) {
			ImageViewTouch preImageView = 
					(ImageViewTouch) getView(prePosition);
			if (preImageView != null) {
				preImageView.setImageBitmapResetBase(
						preImageView.mBitmapDisplayed.getBitmap(), true);
			}

			if (getCurrentImageView() != null
					&& getCurrentImageView().mBitmapDisplayed != null
					&& getCurrentImageView().mBitmapDisplayed.getBitmap() == null) {
			}

			mPosition = position;

//			updateZoomButtonsEnabled();
//			updateShowInfo();

//			if (mPreToast != null) {
//				mPreToast.cancel();
//			}
			Log.d(TAG, "onPageSelected: " + position);
			if (mPreToast == null) {
				mPreToast = Toast.makeText(MainActivity.this,
						String.format("%d/%d", position + 1, slideCount),
						Toast.LENGTH_SHORT);
			} else {
				mPreToast.cancel();
				mPreToast.setText(String.format("%d/%d", position + 1, slideCount));
				mPreToast.setDuration(Toast.LENGTH_SHORT);
			}
			mPreToast.show();
		}

		@Override
		public void onPageScrolled(int position, float positionOffset,
				int positionOffsetPixels) {
			// Logger.d(TAG, "onPageScrolled");
			mOnPagerScoll = true;
		}

		@Override
		public void onPageScrollStateChanged(int state) {
			// Logger.d(TAG, "onPageScrollStateChanged: " + state);
			if (state == ViewPager.SCROLL_STATE_DRAGGING) {
				mOnPagerScoll = true;
			} else if (state == ViewPager.SCROLL_STATE_SETTLING) {
				mOnPagerScoll = false;
			} else {
				mOnPagerScoll = false;
			}
		}
		
	};
	
	public ImageViewTouch getCurrentImageView() {
//		return (ImageViewTouch) mViewPager.getChildAt(mViewPager
//				.getCurrentItem());
		return (ImageViewTouch) getView(mViewPager.getCurrentItem());
	}

	private class MyGestureListener extends
			GestureDetector.SimpleOnGestureListener {

		@Override
		public boolean onScroll(MotionEvent e1, MotionEvent e2,
				float distanceX, float distanceY) {
			// Logger.d(TAG, "gesture onScroll");
			if (mOnScale) {
				return true;
			}
			if (mPaused) {
				return false;
			}
			ImageViewTouch imageView = getCurrentImageView();
			if (imageView != null) {
				imageView.panBy(-distanceX, -distanceY);
	
				// 超出边界效果去掉这个
				imageView.center(true, true);
			}

			return true;
		}

		@Override
		public boolean onSingleTapConfirmed(MotionEvent e) {
			if (mControlsShow) {
				// delayHideControls();
//				hideControls();
			} else {
//				updateZoomButtonsEnabled();

//				if (fromLocalFav) {
//					showControls();
//				}
			}

			return true;
		}

		@Override
		public boolean onDoubleTap(MotionEvent e) {
			if (mPaused) {
				return false;
			}
			ImageViewTouch imageView = getCurrentImageView();
			// Switch between the original scale and 3x scale.
			if (imageView.mBaseZoom < 1) {
				if (imageView.getScale() > 2F) {
					imageView.zoomTo(1f);
				} else {
					imageView.zoomToPoint(3f, e.getX(), e.getY());
				}
			} else {
				if (imageView.getScale() > (imageView.mMinZoom + imageView.mMaxZoom) / 2f) {
					imageView.zoomTo(imageView.mMinZoom);
				} else {
					imageView.zoomToPoint(imageView.mMaxZoom, e.getX(),
							e.getY());
				}
			}

//			updateZoomButtonsEnabled();
			return true;
		}
	}

	private class MyOnScaleGestureListener extends
			ScaleGestureDetector.SimpleOnScaleGestureListener {

		float currentScale;
		float currentMiddleX;
		float currentMiddleY;

		@Override
		public void onScaleEnd(ScaleGestureDetector detector) {

//			updateZoomButtonsEnabled();

			final ImageViewTouch imageView = getCurrentImageView();

			Log.d(TAG, "currentScale: " + currentScale + ", maxZoom: "
					+ imageView.mMaxZoom);
			if (currentScale > imageView.mMaxZoom) {
				imageView
						.zoomToNoCenterWithAni(currentScale
								/ imageView.mMaxZoom, 1, currentMiddleX,
								currentMiddleY);
				currentScale = imageView.mMaxZoom;
				imageView.zoomToNoCenterValue(currentScale, currentMiddleX,
						currentMiddleY);
			} else if (currentScale < imageView.mMinZoom) {
//				imageView.zoomToNoCenterWithAni(currentScale,
//						imageView.mMinZoom, currentMiddleX, currentMiddleY);
				currentScale = imageView.mMinZoom;
				imageView.zoomToNoCenterValue(currentScale, currentMiddleX,
						currentMiddleY);
			} else {
				imageView.zoomToNoCenter(currentScale, currentMiddleX,
						currentMiddleY);
			}

			imageView.center(true, true);

			// NOTE: 延迟修正缩放后可能移动问题
			imageView.postDelayed(new Runnable() {
				@Override
				public void run() {
					mOnScale = false;
				}
			}, 300);
			// Logger.d(TAG, "gesture onScaleEnd");
		}

		@Override
		public boolean onScaleBegin(ScaleGestureDetector detector) {
			// Logger.d(TAG, "gesture onScaleStart");
			mOnScale = true;
			return true;
		}

		@Override
		public boolean onScale(ScaleGestureDetector detector, float mx, float my) {
			// Logger.d(TAG, "gesture onScale");
			ImageViewTouch imageView = getCurrentImageView();
			float ns = imageView.getScale() * detector.getScaleFactor();

			currentScale = ns;
			currentMiddleX = mx;
			currentMiddleY = my;

			if (detector.isInProgress()) {
				imageView.zoomToNoCenter(ns, mx, my);
			}
			return true;
		}
	}
	
	@Override
	public boolean dispatchTouchEvent(MotionEvent m) {
		if (mPaused)
			return true;
		// delayHideControls();
		return super.dispatchTouchEvent(m);
	}
	
	private void setupOnTouchListeners(View rootView) {
		mGestureDetector = new GestureDetector(this, new MyGestureListener(),
				null, true);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1) {
			mScaleGestureDetector = new ScaleGestureDetector(this,
					new MyOnScaleGestureListener());
		}

		OnTouchListener rootListener = new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				// NOTE: gestureDetector may handle onScroll..
				if (!mOnScale) {
					if (!mOnPagerScoll) {
						try {
							mGestureDetector.onTouchEvent(event);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1) {
					if (!mOnPagerScoll) {
						mScaleGestureDetector.onTouchEvent(event);
					}
				}

				ImageViewTouch imageView = getCurrentImageView();
				if (!mOnScale && imageView != null
						&& imageView.mBitmapDisplayed != null
						&& imageView.mBitmapDisplayed.getBitmap() != null) {
					Matrix m = imageView.getImageViewMatrix();
					RectF rect = new RectF(0, 0, imageView.mBitmapDisplayed
							.getBitmap().getWidth(), imageView.mBitmapDisplayed
							.getBitmap().getHeight());
					m.mapRect(rect);
					// Logger.d(TAG, "rect.right: " + rect.right +
					// ", rect.left: "
					// + rect.left + ", imageView.getWidth(): "
					// + imageView.getWidth());
					// 图片超出屏幕范围后移动
					if (!(rect.right > imageView.getWidth() + 0.1 && rect.left < -0.1)) {
						try {
							mViewPager.onTouchEvent(event);
						} catch (Exception e) {
							// why?
							e.printStackTrace();
						}
					}
				}

				// We do not use the return value of
				// mGestureDetector.onTouchEvent because we will not receive
				// the "up" event if we return false for the "down" event.
				return true;
			}
		};

		rootView.setOnTouchListener(rootListener);
	}
	

	@Override
	public void onStart() {
		super.onStart();
		mPaused = false;
	}

	@Override
	public void onStop() {
		super.onStop();
		mPaused = true;
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		ImageViewTouch imageView = getCurrentImageView();
		if (imageView != null) {
			imageView.mBitmapDisplayed.recycle();
			imageView.clear();
		}
		
		ppt = null;
		slide = null;
		mPagerAdapter = null;
		mViewPager = null;
	}
}

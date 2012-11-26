/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qhm123.slide;

import java.util.concurrent.atomic.AtomicBoolean;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.ImageView;

public class ImageViewTouch extends ImageView {

	@SuppressWarnings("unused")
	private static final String TAG = "ImageViewTouchBase";

	// This is the base transformation which is used to show the image
	// initially. The current computation for this shows the image in
	// it's entirety, letterboxing as needed. One could choose to
	// show the image as cropped instead.
	//
	// This matrix is recomputed when we go from the thumbnail image to
	// the full size image.
	protected Matrix mBaseMatrix = new Matrix();

	// This is the supplementary transformation which reflects what
	// the user has done in terms of zooming and panning.
	//
	// This matrix remains the same when we go from the thumbnail image
	// to the full size image.
	protected Matrix mSuppMatrix = new Matrix();

	// This is the final matrix which is computed as the concatentation
	// of the base matrix and the supplementary matrix.
	protected final Matrix mDisplayMatrix = new Matrix();

	// Temporary buffer used for getting the values out of a matrix.
	private final float[] mMatrixValues = new float[9];

	// The current bitmap being displayed.
	public final RotateBitmap mBitmapDisplayed = new RotateBitmap(null);

	int mThisWidth = -1, mThisHeight = -1;

	public float mMaxZoom;
	public float mMinZoom;
	public float mBaseZoom;
	
	// ImageViewTouchBase will pass a Bitmap to the Recycler if it has finished
	// its use of that Bitmap.
	public interface Recycler {
		public void recycle(Bitmap b);
	}

	public void setRecycler(Recycler r) {
		mRecycler = r;
	}

	private Recycler mRecycler;

	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		super.onLayout(changed, left, top, right, bottom);
		mThisWidth = right - left;
		mThisHeight = bottom - top;
		Runnable r = mOnLayoutRunnable;
		if (r != null) {
			mOnLayoutRunnable = null;
			r.run();
		}
		if (mBitmapDisplayed.getBitmap() != null) {
			getProperBaseMatrix(mBitmapDisplayed, mBaseMatrix);
			setImageMatrix(getImageViewMatrix());
		}
	}

	// @Override
	// public boolean onKeyDown(int keyCode, KeyEvent event) {
	// if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	// event.startTracking();
	// return true;
	// }
	// return super.onKeyDown(keyCode, event);
	// }
	//
	// @Override
	// public boolean onKeyUp(int keyCode, KeyEvent event) {
	// if (keyCode == KeyEvent.KEYCODE_BACK && event.isTracking()
	// && !event.isCanceled()) {
	// if (getScale() > 1.0f) {
	// // If we're zoomed in, pressing Back jumps out to show the
	// // entire image, otherwise Back returns the user to the gallery.
	// zoomTo(1.0f);
	// return true;
	// }
	// }
	// return super.onKeyUp(keyCode, event);
	// }

	protected Handler mHandler = new Handler();

	@Override
	public void setImageBitmap(Bitmap bitmap) {
		setImageBitmap(bitmap, 0);
	}

	private void setImageBitmap(Bitmap bitmap, int rotation) {
		super.setImageBitmap(bitmap);
		Drawable d = getDrawable();
		if (d != null) {
			d.setDither(true);
		}

		Bitmap old = mBitmapDisplayed.getBitmap();
		mBitmapDisplayed.setBitmap(bitmap);
		mBitmapDisplayed.setRotation(rotation);

		if (old != null && old != bitmap && mRecycler != null) {
			mRecycler.recycle(old);
		}
	}

	public void clear() {
		setImageBitmapResetBase(null, true);
	}

	private Runnable mOnLayoutRunnable = null;

	// This function changes bitmap, reset base matrix according to the size
	// of the bitmap, and optionally reset the supplementary matrix.
	public void setImageBitmapResetBase(final Bitmap bitmap,
			final boolean resetSupp) {
		setImageRotateBitmapResetBase(new RotateBitmap(bitmap), resetSupp);
	}

	public void setImageRotateBitmapResetBase(final RotateBitmap bitmap,
			final boolean resetSupp) {
		final int viewWidth = getWidth();

		if (viewWidth <= 0) {
			mOnLayoutRunnable = new Runnable() {
				public void run() {
					setImageRotateBitmapResetBase(bitmap, resetSupp);
				}
			};
			return;
		}

		if (bitmap.getBitmap() != null) {
			getProperBaseMatrix(bitmap, mBaseMatrix);
			setImageBitmap(bitmap.getBitmap(), bitmap.getRotation());
		} else {
			mBaseMatrix.reset();
			setImageBitmap(null);
		}

		if (resetSupp) {
			mSuppMatrix.reset();
		}
		setImageMatrix(getImageViewMatrix());
		mMaxZoom = maxZoom();
		mMinZoom = minZoom();
		mBaseZoom = getScale(mBaseMatrix);
	}

	// Center as much as possible in one or both axis. Centering is
	// defined as follows: if the image is scaled down below the
	// view's dimensions then center it (literally). If the image
	// is scaled larger than the view and is translated out of view
	// then translate it back into view (i.e. eliminate black bars).
	public void center(boolean horizontal, boolean vertical) {
		centerCharge(horizontal, vertical, false);
	}

	private void centerCharge(boolean horizontal, boolean vertical,
			boolean hasAni) {
		if (mBitmapDisplayed.getBitmap() == null) {
			return;
		}

		Matrix m = getImageViewMatrix();

		RectF rect = new RectF(0, 0, mBitmapDisplayed.getBitmap().getWidth(),
				mBitmapDisplayed.getBitmap().getHeight());

		m.mapRect(rect);

		float height = rect.height();
		float width = rect.width();

		float deltaX = 0, deltaY = 0;

		if (vertical) {
			int viewHeight = getHeight();
			if (height < viewHeight) {
				deltaY = (viewHeight - height) / 2 - rect.top;
			} else if (rect.top > 0) {
				deltaY = -rect.top;
			} else if (rect.bottom < viewHeight) {
				deltaY = getHeight() - rect.bottom;
			}
		}

		if (horizontal) {
			int viewWidth = getWidth();
			if (width < viewWidth) {
				deltaX = (viewWidth - width) / 2 - rect.left;
			} else if (rect.left > 0) {
				deltaX = -rect.left;
			} else if (rect.right < viewWidth) {
				deltaX = viewWidth - rect.right;
			}
		}

		postTranslate(deltaX, deltaY);

		if (hasAni) {
			// Animation animation = new MatrixTransformAnimation(
			// getImageViewMatrix());
			// animation.setDuration(500);
			// animation.setFillAfter(true);
			// startAnimation(animation);
		} else {
			setImageMatrix(getImageViewMatrix());
		}
	}

	protected void centerWithAni(boolean horizontal, boolean vertical) {
		centerCharge(horizontal, vertical, true);
	}

	public ImageViewTouch(Context context) {
		super(context);
		init();
	}

	public ImageViewTouch(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	private void init() {
		setScaleType(ImageView.ScaleType.MATRIX);
	}

	protected float getValue(Matrix matrix, int whichValue) {
		matrix.getValues(mMatrixValues);
		return mMatrixValues[whichValue];
	}

	// Get the scale factor out of the matrix.
	protected float getScale(Matrix matrix) {
		return getValue(matrix, Matrix.MSCALE_X);
	}

	public float getScale() {
		return getScale(mSuppMatrix);
	}

	// Setup the base matrix so that the image is centered and scaled properly.
	private void getProperBaseMatrix(RotateBitmap bitmap, Matrix matrix) {
		float viewWidth = getWidth();
		float viewHeight = getHeight();

		float w = bitmap.getWidth();
		float h = bitmap.getHeight();
		matrix.reset();

		// We limit up-scaling to 3x otherwise the result may look bad if it's
		// a small icon.
		float widthScale = Math.min(viewWidth / w, 3.0f);
		float heightScale = Math.min(viewHeight / h, 3.0f);

		// float widthScale = viewWidth / w;
		// float heightScale = viewHeight / h;
		float scale = Math.min(widthScale, heightScale);
		// Logger.d(TAG, "scale: " + scale);

		matrix.postConcat(bitmap.getRotateMatrix());

		// if (scale < 1F) {
		matrix.postScale(scale, scale);

		matrix.postTranslate((viewWidth - w * scale) / 2F, (viewHeight - h
				* scale) / 2F);
		// } else {
		// matrix.postTranslate((viewWidth - w) / 2F, (viewHeight - h) / 2F);
		// }
	}

	// Combine the base matrix and the supp matrix to make the final matrix.
	public Matrix getImageViewMatrix() {
		// The final matrix is computed as the concatentation of the base matrix
		// and the supplementary matrix.
		mDisplayMatrix.set(mBaseMatrix);
		mDisplayMatrix.postConcat(mSuppMatrix);
		return mDisplayMatrix;
	}

	static final float SCALE_RATE = 1.25F;

	// Sets the maximum zoom, which is a scale relative to the base matrix. It
	// is calculated to show the image at 400% zoom regardless of screen or
	// image orientation. If in the future we decode the full 3 megapixel image,
	// rather than the current 1024x768, this should be changed down to 200%.
	protected float maxZoom() {
		if (mBitmapDisplayed.getBitmap() == null) {
			return 1F;
		}

		float fw = (float) mBitmapDisplayed.getWidth() / (float) mThisWidth;
		float fh = (float) mBitmapDisplayed.getHeight() / (float) mThisHeight;
		float max = Math.max(fw, fh) * 4;
		return max;
	}

	protected float minZoom() {
		float baseScale = getScale(mBaseMatrix);
		if (baseScale < 1) {
			return 1F;
		} else {
			return 1F / baseScale;
		}
	}

	protected void zoomTo(float scale, float centerX, float centerY) {
		if (scale > mMaxZoom) {
			scale = mMaxZoom;
		}

		float oldScale = getScale();
		float deltaScale = scale / oldScale;

		mSuppMatrix.postScale(deltaScale, deltaScale, centerX, centerY);
		setImageMatrix(getImageViewMatrix());
		center(true, true);
	}

	protected void zoomTo(final float scale, final float centerX,
			final float centerY, final float durationMs) {
		final float incrementPerMs = (scale - getScale()) / durationMs;
		final float oldScale = getScale();
		final long startTime = System.currentTimeMillis();

		mHandler.post(new Runnable() {
			public void run() {
				long now = System.currentTimeMillis();
				float currentMs = Math.min(durationMs, now - startTime);
				float target = oldScale + (incrementPerMs * currentMs);
				zoomTo(target, centerX, centerY);

				if (currentMs < durationMs) {
					mHandler.post(this);
				}
			}
		});
	}

	public void zoomTo(float scale) {
		float cx = getWidth() / 2F;
		float cy = getHeight() / 2F;

		zoomTo(scale, cx, cy);
	}

	public void zoomToPoint(float scale, float pointX, float pointY) {
		float cx = getWidth() / 2F;
		float cy = getHeight() / 2F;

		panBy(cx - pointX, cy - pointY);
		zoomTo(scale, cx, cy);
	}

	public void zoomToNoCenter(float scale, float centerX, float centerY) {
		// if (scale > mMaxZoom) {
		// scale = mMaxZoom;
		// }

		float oldScale = getScale();
		float deltaScale = scale / oldScale;

		mSuppMatrix.postScale(deltaScale, deltaScale, centerX, centerY);
		setImageMatrix(getImageViewMatrix());
	}

	public class MatrixTransformAnimation extends Animation {
		Matrix mFrom;
		Matrix mTo;

		public MatrixTransformAnimation(Matrix from, Matrix to) {
			mFrom = from;
			mTo = to;
		}

		@Override
		protected void applyTransformation(float interpolatedTime,
				Transformation t) {
			Matrix matrix = t.getMatrix();
			// matrix.set(mMatrix);
			float from = getValue(mFrom, Matrix.MSCALE_X);
			float to = getValue(mTo, Matrix.MSCALE_X);
			matrix.setScale(from / to, from / to);
		}
	}

	public void zoomToNoCenterValue(float scale, float centerX, float centerY) {
		float oldScale = getScale();
		float deltaScale = scale / oldScale;

		mSuppMatrix.postScale(deltaScale, deltaScale, centerX, centerY);
		getImageViewMatrix();
	}

	public void zoomToNoCenterWithAni(float scale, float toScale,
			float centerX, float centerY) {
		ScaleAnimation animation = new ScaleAnimation(scale, toScale, scale,
				toScale, centerX, centerY);
		animation.setDuration(300);
		startAnimation(animation);

		// float oldScale = getScale();
		// float deltaScale = scale / oldScale;
		// mSuppMatrix.postScale(deltaScale, deltaScale, centerX, centerY);
		// Animation animation = new MatrixTransformAnimation(
		// getImageViewMatrix(), getImageViewMatrix());
		// animation.setDuration(300);
		// startAnimation(animation);
	}

	protected void zoomIn() {
		zoomIn(SCALE_RATE);
	}

	protected void zoomOut() {
		zoomOut(SCALE_RATE);
	}

	protected void zoomIn(float rate) {
		if (getScale() >= mMaxZoom) {
			return; // Don't let the user zoom into the molecular level.
		}
		if (mBitmapDisplayed.getBitmap() == null) {
			return;
		}

		float cx = getWidth() / 2F;
		float cy = getHeight() / 2F;

		mSuppMatrix.postScale(rate, rate, cx, cy);
		setImageMatrix(getImageViewMatrix());
	}

	protected void zoomOut(float rate) {
		if (mBitmapDisplayed.getBitmap() == null) {
			return;
		}

		float cx = getWidth() / 2F;
		float cy = getHeight() / 2F;

		// Zoom out to at most 1x.
		Matrix tmp = new Matrix(mSuppMatrix);
		tmp.postScale(1F / rate, 1F / rate, cx, cy);
		if (getScale(tmp) < mMinZoom) {
			mSuppMatrix.setScale(mMinZoom, mMinZoom, cx, cy);
		}
		// if (getScale(tmp) < 1F) {
		// mSuppMatrix.setScale(1F, 1F, cx, cy);
		// }
		else {
			mSuppMatrix.postScale(1F / rate, 1F / rate, cx, cy);
		}
		setImageMatrix(getImageViewMatrix());
		center(true, true);
	}

	protected void postTranslate(float dx, float dy) {
		mSuppMatrix.postTranslate(dx, dy);
	}

	public void panBy(float dx, float dy) {
		try {
			postTranslate(dx, dy);
			setImageMatrix(getImageViewMatrix());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	AtomicBoolean isCanceled;
	
	public void setIsCanceled(AtomicBoolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	public AtomicBoolean getCanceled() {
		return isCanceled;
	}
}

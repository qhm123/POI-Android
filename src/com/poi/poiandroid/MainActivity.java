package com.poi.poiandroid;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.pbdavey.awt.Graphics2D;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

import and.awt.Dimension;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

public class MainActivity extends Activity {

	// ImageView mImageView;

	ViewPager mViewPager;
	PagerAdapter mPagerAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setPageMargin(10);

		Logger.getLogger("org.teleal.cling").setLevel(Level.FINEST);

		try {
			ppt2png();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void ppt2png() throws IOException {
		FileInputStream is = new FileInputStream("/sdcard/socket.ppt");
		SlideShow ppt = new SlideShow(is);
		is.close();

		final Dimension pgsize = ppt.getPageSize();

		final Slide[] slide = ppt.getSlides();

		mPagerAdapter = new PagerAdapter() {

			@Override
			public void destroyItem(ViewGroup container, int position,
					Object object) {
				ImageView view = (ImageView) object;
				
				container.removeView(view);

				BitmapDrawable bitmapDrawable = (BitmapDrawable) view
						.getDrawable();
				if (!bitmapDrawable.getBitmap().isRecycled()) {
					bitmapDrawable.getBitmap().recycle();
				}
			}

			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				ImageView imageView = new ImageView(MainActivity.this);
				imageView.setLayoutParams(new LayoutParams(
						LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));

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

				Graphics2D graphics2d = new Graphics2D(canvas);

				// render
				slide[position].draw(graphics2d);

				imageView.setImageBitmap(bmp);

				container.addView(imageView);

				// return super.instantiateItem(container, position);
				return imageView;
			}

			@Override
			public boolean isViewFromObject(View view, Object object) {
				return view == ((ImageView) object);
			}

			@Override
			public int getCount() {
				return slide.length;
			}
		};

		mViewPager.setAdapter(mPagerAdapter);

		// for (int i = 0; i < slide.length; i++) {
		//
		// String title = slide[i].getTitle();
		// System.out.println("Rendering slide " + (i + 1) + (title == null ? ""
		// : ": " + title));
		// System.out.println("pgsize.width: " + pgsize.getWidth() +
		// ", pgsize.height: " + pgsize.getHeight());
		//
		// Bitmap bmp = Bitmap.createBitmap((int)pgsize.getWidth(),
		// (int)pgsize.getHeight(), Config.RGB_565);
		// Canvas canvas = new Canvas(bmp);
		// Paint paint = new Paint();
		// paint.setColor(android.graphics.Color.WHITE);
		// paint.setFlags(Paint.ANTI_ALIAS_FLAG);
		// canvas.drawPaint(paint);
		//
		//
		// Graphics2D graphics2d = new Graphics2D(canvas);
		//
		// // render
		// slide[i].draw(graphics2d);
		//
		// // mImageView.setImageBitmap(bmp);
		//
		// FileOutputStream out = new FileOutputStream("/sdcard/slide-" + (i +
		// 1)
		// + ".png");
		// bmp.compress(CompressFormat.PNG, 80, out);
		// out.close();
		// bmp.recycle();
		//
		// System.out.println("end");
		// }
	}
}

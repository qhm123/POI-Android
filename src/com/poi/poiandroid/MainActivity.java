package com.poi.poiandroid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import net.pbdavey.awt.Graphics2D;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;


import and.awt.Color;
import and.awt.Dimension;
import and.awt.geom.Rectangle2D;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView mImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mImageView = (ImageView) findViewById(R.id.image);
        
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

		Dimension pgsize = ppt.getPageSize();

		Slide[] slide = ppt.getSlides();
		for (int i = 0; i < slide.length; i++) {
			
			String title = slide[i].getTitle();
			System.out.println("Rendering slide " + (i + 1) + (title == null ? "" : ": " + title));
			System.out.println("pgsize.width: " + pgsize.getWidth() + ", pgsize.height: " + pgsize.getHeight());
			
			Bitmap bmp = Bitmap.createBitmap((int)pgsize.getWidth(), (int)pgsize.getHeight(), Config.RGB_565);
			Canvas canvas = new Canvas(bmp);
			Paint paint = new Paint();
			paint.setColor(android.graphics.Color.WHITE);
			paint.setFlags(Paint.ANTI_ALIAS_FLAG);
			canvas.drawPaint(paint);
			
			
			Graphics2D graphics2d = new Graphics2D(canvas);
			
			// render
			slide[i].draw(graphics2d);
			
//			mImageView.setImageBitmap(bmp);
			
			FileOutputStream out = new FileOutputStream("/sdcard/slide-" + (i + 1)
					+ ".png");
			bmp.compress(CompressFormat.PNG, 80, out);
			out.close();
			bmp.recycle();
			
			System.out.println("end");
		}
    }
}

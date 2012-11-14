package com.poi.poiandroid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;


import and.awt.Color;
import and.awt.Dimension;
import and.awt.geom.Rectangle2D;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
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

		Rect pgsize = ppt.getPageSize();
		Region s;

		Slide[] slide = ppt.getSlides();
		for (int i = 0; i < 1; i++) {
			
			String title = slide[i].getTitle();
			System.out.println("Rendering slide " + (i + 1) + (title == null ? "" : ": " + title));
			System.out.println("pgsize.width: " + pgsize.width() + ", pgsize.height: " + pgsize.height());
			
			Bitmap bmp = Bitmap.createBitmap(pgsize.width(), pgsize.height(), Config.RGB_565);
			Canvas canvas = new Canvas(bmp);
			Paint paint = new Paint();
			paint.setFlags(Paint.ANTI_ALIAS_FLAG);
			canvas.drawPaint(paint);
			
			// render
			slide[i].draw(canvas);

//			BufferedImage img = new BufferedImage(pgsize.width(), pgsize.height(),
//					BufferedImage.TYPE_INT_RGB);
//			Graphics2D graphics = img.createGraphics();
			
//			// default rendering options
//			graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
////			graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
////			graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
////			graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
//
			// clear the drawing area
//			graphics.setColor(Color.white);
//			graphics.fillRect(0, 0, pgsize.width,
//					pgsize.height);
//			graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width,
//					pgsize.height));
			
//			Bitmap bmp = Bitmap.createBitmap(400, 400, Config.RGB_565);
//			Canvas c = new Canvas(bmp);
//			Paint p = new Paint();
//			p.setColor(android.graphics.Color.BLUE);
//			c.drawRect(new Rect(0, 0, 400, 400), p);
//			mImageView.setImageBitmap(bmp);
//
			// render
//			slide[i].draw(graphics);
//
//			// save the output
			
			mImageView.setImageBitmap(bmp);
//			FileOutputStream out = new FileOutputStream("/sdcard/slide-" + (i + 1)
//					+ ".png");
//			ImageIO.write(img, "png", out);
//			out.close();
		}
    }
}

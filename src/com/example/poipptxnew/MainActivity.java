package com.example.poipptxnew;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import net.pbdavey.awt.Graphics2D;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

import and.awt.Dimension;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView mImageView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
		System.setProperty("javax.xml.stream.XMLInputFactory",
				"com.sun.xml.stream.ZephyrParserFactory");
		System.setProperty("javax.xml.stream.XMLOutputFactory",
				"com.sun.xml.stream.ZephyrWriterFactory");
		System.setProperty("javax.xml.stream.XMLEventFactory",
				"com.sun.xml.stream.events.ZephyrEventFactory");
		
		Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
    
		try {
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			XMLEventReader reader = inputFactory
					.createXMLEventReader(new StringReader(
							"<doc att=\"value\">some text</doc>"));
			while (reader.hasNext()) {
				XMLEvent e = reader.nextEvent();
				Log.e("HelloStax", "Event:[" + e + "]");
			}
		} catch (XMLStreamException e) {
			Log.e("HelloStax", "Error parsing XML", e);
		}
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mImageView = (ImageView) findViewById(R.id.image);

		Logger.getLogger("org.teleal.cling").setLevel(Level.FINEST);

		try {
			pptx2png();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    private void pptx2png() throws InvalidFormatException, IOException {
    	String file = "/sdcard/PhoneGap.pptx";
		
		System.out.println("Processing " + file);
        XMLSlideShow ppt = new XMLSlideShow(OPCPackage.open(file));

        Dimension pgsize = ppt.getPageSize();

        XSLFSlide[] slide = ppt.getSlides();
        for (int i = 0; i < slide.length; i++) {
            String title = slide[i].getTitle();
            System.out.println("Rendering slide " + (i + 1) + (title == null ? "" : ": " + title));

            Bitmap bmp = Bitmap.createBitmap((int) pgsize.getWidth(),
					(int) pgsize.getHeight(), Config.RGB_565);
			Canvas canvas = new Canvas(bmp);
			Paint paint = new Paint();
			paint.setColor(android.graphics.Color.WHITE);
			paint.setFlags(Paint.ANTI_ALIAS_FLAG);
			canvas.drawPaint(paint);

			Graphics2D graphics2d = new Graphics2D(canvas);
            
            // draw stuff
            slide[i].draw(graphics2d);

//          mImageView.setImageBitmap(bmp);
            
            // save the result
            int sep = file.lastIndexOf(".");
            String fname = file.substring(0, sep == -1 ? file.length() : sep) + "-" + (i + 1) +".png";
            FileOutputStream out = new FileOutputStream(fname);
            bmp.compress(CompressFormat.PNG, 80, out);
            out.close();
        }
        System.out.println("Done");
    }
}

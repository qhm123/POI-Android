package and.awt.image;

import java.io.FileOutputStream;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Bitmap.Config;
import android.graphics.Paint;
import android.graphics.Rect;
import net.pbdavey.awt.Graphics2D;

public class BufferedImage {

	public static final int TYPE_INT_RGB = 0;
	
	Canvas mCanvas;
	Bitmap mBitmap;
	Graphics2D mGraphics2D;

	public BufferedImage(int width, int height, int type) {
		mBitmap = Bitmap.createBitmap(width, height, Config.RGB_565);
		mCanvas = new Canvas(mBitmap);
		
		Paint p = new Paint();
		p.setColor(Color.BLUE);
		mCanvas.drawRect(new Rect(0, 0, 400, 400), p);
	}

	public Graphics2D getGraphics() {
		return mGraphics2D;
	}

	public Graphics2D createGraphics() {
		mGraphics2D = new Graphics2D(mCanvas);
		return mGraphics2D;
	}

	public void compress(CompressFormat png, int i, FileOutputStream out) {
		mBitmap.compress(png, i, out);
	}
	
	public Bitmap getBitmap() {
		return mBitmap;
	}

}

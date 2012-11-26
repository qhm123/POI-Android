package and.awt;

import net.pbdavey.awt.Graphics2D;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;

public class BufferedImage {

	public static final Config TYPE_INT_RGB = Bitmap.Config.RGB_565;
	
	public Bitmap bm;

	public BufferedImage(Bitmap bm) {
		this.bm = bm;
	}

	public BufferedImage(int width, int height, Config config) {
		bm = Bitmap.createBitmap(width, height, config);
	}

	public int getWidth() {
		if (bm != null) {
			return bm.getWidth();
		}
		return 0;
	}

	public int getHeight() {
		if (bm != null) {
			return bm.getHeight();
		}

		return 0;
	}

	public Image getScaledInstance(int width, int height, String scaleSmooth) {

		return new Image(imageScale(bm, width, height));
	}

	public static Bitmap imageScale(Bitmap bitmap, int dst_w, int dst_h) {

		int src_w = bitmap.getWidth();
		int src_h = bitmap.getHeight();
		float scale_w = ((float) dst_w) / src_w;
		float scale_h = ((float) dst_h) / src_h;
		Matrix matrix = new Matrix();
		matrix.postScale(scale_w, scale_h);
		Bitmap dstbmp = Bitmap.createBitmap(bitmap, 0, 0, src_w, src_h, matrix,
				true);

		return dstbmp;
	}

	public Graphics2D createGraphics() {
		if (bm == null) return null;
		Canvas canvas = new Canvas(bm);
		return new Graphics2D(canvas);
	}

}

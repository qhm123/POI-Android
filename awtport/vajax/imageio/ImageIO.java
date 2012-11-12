package vajax.imageio;

import java.io.FileOutputStream;

import and.awt.image.BufferedImage;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ImageIO {

	public static void write(BufferedImage img, String string,
			FileOutputStream out) {
		img.compress(Bitmap.CompressFormat.PNG, 90, out);
	}

}

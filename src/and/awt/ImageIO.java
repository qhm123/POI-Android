package and.awt;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ImageIO {

	public static BufferedImage read(InputStream byteArrayInputStream) {
		Bitmap bm = BitmapFactory.decodeStream(byteArrayInputStream);
		return bm == null ? null : new BufferedImage(bm);
	}

}

package and.awt;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import android.graphics.BitmapFactory;

public class ImageIO {

	public static BufferedImage read(InputStream byteArrayInputStream) {
		return new BufferedImage(BitmapFactory.decodeStream(byteArrayInputStream));
	}

}

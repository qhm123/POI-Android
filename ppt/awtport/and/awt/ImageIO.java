package and.awt;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.poi.poiandroid.Utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ImageIO {

	public static BufferedImage read(InputStream byteArrayInputStream) {
		final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        
        if (options.outWidth < 0 || options.outHeight < 0) {
        	return null;
        }
        
        // Calculate inSampleSize
		options.inSampleSize = Utils.calculateInSampleSize(options, 480, 800);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        
        try {
			byteArrayInputStream.reset();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Bitmap bm = BitmapFactory.decodeStream(byteArrayInputStream, null, options);
		return bm == null ? null : new BufferedImage(bm);
	}
	
	public static boolean canDecode(InputStream byteArrayInputStream) {
		final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        if (options.outWidth < 0 || options.outHeight < 0) {
        	return false;
        }
        
        return true;
	}

}

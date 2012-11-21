package net.arnx.wmf2svg.util;

//import java.awt.image.BufferedImage;
//import java.awt.image.ColorConvertOp;
//import java.awt.image.DataBuffer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import and.awt.BufferedImage;
import and.awt.ImageIO;

//import javax.imageio.ImageIO;

//import com.google.appengine.api.images.Image;
//import com.google.appengine.api.images.ImagesService;
//import com.google.appengine.api.images.ImagesServiceFactory;
//import com.google.appengine.api.images.Transform;
//import com.google.appengine.api.images.ImagesService.OutputEncoding;

public class ImageUtil {
	private static Converter converter;
	
	static {
		converter = new ImageIOConverter();
	}
	
	public static byte[] convert(byte[] image, String destType, boolean reverse) {
		if (converter == null) {
			throw new UnsupportedOperationException("Image Conversion API(Image IO or GAE Image API) is missing.");
		}
		return converter.convert(image, destType, reverse);
	}
	
	private static interface Converter {
		public byte[] convert(byte[] image, String destType, boolean reverse);
	}
	
	private static class ImageIOConverter implements Converter {
		public byte[] convert(byte[] image, String destType, boolean reverse) {
			if (destType == null) {
				throw new IllegalArgumentException("dest type is null.");
			} else {
				destType = destType.toLowerCase();
			}
			
			byte[] outimage = image;
//			byte[] outimage = null;
//			try {
				// convert to 24bit color
//				BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(image));
//				BufferedImage dst = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
//				ColorConvertOp colorConvert = new ColorConvertOp(dst.getColorModel().getColorSpace(), null);
//				colorConvert.filter(bufferedImage, dst);
//				bufferedImage = dst;
				
//				if (reverse) {
//					DataBuffer srcData = bufferedImage.getRaster().getDataBuffer();
//					BufferedImage dstImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), bufferedImage.getType());
//					DataBuffer dstData = dstImage.getRaster().getDataBuffer();
//					int lineSize = bufferedImage.getWidth() * bufferedImage.getColorModel().getPixelSize() / 8;
//					for (int h = 0, k = bufferedImage.getHeight() - 1; h < bufferedImage.getHeight(); h++, k--) {
//						for (int j = 0; j < lineSize; j++) {
//							dstData.setElem(h * lineSize + j, srcData.getElem(k * lineSize + j));
//						}
//					}
//					bufferedImage = dstImage;
//				}
				
//				ByteArrayOutputStream out = new ByteArrayOutputStream();
//				ImageIO.write(bufferedImage, destType, out);
//				outimage = out.toByteArray();
//			} catch (IOException e) {
//				// never occurred.
//			}
		
			return outimage;
		}
	}
	
//	private static class GAEConverter implements Converter {
//		public byte[] convert(byte[] image, String destType, boolean reverse) {
//			if (destType == null) {
//				throw new IllegalArgumentException("dest type is null.");
//			} else {
//				destType = destType.toLowerCase();
//			}
//			
//			ImagesService.OutputEncoding encoding = null;
//			if ("png".equals(destType)) {
//				encoding = OutputEncoding.PNG;
//			} else if ("jpeg".equals(destType)) {
//				encoding = OutputEncoding.JPEG;
//			} else {
//				throw new UnsupportedOperationException("unsupported image encoding: " + destType);
//			}
//			
//			ImagesService imagesService = ImagesServiceFactory.getImagesService();
//			Image bmp = ImagesServiceFactory.makeImage(image);
//			
//			Transform t = (reverse) ? ImagesServiceFactory.makeVerticalFlip() : ImagesServiceFactory.makeCompositeTransform();
//			return imagesService.applyTransform(t, bmp, encoding).getImageData();
//		}
//	}
}

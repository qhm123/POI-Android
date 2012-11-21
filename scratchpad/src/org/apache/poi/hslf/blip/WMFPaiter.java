package org.apache.poi.hslf.blip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import net.arnx.wmf2svg.gdi.svg.SvgGdi;
import net.arnx.wmf2svg.gdi.wmf.WmfParser;
import net.pbdavey.awt.Graphics2D;

import org.apache.poi.hslf.model.Picture;
import org.apache.poi.hslf.usermodel.PictureData;
import org.w3c.dom.Document;

import and.awt.Rectangle;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.ImageView.ScaleType;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import com.libsvg.SvgDrawable;

public class WMFPaiter implements ImagePainter {

	@Override
	public void paint(Graphics2D graphics, PictureData pict, Picture parent) {
		try {
			InputStream in = new ByteArrayInputStream(pict.getData());
			
			WmfParser parser = new WmfParser();
			final SvgGdi gdi = new SvgGdi(false);
			parser.parse(in, gdi);

			Document doc = gdi.getDocument();
//			ByteArrayOutputStream out = new ByteArrayOutputStream();
			FileOutputStream out = new FileOutputStream("/sdcard/ppt.svg");
			output(doc, out);
			
//			InputStream svgIn = new ByteArrayInputStream(out.toByteArray());
			
//			SVG svg = SVGParser.getSVGFromInputStream(svgIn);
//			// Get the picture
//			android.graphics.Picture picture = svg.getPicture();
			
//			SvgDrawable svg = new SvgDrawable(svgIn);
//			svg.setScaleType(ScaleType.FIT_XY);
//			
			Rectangle anchor = parent.getAnchor();
//			float scale = (float)anchor.width/svg.getIntrinsicWidth();
//			graphics.scale(scale, scale);
//			graphics.translate(anchor.x, anchor.y);
//			svg.setBounds(anchor.x, anchor.y, anchor.x + anchor.width, anchor.y + anchor.height);
//			svg.draw(graphics.canvas);
			
			Paint p = new Paint(); 
			p.setColor(Color.BLACK);
			graphics.canvas.drawRect(anchor.x, anchor.y, anchor.x + anchor.width, anchor.y + anchor.height, p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void output(Document doc, OutputStream out) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,
				"-//W3C//DTD SVG 1.0//EN");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,
				"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd");
		transformer.transform(new DOMSource(doc), new StreamResult(out));
		out.flush();
		out.close();
	}

}

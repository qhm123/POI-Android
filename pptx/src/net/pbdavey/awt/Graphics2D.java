package net.pbdavey.awt;


import java.util.HashMap;

import org.apache.poi.xslf.usermodel.XSLFRenderingHint;

import and.awt.BasicStroke;
import and.awt.BufferedImage;
import and.awt.Color;
import and.awt.Graphics;
import and.awt.Image;
import and.awt.Shape;
import and.awt.Stroke;
import and.awt.geom.AffineTransform;
import and.awt.geom.PathIterator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Log;
/**
 * So far it appears that Graphics2D is roughly equivalent to a Canvas with Paint.
 * The Paint object contains information regarding Fonts and FontMetrics, while
 * the Canvas is a more raw drawing tool.
 * @author pbdavey
 *
 */
public class Graphics2D extends Graphics {
	Paint paint;
	public Canvas canvas;
	
	Font font = new Font();
	Stroke stroke;

	Color color = Color.white;
	Color bgColor;
	AffineTransform transform;
	
	public Graphics2D(Canvas canvas) {
		this.canvas = canvas;
		this.transform = new AffineTransform();
		this.paint = new Paint();
		paint.setAntiAlias(true);
	}
	
	public void setColor(Color color) {
		this.color = color;
		paint.setColor(this.color.getRGB());
	}
	
	public Color getColor() {
		return this.color;
	}

	/**
	 * TODO: This shouldn't accept BasicStroke, rather a generic Stroke
	 * The issue here has to do with actually stroking the Shape, which
	 * is delegated to a rendering pipe.  See
	 * {@link and.awt.BasicStroke#createStrokedShape}
	 * @param stroke
	 */
	public void setStroke(Stroke pStroke) {
		this.stroke = pStroke;
		BasicStroke stroke = (BasicStroke) pStroke;
		
		Paint.Cap cap = Paint.Cap.BUTT;
		switch(stroke.getEndCap()) {
		case BasicStroke.CAP_BUTT:
			cap = Paint.Cap.BUTT;
			break;
		case BasicStroke.CAP_ROUND:
			cap = Paint.Cap.ROUND;
			break;
		case BasicStroke.CAP_SQUARE:
			cap = Paint.Cap.SQUARE;
			break;
		}
		this.paint.setStrokeCap(cap);

		Paint.Join join = Paint.Join.BEVEL;
		switch(stroke.getLineJoin()) {
		case BasicStroke.JOIN_BEVEL:
			join = Paint.Join.BEVEL;
			break;
		case BasicStroke.JOIN_MITER:
			join = Paint.Join.MITER;
			break;
		case BasicStroke.JOIN_ROUND:
			join = Paint.Join.ROUND;
			break;
		}
		this.paint.setStrokeJoin(join);
		
		this.paint.setStrokeMiter(stroke.getMiterLimit());
		this.paint.setStrokeWidth(stroke.getLineWidth());
	}
	
	public Stroke getStroke() {
		return this.stroke;
	}
	
	public void draw(Shape s) {
		PathIterator pi = s.getPathIterator(null);
		Path path = convertAwtPathToAndroid(pi);
		// Draw the outline, don't fill
		paint.setStyle(Style.STROKE);
		canvas.drawPath(path, paint);
	}
	
	public void fill(Shape s) {
		PathIterator pi = s.getPathIterator(null);
		Path path = convertAwtPathToAndroid(pi);
		// Draw the outline and fill
		paint.setStyle(Style.FILL_AND_STROKE);
		canvas.drawPath(path, paint);;
	}

	private Path convertAwtPathToAndroid(PathIterator pi) {
		Path path = new Path();
		float [] coords = new float [6];
		while (!pi.isDone()) {
			int windingRule = pi.getWindingRule();
			
			if (windingRule == PathIterator.WIND_EVEN_ODD) {
				path.setFillType(Path.FillType.EVEN_ODD);
			}
			else {
				path.setFillType(Path.FillType.WINDING);
			}
			
			int pathType = pi.currentSegment(coords);

			switch (pathType) {
			case PathIterator.SEG_CLOSE:
				path.close();
				break;
			case PathIterator.SEG_CUBICTO:
				path.cubicTo(coords [0], coords [1], coords [2], coords [3], coords [4], coords [5]);
				break;
			case PathIterator.SEG_LINETO:
				path.lineTo(coords [0], coords [1]);
				break;
			case PathIterator.SEG_MOVETO:
				path.moveTo(coords [0], coords [1]);
				break;
			case PathIterator.SEG_QUADTO:
				path.quadTo(coords [0], coords [1], coords [2], coords [3]);
				break;
			}
			
			pi.next();
		}		
		return path;
	}

	public void translate(double tx, double ty) {
		this.transform.translate(tx, ty);
		canvas.translate((float)tx, (float)ty);
	}
	
	public void rotate(double theta) {
		this.transform.rotate(theta);
		canvas.rotate((float)Math.toDegrees(theta));
	}
	
	public void scale(double sx, double sy) {
		this.transform.scale(sx, sy);
		canvas.scale((float)sx, (float)sy);
	}
	
	public void setTransform(AffineTransform Tx) {
		// XXX: DD
		this.transform = Tx;
	}
	
	public AffineTransform getTransform() {
		return this.transform;
	}
	
	public void drawImage(Image img, int x, int y, Object o) {
		canvas.drawBitmap(img.bm, x, y, paint);
	}
	
	public void drawImage(BufferedImage img, int x, int y, int width, int height, Object o) {
		canvas.drawBitmap(img.bm, new Rect(0, 0, img.getWidth(), img.getHeight()), new Rect(x, y, width, height), paint);
	}

	public void setPaint(Color lineColor) {
		paint.setColor(lineColor.getRGB());
	}

	public void drawRenderedImage(BufferedImage img, AffineTransform at) {
		
		Log.d("drawRenderedImage", "sx: " + at.getScaleX() + ", sy: " + at.getScaleY() + 
				", tx: " + at.getTranslateX() + ", ty: " + at.getTranslateY());
		
		Matrix m = new Matrix();
		float[] values = new float[9];
		values[Matrix.MSCALE_X] = (float) at.getScaleX();
		values[Matrix.MSCALE_Y] = (float)at.getScaleY();
		values[Matrix.MTRANS_X] = (float)at.getTranslateX();
		values[Matrix.MTRANS_Y] = (float)at.getTranslateY();
		values[Matrix.MSKEW_X] = (float)at.getShearX();
		values[Matrix.MSKEW_Y] = (float)at.getShearY();
		values[Matrix.MPERSP_2] = 1;
		m.setValues(values);
        
        canvas.drawBitmap(img.bm, m, paint);
	}

	public void setPaint(and.awt.Paint fill) {
		if (fill instanceof Color) {
			Color c = (Color) fill;
			paint.setColor(c.getRGB());
		}
	}

	public AffineTransform getRenderingHint(XSLFRenderingHint groupTransform) {
		return affineTransformHintMap.get(groupTransform);
	}
	
	HashMap<XSLFRenderingHint, AffineTransform> affineTransformHintMap = new HashMap<XSLFRenderingHint, AffineTransform>();

	public void setRenderingHint(XSLFRenderingHint hint, boolean b) {
		if (hint == XSLFRenderingHint.GSAVE) {
			canvas.save();
		} else if (hint == XSLFRenderingHint.GRESTORE) {
			canvas.restore();
		}
	}

	public void setRenderingHint(XSLFRenderingHint groupTransform,
			AffineTransform tx0) {
		affineTransformHintMap.put(groupTransform, tx0);
	}
}

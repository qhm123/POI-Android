package com.libsvg;

/**
 * 
 * @author Pavel.B.Chernov - minor improvements
 * @author kushnarev - original implementation
 *
 */

import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Typeface;
import android.util.Log;


public class SvgRaster {

	public native static long svgAndroidCreate();
	public native static void svgAndroidDestroy(long id);
	public native static int svgAndroidParseBuffer(long id, String bfr);	
	public native static int svgAndroidParseChunkBegin(long id);
	public native static int svgAndroidParseChunk(long id, String bfr);
	public native static int svgAndroidParseChunkEnd(long id);
	public native static int svgAndroidSetAntialiasing(long id, boolean doIt);	
	public native static int svgAndroidRender(long id, Canvas target);
	// Pavel.B.Chernov: I've changed this function to make scaling without saving aspect ratio
	public native static int svgAndroidRenderToArea(long id, Canvas target, int x, int y, int w, int h);
	// Pavel.B.Chernov: I've added this function for uniform scaling, preserving aspect ration
	public native static int svgAndroidRenderToAreaUniform(long id, Canvas target, int x, int y, int w, int h);
	public native static int svgAndroidGetWidth(long id);
	public native static int svgAndroidGetHeight(long id);

	public static void debugMatrix(Matrix m) {
		Log.v("Kamoflage", m.toString());
	}
	
	public static void setTypeface(
		Paint p, String family, int weight_n_slant, float textSize, int talign) {
		int style = android.graphics.Typeface.NORMAL;
		Paint.Align al = Paint.Align.LEFT;
		
		switch(weight_n_slant) {
		case 0: // italic, bold
			style = android.graphics.Typeface.BOLD_ITALIC;
			break;
		case 1: // italic, no bold
			style = android.graphics.Typeface.ITALIC;
			break;
		case 2: // normal, bold
			style = android.graphics.Typeface.BOLD;
			break;
		default:
		case 3: // normal, no bold
			style = android.graphics.Typeface.NORMAL;
			break;
		}

		switch(talign) {
		default:
		case 0:
			al = Paint.Align.LEFT;
			break;
		case 1:
			al = Paint.Align.CENTER;
			break;
		case 2:
			al = Paint.Align.RIGHT;
			break;
		}
		
		Typeface tf = Typeface.create(family, style);

		p.setTypeface(tf);
		p.setTextSize(textSize);
		p.setTextAlign(al);
	}
	
	public static Matrix matrixInvert(Matrix m) {
		Matrix r = new Matrix();

		if(m.invert(r)) return r;
		return null;
	}

	public static Shader createBitmapShader(Bitmap b) {
	       return new BitmapShader(b, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
	}
	
	public static Shader createLinearGradient(float x1, float y1, float x2, float y2,
						  int[] colors, float[] offsets, int spreadType) {
		if (colors == null || colors.length <= 0 || offsets == null || offsets.length <= 0) {
			return null;
		}
		Shader.TileMode tm = Shader.TileMode.REPEAT;
		switch(spreadType) {
		case 0:
			tm = Shader.TileMode.REPEAT;
			break;
		case 1:
			tm = Shader.TileMode.MIRROR;
			break;
		case 2:
			tm = Shader.TileMode.CLAMP;
			break;
		}
		return new LinearGradient(x1, y1, x2, y2, colors, offsets, tm);
	}
	
	public static Shader createRadialGradient(float x, float y, float r,
						  int[] colors, float[] offsets, int spreadType) {
		if (colors == null || colors.length <= 0 || offsets == null || offsets.length <= 0) {
			return null;
		}
		Shader.TileMode tm = Shader.TileMode.REPEAT;
		switch(spreadType) {
		case 0:
			tm = Shader.TileMode.REPEAT;
			break;
		case 1:
			tm = Shader.TileMode.MIRROR;
			break;
		case 2:
			tm = Shader.TileMode.CLAMP;
			break;
		}
		return new RadialGradient(x, y, r, colors, offsets, tm);
	}
	
	public static float[] getBounds(Path p) {
		float[] rv = {(float)0.0, (float)0.0, (float)0.0, (float)0.0};

		RectF r = new RectF();
		p.computeBounds(r, false);
		rv[0] = r.left;
		rv[1] = r.top;
		rv[2] = r.right;
		rv[3] = r.bottom;

		return rv;
	}
	
	public static Matrix matrixInit(float xx, float yx, float xy, float yy, float x0, float y0) {
		android.graphics.Matrix x = new android.graphics.Matrix();
		float[] val = {
			(float)xx,  (float)xy,  (float)x0,
			(float)yx,  (float)yy,  (float)y0,
			(float)0.0, (float)0.0, (float)1.0
		};
		x.setValues(val);
		return x;
	}

	public static void setPaintStyle(Paint p, boolean isStroke) {
		p.setStyle(isStroke ? Paint.Style.STROKE : Paint.Style.FILL);
	}
	
	public static void setStrokeCap(Paint p, int cap) {
		switch(cap) {
		case 0:
			p.setStrokeCap(android.graphics.Paint.Cap.BUTT);
			break;
		case 1:
			p.setStrokeCap(android.graphics.Paint.Cap.ROUND);
			break;
		case 2:
		default:
			p.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
			break;
		}
	}
	
	public static void setStrokeJoin(Paint p, int cap) {
		switch(cap) {
		case 0:
			p.setStrokeJoin(android.graphics.Paint.Join.MITER);
			break;
		case 1:
			p.setStrokeJoin(android.graphics.Paint.Join.ROUND);
			break;
		case 2:
		default:
			p.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
			break;
		}
	}
	
	public static void setFillRule(Path p, boolean even_odd) {
		if(even_odd)
			p.setFillType(Path.FillType.EVEN_ODD);
		else
			p.setFillType(Path.FillType.WINDING);
	}

	public static void drawEllipse(Canvas c, Paint p, float cx, float cy, float rx, float ry) {
		float l, t, r, b;

		l = cx - rx;
		t = cy - ry;
		r = cx + rx;
		b = cy + ry;

		RectF rct = new RectF(l, t, r, b);
		c.drawOval(rct, p);
	}

	public static Bitmap data2bitmap(int w, int h, int[] data) {
		return Bitmap.createBitmap(data, w, h, Bitmap.Config.ARGB_8888);
	}
	
	public static Bitmap createBitmap(int w, int h) {
		return Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
	}
	
}
	

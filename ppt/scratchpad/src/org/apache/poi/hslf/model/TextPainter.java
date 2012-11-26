/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hslf.model;

import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.List;

import net.pbdavey.awt.Graphics2D;

import org.apache.poi.hslf.record.TextRulerAtom;
import org.apache.poi.hslf.usermodel.RichTextRun;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

import and.awt.geom.Rectangle2D;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.renderscript.Type;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AlignmentSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.FloatMath;

/**
 * Paint text into and.awt.Graphics2D
 *
 * @author Yegor Kozlov
 */
public final class TextPainter {
    protected POILogger logger = POILogFactory.getLogger(this.getClass());

    /**
     * Display unicode square if a bullet char can't be displayed,
     * for example, if Wingdings font is used.
     * TODO: map Wingdngs and Symbol to unicode Arial
     */
    protected static final char DEFAULT_BULLET_CHAR = '\u25a0';

    protected TextShape _shape;

    public TextPainter(TextShape shape){
        _shape = shape;
    }
    
    public SpannableStringBuilder getAttributedString(TextRun txrun){
        String text = txrun.getText();
        //TODO: properly process tabs
        text = text.replace('\t', ' ');
        text = text.replace((char)160, ' ');
        
        System.out.println("text: " + text);

        SpannableStringBuilder at = new SpannableStringBuilder(text);
        RichTextRun[] rt = txrun.getRichTextRuns();
        for (int i = 0; i < rt.length; i++) {
            int start = rt[i].getStartIndex();
            int end = rt[i].getEndIndex();
            if(start == end) {
                logger.log(POILogger.INFO,  "Skipping RichTextRun with zero length");
                continue;
            }
            
            if (end > at.length() || start > at.length()) {continue;}
            
            int style = Typeface.NORMAL;
            if (rt[i].isBold() && rt[i].isItalic()) {
            	style = Typeface.BOLD_ITALIC;
            } else if (rt[i].isItalic()) {
            	style = Typeface.ITALIC;
            } else if (rt[i].isBold()) {
            	style = Typeface.BOLD;
            }
            
            ColorStateList color = ColorStateList.valueOf(rt[i].getFontColor().getRGB());
            at.setSpan(new TextAppearanceSpan(rt[i].getFontName(), style, rt[i].getFontSize(),
            		color, color), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            if(rt[i].isUnderlined()) {
            	at.setSpan(new UnderlineSpan(), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            if(rt[i].isStrikethrough()) {
            	at.setSpan(new StrikethroughSpan(), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            int superScript = rt[i].getSuperscript();
            if (superScript > 0) {
            	at.setSpan(new SuperscriptSpan(), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } else if (superScript < 0) {
            	at.setSpan(new SubscriptSpan(), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            
            Alignment alignment;
            switch (rt[i].getAlignment()) {
			case TextShape.AlignLeft:
				alignment = Alignment.ALIGN_NORMAL;
				break;
			case TextShape.AlignRight:
				alignment = Alignment.ALIGN_OPPOSITE;
				break;
			case TextShape.AlignCenter:
				alignment = Alignment.ALIGN_CENTER;
				break;
			default:
				alignment = Alignment.ALIGN_NORMAL;
				break;
			}
            at.setSpan(new AlignmentSpan.Standard(alignment), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            
			System.out.println("start: " + start + ", end: " + end
					+ ", offset: " + rt[i].getTextOffset() + ", getBulletOffset: " + rt[i].getBulletOffset()
					+ ", getSpaceBefore: " + rt[i].getSpaceBefore() + ", getSpaceAfter: " + rt[i].getSpaceAfter()
					+ ", getIndentLevel: " + rt[i].getIndentLevel() + ", getIndentLevel: " + rt[i].getAlignment()
					+ ", text: " + rt[i].getText());
			at.setSpan(new LeadingMarginSpan.Standard(rt[i].getTextOffset()),
					start, end, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        }
        return at;
    }

    public void paint(Graphics2D graphics){
    	Rectangle2D anchor = _shape.getLogicalAnchor2D();
        TextRun run = _shape.getTextRun();
        if (run == null) return;

        String text = run.getText();
        if (text == null || text.equals("")) return;
        
        SpannableStringBuilder ssb = getAttributedString(run);
        
        graphics.canvas.save();
        graphics.canvas.translate((float)anchor.getX() + _shape.getMarginLeft(), (float)anchor.getY() + _shape.getMarginTop());
        
        Paint p = new TextPaint();
        p.setAntiAlias(true);
        p.setColor(Color.BLACK);
        StaticLayout sl = new StaticLayout(ssb, new TextPaint(p), (int) Math.ceil(anchor.getWidth()), Alignment.ALIGN_NORMAL, 1f, 0f, false);
        sl.draw(graphics.canvas);
        
        graphics.canvas.restore();
    }
}

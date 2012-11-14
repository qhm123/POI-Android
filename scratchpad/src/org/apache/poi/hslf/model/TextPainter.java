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

        SpannableStringBuilder at = new SpannableStringBuilder(text);
        RichTextRun[] rt = txrun.getRichTextRuns();
        for (int i = 0; i < rt.length; i++) {
            int start = rt[i].getStartIndex();
            int end = rt[i].getEndIndex();
            if(start == end) {
                logger.log(POILogger.INFO,  "Skipping RichTextRun with zero length");
                continue;
            }
            
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
            
            System.out.println("start: " + start + ", end: " + end + ", offset: " + rt[i].getTextOffset() 
            		+ ", text: " + rt[i].getText());
//            if(rt[i].getText().startsWith("SYN")) {
            	at.setSpan(new LeadingMarginSpan.Standard(rt[i].getTextOffset()), start, end, 
            			Spannable.SPAN_INCLUSIVE_EXCLUSIVE);	
//            }
            
            

//            at.addAttribute(TextAttribute.FAMILY, rt[i].getFontName(), start, end);
//            at.addAttribute(TextAttribute.SIZE, new Float(rt[i].getFontSize()), start, end);
//            at.addAttribute(TextAttribute.FOREGROUND, rt[i].getFontColor(), start, end);
//            if(rt[i].isBold()) at.addAttribute(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD, start, end);
//            if(rt[i].isItalic()) at.addAttribute(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE, start, end);
//            if(rt[i].isUnderlined()) {
//                at.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON, start, end);
//                at.addAttribute(TextAttribute.INPUT_METHOD_UNDERLINE, TextAttribute.UNDERLINE_LOW_TWO_PIXEL, start, end);
//            }
//            if(rt[i].isStrikethrough()) at.addAttribute(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON, start, end);
//            int superScript = rt[i].getSuperscript();
//            if(superScript != 0) at.addAttribute(TextAttribute.SUPERSCRIPT, superScript > 0 ? TextAttribute.SUPERSCRIPT_SUPER : TextAttribute.SUPERSCRIPT_SUB, start, end);

        }
        return at;
    }

//    /**
//     * Convert the underlying set of rich text runs into java.text.AttributedString
//     */
//    public AttributedString getAttributedString(TextRun txrun){
//        String text = txrun.getText();
//        //TODO: properly process tabs
//        text = text.replace('\t', ' ');
//        text = text.replace((char)160, ' ');
//
//        AttributedString at = new AttributedString(text);
//        RichTextRun[] rt = txrun.getRichTextRuns();
//        for (int i = 0; i < rt.length; i++) {
//            int start = rt[i].getStartIndex();
//            int end = rt[i].getEndIndex();
//            if(start == end) {
//                logger.log(POILogger.INFO,  "Skipping RichTextRun with zero length");
//                continue;
//            }
//
//            at.addAttribute(TextAttribute.FAMILY, rt[i].getFontName(), start, end);
//            at.addAttribute(TextAttribute.SIZE, new Float(rt[i].getFontSize()), start, end);
//            at.addAttribute(TextAttribute.FOREGROUND, rt[i].getFontColor(), start, end);
//            if(rt[i].isBold()) at.addAttribute(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD, start, end);
//            if(rt[i].isItalic()) at.addAttribute(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE, start, end);
//            if(rt[i].isUnderlined()) {
//                at.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON, start, end);
//                at.addAttribute(TextAttribute.INPUT_METHOD_UNDERLINE, TextAttribute.UNDERLINE_LOW_TWO_PIXEL, start, end);
//            }
//            if(rt[i].isStrikethrough()) at.addAttribute(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON, start, end);
//            int superScript = rt[i].getSuperscript();
//            if(superScript != 0) at.addAttribute(TextAttribute.SUPERSCRIPT, superScript > 0 ? TextAttribute.SUPERSCRIPT_SUPER : TextAttribute.SUPERSCRIPT_SUB, start, end);
//
//        }
//        return at;
//    }

    public void paint(Graphics2D graphics){
    	Rectangle2D r2d = _shape.getLogicalAnchor2D();
        RectF anchor = new RectF((float)r2d.getX(), (float)r2d.getY(), (float)r2d.getX() + (float)r2d.getWidth(), (float)r2d.getY() + (float)r2d.getHeight());
        Paint p = new TextPaint();
        
        TextRun run = _shape.getTextRun();
        if (run == null) return;

        String text = run.getText();
        if (text == null || text.equals("")) return;
        
        SpannableStringBuilder ssb = getAttributedString(run);
//        TextElement[] elem = getTextElements((float)anchor.width(), p);
//        if(elem == null) return;
//
//        float textHeight = 0;
//        for (int i = 0; i < elem.length; i++) {
//            textHeight += elem[i].ascent + elem[i].descent;
//        }
//
//        int valign = _shape.getVerticalAlignment();
//        double y0 = anchor.top;
//        switch (valign){
//            case TextShape.AnchorTopBaseline:
//            case TextShape.AnchorTop:
//                y0 += _shape.getMarginTop();
//                break;
//            case TextShape.AnchorBottom:
//                y0 += anchor.height() - textHeight - _shape.getMarginBottom();
//                break;
//            default:
//            case TextShape.AnchorMiddle:
//                float delta =  (float)anchor.height() - textHeight - _shape.getMarginTop() - _shape.getMarginBottom();
//                y0 += _shape.getMarginTop()  + delta/2;
//                break;
//        }
//
//        //finally draw the text fragments
//        for (int i = 0; i < elem.length; i++) {
//            y0 += elem[i].ascent;
//            
//            Point pen = new Point();
//            pen.y = (int) y0;
//            switch (elem[i]._align) {
//                default:
//                case TextShape.AlignLeft:
//                    pen.x = (int) (anchor.left + _shape.getMarginLeft());
//                    break;
//                case TextShape.AlignCenter:
//                    pen.x = (int) (anchor.left + _shape.getMarginLeft() +
//                            (anchor.width() - elem[i].advance - _shape.getMarginLeft() - _shape.getMarginRight()) / 2);
//                    break;
//                case TextShape.AlignRight:
//                    pen.x = (int) (anchor.left + _shape.getMarginLeft() +
//                            (anchor.width() - elem[i].advance - _shape.getMarginLeft() - _shape.getMarginRight()));
//                    break;
//            }
//            if(elem[i]._bullet != null){
////            	graphics.drawText(text, x, y, paint);
//                graphics.drawString(elem[i]._bullet.getIterator(), (float)(pen.x + elem[i]._bulletOffset), (float)pen.y);
//            }
//            AttributedCharacterIterator chIt = elem[i]._text.getIterator();
//            if(chIt.getEndIndex() > chIt.getBeginIndex()) {
//                graphics.drawString(chIt, (float)(pen.x + elem[i]._textOffset), (float)pen.y);
//            }
//            y0 += elem[i].descent;
//        }
        
        graphics.canvas.save();
        graphics.canvas.translate(_shape.getMarginLeft(), anchor.top + _shape.getMarginTop());
        
        System.out.println("anchor.width(): " + anchor.width() + ", " + _shape.getMarginLeft() + ", " + _shape.getMarginRight());
        
        StaticLayout sl = new StaticLayout(ssb, new TextPaint(p), (int) Math.ceil(anchor.width()), Alignment.ALIGN_NORMAL, 1f, 0f, false);
        sl.draw(graphics.canvas);
        
        if(sl.getLineCount() > 5) {
        	System.out.println("getLineWidth: " + sl.getLineWidth(5) + ", " + sl.getParagraphRight(5));
        }
        System.out.println("getLineWidth: " + sl.getLineCount());
        
        graphics.canvas.restore();
    }

    public TextElement[] getTextElements(float textWidth, Paint frc){
        TextRun run = _shape.getTextRun();
        if (run == null) return null;

        String text = run.getText();
        if (text == null || text.equals("")) return null;

        SpannableStringBuilder at = getAttributedString(run);

//        AttributedCharacterIterator it = at.getIterator();
//        int paragraphStart = it.getBeginIndex();
//        int paragraphEnd = it.getEndIndex();
        
        List<TextElement> lines = new ArrayList<TextElement>();
//        LineBreakMeasurer measurer = new LineBreakMeasurer(it, frc);
//        measurer.setPosition(paragraphStart);
        
        
        int start = 0;
        while (start < at.length()) {
            int startIndex = start;
            int nextBreak = text.indexOf('\n', start + 1);

            boolean prStart = text.charAt(startIndex) == '\n';
            if(prStart) start = startIndex++;

            RichTextRun rt = run.getRichTextRunAt(startIndex == text.length() ? (startIndex-1) : startIndex);
            if(rt == null) {
                logger.log(POILogger.WARN,  "RichTextRun not found at pos" + startIndex + "; text.length: " + text.length());
                break;
            }

            float wrappingWidth = textWidth - _shape.getMarginLeft() - _shape.getMarginRight();
            int bulletOffset = rt.getBulletOffset();
            int textOffset = rt.getTextOffset();
            int indent = rt.getIndentLevel();

            TextRulerAtom ruler = run.getTextRuler();
            if(ruler != null) {
                int bullet_val = ruler.getBulletOffsets()[indent]*Shape.POINT_DPI/Shape.MASTER_DPI;
                int text_val = ruler.getTextOffsets()[indent]*Shape.POINT_DPI/Shape.MASTER_DPI;
                if(bullet_val > text_val){
                    int a = bullet_val;
                    bullet_val = text_val;
                    text_val = a;
                }
                if(bullet_val != 0 ) bulletOffset = bullet_val;
                if(text_val != 0) textOffset = text_val;
            }

            if(bulletOffset > 0 || prStart || startIndex == 0) wrappingWidth -= textOffset;

            if (_shape.getWordWrap() == TextShape.WrapNone) {
                wrappingWidth = (float) _shape.getSheet().getSlideShow().getPageSize().getWidth();
            }

            StaticLayout sl = new StaticLayout(at, new TextPaint(), (int) wrappingWidth, Layout.Alignment.ALIGN_NORMAL, 1.5f, 0, false);
            sl.getLineCount();
//            int measuredCount = frc.breakText(text, paragraphStart, paragraphEnd, false, wrappingWidth, null);
            FontMetrics fm = frc.getFontMetrics();
            
//            TextLayout textLayout = measurer.nextLayout(wrappingWidth + 1,
//                    nextBreak == -1 ? paragraphEnd : nextBreak, true);
//            if (textLayout == null) {
//                textLayout = measurer.nextLayout(textWidth,
//                    nextBreak == -1 ? paragraphEnd : nextBreak, false);
//            }
//            if(textLayout == null){
//                logger.log(POILogger.WARN, "Failed to break text into lines: wrappingWidth: "+wrappingWidth+
//                        "; text: " + rt.getText());
//                measurer.setPosition(rt.getEndIndex());
//                continue;
//            }
//            int endIndex = start + measuredCount;
//            
//            Rect bounds = new Rect();
//            frc.getTextBounds(text, paragraphStart, paragraphStart + measuredCount, bounds);
//            
//            float[] widths = new float[measuredCount];
//            frc.getTextWidths(text, paragraphStart, paragraphStart + measuredCount, widths);
//            float advance = 0;
//            for (float w : widths) {
//            	advance += w;
//            }

////            float lineHeight = (float)textLayout.getBounds().getHeight();
//            float lineHeight = bounds.height();
//            int linespacing = rt.getLineSpacing();
//            if(linespacing == 0) linespacing = 100;
//
//            TextElement el = new TextElement();
//            if(linespacing >= 0){
////                el.ascent = textLayout.getAscent()*linespacing/100;
//            	el.ascent = fm.ascent*linespacing/100;
//            } else {
//                el.ascent = -linespacing*Shape.POINT_DPI/Shape.MASTER_DPI;
//            }
//
//            el._align = rt.getAlignment();
////            el.advance = textLayout.getAdvance();
//            el.advance = advance;
//            el._textOffset = textOffset;
//            el._text = new AttributedString(it, startIndex, endIndex);
//            el.textStartIndex = startIndex;
//            el.textEndIndex = endIndex;
//
//            if (prStart){
//                int sp = rt.getSpaceBefore();
//                float spaceBefore;
//                if(sp >= 0){
//                    spaceBefore = lineHeight * sp/100;
//                } else {
//                    spaceBefore = -sp*Shape.POINT_DPI/Shape.MASTER_DPI;
//                }
//                el.ascent += spaceBefore;
//            }
//
//            float descent;
//            if(linespacing >= 0){
////                descent = (textLayout.getDescent() + textLayout.getLeading())*linespacing/100;
//            	descent = (fm.descent + fm.leading)*linespacing/100;
//            } else {
//                descent = -linespacing*Shape.POINT_DPI/Shape.MASTER_DPI;
//            }
//            if (prStart){
//                int sp = rt.getSpaceAfter();
//                float spaceAfter;
//                if(sp >= 0){
//                    spaceAfter = lineHeight * sp/100;
//                } else {
//                    spaceAfter = -sp*Shape.POINT_DPI/Shape.MASTER_DPI;
//                }
//                el.ascent += spaceAfter;
//            }
//            el.descent = descent;

//            if(rt.isBullet() && (prStart || startIndex == 0)){
//                it.setIndex(startIndex);
//
//                AttributedString bat = new AttributedString(Character.toString(rt.getBulletChar()));
//                int clr = rt.getBulletColor();
//                if (clr != -1) bat.addAttribute(TextAttribute.FOREGROUND, clr);
//                else bat.addAttribute(TextAttribute.FOREGROUND, it.getAttribute(TextAttribute.FOREGROUND));
//
//                int fontIdx = rt.getBulletFont();
//                if(fontIdx == -1) fontIdx = rt.getFontIndex();
//                PPFont bulletFont = _shape.getSheet().getSlideShow().getFont(fontIdx);
//                bat.addAttribute(TextAttribute.FAMILY, bulletFont.getFontName());
//
//                int bulletSize = rt.getBulletSize();
//                int fontSize = rt.getFontSize();
//                if(bulletSize != -1) fontSize = Math.round(fontSize*bulletSize*0.01f);
//                bat.addAttribute(TextAttribute.SIZE, new Float(fontSize));
//
////                Typeface.create(bulletFont.getFontName(), Typeface.NORMAL);
//                //!new Font(bulletFont.getFontName(), Font.PLAIN, 1).canDisplay(rt.getBulletChar())
//                if(false){
//                    bat.addAttribute(TextAttribute.FAMILY, "Arial");
//                    bat = new AttributedString("" + DEFAULT_BULLET_CHAR, bat.getIterator().getAttributes());
//                }
//
//                if(text.substring(startIndex, endIndex).length() > 1){
//                    el._bullet = bat;
//                    el._bulletOffset = bulletOffset;
//                }
//            }
//            lines.add(el);
        }

        //finally draw the text fragments
        TextElement[] elems = new TextElement[lines.size()];
        return lines.toArray(elems);
    }

    public static class TextElement {
        public AttributedString _text;
        public int _textOffset;
        public AttributedString _bullet;
        public int _bulletOffset;
        public int _align;
        public float ascent, descent;
        public float advance;
        public int textStartIndex, textEndIndex;
    }
}

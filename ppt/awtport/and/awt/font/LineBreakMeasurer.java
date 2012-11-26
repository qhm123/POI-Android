package and.awt.font;

import java.text.AttributedCharacterIterator;
import java.text.BreakIterator;

public class LineBreakMeasurer {

    private BreakIterator breakIter;
    private int start;
    private int pos;
    private int limit;
    private TextMeasurer measurer;
    private CharArrayIterator charIter;

    /**
     * Constructs a <code>LineBreakMeasurer</code> for the specified text.
     *
     * @param text the text for which this <code>LineBreakMeasurer</code>
     *       produces <code>TextLayout</code> objects; the text must contain
     *       at least one character; if the text available through
     *       <code>iter</code> changes, further calls to this
     *       <code>LineBreakMeasurer</code> instance are undefined (except,
     *       in some cases, when <code>insertChar</code> or
     *       <code>deleteChar</code> are invoked afterward - see below)
     * @param frc contains information about a graphics device which is
     *       needed to measure the text correctly;
     *       text measurements can vary slightly depending on the
     *       device resolution, and attributes such as antialiasing; this
     *       parameter does not specify a translation between the
     *       <code>LineBreakMeasurer</code> and user space
     * @see LineBreakMeasurer#insertChar
     * @see LineBreakMeasurer#deleteChar
     */
    public LineBreakMeasurer(AttributedCharacterIterator text, FontRenderContext frc) {
        this(text, BreakIterator.getLineInstance(), frc);
    }

    /**
     * Constructs a <code>LineBreakMeasurer</code> for the specified text.
     *
     * @param text the text for which this <code>LineBreakMeasurer</code>
     *     produces <code>TextLayout</code> objects; the text must contain
     *     at least one character; if the text available through
     *     <code>iter</code> changes, further calls to this
     *     <code>LineBreakMeasurer</code> instance are undefined (except,
     *     in some cases, when <code>insertChar</code> or
     *     <code>deleteChar</code> are invoked afterward - see below)
     * @param breakIter the {@link BreakIterator} which defines line
     *     breaks
     * @param frc contains information about a graphics device which is
     *       needed to measure the text correctly;
     *       text measurements can vary slightly depending on the
     *       device resolution, and attributes such as antialiasing; this
     *       parameter does not specify a translation between the
     *       <code>LineBreakMeasurer</code> and user space
     * @throws IllegalArgumentException if the text has less than one character
     * @see LineBreakMeasurer#insertChar
     * @see LineBreakMeasurer#deleteChar
     */
    public LineBreakMeasurer(AttributedCharacterIterator text,
                             BreakIterator breakIter,
                             FontRenderContext frc) {
        if (text.getEndIndex() - text.getBeginIndex() < 1) {
            throw new IllegalArgumentException("Text must contain at least one character.");
        }

        this.breakIter = breakIter;
        this.measurer = new TextMeasurer(text, frc);
        this.limit = text.getEndIndex();
        this.pos = this.start = text.getBeginIndex();

        charIter = new CharArrayIterator(measurer.getChars(), this.start);
        this.breakIter.setText(charIter);
    }

    /**
     * Returns the position at the end of the next layout.  Does NOT
     * update the current position of this <code>LineBreakMeasurer</code>.
     *
     * @param wrappingWidth the maximum visible advance permitted for
     *    the text in the next layout
     * @return an offset in the text representing the limit of the
     *    next <code>TextLayout</code>.
     */
    public int nextOffset(float wrappingWidth) {
        return nextOffset(wrappingWidth, limit, false);
    }

    /**
     * Returns the position at the end of the next layout.  Does NOT
     * update the current position of this <code>LineBreakMeasurer</code>.
     *
     * @param wrappingWidth the maximum visible advance permitted for
     *    the text in the next layout
     * @param offsetLimit the first character that can not be included
     *    in the next layout, even if the text after the limit would fit
     *    within the wrapping width; <code>offsetLimit</code> must be
     *    greater than the current position
     * @param requireNextWord if <code>true</code>, the current position
     *    that is returned if the entire next word does not fit within
     *    <code>wrappingWidth</code>; if <code>false</code>, the offset
     *    returned is at least one greater than the current position
     * @return an offset in the text representing the limit of the
     *    next <code>TextLayout</code>
     */
    public int nextOffset(float wrappingWidth, int offsetLimit,
                          boolean requireNextWord) {

        int nextOffset = pos;

        if (pos < limit) {
            if (offsetLimit <= pos) {
                    throw new IllegalArgumentException("offsetLimit must be after current position");
            }

            int charAtMaxAdvance =
                            measurer.getLineBreakIndex(pos, wrappingWidth);

            if (charAtMaxAdvance == limit) {
                nextOffset = limit;
            }
            else if (Character.isWhitespace(measurer.getChars()[charAtMaxAdvance-start])) {
                nextOffset = breakIter.following(charAtMaxAdvance);
            }
            else {
            // Break is in a word;  back up to previous break.

                // NOTE:  I think that breakIter.preceding(limit) should be
                // equivalent to breakIter.last(), breakIter.previous() but
                // the authors of BreakIterator thought otherwise...
                // If they were equivalent then the first branch would be
                // unnecessary.
                int testPos = charAtMaxAdvance + 1;
                if (testPos == limit) {
                    breakIter.last();
                    nextOffset = breakIter.previous();
                }
                else {
                    nextOffset = breakIter.preceding(testPos);
                }

                if (nextOffset <= pos) {
                    // first word doesn't fit on line
                    if (requireNextWord) {
                        nextOffset = pos;
                    }
                    else {
                        nextOffset = Math.max(pos+1, charAtMaxAdvance);
                    }
                }
            }
        }

        if (nextOffset > offsetLimit) {
            nextOffset = offsetLimit;
        }

        return nextOffset;
    }

    /**
     * Returns the next layout, and updates the current position.
     *
     * @param wrappingWidth the maximum visible advance permitted for
     *     the text in the next layout
     * @return a <code>TextLayout</code>, beginning at the current
     *     position, which represents the next line fitting within
     *     <code>wrappingWidth</code>
     */
    public TextLayout nextLayout(float wrappingWidth) {
        return nextLayout(wrappingWidth, limit, false);
    }

    /**
     * Returns the next layout, and updates the current position.
     *
     * @param wrappingWidth the maximum visible advance permitted
     *    for the text in the next layout
     * @param offsetLimit the first character that can not be
     *    included in the next layout, even if the text after the limit
     *    would fit within the wrapping width; <code>offsetLimit</code>
     *    must be greater than the current position
     * @param requireNextWord if <code>true</code>, and if the entire word
     *    at the current position does not fit within the wrapping width,
     *    <code>null</code> is returned. If <code>false</code>, a valid
     *    layout is returned that includes at least the character at the
     *    current position
     * @return a <code>TextLayout</code>, beginning at the current
     *    position, that represents the next line fitting within
     *    <code>wrappingWidth</code>.  If the current position is at the end
     *    of the text used by this <code>LineBreakMeasurer</code>,
     *    <code>null</code> is returned
     */
    public TextLayout nextLayout(float wrappingWidth, int offsetLimit,
                                 boolean requireNextWord) {

        if (pos < limit) {
            int layoutLimit = nextOffset(wrappingWidth, offsetLimit, requireNextWord);
            if (layoutLimit == pos) {
                return null;
            }

            TextLayout result = measurer.getLayout(pos, layoutLimit);
            pos = layoutLimit;

            return result;
        } else {
            return null;
        }
    }

    /**
     * Returns the current position of this <code>LineBreakMeasurer</code>.
     *
     * @return the current position of this <code>LineBreakMeasurer</code>
     * @see #setPosition
     */
    public int getPosition() {
        return pos;
    }

    /**
     * Sets the current position of this <code>LineBreakMeasurer</code>.
     *
     * @param newPosition the current position of this
     *    <code>LineBreakMeasurer</code>; the position should be within the
     *    text used to construct this <code>LineBreakMeasurer</code> (or in
     *    the text most recently passed to <code>insertChar</code>
     *    or <code>deleteChar</code>
     * @see #getPosition
     */
    public void setPosition(int newPosition) {
        if (newPosition < start || newPosition > limit) {
            throw new IllegalArgumentException("position is out of range");
        }
        pos = newPosition;
    }

    /**
     * Updates this <code>LineBreakMeasurer</code> after a single
     * character is inserted into the text, and sets the current
     * position to the beginning of the paragraph.
     *
     * @param newParagraph the text after the insertion
     * @param insertPos the position in the text at which the character
     *    is inserted
     * @throws IndexOutOfBoundsException if <code>insertPos</code> is less
     *         than the start of <code>newParagraph</code> or greater than
     *         or equal to the end of <code>newParagraph</code>
     * @throws NullPointerException if <code>newParagraph</code> is
     *         <code>null</code>
     * @see #deleteChar
     */
    public void insertChar(AttributedCharacterIterator newParagraph,
                           int insertPos) {

        measurer.insertChar(newParagraph, insertPos);

        limit = newParagraph.getEndIndex();
        pos = start = newParagraph.getBeginIndex();

        charIter.reset(measurer.getChars(), newParagraph.getBeginIndex());
        breakIter.setText(charIter);
    }

    /**
     * Updates this <code>LineBreakMeasurer</code> after a single
     * character is deleted from the text, and sets the current
     * position to the beginning of the paragraph.
     * @param newParagraph the text after the deletion
     * @param deletePos the position in the text at which the character
     *    is deleted
     * @throws IndexOutOfBoundsException if <code>deletePos</code> is
     *         less than the start of <code>newParagraph</code> or greater
     *         than the end of <code>newParagraph</code>
     * @throws NullPointerException if <code>newParagraph</code> is
     *         <code>null</code>
     * @see #insertChar
     */
    public void deleteChar(AttributedCharacterIterator newParagraph,
                           int deletePos) {

        measurer.deleteChar(newParagraph, deletePos);

        limit = newParagraph.getEndIndex();
        pos = start = newParagraph.getBeginIndex();

        charIter.reset(measurer.getChars(), start);
        breakIter.setText(charIter);
    }

}

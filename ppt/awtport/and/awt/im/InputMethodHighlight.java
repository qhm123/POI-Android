package and.awt.im;

import java.awt.font.TextAttribute;
import java.util.Map;

public class InputMethodHighlight {
	  /**
     * Constant for the raw text state.
     */
    public final static int RAW_TEXT = 0;

    /**
     * Constant for the converted text state.
     */
    public final static int CONVERTED_TEXT = 1;


    /**
     * Constant for the default highlight for unselected raw text.
     */
    public final static InputMethodHighlight UNSELECTED_RAW_TEXT_HIGHLIGHT =
        new InputMethodHighlight(false, RAW_TEXT);

    /**
     * Constant for the default highlight for selected raw text.
     */
    public final static InputMethodHighlight SELECTED_RAW_TEXT_HIGHLIGHT =
        new InputMethodHighlight(true, RAW_TEXT);

    /**
     * Constant for the default highlight for unselected converted text.
     */
    public final static InputMethodHighlight UNSELECTED_CONVERTED_TEXT_HIGHLIGHT =
        new InputMethodHighlight(false, CONVERTED_TEXT);

    /**
     * Constant for the default highlight for selected converted text.
     */
    public final static InputMethodHighlight SELECTED_CONVERTED_TEXT_HIGHLIGHT =
        new InputMethodHighlight(true, CONVERTED_TEXT);


    /**
     * Constructs an input method highlight record.
     * The variation is set to 0, the style to null.
     * @param selected Whether the text range is selected
     * @param state The conversion state for the text range - RAW_TEXT or CONVERTED_TEXT
     * @see InputMethodHighlight#RAW_TEXT
     * @see InputMethodHighlight#CONVERTED_TEXT
     * @exception IllegalArgumentException if a state other than RAW_TEXT or CONVERTED_TEXT is given
     */
    public InputMethodHighlight(boolean selected, int state) {
        this(selected, state, 0, null);
    }

    /**
     * Constructs an input method highlight record.
     * The style is set to null.
     * @param selected Whether the text range is selected
     * @param state The conversion state for the text range - RAW_TEXT or CONVERTED_TEXT
     * @param variation The style variation for the text range
     * @see InputMethodHighlight#RAW_TEXT
     * @see InputMethodHighlight#CONVERTED_TEXT
     * @exception IllegalArgumentException if a state other than RAW_TEXT or CONVERTED_TEXT is given
     */
    public InputMethodHighlight(boolean selected, int state, int variation) {
        this(selected, state, variation, null);
    }

    /**
     * Constructs an input method highlight record.
     * The style attributes map provided must be unmodifiable.
     * @param selected whether the text range is selected
     * @param state the conversion state for the text range - RAW_TEXT or CONVERTED_TEXT
     * @param variation the variation for the text range
     * @param style the rendering style attributes for the text range, or null
     * @see InputMethodHighlight#RAW_TEXT
     * @see InputMethodHighlight#CONVERTED_TEXT
     * @exception IllegalArgumentException if a state other than RAW_TEXT or CONVERTED_TEXT is given
     * @since 1.3
     */
    public InputMethodHighlight(boolean selected, int state, int variation,
                                Map<TextAttribute,?> style)
    {
        this.selected = selected;
        if (!(state == RAW_TEXT || state == CONVERTED_TEXT)) {
            throw new IllegalArgumentException("unknown input method highlight state");
        }
        this.state = state;
        this.variation = variation;
        this.style = style;
    }

    /**
     * Returns whether the text range is selected.
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Returns the conversion state of the text range.
     * @return The conversion state for the text range - RAW_TEXT or CONVERTED_TEXT.
     * @see InputMethodHighlight#RAW_TEXT
     * @see InputMethodHighlight#CONVERTED_TEXT
     */
    public int getState() {
        return state;
    }

    /**
     * Returns the variation of the text range.
     */
    public int getVariation() {
        return variation;
    }

    /**
     * Returns the rendering style attributes for the text range, or null.
     * @since 1.3
     */
    public Map<TextAttribute,?> getStyle() {
        return style;
    }

    private boolean selected;
    private int state;
    private int variation;
    private Map style;


}

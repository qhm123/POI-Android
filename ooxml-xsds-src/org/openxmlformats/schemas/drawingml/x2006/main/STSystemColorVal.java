/*
 * XML Type:  ST_SystemColorVal
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STSystemColorVal
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_SystemColorVal(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STSystemColorVal.
 */
public interface STSystemColorVal extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STSystemColorVal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stsystemcolorvalf938type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SCROLL_BAR = Enum.forString("scrollBar");
    static final Enum BACKGROUND = Enum.forString("background");
    static final Enum ACTIVE_CAPTION = Enum.forString("activeCaption");
    static final Enum INACTIVE_CAPTION = Enum.forString("inactiveCaption");
    static final Enum MENU = Enum.forString("menu");
    static final Enum WINDOW = Enum.forString("window");
    static final Enum WINDOW_FRAME = Enum.forString("windowFrame");
    static final Enum MENU_TEXT = Enum.forString("menuText");
    static final Enum WINDOW_TEXT = Enum.forString("windowText");
    static final Enum CAPTION_TEXT = Enum.forString("captionText");
    static final Enum ACTIVE_BORDER = Enum.forString("activeBorder");
    static final Enum INACTIVE_BORDER = Enum.forString("inactiveBorder");
    static final Enum APP_WORKSPACE = Enum.forString("appWorkspace");
    static final Enum HIGHLIGHT = Enum.forString("highlight");
    static final Enum HIGHLIGHT_TEXT = Enum.forString("highlightText");
    static final Enum BTN_FACE = Enum.forString("btnFace");
    static final Enum BTN_SHADOW = Enum.forString("btnShadow");
    static final Enum GRAY_TEXT = Enum.forString("grayText");
    static final Enum BTN_TEXT = Enum.forString("btnText");
    static final Enum INACTIVE_CAPTION_TEXT = Enum.forString("inactiveCaptionText");
    static final Enum BTN_HIGHLIGHT = Enum.forString("btnHighlight");
    static final Enum X_3_D_DK_SHADOW = Enum.forString("3dDkShadow");
    static final Enum X_3_D_LIGHT = Enum.forString("3dLight");
    static final Enum INFO_TEXT = Enum.forString("infoText");
    static final Enum INFO_BK = Enum.forString("infoBk");
    static final Enum HOT_LIGHT = Enum.forString("hotLight");
    static final Enum GRADIENT_ACTIVE_CAPTION = Enum.forString("gradientActiveCaption");
    static final Enum GRADIENT_INACTIVE_CAPTION = Enum.forString("gradientInactiveCaption");
    static final Enum MENU_HIGHLIGHT = Enum.forString("menuHighlight");
    static final Enum MENU_BAR = Enum.forString("menuBar");
    
    static final int INT_SCROLL_BAR = Enum.INT_SCROLL_BAR;
    static final int INT_BACKGROUND = Enum.INT_BACKGROUND;
    static final int INT_ACTIVE_CAPTION = Enum.INT_ACTIVE_CAPTION;
    static final int INT_INACTIVE_CAPTION = Enum.INT_INACTIVE_CAPTION;
    static final int INT_MENU = Enum.INT_MENU;
    static final int INT_WINDOW = Enum.INT_WINDOW;
    static final int INT_WINDOW_FRAME = Enum.INT_WINDOW_FRAME;
    static final int INT_MENU_TEXT = Enum.INT_MENU_TEXT;
    static final int INT_WINDOW_TEXT = Enum.INT_WINDOW_TEXT;
    static final int INT_CAPTION_TEXT = Enum.INT_CAPTION_TEXT;
    static final int INT_ACTIVE_BORDER = Enum.INT_ACTIVE_BORDER;
    static final int INT_INACTIVE_BORDER = Enum.INT_INACTIVE_BORDER;
    static final int INT_APP_WORKSPACE = Enum.INT_APP_WORKSPACE;
    static final int INT_HIGHLIGHT = Enum.INT_HIGHLIGHT;
    static final int INT_HIGHLIGHT_TEXT = Enum.INT_HIGHLIGHT_TEXT;
    static final int INT_BTN_FACE = Enum.INT_BTN_FACE;
    static final int INT_BTN_SHADOW = Enum.INT_BTN_SHADOW;
    static final int INT_GRAY_TEXT = Enum.INT_GRAY_TEXT;
    static final int INT_BTN_TEXT = Enum.INT_BTN_TEXT;
    static final int INT_INACTIVE_CAPTION_TEXT = Enum.INT_INACTIVE_CAPTION_TEXT;
    static final int INT_BTN_HIGHLIGHT = Enum.INT_BTN_HIGHLIGHT;
    static final int INT_X_3_D_DK_SHADOW = Enum.INT_X_3_D_DK_SHADOW;
    static final int INT_X_3_D_LIGHT = Enum.INT_X_3_D_LIGHT;
    static final int INT_INFO_TEXT = Enum.INT_INFO_TEXT;
    static final int INT_INFO_BK = Enum.INT_INFO_BK;
    static final int INT_HOT_LIGHT = Enum.INT_HOT_LIGHT;
    static final int INT_GRADIENT_ACTIVE_CAPTION = Enum.INT_GRADIENT_ACTIVE_CAPTION;
    static final int INT_GRADIENT_INACTIVE_CAPTION = Enum.INT_GRADIENT_INACTIVE_CAPTION;
    static final int INT_MENU_HIGHLIGHT = Enum.INT_MENU_HIGHLIGHT;
    static final int INT_MENU_BAR = Enum.INT_MENU_BAR;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STSystemColorVal.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SCROLL_BAR
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_SCROLL_BAR = 1;
        static final int INT_BACKGROUND = 2;
        static final int INT_ACTIVE_CAPTION = 3;
        static final int INT_INACTIVE_CAPTION = 4;
        static final int INT_MENU = 5;
        static final int INT_WINDOW = 6;
        static final int INT_WINDOW_FRAME = 7;
        static final int INT_MENU_TEXT = 8;
        static final int INT_WINDOW_TEXT = 9;
        static final int INT_CAPTION_TEXT = 10;
        static final int INT_ACTIVE_BORDER = 11;
        static final int INT_INACTIVE_BORDER = 12;
        static final int INT_APP_WORKSPACE = 13;
        static final int INT_HIGHLIGHT = 14;
        static final int INT_HIGHLIGHT_TEXT = 15;
        static final int INT_BTN_FACE = 16;
        static final int INT_BTN_SHADOW = 17;
        static final int INT_GRAY_TEXT = 18;
        static final int INT_BTN_TEXT = 19;
        static final int INT_INACTIVE_CAPTION_TEXT = 20;
        static final int INT_BTN_HIGHLIGHT = 21;
        static final int INT_X_3_D_DK_SHADOW = 22;
        static final int INT_X_3_D_LIGHT = 23;
        static final int INT_INFO_TEXT = 24;
        static final int INT_INFO_BK = 25;
        static final int INT_HOT_LIGHT = 26;
        static final int INT_GRADIENT_ACTIVE_CAPTION = 27;
        static final int INT_GRADIENT_INACTIVE_CAPTION = 28;
        static final int INT_MENU_HIGHLIGHT = 29;
        static final int INT_MENU_BAR = 30;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("scrollBar", INT_SCROLL_BAR),
                new Enum("background", INT_BACKGROUND),
                new Enum("activeCaption", INT_ACTIVE_CAPTION),
                new Enum("inactiveCaption", INT_INACTIVE_CAPTION),
                new Enum("menu", INT_MENU),
                new Enum("window", INT_WINDOW),
                new Enum("windowFrame", INT_WINDOW_FRAME),
                new Enum("menuText", INT_MENU_TEXT),
                new Enum("windowText", INT_WINDOW_TEXT),
                new Enum("captionText", INT_CAPTION_TEXT),
                new Enum("activeBorder", INT_ACTIVE_BORDER),
                new Enum("inactiveBorder", INT_INACTIVE_BORDER),
                new Enum("appWorkspace", INT_APP_WORKSPACE),
                new Enum("highlight", INT_HIGHLIGHT),
                new Enum("highlightText", INT_HIGHLIGHT_TEXT),
                new Enum("btnFace", INT_BTN_FACE),
                new Enum("btnShadow", INT_BTN_SHADOW),
                new Enum("grayText", INT_GRAY_TEXT),
                new Enum("btnText", INT_BTN_TEXT),
                new Enum("inactiveCaptionText", INT_INACTIVE_CAPTION_TEXT),
                new Enum("btnHighlight", INT_BTN_HIGHLIGHT),
                new Enum("3dDkShadow", INT_X_3_D_DK_SHADOW),
                new Enum("3dLight", INT_X_3_D_LIGHT),
                new Enum("infoText", INT_INFO_TEXT),
                new Enum("infoBk", INT_INFO_BK),
                new Enum("hotLight", INT_HOT_LIGHT),
                new Enum("gradientActiveCaption", INT_GRADIENT_ACTIVE_CAPTION),
                new Enum("gradientInactiveCaption", INT_GRADIENT_INACTIVE_CAPTION),
                new Enum("menuHighlight", INT_MENU_HIGHLIGHT),
                new Enum("menuBar", INT_MENU_BAR),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

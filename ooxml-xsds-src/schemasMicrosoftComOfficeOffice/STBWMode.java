/*
 * XML Type:  ST_BWMode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.STBWMode
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML ST_BWMode(@urn:schemas-microsoft-com:office:office).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComOfficeOffice.STBWMode.
 */
public interface STBWMode extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STBWMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stbwmode77abtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum COLOR = Enum.forString("color");
    static final Enum AUTO = Enum.forString("auto");
    static final Enum GRAY_SCALE = Enum.forString("grayScale");
    static final Enum LIGHT_GRAYSCALE = Enum.forString("lightGrayscale");
    static final Enum INVERSE_GRAY = Enum.forString("inverseGray");
    static final Enum GRAY_OUTLINE = Enum.forString("grayOutline");
    static final Enum HIGH_CONTRAST = Enum.forString("highContrast");
    static final Enum BLACK = Enum.forString("black");
    static final Enum WHITE = Enum.forString("white");
    static final Enum HIDE = Enum.forString("hide");
    static final Enum UNDRAWN = Enum.forString("undrawn");
    static final Enum BLACK_TEXT_AND_LINES = Enum.forString("blackTextAndLines");
    
    static final int INT_COLOR = Enum.INT_COLOR;
    static final int INT_AUTO = Enum.INT_AUTO;
    static final int INT_GRAY_SCALE = Enum.INT_GRAY_SCALE;
    static final int INT_LIGHT_GRAYSCALE = Enum.INT_LIGHT_GRAYSCALE;
    static final int INT_INVERSE_GRAY = Enum.INT_INVERSE_GRAY;
    static final int INT_GRAY_OUTLINE = Enum.INT_GRAY_OUTLINE;
    static final int INT_HIGH_CONTRAST = Enum.INT_HIGH_CONTRAST;
    static final int INT_BLACK = Enum.INT_BLACK;
    static final int INT_WHITE = Enum.INT_WHITE;
    static final int INT_HIDE = Enum.INT_HIDE;
    static final int INT_UNDRAWN = Enum.INT_UNDRAWN;
    static final int INT_BLACK_TEXT_AND_LINES = Enum.INT_BLACK_TEXT_AND_LINES;
    
    /**
     * Enumeration value class for schemasMicrosoftComOfficeOffice.STBWMode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_COLOR
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
        
        static final int INT_COLOR = 1;
        static final int INT_AUTO = 2;
        static final int INT_GRAY_SCALE = 3;
        static final int INT_LIGHT_GRAYSCALE = 4;
        static final int INT_INVERSE_GRAY = 5;
        static final int INT_GRAY_OUTLINE = 6;
        static final int INT_HIGH_CONTRAST = 7;
        static final int INT_BLACK = 8;
        static final int INT_WHITE = 9;
        static final int INT_HIDE = 10;
        static final int INT_UNDRAWN = 11;
        static final int INT_BLACK_TEXT_AND_LINES = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("color", INT_COLOR),
                new Enum("auto", INT_AUTO),
                new Enum("grayScale", INT_GRAY_SCALE),
                new Enum("lightGrayscale", INT_LIGHT_GRAYSCALE),
                new Enum("inverseGray", INT_INVERSE_GRAY),
                new Enum("grayOutline", INT_GRAY_OUTLINE),
                new Enum("highContrast", INT_HIGH_CONTRAST),
                new Enum("black", INT_BLACK),
                new Enum("white", INT_WHITE),
                new Enum("hide", INT_HIDE),
                new Enum("undrawn", INT_UNDRAWN),
                new Enum("blackTextAndLines", INT_BLACK_TEXT_AND_LINES),
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

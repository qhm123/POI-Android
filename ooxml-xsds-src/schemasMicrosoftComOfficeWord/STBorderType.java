/*
 * XML Type:  ST_BorderType
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.STBorderType
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * An XML ST_BorderType(@urn:schemas-microsoft-com:office:word).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComOfficeWord.STBorderType.
 */
public interface STBorderType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STBorderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stbordertype7cc7type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum SINGLE = Enum.forString("single");
    static final Enum THICK = Enum.forString("thick");
    static final Enum DOUBLE = Enum.forString("double");
    static final Enum HAIRLINE = Enum.forString("hairline");
    static final Enum DOT = Enum.forString("dot");
    static final Enum DASH = Enum.forString("dash");
    static final Enum DOT_DASH = Enum.forString("dotDash");
    static final Enum DASH_DOT_DOT = Enum.forString("dashDotDot");
    static final Enum TRIPLE = Enum.forString("triple");
    static final Enum THIN_THICK_SMALL = Enum.forString("thinThickSmall");
    static final Enum THICK_THIN_SMALL = Enum.forString("thickThinSmall");
    static final Enum THICK_BETWEEN_THIN_SMALL = Enum.forString("thickBetweenThinSmall");
    static final Enum THIN_THICK = Enum.forString("thinThick");
    static final Enum THICK_THIN = Enum.forString("thickThin");
    static final Enum THICK_BETWEEN_THIN = Enum.forString("thickBetweenThin");
    static final Enum THIN_THICK_LARGE = Enum.forString("thinThickLarge");
    static final Enum THICK_THIN_LARGE = Enum.forString("thickThinLarge");
    static final Enum THICK_BETWEEN_THIN_LARGE = Enum.forString("thickBetweenThinLarge");
    static final Enum WAVE = Enum.forString("wave");
    static final Enum DOUBLE_WAVE = Enum.forString("doubleWave");
    static final Enum DASHED_SMALL = Enum.forString("dashedSmall");
    static final Enum DASH_DOT_STROKED = Enum.forString("dashDotStroked");
    static final Enum THREE_D_EMBOSS = Enum.forString("threeDEmboss");
    static final Enum THREE_D_ENGRAVE = Enum.forString("threeDEngrave");
    static final Enum HTML_OUTSET = Enum.forString("HTMLOutset");
    static final Enum HTML_INSET = Enum.forString("HTMLInset");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_SINGLE = Enum.INT_SINGLE;
    static final int INT_THICK = Enum.INT_THICK;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_HAIRLINE = Enum.INT_HAIRLINE;
    static final int INT_DOT = Enum.INT_DOT;
    static final int INT_DASH = Enum.INT_DASH;
    static final int INT_DOT_DASH = Enum.INT_DOT_DASH;
    static final int INT_DASH_DOT_DOT = Enum.INT_DASH_DOT_DOT;
    static final int INT_TRIPLE = Enum.INT_TRIPLE;
    static final int INT_THIN_THICK_SMALL = Enum.INT_THIN_THICK_SMALL;
    static final int INT_THICK_THIN_SMALL = Enum.INT_THICK_THIN_SMALL;
    static final int INT_THICK_BETWEEN_THIN_SMALL = Enum.INT_THICK_BETWEEN_THIN_SMALL;
    static final int INT_THIN_THICK = Enum.INT_THIN_THICK;
    static final int INT_THICK_THIN = Enum.INT_THICK_THIN;
    static final int INT_THICK_BETWEEN_THIN = Enum.INT_THICK_BETWEEN_THIN;
    static final int INT_THIN_THICK_LARGE = Enum.INT_THIN_THICK_LARGE;
    static final int INT_THICK_THIN_LARGE = Enum.INT_THICK_THIN_LARGE;
    static final int INT_THICK_BETWEEN_THIN_LARGE = Enum.INT_THICK_BETWEEN_THIN_LARGE;
    static final int INT_WAVE = Enum.INT_WAVE;
    static final int INT_DOUBLE_WAVE = Enum.INT_DOUBLE_WAVE;
    static final int INT_DASHED_SMALL = Enum.INT_DASHED_SMALL;
    static final int INT_DASH_DOT_STROKED = Enum.INT_DASH_DOT_STROKED;
    static final int INT_THREE_D_EMBOSS = Enum.INT_THREE_D_EMBOSS;
    static final int INT_THREE_D_ENGRAVE = Enum.INT_THREE_D_ENGRAVE;
    static final int INT_HTML_OUTSET = Enum.INT_HTML_OUTSET;
    static final int INT_HTML_INSET = Enum.INT_HTML_INSET;
    
    /**
     * Enumeration value class for schemasMicrosoftComOfficeWord.STBorderType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
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
        
        static final int INT_NONE = 1;
        static final int INT_SINGLE = 2;
        static final int INT_THICK = 3;
        static final int INT_DOUBLE = 4;
        static final int INT_HAIRLINE = 5;
        static final int INT_DOT = 6;
        static final int INT_DASH = 7;
        static final int INT_DOT_DASH = 8;
        static final int INT_DASH_DOT_DOT = 9;
        static final int INT_TRIPLE = 10;
        static final int INT_THIN_THICK_SMALL = 11;
        static final int INT_THICK_THIN_SMALL = 12;
        static final int INT_THICK_BETWEEN_THIN_SMALL = 13;
        static final int INT_THIN_THICK = 14;
        static final int INT_THICK_THIN = 15;
        static final int INT_THICK_BETWEEN_THIN = 16;
        static final int INT_THIN_THICK_LARGE = 17;
        static final int INT_THICK_THIN_LARGE = 18;
        static final int INT_THICK_BETWEEN_THIN_LARGE = 19;
        static final int INT_WAVE = 20;
        static final int INT_DOUBLE_WAVE = 21;
        static final int INT_DASHED_SMALL = 22;
        static final int INT_DASH_DOT_STROKED = 23;
        static final int INT_THREE_D_EMBOSS = 24;
        static final int INT_THREE_D_ENGRAVE = 25;
        static final int INT_HTML_OUTSET = 26;
        static final int INT_HTML_INSET = 27;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("single", INT_SINGLE),
                new Enum("thick", INT_THICK),
                new Enum("double", INT_DOUBLE),
                new Enum("hairline", INT_HAIRLINE),
                new Enum("dot", INT_DOT),
                new Enum("dash", INT_DASH),
                new Enum("dotDash", INT_DOT_DASH),
                new Enum("dashDotDot", INT_DASH_DOT_DOT),
                new Enum("triple", INT_TRIPLE),
                new Enum("thinThickSmall", INT_THIN_THICK_SMALL),
                new Enum("thickThinSmall", INT_THICK_THIN_SMALL),
                new Enum("thickBetweenThinSmall", INT_THICK_BETWEEN_THIN_SMALL),
                new Enum("thinThick", INT_THIN_THICK),
                new Enum("thickThin", INT_THICK_THIN),
                new Enum("thickBetweenThin", INT_THICK_BETWEEN_THIN),
                new Enum("thinThickLarge", INT_THIN_THICK_LARGE),
                new Enum("thickThinLarge", INT_THICK_THIN_LARGE),
                new Enum("thickBetweenThinLarge", INT_THICK_BETWEEN_THIN_LARGE),
                new Enum("wave", INT_WAVE),
                new Enum("doubleWave", INT_DOUBLE_WAVE),
                new Enum("dashedSmall", INT_DASHED_SMALL),
                new Enum("dashDotStroked", INT_DASH_DOT_STROKED),
                new Enum("threeDEmboss", INT_THREE_D_EMBOSS),
                new Enum("threeDEngrave", INT_THREE_D_ENGRAVE),
                new Enum("HTMLOutset", INT_HTML_OUTSET),
                new Enum("HTMLInset", INT_HTML_INSET),
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

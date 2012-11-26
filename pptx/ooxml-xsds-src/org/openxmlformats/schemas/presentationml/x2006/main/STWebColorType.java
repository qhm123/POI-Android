/*
 * XML Type:  ST_WebColorType
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_WebColorType(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType.
 */
public interface STWebColorType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STWebColorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stwebcolortype822ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum BROWSER = Enum.forString("browser");
    static final Enum PRESENTATION_TEXT = Enum.forString("presentationText");
    static final Enum PRESENTATION_ACCENT = Enum.forString("presentationAccent");
    static final Enum WHITE_TEXT_ON_BLACK = Enum.forString("whiteTextOnBlack");
    static final Enum BLACK_TEXT_ON_WHITE = Enum.forString("blackTextOnWhite");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_BROWSER = Enum.INT_BROWSER;
    static final int INT_PRESENTATION_TEXT = Enum.INT_PRESENTATION_TEXT;
    static final int INT_PRESENTATION_ACCENT = Enum.INT_PRESENTATION_ACCENT;
    static final int INT_WHITE_TEXT_ON_BLACK = Enum.INT_WHITE_TEXT_ON_BLACK;
    static final int INT_BLACK_TEXT_ON_WHITE = Enum.INT_BLACK_TEXT_ON_WHITE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType.
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
        static final int INT_BROWSER = 2;
        static final int INT_PRESENTATION_TEXT = 3;
        static final int INT_PRESENTATION_ACCENT = 4;
        static final int INT_WHITE_TEXT_ON_BLACK = 5;
        static final int INT_BLACK_TEXT_ON_WHITE = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("browser", INT_BROWSER),
                new Enum("presentationText", INT_PRESENTATION_TEXT),
                new Enum("presentationAccent", INT_PRESENTATION_ACCENT),
                new Enum("whiteTextOnBlack", INT_WHITE_TEXT_ON_BLACK),
                new Enum("blackTextOnWhite", INT_BLACK_TEXT_ON_WHITE),
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

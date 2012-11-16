/*
 * XML Type:  ST_BlackWhiteMode
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_BlackWhiteMode(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode.
 */
public interface STBlackWhiteMode extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STBlackWhiteMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stblackwhitemode0558type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CLR = Enum.forString("clr");
    static final Enum AUTO = Enum.forString("auto");
    static final Enum GRAY = Enum.forString("gray");
    static final Enum LT_GRAY = Enum.forString("ltGray");
    static final Enum INV_GRAY = Enum.forString("invGray");
    static final Enum GRAY_WHITE = Enum.forString("grayWhite");
    static final Enum BLACK_GRAY = Enum.forString("blackGray");
    static final Enum BLACK_WHITE = Enum.forString("blackWhite");
    static final Enum BLACK = Enum.forString("black");
    static final Enum WHITE = Enum.forString("white");
    static final Enum HIDDEN = Enum.forString("hidden");
    
    static final int INT_CLR = Enum.INT_CLR;
    static final int INT_AUTO = Enum.INT_AUTO;
    static final int INT_GRAY = Enum.INT_GRAY;
    static final int INT_LT_GRAY = Enum.INT_LT_GRAY;
    static final int INT_INV_GRAY = Enum.INT_INV_GRAY;
    static final int INT_GRAY_WHITE = Enum.INT_GRAY_WHITE;
    static final int INT_BLACK_GRAY = Enum.INT_BLACK_GRAY;
    static final int INT_BLACK_WHITE = Enum.INT_BLACK_WHITE;
    static final int INT_BLACK = Enum.INT_BLACK;
    static final int INT_WHITE = Enum.INT_WHITE;
    static final int INT_HIDDEN = Enum.INT_HIDDEN;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CLR
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
        
        static final int INT_CLR = 1;
        static final int INT_AUTO = 2;
        static final int INT_GRAY = 3;
        static final int INT_LT_GRAY = 4;
        static final int INT_INV_GRAY = 5;
        static final int INT_GRAY_WHITE = 6;
        static final int INT_BLACK_GRAY = 7;
        static final int INT_BLACK_WHITE = 8;
        static final int INT_BLACK = 9;
        static final int INT_WHITE = 10;
        static final int INT_HIDDEN = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("clr", INT_CLR),
                new Enum("auto", INT_AUTO),
                new Enum("gray", INT_GRAY),
                new Enum("ltGray", INT_LT_GRAY),
                new Enum("invGray", INT_INV_GRAY),
                new Enum("grayWhite", INT_GRAY_WHITE),
                new Enum("blackGray", INT_BLACK_GRAY),
                new Enum("blackWhite", INT_BLACK_WHITE),
                new Enum("black", INT_BLACK),
                new Enum("white", INT_WHITE),
                new Enum("hidden", INT_HIDDEN),
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

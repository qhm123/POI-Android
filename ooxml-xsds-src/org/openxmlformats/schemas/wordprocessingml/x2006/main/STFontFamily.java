/*
 * XML Type:  ST_FontFamily
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STFontFamily
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_FontFamily(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STFontFamily.
 */
public interface STFontFamily extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STFontFamily.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stfontfamily4b65type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum DECORATIVE = Enum.forString("decorative");
    static final Enum MODERN = Enum.forString("modern");
    static final Enum ROMAN = Enum.forString("roman");
    static final Enum SCRIPT = Enum.forString("script");
    static final Enum SWISS = Enum.forString("swiss");
    static final Enum AUTO = Enum.forString("auto");
    
    static final int INT_DECORATIVE = Enum.INT_DECORATIVE;
    static final int INT_MODERN = Enum.INT_MODERN;
    static final int INT_ROMAN = Enum.INT_ROMAN;
    static final int INT_SCRIPT = Enum.INT_SCRIPT;
    static final int INT_SWISS = Enum.INT_SWISS;
    static final int INT_AUTO = Enum.INT_AUTO;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STFontFamily.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DECORATIVE
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
        
        static final int INT_DECORATIVE = 1;
        static final int INT_MODERN = 2;
        static final int INT_ROMAN = 3;
        static final int INT_SCRIPT = 4;
        static final int INT_SWISS = 5;
        static final int INT_AUTO = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("decorative", INT_DECORATIVE),
                new Enum("modern", INT_MODERN),
                new Enum("roman", INT_ROMAN),
                new Enum("script", INT_SCRIPT),
                new Enum("swiss", INT_SWISS),
                new Enum("auto", INT_AUTO),
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

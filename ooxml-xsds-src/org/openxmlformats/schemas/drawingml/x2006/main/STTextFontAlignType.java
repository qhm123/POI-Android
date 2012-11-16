/*
 * XML Type:  ST_TextFontAlignType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_TextFontAlignType(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType.
 */
public interface STTextFontAlignType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTextFontAlignType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttextfontaligntypecb44type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AUTO = Enum.forString("auto");
    static final Enum T = Enum.forString("t");
    static final Enum CTR = Enum.forString("ctr");
    static final Enum BASE = Enum.forString("base");
    static final Enum B = Enum.forString("b");
    
    static final int INT_AUTO = Enum.INT_AUTO;
    static final int INT_T = Enum.INT_T;
    static final int INT_CTR = Enum.INT_CTR;
    static final int INT_BASE = Enum.INT_BASE;
    static final int INT_B = Enum.INT_B;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AUTO
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
        
        static final int INT_AUTO = 1;
        static final int INT_T = 2;
        static final int INT_CTR = 3;
        static final int INT_BASE = 4;
        static final int INT_B = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("auto", INT_AUTO),
                new Enum("t", INT_T),
                new Enum("ctr", INT_CTR),
                new Enum("base", INT_BASE),
                new Enum("b", INT_B),
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

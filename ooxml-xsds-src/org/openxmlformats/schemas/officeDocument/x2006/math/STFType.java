/*
 * XML Type:  ST_FType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.STFType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML ST_FType(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.officeDocument.x2006.math.STFType.
 */
public interface STFType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STFType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stftype30ectype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BAR = Enum.forString("bar");
    static final Enum SKW = Enum.forString("skw");
    static final Enum LIN = Enum.forString("lin");
    static final Enum NO_BAR = Enum.forString("noBar");
    
    static final int INT_BAR = Enum.INT_BAR;
    static final int INT_SKW = Enum.INT_SKW;
    static final int INT_LIN = Enum.INT_LIN;
    static final int INT_NO_BAR = Enum.INT_NO_BAR;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.officeDocument.x2006.math.STFType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BAR
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
        
        static final int INT_BAR = 1;
        static final int INT_SKW = 2;
        static final int INT_LIN = 3;
        static final int INT_NO_BAR = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("bar", INT_BAR),
                new Enum("skw", INT_SKW),
                new Enum("lin", INT_LIN),
                new Enum("noBar", INT_NO_BAR),
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

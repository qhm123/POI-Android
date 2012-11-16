/*
 * XML Type:  ST_ErrValType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.STErrValType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML ST_ErrValType(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.chart.STErrValType.
 */
public interface STErrValType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STErrValType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sterrvaltype96d6type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CUST = Enum.forString("cust");
    static final Enum FIXED_VAL = Enum.forString("fixedVal");
    static final Enum PERCENTAGE = Enum.forString("percentage");
    static final Enum STD_DEV = Enum.forString("stdDev");
    static final Enum STD_ERR = Enum.forString("stdErr");
    
    static final int INT_CUST = Enum.INT_CUST;
    static final int INT_FIXED_VAL = Enum.INT_FIXED_VAL;
    static final int INT_PERCENTAGE = Enum.INT_PERCENTAGE;
    static final int INT_STD_DEV = Enum.INT_STD_DEV;
    static final int INT_STD_ERR = Enum.INT_STD_ERR;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.chart.STErrValType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CUST
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
        
        static final int INT_CUST = 1;
        static final int INT_FIXED_VAL = 2;
        static final int INT_PERCENTAGE = 3;
        static final int INT_STD_DEV = 4;
        static final int INT_STD_ERR = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("cust", INT_CUST),
                new Enum("fixedVal", INT_FIXED_VAL),
                new Enum("percentage", INT_PERCENTAGE),
                new Enum("stdDev", INT_STD_DEV),
                new Enum("stdErr", INT_STD_ERR),
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

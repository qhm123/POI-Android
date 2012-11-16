/*
 * XML Type:  ST_BuiltInUnit
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.STBuiltInUnit
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML ST_BuiltInUnit(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.chart.STBuiltInUnit.
 */
public interface STBuiltInUnit extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STBuiltInUnit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stbuiltinunit3eaftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum HUNDREDS = Enum.forString("hundreds");
    static final Enum THOUSANDS = Enum.forString("thousands");
    static final Enum TEN_THOUSANDS = Enum.forString("tenThousands");
    static final Enum HUNDRED_THOUSANDS = Enum.forString("hundredThousands");
    static final Enum MILLIONS = Enum.forString("millions");
    static final Enum TEN_MILLIONS = Enum.forString("tenMillions");
    static final Enum HUNDRED_MILLIONS = Enum.forString("hundredMillions");
    static final Enum BILLIONS = Enum.forString("billions");
    static final Enum TRILLIONS = Enum.forString("trillions");
    
    static final int INT_HUNDREDS = Enum.INT_HUNDREDS;
    static final int INT_THOUSANDS = Enum.INT_THOUSANDS;
    static final int INT_TEN_THOUSANDS = Enum.INT_TEN_THOUSANDS;
    static final int INT_HUNDRED_THOUSANDS = Enum.INT_HUNDRED_THOUSANDS;
    static final int INT_MILLIONS = Enum.INT_MILLIONS;
    static final int INT_TEN_MILLIONS = Enum.INT_TEN_MILLIONS;
    static final int INT_HUNDRED_MILLIONS = Enum.INT_HUNDRED_MILLIONS;
    static final int INT_BILLIONS = Enum.INT_BILLIONS;
    static final int INT_TRILLIONS = Enum.INT_TRILLIONS;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.chart.STBuiltInUnit.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_HUNDREDS
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
        
        static final int INT_HUNDREDS = 1;
        static final int INT_THOUSANDS = 2;
        static final int INT_TEN_THOUSANDS = 3;
        static final int INT_HUNDRED_THOUSANDS = 4;
        static final int INT_MILLIONS = 5;
        static final int INT_TEN_MILLIONS = 6;
        static final int INT_HUNDRED_MILLIONS = 7;
        static final int INT_BILLIONS = 8;
        static final int INT_TRILLIONS = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("hundreds", INT_HUNDREDS),
                new Enum("thousands", INT_THOUSANDS),
                new Enum("tenThousands", INT_TEN_THOUSANDS),
                new Enum("hundredThousands", INT_HUNDRED_THOUSANDS),
                new Enum("millions", INT_MILLIONS),
                new Enum("tenMillions", INT_TEN_MILLIONS),
                new Enum("hundredMillions", INT_HUNDRED_MILLIONS),
                new Enum("billions", INT_BILLIONS),
                new Enum("trillions", INT_TRILLIONS),
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

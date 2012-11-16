/*
 * XML Type:  ST_TrendlineType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.STTrendlineType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML ST_TrendlineType(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.chart.STTrendlineType.
 */
public interface STTrendlineType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTrendlineType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttrendlinetype1f6btype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum EXP = Enum.forString("exp");
    static final Enum LINEAR = Enum.forString("linear");
    static final Enum LOG = Enum.forString("log");
    static final Enum MOVING_AVG = Enum.forString("movingAvg");
    static final Enum POLY = Enum.forString("poly");
    static final Enum POWER = Enum.forString("power");
    
    static final int INT_EXP = Enum.INT_EXP;
    static final int INT_LINEAR = Enum.INT_LINEAR;
    static final int INT_LOG = Enum.INT_LOG;
    static final int INT_MOVING_AVG = Enum.INT_MOVING_AVG;
    static final int INT_POLY = Enum.INT_POLY;
    static final int INT_POWER = Enum.INT_POWER;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.chart.STTrendlineType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EXP
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
        
        static final int INT_EXP = 1;
        static final int INT_LINEAR = 2;
        static final int INT_LOG = 3;
        static final int INT_MOVING_AVG = 4;
        static final int INT_POLY = 5;
        static final int INT_POWER = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("exp", INT_EXP),
                new Enum("linear", INT_LINEAR),
                new Enum("log", INT_LOG),
                new Enum("movingAvg", INT_MOVING_AVG),
                new Enum("poly", INT_POLY),
                new Enum("power", INT_POWER),
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

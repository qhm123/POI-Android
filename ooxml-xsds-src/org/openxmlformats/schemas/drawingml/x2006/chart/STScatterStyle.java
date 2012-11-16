/*
 * XML Type:  ST_ScatterStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.STScatterStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML ST_ScatterStyle(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.chart.STScatterStyle.
 */
public interface STScatterStyle extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STScatterStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stscatterstyle9eb9type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum LINE = Enum.forString("line");
    static final Enum LINE_MARKER = Enum.forString("lineMarker");
    static final Enum MARKER = Enum.forString("marker");
    static final Enum SMOOTH = Enum.forString("smooth");
    static final Enum SMOOTH_MARKER = Enum.forString("smoothMarker");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_LINE = Enum.INT_LINE;
    static final int INT_LINE_MARKER = Enum.INT_LINE_MARKER;
    static final int INT_MARKER = Enum.INT_MARKER;
    static final int INT_SMOOTH = Enum.INT_SMOOTH;
    static final int INT_SMOOTH_MARKER = Enum.INT_SMOOTH_MARKER;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.chart.STScatterStyle.
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
        static final int INT_LINE = 2;
        static final int INT_LINE_MARKER = 3;
        static final int INT_MARKER = 4;
        static final int INT_SMOOTH = 5;
        static final int INT_SMOOTH_MARKER = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("line", INT_LINE),
                new Enum("lineMarker", INT_LINE_MARKER),
                new Enum("marker", INT_MARKER),
                new Enum("smooth", INT_SMOOTH),
                new Enum("smoothMarker", INT_SMOOTH_MARKER),
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

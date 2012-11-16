/*
 * XML Type:  ST_Shape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.STShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML ST_Shape(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.chart.STShape.
 */
public interface STShape extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stshapecdf5type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CONE = Enum.forString("cone");
    static final Enum CONE_TO_MAX = Enum.forString("coneToMax");
    static final Enum BOX = Enum.forString("box");
    static final Enum CYLINDER = Enum.forString("cylinder");
    static final Enum PYRAMID = Enum.forString("pyramid");
    static final Enum PYRAMID_TO_MAX = Enum.forString("pyramidToMax");
    
    static final int INT_CONE = Enum.INT_CONE;
    static final int INT_CONE_TO_MAX = Enum.INT_CONE_TO_MAX;
    static final int INT_BOX = Enum.INT_BOX;
    static final int INT_CYLINDER = Enum.INT_CYLINDER;
    static final int INT_PYRAMID = Enum.INT_PYRAMID;
    static final int INT_PYRAMID_TO_MAX = Enum.INT_PYRAMID_TO_MAX;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.chart.STShape.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CONE
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
        
        static final int INT_CONE = 1;
        static final int INT_CONE_TO_MAX = 2;
        static final int INT_BOX = 3;
        static final int INT_CYLINDER = 4;
        static final int INT_PYRAMID = 5;
        static final int INT_PYRAMID_TO_MAX = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("cone", INT_CONE),
                new Enum("coneToMax", INT_CONE_TO_MAX),
                new Enum("box", INT_BOX),
                new Enum("cylinder", INT_CYLINDER),
                new Enum("pyramid", INT_PYRAMID),
                new Enum("pyramidToMax", INT_PYRAMID_TO_MAX),
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

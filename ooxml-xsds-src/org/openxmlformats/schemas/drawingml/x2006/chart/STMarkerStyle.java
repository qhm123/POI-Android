/*
 * XML Type:  ST_MarkerStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.STMarkerStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML ST_MarkerStyle(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.chart.STMarkerStyle.
 */
public interface STMarkerStyle extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STMarkerStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stmarkerstyle177ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CIRCLE = Enum.forString("circle");
    static final Enum DASH = Enum.forString("dash");
    static final Enum DIAMOND = Enum.forString("diamond");
    static final Enum DOT = Enum.forString("dot");
    static final Enum NONE = Enum.forString("none");
    static final Enum PICTURE = Enum.forString("picture");
    static final Enum PLUS = Enum.forString("plus");
    static final Enum SQUARE = Enum.forString("square");
    static final Enum STAR = Enum.forString("star");
    static final Enum TRIANGLE = Enum.forString("triangle");
    static final Enum X = Enum.forString("x");
    
    static final int INT_CIRCLE = Enum.INT_CIRCLE;
    static final int INT_DASH = Enum.INT_DASH;
    static final int INT_DIAMOND = Enum.INT_DIAMOND;
    static final int INT_DOT = Enum.INT_DOT;
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_PICTURE = Enum.INT_PICTURE;
    static final int INT_PLUS = Enum.INT_PLUS;
    static final int INT_SQUARE = Enum.INT_SQUARE;
    static final int INT_STAR = Enum.INT_STAR;
    static final int INT_TRIANGLE = Enum.INT_TRIANGLE;
    static final int INT_X = Enum.INT_X;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.chart.STMarkerStyle.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CIRCLE
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
        
        static final int INT_CIRCLE = 1;
        static final int INT_DASH = 2;
        static final int INT_DIAMOND = 3;
        static final int INT_DOT = 4;
        static final int INT_NONE = 5;
        static final int INT_PICTURE = 6;
        static final int INT_PLUS = 7;
        static final int INT_SQUARE = 8;
        static final int INT_STAR = 9;
        static final int INT_TRIANGLE = 10;
        static final int INT_X = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("circle", INT_CIRCLE),
                new Enum("dash", INT_DASH),
                new Enum("diamond", INT_DIAMOND),
                new Enum("dot", INT_DOT),
                new Enum("none", INT_NONE),
                new Enum("picture", INT_PICTURE),
                new Enum("plus", INT_PLUS),
                new Enum("square", INT_SQUARE),
                new Enum("star", INT_STAR),
                new Enum("triangle", INT_TRIANGLE),
                new Enum("x", INT_X),
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

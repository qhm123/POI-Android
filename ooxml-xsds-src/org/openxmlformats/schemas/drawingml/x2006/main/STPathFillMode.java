/*
 * XML Type:  ST_PathFillMode
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_PathFillMode(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode.
 */
public interface STPathFillMode extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STPathFillMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stpathfillmode3cf6type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum NORM = Enum.forString("norm");
    static final Enum LIGHTEN = Enum.forString("lighten");
    static final Enum LIGHTEN_LESS = Enum.forString("lightenLess");
    static final Enum DARKEN = Enum.forString("darken");
    static final Enum DARKEN_LESS = Enum.forString("darkenLess");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_NORM = Enum.INT_NORM;
    static final int INT_LIGHTEN = Enum.INT_LIGHTEN;
    static final int INT_LIGHTEN_LESS = Enum.INT_LIGHTEN_LESS;
    static final int INT_DARKEN = Enum.INT_DARKEN;
    static final int INT_DARKEN_LESS = Enum.INT_DARKEN_LESS;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode.
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
        static final int INT_NORM = 2;
        static final int INT_LIGHTEN = 3;
        static final int INT_LIGHTEN_LESS = 4;
        static final int INT_DARKEN = 5;
        static final int INT_DARKEN_LESS = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("norm", INT_NORM),
                new Enum("lighten", INT_LIGHTEN),
                new Enum("lightenLess", INT_LIGHTEN_LESS),
                new Enum("darken", INT_DARKEN),
                new Enum("darkenLess", INT_DARKEN_LESS),
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

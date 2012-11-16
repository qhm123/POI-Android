/*
 * XML Type:  ST_CompoundLine
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_CompoundLine(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine.
 */
public interface STCompoundLine extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STCompoundLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stcompoundline712atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SNG = Enum.forString("sng");
    static final Enum DBL = Enum.forString("dbl");
    static final Enum THICK_THIN = Enum.forString("thickThin");
    static final Enum THIN_THICK = Enum.forString("thinThick");
    static final Enum TRI = Enum.forString("tri");
    
    static final int INT_SNG = Enum.INT_SNG;
    static final int INT_DBL = Enum.INT_DBL;
    static final int INT_THICK_THIN = Enum.INT_THICK_THIN;
    static final int INT_THIN_THICK = Enum.INT_THIN_THICK;
    static final int INT_TRI = Enum.INT_TRI;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SNG
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
        
        static final int INT_SNG = 1;
        static final int INT_DBL = 2;
        static final int INT_THICK_THIN = 3;
        static final int INT_THIN_THICK = 4;
        static final int INT_TRI = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("sng", INT_SNG),
                new Enum("dbl", INT_DBL),
                new Enum("thickThin", INT_THICK_THIN),
                new Enum("thinThick", INT_THIN_THICK),
                new Enum("tri", INT_TRI),
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

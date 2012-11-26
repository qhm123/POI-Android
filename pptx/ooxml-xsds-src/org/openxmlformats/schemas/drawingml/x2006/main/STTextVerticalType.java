/*
 * XML Type:  ST_TextVerticalType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_TextVerticalType(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType.
 */
public interface STTextVerticalType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTextVerticalType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttextverticaltyped988type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum HORZ = Enum.forString("horz");
    static final Enum VERT = Enum.forString("vert");
    static final Enum VERT_270 = Enum.forString("vert270");
    static final Enum WORD_ART_VERT = Enum.forString("wordArtVert");
    static final Enum EA_VERT = Enum.forString("eaVert");
    static final Enum MONGOLIAN_VERT = Enum.forString("mongolianVert");
    static final Enum WORD_ART_VERT_RTL = Enum.forString("wordArtVertRtl");
    
    static final int INT_HORZ = Enum.INT_HORZ;
    static final int INT_VERT = Enum.INT_VERT;
    static final int INT_VERT_270 = Enum.INT_VERT_270;
    static final int INT_WORD_ART_VERT = Enum.INT_WORD_ART_VERT;
    static final int INT_EA_VERT = Enum.INT_EA_VERT;
    static final int INT_MONGOLIAN_VERT = Enum.INT_MONGOLIAN_VERT;
    static final int INT_WORD_ART_VERT_RTL = Enum.INT_WORD_ART_VERT_RTL;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_HORZ
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
        
        static final int INT_HORZ = 1;
        static final int INT_VERT = 2;
        static final int INT_VERT_270 = 3;
        static final int INT_WORD_ART_VERT = 4;
        static final int INT_EA_VERT = 5;
        static final int INT_MONGOLIAN_VERT = 6;
        static final int INT_WORD_ART_VERT_RTL = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("horz", INT_HORZ),
                new Enum("vert", INT_VERT),
                new Enum("vert270", INT_VERT_270),
                new Enum("wordArtVert", INT_WORD_ART_VERT),
                new Enum("eaVert", INT_EA_VERT),
                new Enum("mongolianVert", INT_MONGOLIAN_VERT),
                new Enum("wordArtVertRtl", INT_WORD_ART_VERT_RTL),
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

/*
 * XML Type:  ST_BorderStyle
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_BorderStyle(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle.
 */
public interface STBorderStyle extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STBorderStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stborderstylec774type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum THIN = Enum.forString("thin");
    static final Enum MEDIUM = Enum.forString("medium");
    static final Enum DASHED = Enum.forString("dashed");
    static final Enum DOTTED = Enum.forString("dotted");
    static final Enum THICK = Enum.forString("thick");
    static final Enum DOUBLE = Enum.forString("double");
    static final Enum HAIR = Enum.forString("hair");
    static final Enum MEDIUM_DASHED = Enum.forString("mediumDashed");
    static final Enum DASH_DOT = Enum.forString("dashDot");
    static final Enum MEDIUM_DASH_DOT = Enum.forString("mediumDashDot");
    static final Enum DASH_DOT_DOT = Enum.forString("dashDotDot");
    static final Enum MEDIUM_DASH_DOT_DOT = Enum.forString("mediumDashDotDot");
    static final Enum SLANT_DASH_DOT = Enum.forString("slantDashDot");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_THIN = Enum.INT_THIN;
    static final int INT_MEDIUM = Enum.INT_MEDIUM;
    static final int INT_DASHED = Enum.INT_DASHED;
    static final int INT_DOTTED = Enum.INT_DOTTED;
    static final int INT_THICK = Enum.INT_THICK;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_HAIR = Enum.INT_HAIR;
    static final int INT_MEDIUM_DASHED = Enum.INT_MEDIUM_DASHED;
    static final int INT_DASH_DOT = Enum.INT_DASH_DOT;
    static final int INT_MEDIUM_DASH_DOT = Enum.INT_MEDIUM_DASH_DOT;
    static final int INT_DASH_DOT_DOT = Enum.INT_DASH_DOT_DOT;
    static final int INT_MEDIUM_DASH_DOT_DOT = Enum.INT_MEDIUM_DASH_DOT_DOT;
    static final int INT_SLANT_DASH_DOT = Enum.INT_SLANT_DASH_DOT;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle.
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
        static final int INT_THIN = 2;
        static final int INT_MEDIUM = 3;
        static final int INT_DASHED = 4;
        static final int INT_DOTTED = 5;
        static final int INT_THICK = 6;
        static final int INT_DOUBLE = 7;
        static final int INT_HAIR = 8;
        static final int INT_MEDIUM_DASHED = 9;
        static final int INT_DASH_DOT = 10;
        static final int INT_MEDIUM_DASH_DOT = 11;
        static final int INT_DASH_DOT_DOT = 12;
        static final int INT_MEDIUM_DASH_DOT_DOT = 13;
        static final int INT_SLANT_DASH_DOT = 14;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("thin", INT_THIN),
                new Enum("medium", INT_MEDIUM),
                new Enum("dashed", INT_DASHED),
                new Enum("dotted", INT_DOTTED),
                new Enum("thick", INT_THICK),
                new Enum("double", INT_DOUBLE),
                new Enum("hair", INT_HAIR),
                new Enum("mediumDashed", INT_MEDIUM_DASHED),
                new Enum("dashDot", INT_DASH_DOT),
                new Enum("mediumDashDot", INT_MEDIUM_DASH_DOT),
                new Enum("dashDotDot", INT_DASH_DOT_DOT),
                new Enum("mediumDashDotDot", INT_MEDIUM_DASH_DOT_DOT),
                new Enum("slantDashDot", INT_SLANT_DASH_DOT),
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

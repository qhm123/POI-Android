/*
 * XML Type:  ST_PatternType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_PatternType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.
 */
public interface STPatternType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STPatternType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stpatterntype7939type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum SOLID = Enum.forString("solid");
    static final Enum MEDIUM_GRAY = Enum.forString("mediumGray");
    static final Enum DARK_GRAY = Enum.forString("darkGray");
    static final Enum LIGHT_GRAY = Enum.forString("lightGray");
    static final Enum DARK_HORIZONTAL = Enum.forString("darkHorizontal");
    static final Enum DARK_VERTICAL = Enum.forString("darkVertical");
    static final Enum DARK_DOWN = Enum.forString("darkDown");
    static final Enum DARK_UP = Enum.forString("darkUp");
    static final Enum DARK_GRID = Enum.forString("darkGrid");
    static final Enum DARK_TRELLIS = Enum.forString("darkTrellis");
    static final Enum LIGHT_HORIZONTAL = Enum.forString("lightHorizontal");
    static final Enum LIGHT_VERTICAL = Enum.forString("lightVertical");
    static final Enum LIGHT_DOWN = Enum.forString("lightDown");
    static final Enum LIGHT_UP = Enum.forString("lightUp");
    static final Enum LIGHT_GRID = Enum.forString("lightGrid");
    static final Enum LIGHT_TRELLIS = Enum.forString("lightTrellis");
    static final Enum GRAY_125 = Enum.forString("gray125");
    static final Enum GRAY_0625 = Enum.forString("gray0625");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_SOLID = Enum.INT_SOLID;
    static final int INT_MEDIUM_GRAY = Enum.INT_MEDIUM_GRAY;
    static final int INT_DARK_GRAY = Enum.INT_DARK_GRAY;
    static final int INT_LIGHT_GRAY = Enum.INT_LIGHT_GRAY;
    static final int INT_DARK_HORIZONTAL = Enum.INT_DARK_HORIZONTAL;
    static final int INT_DARK_VERTICAL = Enum.INT_DARK_VERTICAL;
    static final int INT_DARK_DOWN = Enum.INT_DARK_DOWN;
    static final int INT_DARK_UP = Enum.INT_DARK_UP;
    static final int INT_DARK_GRID = Enum.INT_DARK_GRID;
    static final int INT_DARK_TRELLIS = Enum.INT_DARK_TRELLIS;
    static final int INT_LIGHT_HORIZONTAL = Enum.INT_LIGHT_HORIZONTAL;
    static final int INT_LIGHT_VERTICAL = Enum.INT_LIGHT_VERTICAL;
    static final int INT_LIGHT_DOWN = Enum.INT_LIGHT_DOWN;
    static final int INT_LIGHT_UP = Enum.INT_LIGHT_UP;
    static final int INT_LIGHT_GRID = Enum.INT_LIGHT_GRID;
    static final int INT_LIGHT_TRELLIS = Enum.INT_LIGHT_TRELLIS;
    static final int INT_GRAY_125 = Enum.INT_GRAY_125;
    static final int INT_GRAY_0625 = Enum.INT_GRAY_0625;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.
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
        static final int INT_SOLID = 2;
        static final int INT_MEDIUM_GRAY = 3;
        static final int INT_DARK_GRAY = 4;
        static final int INT_LIGHT_GRAY = 5;
        static final int INT_DARK_HORIZONTAL = 6;
        static final int INT_DARK_VERTICAL = 7;
        static final int INT_DARK_DOWN = 8;
        static final int INT_DARK_UP = 9;
        static final int INT_DARK_GRID = 10;
        static final int INT_DARK_TRELLIS = 11;
        static final int INT_LIGHT_HORIZONTAL = 12;
        static final int INT_LIGHT_VERTICAL = 13;
        static final int INT_LIGHT_DOWN = 14;
        static final int INT_LIGHT_UP = 15;
        static final int INT_LIGHT_GRID = 16;
        static final int INT_LIGHT_TRELLIS = 17;
        static final int INT_GRAY_125 = 18;
        static final int INT_GRAY_0625 = 19;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("solid", INT_SOLID),
                new Enum("mediumGray", INT_MEDIUM_GRAY),
                new Enum("darkGray", INT_DARK_GRAY),
                new Enum("lightGray", INT_LIGHT_GRAY),
                new Enum("darkHorizontal", INT_DARK_HORIZONTAL),
                new Enum("darkVertical", INT_DARK_VERTICAL),
                new Enum("darkDown", INT_DARK_DOWN),
                new Enum("darkUp", INT_DARK_UP),
                new Enum("darkGrid", INT_DARK_GRID),
                new Enum("darkTrellis", INT_DARK_TRELLIS),
                new Enum("lightHorizontal", INT_LIGHT_HORIZONTAL),
                new Enum("lightVertical", INT_LIGHT_VERTICAL),
                new Enum("lightDown", INT_LIGHT_DOWN),
                new Enum("lightUp", INT_LIGHT_UP),
                new Enum("lightGrid", INT_LIGHT_GRID),
                new Enum("lightTrellis", INT_LIGHT_TRELLIS),
                new Enum("gray125", INT_GRAY_125),
                new Enum("gray0625", INT_GRAY_0625),
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

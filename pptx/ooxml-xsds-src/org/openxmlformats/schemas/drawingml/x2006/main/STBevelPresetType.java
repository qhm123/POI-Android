/*
 * XML Type:  ST_BevelPresetType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_BevelPresetType(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType.
 */
public interface STBevelPresetType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STBevelPresetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stbevelpresettype48b4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum RELAXED_INSET = Enum.forString("relaxedInset");
    static final Enum CIRCLE = Enum.forString("circle");
    static final Enum SLOPE = Enum.forString("slope");
    static final Enum CROSS = Enum.forString("cross");
    static final Enum ANGLE = Enum.forString("angle");
    static final Enum SOFT_ROUND = Enum.forString("softRound");
    static final Enum CONVEX = Enum.forString("convex");
    static final Enum COOL_SLANT = Enum.forString("coolSlant");
    static final Enum DIVOT = Enum.forString("divot");
    static final Enum RIBLET = Enum.forString("riblet");
    static final Enum HARD_EDGE = Enum.forString("hardEdge");
    static final Enum ART_DECO = Enum.forString("artDeco");
    
    static final int INT_RELAXED_INSET = Enum.INT_RELAXED_INSET;
    static final int INT_CIRCLE = Enum.INT_CIRCLE;
    static final int INT_SLOPE = Enum.INT_SLOPE;
    static final int INT_CROSS = Enum.INT_CROSS;
    static final int INT_ANGLE = Enum.INT_ANGLE;
    static final int INT_SOFT_ROUND = Enum.INT_SOFT_ROUND;
    static final int INT_CONVEX = Enum.INT_CONVEX;
    static final int INT_COOL_SLANT = Enum.INT_COOL_SLANT;
    static final int INT_DIVOT = Enum.INT_DIVOT;
    static final int INT_RIBLET = Enum.INT_RIBLET;
    static final int INT_HARD_EDGE = Enum.INT_HARD_EDGE;
    static final int INT_ART_DECO = Enum.INT_ART_DECO;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_RELAXED_INSET
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
        
        static final int INT_RELAXED_INSET = 1;
        static final int INT_CIRCLE = 2;
        static final int INT_SLOPE = 3;
        static final int INT_CROSS = 4;
        static final int INT_ANGLE = 5;
        static final int INT_SOFT_ROUND = 6;
        static final int INT_CONVEX = 7;
        static final int INT_COOL_SLANT = 8;
        static final int INT_DIVOT = 9;
        static final int INT_RIBLET = 10;
        static final int INT_HARD_EDGE = 11;
        static final int INT_ART_DECO = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("relaxedInset", INT_RELAXED_INSET),
                new Enum("circle", INT_CIRCLE),
                new Enum("slope", INT_SLOPE),
                new Enum("cross", INT_CROSS),
                new Enum("angle", INT_ANGLE),
                new Enum("softRound", INT_SOFT_ROUND),
                new Enum("convex", INT_CONVEX),
                new Enum("coolSlant", INT_COOL_SLANT),
                new Enum("divot", INT_DIVOT),
                new Enum("riblet", INT_RIBLET),
                new Enum("hardEdge", INT_HARD_EDGE),
                new Enum("artDeco", INT_ART_DECO),
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

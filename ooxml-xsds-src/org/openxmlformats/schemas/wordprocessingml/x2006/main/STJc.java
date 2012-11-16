/*
 * XML Type:  ST_Jc
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_Jc(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc.
 */
public interface STJc extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STJc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stjc977ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum LEFT = Enum.forString("left");
    static final Enum CENTER = Enum.forString("center");
    static final Enum RIGHT = Enum.forString("right");
    static final Enum BOTH = Enum.forString("both");
    static final Enum MEDIUM_KASHIDA = Enum.forString("mediumKashida");
    static final Enum DISTRIBUTE = Enum.forString("distribute");
    static final Enum NUM_TAB = Enum.forString("numTab");
    static final Enum HIGH_KASHIDA = Enum.forString("highKashida");
    static final Enum LOW_KASHIDA = Enum.forString("lowKashida");
    static final Enum THAI_DISTRIBUTE = Enum.forString("thaiDistribute");
    
    static final int INT_LEFT = Enum.INT_LEFT;
    static final int INT_CENTER = Enum.INT_CENTER;
    static final int INT_RIGHT = Enum.INT_RIGHT;
    static final int INT_BOTH = Enum.INT_BOTH;
    static final int INT_MEDIUM_KASHIDA = Enum.INT_MEDIUM_KASHIDA;
    static final int INT_DISTRIBUTE = Enum.INT_DISTRIBUTE;
    static final int INT_NUM_TAB = Enum.INT_NUM_TAB;
    static final int INT_HIGH_KASHIDA = Enum.INT_HIGH_KASHIDA;
    static final int INT_LOW_KASHIDA = Enum.INT_LOW_KASHIDA;
    static final int INT_THAI_DISTRIBUTE = Enum.INT_THAI_DISTRIBUTE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LEFT
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
        
        static final int INT_LEFT = 1;
        static final int INT_CENTER = 2;
        static final int INT_RIGHT = 3;
        static final int INT_BOTH = 4;
        static final int INT_MEDIUM_KASHIDA = 5;
        static final int INT_DISTRIBUTE = 6;
        static final int INT_NUM_TAB = 7;
        static final int INT_HIGH_KASHIDA = 8;
        static final int INT_LOW_KASHIDA = 9;
        static final int INT_THAI_DISTRIBUTE = 10;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("left", INT_LEFT),
                new Enum("center", INT_CENTER),
                new Enum("right", INT_RIGHT),
                new Enum("both", INT_BOTH),
                new Enum("mediumKashida", INT_MEDIUM_KASHIDA),
                new Enum("distribute", INT_DISTRIBUTE),
                new Enum("numTab", INT_NUM_TAB),
                new Enum("highKashida", INT_HIGH_KASHIDA),
                new Enum("lowKashida", INT_LOW_KASHIDA),
                new Enum("thaiDistribute", INT_THAI_DISTRIBUTE),
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

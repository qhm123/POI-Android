/*
 * XML Type:  ST_TabJc
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_TabJc(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc.
 */
public interface STTabJc extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTabJc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttabjc10f4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CLEAR = Enum.forString("clear");
    static final Enum LEFT = Enum.forString("left");
    static final Enum CENTER = Enum.forString("center");
    static final Enum RIGHT = Enum.forString("right");
    static final Enum DECIMAL = Enum.forString("decimal");
    static final Enum BAR = Enum.forString("bar");
    static final Enum NUM = Enum.forString("num");
    
    static final int INT_CLEAR = Enum.INT_CLEAR;
    static final int INT_LEFT = Enum.INT_LEFT;
    static final int INT_CENTER = Enum.INT_CENTER;
    static final int INT_RIGHT = Enum.INT_RIGHT;
    static final int INT_DECIMAL = Enum.INT_DECIMAL;
    static final int INT_BAR = Enum.INT_BAR;
    static final int INT_NUM = Enum.INT_NUM;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CLEAR
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
        
        static final int INT_CLEAR = 1;
        static final int INT_LEFT = 2;
        static final int INT_CENTER = 3;
        static final int INT_RIGHT = 4;
        static final int INT_DECIMAL = 5;
        static final int INT_BAR = 6;
        static final int INT_NUM = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("clear", INT_CLEAR),
                new Enum("left", INT_LEFT),
                new Enum("center", INT_CENTER),
                new Enum("right", INT_RIGHT),
                new Enum("decimal", INT_DECIMAL),
                new Enum("bar", INT_BAR),
                new Enum("num", INT_NUM),
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

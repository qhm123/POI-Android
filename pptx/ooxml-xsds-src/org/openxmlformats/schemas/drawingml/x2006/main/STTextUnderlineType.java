/*
 * XML Type:  ST_TextUnderlineType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_TextUnderlineType(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType.
 */
public interface STTextUnderlineType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTextUnderlineType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttextunderlinetype469atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum WORDS = Enum.forString("words");
    static final Enum SNG = Enum.forString("sng");
    static final Enum DBL = Enum.forString("dbl");
    static final Enum HEAVY = Enum.forString("heavy");
    static final Enum DOTTED = Enum.forString("dotted");
    static final Enum DOTTED_HEAVY = Enum.forString("dottedHeavy");
    static final Enum DASH = Enum.forString("dash");
    static final Enum DASH_HEAVY = Enum.forString("dashHeavy");
    static final Enum DASH_LONG = Enum.forString("dashLong");
    static final Enum DASH_LONG_HEAVY = Enum.forString("dashLongHeavy");
    static final Enum DOT_DASH = Enum.forString("dotDash");
    static final Enum DOT_DASH_HEAVY = Enum.forString("dotDashHeavy");
    static final Enum DOT_DOT_DASH = Enum.forString("dotDotDash");
    static final Enum DOT_DOT_DASH_HEAVY = Enum.forString("dotDotDashHeavy");
    static final Enum WAVY = Enum.forString("wavy");
    static final Enum WAVY_HEAVY = Enum.forString("wavyHeavy");
    static final Enum WAVY_DBL = Enum.forString("wavyDbl");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_WORDS = Enum.INT_WORDS;
    static final int INT_SNG = Enum.INT_SNG;
    static final int INT_DBL = Enum.INT_DBL;
    static final int INT_HEAVY = Enum.INT_HEAVY;
    static final int INT_DOTTED = Enum.INT_DOTTED;
    static final int INT_DOTTED_HEAVY = Enum.INT_DOTTED_HEAVY;
    static final int INT_DASH = Enum.INT_DASH;
    static final int INT_DASH_HEAVY = Enum.INT_DASH_HEAVY;
    static final int INT_DASH_LONG = Enum.INT_DASH_LONG;
    static final int INT_DASH_LONG_HEAVY = Enum.INT_DASH_LONG_HEAVY;
    static final int INT_DOT_DASH = Enum.INT_DOT_DASH;
    static final int INT_DOT_DASH_HEAVY = Enum.INT_DOT_DASH_HEAVY;
    static final int INT_DOT_DOT_DASH = Enum.INT_DOT_DOT_DASH;
    static final int INT_DOT_DOT_DASH_HEAVY = Enum.INT_DOT_DOT_DASH_HEAVY;
    static final int INT_WAVY = Enum.INT_WAVY;
    static final int INT_WAVY_HEAVY = Enum.INT_WAVY_HEAVY;
    static final int INT_WAVY_DBL = Enum.INT_WAVY_DBL;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType.
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
        static final int INT_WORDS = 2;
        static final int INT_SNG = 3;
        static final int INT_DBL = 4;
        static final int INT_HEAVY = 5;
        static final int INT_DOTTED = 6;
        static final int INT_DOTTED_HEAVY = 7;
        static final int INT_DASH = 8;
        static final int INT_DASH_HEAVY = 9;
        static final int INT_DASH_LONG = 10;
        static final int INT_DASH_LONG_HEAVY = 11;
        static final int INT_DOT_DASH = 12;
        static final int INT_DOT_DASH_HEAVY = 13;
        static final int INT_DOT_DOT_DASH = 14;
        static final int INT_DOT_DOT_DASH_HEAVY = 15;
        static final int INT_WAVY = 16;
        static final int INT_WAVY_HEAVY = 17;
        static final int INT_WAVY_DBL = 18;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("words", INT_WORDS),
                new Enum("sng", INT_SNG),
                new Enum("dbl", INT_DBL),
                new Enum("heavy", INT_HEAVY),
                new Enum("dotted", INT_DOTTED),
                new Enum("dottedHeavy", INT_DOTTED_HEAVY),
                new Enum("dash", INT_DASH),
                new Enum("dashHeavy", INT_DASH_HEAVY),
                new Enum("dashLong", INT_DASH_LONG),
                new Enum("dashLongHeavy", INT_DASH_LONG_HEAVY),
                new Enum("dotDash", INT_DOT_DASH),
                new Enum("dotDashHeavy", INT_DOT_DASH_HEAVY),
                new Enum("dotDotDash", INT_DOT_DOT_DASH),
                new Enum("dotDotDashHeavy", INT_DOT_DOT_DASH_HEAVY),
                new Enum("wavy", INT_WAVY),
                new Enum("wavyHeavy", INT_WAVY_HEAVY),
                new Enum("wavyDbl", INT_WAVY_DBL),
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

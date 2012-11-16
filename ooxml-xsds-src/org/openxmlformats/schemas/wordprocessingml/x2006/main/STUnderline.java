/*
 * XML Type:  ST_Underline
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnderline
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_Underline(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnderline.
 */
public interface STUnderline extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STUnderline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stunderlinef416type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SINGLE = Enum.forString("single");
    static final Enum WORDS = Enum.forString("words");
    static final Enum DOUBLE = Enum.forString("double");
    static final Enum THICK = Enum.forString("thick");
    static final Enum DOTTED = Enum.forString("dotted");
    static final Enum DOTTED_HEAVY = Enum.forString("dottedHeavy");
    static final Enum DASH = Enum.forString("dash");
    static final Enum DASHED_HEAVY = Enum.forString("dashedHeavy");
    static final Enum DASH_LONG = Enum.forString("dashLong");
    static final Enum DASH_LONG_HEAVY = Enum.forString("dashLongHeavy");
    static final Enum DOT_DASH = Enum.forString("dotDash");
    static final Enum DASH_DOT_HEAVY = Enum.forString("dashDotHeavy");
    static final Enum DOT_DOT_DASH = Enum.forString("dotDotDash");
    static final Enum DASH_DOT_DOT_HEAVY = Enum.forString("dashDotDotHeavy");
    static final Enum WAVE = Enum.forString("wave");
    static final Enum WAVY_HEAVY = Enum.forString("wavyHeavy");
    static final Enum WAVY_DOUBLE = Enum.forString("wavyDouble");
    static final Enum NONE = Enum.forString("none");
    
    static final int INT_SINGLE = Enum.INT_SINGLE;
    static final int INT_WORDS = Enum.INT_WORDS;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_THICK = Enum.INT_THICK;
    static final int INT_DOTTED = Enum.INT_DOTTED;
    static final int INT_DOTTED_HEAVY = Enum.INT_DOTTED_HEAVY;
    static final int INT_DASH = Enum.INT_DASH;
    static final int INT_DASHED_HEAVY = Enum.INT_DASHED_HEAVY;
    static final int INT_DASH_LONG = Enum.INT_DASH_LONG;
    static final int INT_DASH_LONG_HEAVY = Enum.INT_DASH_LONG_HEAVY;
    static final int INT_DOT_DASH = Enum.INT_DOT_DASH;
    static final int INT_DASH_DOT_HEAVY = Enum.INT_DASH_DOT_HEAVY;
    static final int INT_DOT_DOT_DASH = Enum.INT_DOT_DOT_DASH;
    static final int INT_DASH_DOT_DOT_HEAVY = Enum.INT_DASH_DOT_DOT_HEAVY;
    static final int INT_WAVE = Enum.INT_WAVE;
    static final int INT_WAVY_HEAVY = Enum.INT_WAVY_HEAVY;
    static final int INT_WAVY_DOUBLE = Enum.INT_WAVY_DOUBLE;
    static final int INT_NONE = Enum.INT_NONE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnderline.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SINGLE
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
        
        static final int INT_SINGLE = 1;
        static final int INT_WORDS = 2;
        static final int INT_DOUBLE = 3;
        static final int INT_THICK = 4;
        static final int INT_DOTTED = 5;
        static final int INT_DOTTED_HEAVY = 6;
        static final int INT_DASH = 7;
        static final int INT_DASHED_HEAVY = 8;
        static final int INT_DASH_LONG = 9;
        static final int INT_DASH_LONG_HEAVY = 10;
        static final int INT_DOT_DASH = 11;
        static final int INT_DASH_DOT_HEAVY = 12;
        static final int INT_DOT_DOT_DASH = 13;
        static final int INT_DASH_DOT_DOT_HEAVY = 14;
        static final int INT_WAVE = 15;
        static final int INT_WAVY_HEAVY = 16;
        static final int INT_WAVY_DOUBLE = 17;
        static final int INT_NONE = 18;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("single", INT_SINGLE),
                new Enum("words", INT_WORDS),
                new Enum("double", INT_DOUBLE),
                new Enum("thick", INT_THICK),
                new Enum("dotted", INT_DOTTED),
                new Enum("dottedHeavy", INT_DOTTED_HEAVY),
                new Enum("dash", INT_DASH),
                new Enum("dashedHeavy", INT_DASHED_HEAVY),
                new Enum("dashLong", INT_DASH_LONG),
                new Enum("dashLongHeavy", INT_DASH_LONG_HEAVY),
                new Enum("dotDash", INT_DOT_DASH),
                new Enum("dashDotHeavy", INT_DASH_DOT_HEAVY),
                new Enum("dotDotDash", INT_DOT_DOT_DASH),
                new Enum("dashDotDotHeavy", INT_DASH_DOT_DOT_HEAVY),
                new Enum("wave", INT_WAVE),
                new Enum("wavyHeavy", INT_WAVY_HEAVY),
                new Enum("wavyDouble", INT_WAVY_DOUBLE),
                new Enum("none", INT_NONE),
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

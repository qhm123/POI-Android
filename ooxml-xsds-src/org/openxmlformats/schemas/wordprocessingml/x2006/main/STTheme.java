/*
 * XML Type:  ST_Theme
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_Theme(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.
 */
public interface STTheme extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTheme.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttheme58b9type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum MAJOR_EAST_ASIA = Enum.forString("majorEastAsia");
    static final Enum MAJOR_BIDI = Enum.forString("majorBidi");
    static final Enum MAJOR_ASCII = Enum.forString("majorAscii");
    static final Enum MAJOR_H_ANSI = Enum.forString("majorHAnsi");
    static final Enum MINOR_EAST_ASIA = Enum.forString("minorEastAsia");
    static final Enum MINOR_BIDI = Enum.forString("minorBidi");
    static final Enum MINOR_ASCII = Enum.forString("minorAscii");
    static final Enum MINOR_H_ANSI = Enum.forString("minorHAnsi");
    
    static final int INT_MAJOR_EAST_ASIA = Enum.INT_MAJOR_EAST_ASIA;
    static final int INT_MAJOR_BIDI = Enum.INT_MAJOR_BIDI;
    static final int INT_MAJOR_ASCII = Enum.INT_MAJOR_ASCII;
    static final int INT_MAJOR_H_ANSI = Enum.INT_MAJOR_H_ANSI;
    static final int INT_MINOR_EAST_ASIA = Enum.INT_MINOR_EAST_ASIA;
    static final int INT_MINOR_BIDI = Enum.INT_MINOR_BIDI;
    static final int INT_MINOR_ASCII = Enum.INT_MINOR_ASCII;
    static final int INT_MINOR_H_ANSI = Enum.INT_MINOR_H_ANSI;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_MAJOR_EAST_ASIA
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
        
        static final int INT_MAJOR_EAST_ASIA = 1;
        static final int INT_MAJOR_BIDI = 2;
        static final int INT_MAJOR_ASCII = 3;
        static final int INT_MAJOR_H_ANSI = 4;
        static final int INT_MINOR_EAST_ASIA = 5;
        static final int INT_MINOR_BIDI = 6;
        static final int INT_MINOR_ASCII = 7;
        static final int INT_MINOR_H_ANSI = 8;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("majorEastAsia", INT_MAJOR_EAST_ASIA),
                new Enum("majorBidi", INT_MAJOR_BIDI),
                new Enum("majorAscii", INT_MAJOR_ASCII),
                new Enum("majorHAnsi", INT_MAJOR_H_ANSI),
                new Enum("minorEastAsia", INT_MINOR_EAST_ASIA),
                new Enum("minorBidi", INT_MINOR_BIDI),
                new Enum("minorAscii", INT_MINOR_ASCII),
                new Enum("minorHAnsi", INT_MINOR_H_ANSI),
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

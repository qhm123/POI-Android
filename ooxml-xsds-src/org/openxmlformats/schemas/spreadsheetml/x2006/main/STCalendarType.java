/*
 * XML Type:  ST_CalendarType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_CalendarType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType.
 */
public interface STCalendarType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STCalendarType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stcalendartype15f1type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum GREGORIAN = Enum.forString("gregorian");
    static final Enum GREGORIAN_US = Enum.forString("gregorianUs");
    static final Enum JAPAN = Enum.forString("japan");
    static final Enum TAIWAN = Enum.forString("taiwan");
    static final Enum KOREA = Enum.forString("korea");
    static final Enum HIJRI = Enum.forString("hijri");
    static final Enum THAI = Enum.forString("thai");
    static final Enum HEBREW = Enum.forString("hebrew");
    static final Enum GREGORIAN_ME_FRENCH = Enum.forString("gregorianMeFrench");
    static final Enum GREGORIAN_ARABIC = Enum.forString("gregorianArabic");
    static final Enum GREGORIAN_XLIT_ENGLISH = Enum.forString("gregorianXlitEnglish");
    static final Enum GREGORIAN_XLIT_FRENCH = Enum.forString("gregorianXlitFrench");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_GREGORIAN = Enum.INT_GREGORIAN;
    static final int INT_GREGORIAN_US = Enum.INT_GREGORIAN_US;
    static final int INT_JAPAN = Enum.INT_JAPAN;
    static final int INT_TAIWAN = Enum.INT_TAIWAN;
    static final int INT_KOREA = Enum.INT_KOREA;
    static final int INT_HIJRI = Enum.INT_HIJRI;
    static final int INT_THAI = Enum.INT_THAI;
    static final int INT_HEBREW = Enum.INT_HEBREW;
    static final int INT_GREGORIAN_ME_FRENCH = Enum.INT_GREGORIAN_ME_FRENCH;
    static final int INT_GREGORIAN_ARABIC = Enum.INT_GREGORIAN_ARABIC;
    static final int INT_GREGORIAN_XLIT_ENGLISH = Enum.INT_GREGORIAN_XLIT_ENGLISH;
    static final int INT_GREGORIAN_XLIT_FRENCH = Enum.INT_GREGORIAN_XLIT_FRENCH;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType.
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
        static final int INT_GREGORIAN = 2;
        static final int INT_GREGORIAN_US = 3;
        static final int INT_JAPAN = 4;
        static final int INT_TAIWAN = 5;
        static final int INT_KOREA = 6;
        static final int INT_HIJRI = 7;
        static final int INT_THAI = 8;
        static final int INT_HEBREW = 9;
        static final int INT_GREGORIAN_ME_FRENCH = 10;
        static final int INT_GREGORIAN_ARABIC = 11;
        static final int INT_GREGORIAN_XLIT_ENGLISH = 12;
        static final int INT_GREGORIAN_XLIT_FRENCH = 13;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("gregorian", INT_GREGORIAN),
                new Enum("gregorianUs", INT_GREGORIAN_US),
                new Enum("japan", INT_JAPAN),
                new Enum("taiwan", INT_TAIWAN),
                new Enum("korea", INT_KOREA),
                new Enum("hijri", INT_HIJRI),
                new Enum("thai", INT_THAI),
                new Enum("hebrew", INT_HEBREW),
                new Enum("gregorianMeFrench", INT_GREGORIAN_ME_FRENCH),
                new Enum("gregorianArabic", INT_GREGORIAN_ARABIC),
                new Enum("gregorianXlitEnglish", INT_GREGORIAN_XLIT_ENGLISH),
                new Enum("gregorianXlitFrench", INT_GREGORIAN_XLIT_FRENCH),
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

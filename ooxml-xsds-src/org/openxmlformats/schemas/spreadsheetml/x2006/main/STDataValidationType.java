/*
 * XML Type:  ST_DataValidationType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_DataValidationType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType.
 */
public interface STDataValidationType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STDataValidationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stdatavalidationtypeabf6type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum WHOLE = Enum.forString("whole");
    static final Enum DECIMAL = Enum.forString("decimal");
    static final Enum LIST = Enum.forString("list");
    static final Enum DATE = Enum.forString("date");
    static final Enum TIME = Enum.forString("time");
    static final Enum TEXT_LENGTH = Enum.forString("textLength");
    static final Enum CUSTOM = Enum.forString("custom");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_WHOLE = Enum.INT_WHOLE;
    static final int INT_DECIMAL = Enum.INT_DECIMAL;
    static final int INT_LIST = Enum.INT_LIST;
    static final int INT_DATE = Enum.INT_DATE;
    static final int INT_TIME = Enum.INT_TIME;
    static final int INT_TEXT_LENGTH = Enum.INT_TEXT_LENGTH;
    static final int INT_CUSTOM = Enum.INT_CUSTOM;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType.
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
        static final int INT_WHOLE = 2;
        static final int INT_DECIMAL = 3;
        static final int INT_LIST = 4;
        static final int INT_DATE = 5;
        static final int INT_TIME = 6;
        static final int INT_TEXT_LENGTH = 7;
        static final int INT_CUSTOM = 8;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("whole", INT_WHOLE),
                new Enum("decimal", INT_DECIMAL),
                new Enum("list", INT_LIST),
                new Enum("date", INT_DATE),
                new Enum("time", INT_TIME),
                new Enum("textLength", INT_TEXT_LENGTH),
                new Enum("custom", INT_CUSTOM),
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

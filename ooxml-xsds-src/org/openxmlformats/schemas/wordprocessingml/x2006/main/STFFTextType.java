/*
 * XML Type:  ST_FFTextType
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STFFTextType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_FFTextType(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STFFTextType.
 */
public interface STFFTextType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STFFTextType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stfftexttype99b1type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum REGULAR = Enum.forString("regular");
    static final Enum NUMBER = Enum.forString("number");
    static final Enum DATE = Enum.forString("date");
    static final Enum CURRENT_TIME = Enum.forString("currentTime");
    static final Enum CURRENT_DATE = Enum.forString("currentDate");
    static final Enum CALCULATED = Enum.forString("calculated");
    
    static final int INT_REGULAR = Enum.INT_REGULAR;
    static final int INT_NUMBER = Enum.INT_NUMBER;
    static final int INT_DATE = Enum.INT_DATE;
    static final int INT_CURRENT_TIME = Enum.INT_CURRENT_TIME;
    static final int INT_CURRENT_DATE = Enum.INT_CURRENT_DATE;
    static final int INT_CALCULATED = Enum.INT_CALCULATED;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STFFTextType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_REGULAR
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
        
        static final int INT_REGULAR = 1;
        static final int INT_NUMBER = 2;
        static final int INT_DATE = 3;
        static final int INT_CURRENT_TIME = 4;
        static final int INT_CURRENT_DATE = 5;
        static final int INT_CALCULATED = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("regular", INT_REGULAR),
                new Enum("number", INT_NUMBER),
                new Enum("date", INT_DATE),
                new Enum("currentTime", INT_CURRENT_TIME),
                new Enum("currentDate", INT_CURRENT_DATE),
                new Enum("calculated", INT_CALCULATED),
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

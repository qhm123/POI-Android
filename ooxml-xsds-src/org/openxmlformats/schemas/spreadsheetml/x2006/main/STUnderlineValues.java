/*
 * XML Type:  ST_UnderlineValues
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_UnderlineValues(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.
 */
public interface STUnderlineValues extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STUnderlineValues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stunderlinevaluesb6ddtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SINGLE = Enum.forString("single");
    static final Enum DOUBLE = Enum.forString("double");
    static final Enum SINGLE_ACCOUNTING = Enum.forString("singleAccounting");
    static final Enum DOUBLE_ACCOUNTING = Enum.forString("doubleAccounting");
    static final Enum NONE = Enum.forString("none");
    
    static final int INT_SINGLE = Enum.INT_SINGLE;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_SINGLE_ACCOUNTING = Enum.INT_SINGLE_ACCOUNTING;
    static final int INT_DOUBLE_ACCOUNTING = Enum.INT_DOUBLE_ACCOUNTING;
    static final int INT_NONE = Enum.INT_NONE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.
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
        static final int INT_DOUBLE = 2;
        static final int INT_SINGLE_ACCOUNTING = 3;
        static final int INT_DOUBLE_ACCOUNTING = 4;
        static final int INT_NONE = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("single", INT_SINGLE),
                new Enum("double", INT_DOUBLE),
                new Enum("singleAccounting", INT_SINGLE_ACCOUNTING),
                new Enum("doubleAccounting", INT_DOUBLE_ACCOUNTING),
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

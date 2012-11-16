/*
 * XML Type:  ST_DataValidationOperator
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_DataValidationOperator(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator.
 */
public interface STDataValidationOperator extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STDataValidationOperator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stdatavalidationoperatore0e0type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BETWEEN = Enum.forString("between");
    static final Enum NOT_BETWEEN = Enum.forString("notBetween");
    static final Enum EQUAL = Enum.forString("equal");
    static final Enum NOT_EQUAL = Enum.forString("notEqual");
    static final Enum LESS_THAN = Enum.forString("lessThan");
    static final Enum LESS_THAN_OR_EQUAL = Enum.forString("lessThanOrEqual");
    static final Enum GREATER_THAN = Enum.forString("greaterThan");
    static final Enum GREATER_THAN_OR_EQUAL = Enum.forString("greaterThanOrEqual");
    
    static final int INT_BETWEEN = Enum.INT_BETWEEN;
    static final int INT_NOT_BETWEEN = Enum.INT_NOT_BETWEEN;
    static final int INT_EQUAL = Enum.INT_EQUAL;
    static final int INT_NOT_EQUAL = Enum.INT_NOT_EQUAL;
    static final int INT_LESS_THAN = Enum.INT_LESS_THAN;
    static final int INT_LESS_THAN_OR_EQUAL = Enum.INT_LESS_THAN_OR_EQUAL;
    static final int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
    static final int INT_GREATER_THAN_OR_EQUAL = Enum.INT_GREATER_THAN_OR_EQUAL;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BETWEEN
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
        
        static final int INT_BETWEEN = 1;
        static final int INT_NOT_BETWEEN = 2;
        static final int INT_EQUAL = 3;
        static final int INT_NOT_EQUAL = 4;
        static final int INT_LESS_THAN = 5;
        static final int INT_LESS_THAN_OR_EQUAL = 6;
        static final int INT_GREATER_THAN = 7;
        static final int INT_GREATER_THAN_OR_EQUAL = 8;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("between", INT_BETWEEN),
                new Enum("notBetween", INT_NOT_BETWEEN),
                new Enum("equal", INT_EQUAL),
                new Enum("notEqual", INT_NOT_EQUAL),
                new Enum("lessThan", INT_LESS_THAN),
                new Enum("lessThanOrEqual", INT_LESS_THAN_OR_EQUAL),
                new Enum("greaterThan", INT_GREATER_THAN),
                new Enum("greaterThanOrEqual", INT_GREATER_THAN_OR_EQUAL),
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

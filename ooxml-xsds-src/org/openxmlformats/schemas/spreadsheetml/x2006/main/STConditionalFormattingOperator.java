/*
 * XML Type:  ST_ConditionalFormattingOperator
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_ConditionalFormattingOperator(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.
 */
public interface STConditionalFormattingOperator extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STConditionalFormattingOperator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stconditionalformattingoperatora99etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum LESS_THAN = Enum.forString("lessThan");
    static final Enum LESS_THAN_OR_EQUAL = Enum.forString("lessThanOrEqual");
    static final Enum EQUAL = Enum.forString("equal");
    static final Enum NOT_EQUAL = Enum.forString("notEqual");
    static final Enum GREATER_THAN_OR_EQUAL = Enum.forString("greaterThanOrEqual");
    static final Enum GREATER_THAN = Enum.forString("greaterThan");
    static final Enum BETWEEN = Enum.forString("between");
    static final Enum NOT_BETWEEN = Enum.forString("notBetween");
    static final Enum CONTAINS_TEXT = Enum.forString("containsText");
    static final Enum NOT_CONTAINS = Enum.forString("notContains");
    static final Enum BEGINS_WITH = Enum.forString("beginsWith");
    static final Enum ENDS_WITH = Enum.forString("endsWith");
    
    static final int INT_LESS_THAN = Enum.INT_LESS_THAN;
    static final int INT_LESS_THAN_OR_EQUAL = Enum.INT_LESS_THAN_OR_EQUAL;
    static final int INT_EQUAL = Enum.INT_EQUAL;
    static final int INT_NOT_EQUAL = Enum.INT_NOT_EQUAL;
    static final int INT_GREATER_THAN_OR_EQUAL = Enum.INT_GREATER_THAN_OR_EQUAL;
    static final int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
    static final int INT_BETWEEN = Enum.INT_BETWEEN;
    static final int INT_NOT_BETWEEN = Enum.INT_NOT_BETWEEN;
    static final int INT_CONTAINS_TEXT = Enum.INT_CONTAINS_TEXT;
    static final int INT_NOT_CONTAINS = Enum.INT_NOT_CONTAINS;
    static final int INT_BEGINS_WITH = Enum.INT_BEGINS_WITH;
    static final int INT_ENDS_WITH = Enum.INT_ENDS_WITH;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LESS_THAN
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
        
        static final int INT_LESS_THAN = 1;
        static final int INT_LESS_THAN_OR_EQUAL = 2;
        static final int INT_EQUAL = 3;
        static final int INT_NOT_EQUAL = 4;
        static final int INT_GREATER_THAN_OR_EQUAL = 5;
        static final int INT_GREATER_THAN = 6;
        static final int INT_BETWEEN = 7;
        static final int INT_NOT_BETWEEN = 8;
        static final int INT_CONTAINS_TEXT = 9;
        static final int INT_NOT_CONTAINS = 10;
        static final int INT_BEGINS_WITH = 11;
        static final int INT_ENDS_WITH = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("lessThan", INT_LESS_THAN),
                new Enum("lessThanOrEqual", INT_LESS_THAN_OR_EQUAL),
                new Enum("equal", INT_EQUAL),
                new Enum("notEqual", INT_NOT_EQUAL),
                new Enum("greaterThanOrEqual", INT_GREATER_THAN_OR_EQUAL),
                new Enum("greaterThan", INT_GREATER_THAN),
                new Enum("between", INT_BETWEEN),
                new Enum("notBetween", INT_NOT_BETWEEN),
                new Enum("containsText", INT_CONTAINS_TEXT),
                new Enum("notContains", INT_NOT_CONTAINS),
                new Enum("beginsWith", INT_BEGINS_WITH),
                new Enum("endsWith", INT_ENDS_WITH),
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

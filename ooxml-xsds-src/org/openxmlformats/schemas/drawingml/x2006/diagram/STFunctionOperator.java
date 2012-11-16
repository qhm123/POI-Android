/*
 * XML Type:  ST_FunctionOperator
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.STFunctionOperator
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML ST_FunctionOperator(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.diagram.STFunctionOperator.
 */
public interface STFunctionOperator extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STFunctionOperator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stfunctionoperator7485type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum EQU = Enum.forString("equ");
    static final Enum NEQ = Enum.forString("neq");
    static final Enum GT = Enum.forString("gt");
    static final Enum LT = Enum.forString("lt");
    static final Enum GTE = Enum.forString("gte");
    static final Enum LTE = Enum.forString("lte");
    
    static final int INT_EQU = Enum.INT_EQU;
    static final int INT_NEQ = Enum.INT_NEQ;
    static final int INT_GT = Enum.INT_GT;
    static final int INT_LT = Enum.INT_LT;
    static final int INT_GTE = Enum.INT_GTE;
    static final int INT_LTE = Enum.INT_LTE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.diagram.STFunctionOperator.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EQU
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
        
        static final int INT_EQU = 1;
        static final int INT_NEQ = 2;
        static final int INT_GT = 3;
        static final int INT_LT = 4;
        static final int INT_GTE = 5;
        static final int INT_LTE = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("equ", INT_EQU),
                new Enum("neq", INT_NEQ),
                new Enum("gt", INT_GT),
                new Enum("lt", INT_LT),
                new Enum("gte", INT_GTE),
                new Enum("lte", INT_LTE),
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

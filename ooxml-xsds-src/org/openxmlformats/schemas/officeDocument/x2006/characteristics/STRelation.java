/*
 * XML Type:  ST_Relation
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/characteristics
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.characteristics;


/**
 * An XML ST_Relation(@http://schemas.openxmlformats.org/officeDocument/2006/characteristics).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation.
 */
public interface STRelation extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STRelation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("strelation0edatype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum GE = Enum.forString("ge");
    static final Enum LE = Enum.forString("le");
    static final Enum GT = Enum.forString("gt");
    static final Enum LT = Enum.forString("lt");
    static final Enum EQ = Enum.forString("eq");
    
    static final int INT_GE = Enum.INT_GE;
    static final int INT_LE = Enum.INT_LE;
    static final int INT_GT = Enum.INT_GT;
    static final int INT_LT = Enum.INT_LT;
    static final int INT_EQ = Enum.INT_EQ;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_GE
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
        
        static final int INT_GE = 1;
        static final int INT_LE = 2;
        static final int INT_GT = 3;
        static final int INT_LT = 4;
        static final int INT_EQ = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ge", INT_GE),
                new Enum("le", INT_LE),
                new Enum("gt", INT_GT),
                new Enum("lt", INT_LT),
                new Enum("eq", INT_EQ),
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

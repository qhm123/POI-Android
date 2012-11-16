/*
 * XML Type:  ST_MdxFunctionType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_MdxFunctionType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType.
 */
public interface STMdxFunctionType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STMdxFunctionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stmdxfunctiontype3b22type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum M = Enum.forString("m");
    static final Enum V = Enum.forString("v");
    static final Enum S = Enum.forString("s");
    static final Enum C = Enum.forString("c");
    static final Enum R = Enum.forString("r");
    static final Enum P = Enum.forString("p");
    static final Enum K = Enum.forString("k");
    
    static final int INT_M = Enum.INT_M;
    static final int INT_V = Enum.INT_V;
    static final int INT_S = Enum.INT_S;
    static final int INT_C = Enum.INT_C;
    static final int INT_R = Enum.INT_R;
    static final int INT_P = Enum.INT_P;
    static final int INT_K = Enum.INT_K;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_M
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
        
        static final int INT_M = 1;
        static final int INT_V = 2;
        static final int INT_S = 3;
        static final int INT_C = 4;
        static final int INT_R = 5;
        static final int INT_P = 6;
        static final int INT_K = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("m", INT_M),
                new Enum("v", INT_V),
                new Enum("s", INT_S),
                new Enum("c", INT_C),
                new Enum("r", INT_R),
                new Enum("p", INT_P),
                new Enum("k", INT_K),
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

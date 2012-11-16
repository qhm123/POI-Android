/*
 * XML Type:  ST_FunctionType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.STFunctionType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML ST_FunctionType(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.diagram.STFunctionType.
 */
public interface STFunctionType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STFunctionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stfunctiontype0c2ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CNT = Enum.forString("cnt");
    static final Enum POS = Enum.forString("pos");
    static final Enum REV_POS = Enum.forString("revPos");
    static final Enum POS_EVEN = Enum.forString("posEven");
    static final Enum POS_ODD = Enum.forString("posOdd");
    static final Enum VAR = Enum.forString("var");
    static final Enum DEPTH = Enum.forString("depth");
    static final Enum MAX_DEPTH = Enum.forString("maxDepth");
    
    static final int INT_CNT = Enum.INT_CNT;
    static final int INT_POS = Enum.INT_POS;
    static final int INT_REV_POS = Enum.INT_REV_POS;
    static final int INT_POS_EVEN = Enum.INT_POS_EVEN;
    static final int INT_POS_ODD = Enum.INT_POS_ODD;
    static final int INT_VAR = Enum.INT_VAR;
    static final int INT_DEPTH = Enum.INT_DEPTH;
    static final int INT_MAX_DEPTH = Enum.INT_MAX_DEPTH;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.diagram.STFunctionType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CNT
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
        
        static final int INT_CNT = 1;
        static final int INT_POS = 2;
        static final int INT_REV_POS = 3;
        static final int INT_POS_EVEN = 4;
        static final int INT_POS_ODD = 5;
        static final int INT_VAR = 6;
        static final int INT_DEPTH = 7;
        static final int INT_MAX_DEPTH = 8;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("cnt", INT_CNT),
                new Enum("pos", INT_POS),
                new Enum("revPos", INT_REV_POS),
                new Enum("posEven", INT_POS_EVEN),
                new Enum("posOdd", INT_POS_ODD),
                new Enum("var", INT_VAR),
                new Enum("depth", INT_DEPTH),
                new Enum("maxDepth", INT_MAX_DEPTH),
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

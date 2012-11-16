/*
 * XML Type:  ST_DLblPos
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.STDLblPos
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML ST_DLblPos(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.chart.STDLblPos.
 */
public interface STDLblPos extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STDLblPos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stdlblpos1cf4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BEST_FIT = Enum.forString("bestFit");
    static final Enum B = Enum.forString("b");
    static final Enum CTR = Enum.forString("ctr");
    static final Enum IN_BASE = Enum.forString("inBase");
    static final Enum IN_END = Enum.forString("inEnd");
    static final Enum L = Enum.forString("l");
    static final Enum OUT_END = Enum.forString("outEnd");
    static final Enum R = Enum.forString("r");
    static final Enum T = Enum.forString("t");
    
    static final int INT_BEST_FIT = Enum.INT_BEST_FIT;
    static final int INT_B = Enum.INT_B;
    static final int INT_CTR = Enum.INT_CTR;
    static final int INT_IN_BASE = Enum.INT_IN_BASE;
    static final int INT_IN_END = Enum.INT_IN_END;
    static final int INT_L = Enum.INT_L;
    static final int INT_OUT_END = Enum.INT_OUT_END;
    static final int INT_R = Enum.INT_R;
    static final int INT_T = Enum.INT_T;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.chart.STDLblPos.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BEST_FIT
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
        
        static final int INT_BEST_FIT = 1;
        static final int INT_B = 2;
        static final int INT_CTR = 3;
        static final int INT_IN_BASE = 4;
        static final int INT_IN_END = 5;
        static final int INT_L = 6;
        static final int INT_OUT_END = 7;
        static final int INT_R = 8;
        static final int INT_T = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("bestFit", INT_BEST_FIT),
                new Enum("b", INT_B),
                new Enum("ctr", INT_CTR),
                new Enum("inBase", INT_IN_BASE),
                new Enum("inEnd", INT_IN_END),
                new Enum("l", INT_L),
                new Enum("outEnd", INT_OUT_END),
                new Enum("r", INT_R),
                new Enum("t", INT_T),
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

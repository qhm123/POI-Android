/*
 * XML Type:  ST_TextDirection
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextDirection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_TextDirection(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextDirection.
 */
public interface STTextDirection extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTextDirection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttextdirectionf150type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum LR_TB = Enum.forString("lrTb");
    static final Enum TB_RL = Enum.forString("tbRl");
    static final Enum BT_LR = Enum.forString("btLr");
    static final Enum LR_TB_V = Enum.forString("lrTbV");
    static final Enum TB_RL_V = Enum.forString("tbRlV");
    static final Enum TB_LR_V = Enum.forString("tbLrV");
    
    static final int INT_LR_TB = Enum.INT_LR_TB;
    static final int INT_TB_RL = Enum.INT_TB_RL;
    static final int INT_BT_LR = Enum.INT_BT_LR;
    static final int INT_LR_TB_V = Enum.INT_LR_TB_V;
    static final int INT_TB_RL_V = Enum.INT_TB_RL_V;
    static final int INT_TB_LR_V = Enum.INT_TB_LR_V;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextDirection.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LR_TB
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
        
        static final int INT_LR_TB = 1;
        static final int INT_TB_RL = 2;
        static final int INT_BT_LR = 3;
        static final int INT_LR_TB_V = 4;
        static final int INT_TB_RL_V = 5;
        static final int INT_TB_LR_V = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("lrTb", INT_LR_TB),
                new Enum("tbRl", INT_TB_RL),
                new Enum("btLr", INT_BT_LR),
                new Enum("lrTbV", INT_LR_TB_V),
                new Enum("tbRlV", INT_TB_RL_V),
                new Enum("tbLrV", INT_TB_LR_V),
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

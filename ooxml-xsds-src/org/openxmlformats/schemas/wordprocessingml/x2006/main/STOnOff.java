/*
 * XML Type:  ST_OnOff
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_OnOff(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.
 */
public interface STOnOff extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STOnOff.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stonofffcd2type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum TRUE = Enum.forString("true");
    static final Enum FALSE = Enum.forString("false");
    static final Enum ON = Enum.forString("on");
    static final Enum OFF = Enum.forString("off");
    static final Enum X_0 = Enum.forString("0");
    static final Enum X_1 = Enum.forString("1");
    
    static final int INT_TRUE = Enum.INT_TRUE;
    static final int INT_FALSE = Enum.INT_FALSE;
    static final int INT_ON = Enum.INT_ON;
    static final int INT_OFF = Enum.INT_OFF;
    static final int INT_X_0 = Enum.INT_X_0;
    static final int INT_X_1 = Enum.INT_X_1;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TRUE
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
        
        static final int INT_TRUE = 1;
        static final int INT_FALSE = 2;
        static final int INT_ON = 3;
        static final int INT_OFF = 4;
        static final int INT_X_0 = 5;
        static final int INT_X_1 = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("true", INT_TRUE),
                new Enum("false", INT_FALSE),
                new Enum("on", INT_ON),
                new Enum("off", INT_OFF),
                new Enum("0", INT_X_0),
                new Enum("1", INT_X_1),
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

/*
 * XML Type:  ST_BlipCompression
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_BlipCompression(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression.
 */
public interface STBlipCompression extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STBlipCompression.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stblipcompressionb216type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum EMAIL = Enum.forString("email");
    static final Enum SCREEN = Enum.forString("screen");
    static final Enum PRINT = Enum.forString("print");
    static final Enum HQPRINT = Enum.forString("hqprint");
    static final Enum NONE = Enum.forString("none");
    
    static final int INT_EMAIL = Enum.INT_EMAIL;
    static final int INT_SCREEN = Enum.INT_SCREEN;
    static final int INT_PRINT = Enum.INT_PRINT;
    static final int INT_HQPRINT = Enum.INT_HQPRINT;
    static final int INT_NONE = Enum.INT_NONE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EMAIL
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
        
        static final int INT_EMAIL = 1;
        static final int INT_SCREEN = 2;
        static final int INT_PRINT = 3;
        static final int INT_HQPRINT = 4;
        static final int INT_NONE = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("email", INT_EMAIL),
                new Enum("screen", INT_SCREEN),
                new Enum("print", INT_PRINT),
                new Enum("hqprint", INT_HQPRINT),
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

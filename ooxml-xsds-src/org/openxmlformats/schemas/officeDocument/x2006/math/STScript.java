/*
 * XML Type:  ST_Script
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.STScript
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML ST_Script(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.officeDocument.x2006.math.STScript.
 */
public interface STScript extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STScript.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stscript4637type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ROMAN = Enum.forString("roman");
    static final Enum SCRIPT = Enum.forString("script");
    static final Enum FRAKTUR = Enum.forString("fraktur");
    static final Enum DOUBLE_STRUCK = Enum.forString("double-struck");
    static final Enum SANS_SERIF = Enum.forString("sans-serif");
    static final Enum MONOSPACE = Enum.forString("monospace");
    
    static final int INT_ROMAN = Enum.INT_ROMAN;
    static final int INT_SCRIPT = Enum.INT_SCRIPT;
    static final int INT_FRAKTUR = Enum.INT_FRAKTUR;
    static final int INT_DOUBLE_STRUCK = Enum.INT_DOUBLE_STRUCK;
    static final int INT_SANS_SERIF = Enum.INT_SANS_SERIF;
    static final int INT_MONOSPACE = Enum.INT_MONOSPACE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.officeDocument.x2006.math.STScript.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ROMAN
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
        
        static final int INT_ROMAN = 1;
        static final int INT_SCRIPT = 2;
        static final int INT_FRAKTUR = 3;
        static final int INT_DOUBLE_STRUCK = 4;
        static final int INT_SANS_SERIF = 5;
        static final int INT_MONOSPACE = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("roman", INT_ROMAN),
                new Enum("script", INT_SCRIPT),
                new Enum("fraktur", INT_FRAKTUR),
                new Enum("double-struck", INT_DOUBLE_STRUCK),
                new Enum("sans-serif", INT_SANS_SERIF),
                new Enum("monospace", INT_MONOSPACE),
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

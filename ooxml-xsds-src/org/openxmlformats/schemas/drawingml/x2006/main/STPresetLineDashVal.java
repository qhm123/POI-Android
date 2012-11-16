/*
 * XML Type:  ST_PresetLineDashVal
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STPresetLineDashVal
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_PresetLineDashVal(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STPresetLineDashVal.
 */
public interface STPresetLineDashVal extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STPresetLineDashVal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stpresetlinedashval159dtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SOLID = Enum.forString("solid");
    static final Enum DOT = Enum.forString("dot");
    static final Enum DASH = Enum.forString("dash");
    static final Enum LG_DASH = Enum.forString("lgDash");
    static final Enum DASH_DOT = Enum.forString("dashDot");
    static final Enum LG_DASH_DOT = Enum.forString("lgDashDot");
    static final Enum LG_DASH_DOT_DOT = Enum.forString("lgDashDotDot");
    static final Enum SYS_DASH = Enum.forString("sysDash");
    static final Enum SYS_DOT = Enum.forString("sysDot");
    static final Enum SYS_DASH_DOT = Enum.forString("sysDashDot");
    static final Enum SYS_DASH_DOT_DOT = Enum.forString("sysDashDotDot");
    
    static final int INT_SOLID = Enum.INT_SOLID;
    static final int INT_DOT = Enum.INT_DOT;
    static final int INT_DASH = Enum.INT_DASH;
    static final int INT_LG_DASH = Enum.INT_LG_DASH;
    static final int INT_DASH_DOT = Enum.INT_DASH_DOT;
    static final int INT_LG_DASH_DOT = Enum.INT_LG_DASH_DOT;
    static final int INT_LG_DASH_DOT_DOT = Enum.INT_LG_DASH_DOT_DOT;
    static final int INT_SYS_DASH = Enum.INT_SYS_DASH;
    static final int INT_SYS_DOT = Enum.INT_SYS_DOT;
    static final int INT_SYS_DASH_DOT = Enum.INT_SYS_DASH_DOT;
    static final int INT_SYS_DASH_DOT_DOT = Enum.INT_SYS_DASH_DOT_DOT;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STPresetLineDashVal.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SOLID
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
        
        static final int INT_SOLID = 1;
        static final int INT_DOT = 2;
        static final int INT_DASH = 3;
        static final int INT_LG_DASH = 4;
        static final int INT_DASH_DOT = 5;
        static final int INT_LG_DASH_DOT = 6;
        static final int INT_LG_DASH_DOT_DOT = 7;
        static final int INT_SYS_DASH = 8;
        static final int INT_SYS_DOT = 9;
        static final int INT_SYS_DASH_DOT = 10;
        static final int INT_SYS_DASH_DOT_DOT = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("solid", INT_SOLID),
                new Enum("dot", INT_DOT),
                new Enum("dash", INT_DASH),
                new Enum("lgDash", INT_LG_DASH),
                new Enum("dashDot", INT_DASH_DOT),
                new Enum("lgDashDot", INT_LG_DASH_DOT),
                new Enum("lgDashDotDot", INT_LG_DASH_DOT_DOT),
                new Enum("sysDash", INT_SYS_DASH),
                new Enum("sysDot", INT_SYS_DOT),
                new Enum("sysDashDot", INT_SYS_DASH_DOT),
                new Enum("sysDashDotDot", INT_SYS_DASH_DOT_DOT),
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

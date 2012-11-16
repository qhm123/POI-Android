/*
 * XML Type:  ST_ExternalConnectionType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STExternalConnectionType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_ExternalConnectionType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STExternalConnectionType.
 */
public interface STExternalConnectionType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STExternalConnectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stexternalconnectiontypee83ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum GENERAL = Enum.forString("general");
    static final Enum TEXT = Enum.forString("text");
    static final Enum MDY = Enum.forString("MDY");
    static final Enum DMY = Enum.forString("DMY");
    static final Enum YMD = Enum.forString("YMD");
    static final Enum MYD = Enum.forString("MYD");
    static final Enum DYM = Enum.forString("DYM");
    static final Enum YDM = Enum.forString("YDM");
    static final Enum SKIP = Enum.forString("skip");
    static final Enum EMD = Enum.forString("EMD");
    
    static final int INT_GENERAL = Enum.INT_GENERAL;
    static final int INT_TEXT = Enum.INT_TEXT;
    static final int INT_MDY = Enum.INT_MDY;
    static final int INT_DMY = Enum.INT_DMY;
    static final int INT_YMD = Enum.INT_YMD;
    static final int INT_MYD = Enum.INT_MYD;
    static final int INT_DYM = Enum.INT_DYM;
    static final int INT_YDM = Enum.INT_YDM;
    static final int INT_SKIP = Enum.INT_SKIP;
    static final int INT_EMD = Enum.INT_EMD;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STExternalConnectionType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_GENERAL
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
        
        static final int INT_GENERAL = 1;
        static final int INT_TEXT = 2;
        static final int INT_MDY = 3;
        static final int INT_DMY = 4;
        static final int INT_YMD = 5;
        static final int INT_MYD = 6;
        static final int INT_DYM = 7;
        static final int INT_YDM = 8;
        static final int INT_SKIP = 9;
        static final int INT_EMD = 10;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("general", INT_GENERAL),
                new Enum("text", INT_TEXT),
                new Enum("MDY", INT_MDY),
                new Enum("DMY", INT_DMY),
                new Enum("YMD", INT_YMD),
                new Enum("MYD", INT_MYD),
                new Enum("DYM", INT_DYM),
                new Enum("YDM", INT_YDM),
                new Enum("skip", INT_SKIP),
                new Enum("EMD", INT_EMD),
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

/*
 * XML Type:  ST_WebScreenSize
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_WebScreenSize(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize.
 */
public interface STWebScreenSize extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STWebScreenSize.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stwebscreensize6d7etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_544_X_376 = Enum.forString("544x376");
    static final Enum X_640_X_480 = Enum.forString("640x480");
    static final Enum X_720_X_512 = Enum.forString("720x512");
    static final Enum X_800_X_600 = Enum.forString("800x600");
    static final Enum X_1024_X_768 = Enum.forString("1024x768");
    static final Enum X_1152_X_882 = Enum.forString("1152x882");
    static final Enum X_1152_X_900 = Enum.forString("1152x900");
    static final Enum X_1280_X_1024 = Enum.forString("1280x1024");
    static final Enum X_1600_X_1200 = Enum.forString("1600x1200");
    static final Enum X_1800_X_1400 = Enum.forString("1800x1400");
    static final Enum X_1920_X_1200 = Enum.forString("1920x1200");
    
    static final int INT_X_544_X_376 = Enum.INT_X_544_X_376;
    static final int INT_X_640_X_480 = Enum.INT_X_640_X_480;
    static final int INT_X_720_X_512 = Enum.INT_X_720_X_512;
    static final int INT_X_800_X_600 = Enum.INT_X_800_X_600;
    static final int INT_X_1024_X_768 = Enum.INT_X_1024_X_768;
    static final int INT_X_1152_X_882 = Enum.INT_X_1152_X_882;
    static final int INT_X_1152_X_900 = Enum.INT_X_1152_X_900;
    static final int INT_X_1280_X_1024 = Enum.INT_X_1280_X_1024;
    static final int INT_X_1600_X_1200 = Enum.INT_X_1600_X_1200;
    static final int INT_X_1800_X_1400 = Enum.INT_X_1800_X_1400;
    static final int INT_X_1920_X_1200 = Enum.INT_X_1920_X_1200;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_544_X_376
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
        
        static final int INT_X_544_X_376 = 1;
        static final int INT_X_640_X_480 = 2;
        static final int INT_X_720_X_512 = 3;
        static final int INT_X_800_X_600 = 4;
        static final int INT_X_1024_X_768 = 5;
        static final int INT_X_1152_X_882 = 6;
        static final int INT_X_1152_X_900 = 7;
        static final int INT_X_1280_X_1024 = 8;
        static final int INT_X_1600_X_1200 = 9;
        static final int INT_X_1800_X_1400 = 10;
        static final int INT_X_1920_X_1200 = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("544x376", INT_X_544_X_376),
                new Enum("640x480", INT_X_640_X_480),
                new Enum("720x512", INT_X_720_X_512),
                new Enum("800x600", INT_X_800_X_600),
                new Enum("1024x768", INT_X_1024_X_768),
                new Enum("1152x882", INT_X_1152_X_882),
                new Enum("1152x900", INT_X_1152_X_900),
                new Enum("1280x1024", INT_X_1280_X_1024),
                new Enum("1600x1200", INT_X_1600_X_1200),
                new Enum("1800x1400", INT_X_1800_X_1400),
                new Enum("1920x1200", INT_X_1920_X_1200),
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

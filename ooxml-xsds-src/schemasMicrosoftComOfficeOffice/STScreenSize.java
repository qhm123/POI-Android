/*
 * XML Type:  ST_ScreenSize
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.STScreenSize
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML ST_ScreenSize(@urn:schemas-microsoft-com:office:office).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComOfficeOffice.STScreenSize.
 */
public interface STScreenSize extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STScreenSize.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stscreensize2340type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_544_376 = Enum.forString("544,376");
    static final Enum X_640_480 = Enum.forString("640,480");
    static final Enum X_720_512 = Enum.forString("720,512");
    static final Enum X_800_600 = Enum.forString("800,600");
    static final Enum X_1024_768 = Enum.forString("1024,768");
    static final Enum X_1152_862 = Enum.forString("1152,862");
    
    static final int INT_X_544_376 = Enum.INT_X_544_376;
    static final int INT_X_640_480 = Enum.INT_X_640_480;
    static final int INT_X_720_512 = Enum.INT_X_720_512;
    static final int INT_X_800_600 = Enum.INT_X_800_600;
    static final int INT_X_1024_768 = Enum.INT_X_1024_768;
    static final int INT_X_1152_862 = Enum.INT_X_1152_862;
    
    /**
     * Enumeration value class for schemasMicrosoftComOfficeOffice.STScreenSize.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_544_376
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
        
        static final int INT_X_544_376 = 1;
        static final int INT_X_640_480 = 2;
        static final int INT_X_720_512 = 3;
        static final int INT_X_800_600 = 4;
        static final int INT_X_1024_768 = 5;
        static final int INT_X_1152_862 = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("544,376", INT_X_544_376),
                new Enum("640,480", INT_X_640_480),
                new Enum("720,512", INT_X_720_512),
                new Enum("800,600", INT_X_800_600),
                new Enum("1024,768", INT_X_1024_768),
                new Enum("1152,862", INT_X_1152_862),
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

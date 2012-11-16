/*
 * XML Type:  ST_Angle
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.STAngle
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML ST_Angle(@urn:schemas-microsoft-com:office:office).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComOfficeOffice.STAngle.
 */
public interface STAngle extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STAngle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stangle3a7ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ANY = Enum.forString("any");
    static final Enum X_30 = Enum.forString("30");
    static final Enum X_45 = Enum.forString("45");
    static final Enum X_60 = Enum.forString("60");
    static final Enum X_90 = Enum.forString("90");
    static final Enum AUTO = Enum.forString("auto");
    
    static final int INT_ANY = Enum.INT_ANY;
    static final int INT_X_30 = Enum.INT_X_30;
    static final int INT_X_45 = Enum.INT_X_45;
    static final int INT_X_60 = Enum.INT_X_60;
    static final int INT_X_90 = Enum.INT_X_90;
    static final int INT_AUTO = Enum.INT_AUTO;
    
    /**
     * Enumeration value class for schemasMicrosoftComOfficeOffice.STAngle.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ANY
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
        
        static final int INT_ANY = 1;
        static final int INT_X_30 = 2;
        static final int INT_X_45 = 3;
        static final int INT_X_60 = 4;
        static final int INT_X_90 = 5;
        static final int INT_AUTO = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("any", INT_ANY),
                new Enum("30", INT_X_30),
                new Enum("45", INT_X_45),
                new Enum("60", INT_X_60),
                new Enum("90", INT_X_90),
                new Enum("auto", INT_AUTO),
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

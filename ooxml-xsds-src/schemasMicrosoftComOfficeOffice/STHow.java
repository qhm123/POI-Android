/*
 * XML Type:  ST_How
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.STHow
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML ST_How(@urn:schemas-microsoft-com:office:office).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComOfficeOffice.STHow.
 */
public interface STHow extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STHow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sthow13b9type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum TOP = Enum.forString("top");
    static final Enum MIDDLE = Enum.forString("middle");
    static final Enum BOTTOM = Enum.forString("bottom");
    static final Enum LEFT = Enum.forString("left");
    static final Enum CENTER = Enum.forString("center");
    static final Enum RIGHT = Enum.forString("right");
    
    static final int INT_TOP = Enum.INT_TOP;
    static final int INT_MIDDLE = Enum.INT_MIDDLE;
    static final int INT_BOTTOM = Enum.INT_BOTTOM;
    static final int INT_LEFT = Enum.INT_LEFT;
    static final int INT_CENTER = Enum.INT_CENTER;
    static final int INT_RIGHT = Enum.INT_RIGHT;
    
    /**
     * Enumeration value class for schemasMicrosoftComOfficeOffice.STHow.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TOP
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
        
        static final int INT_TOP = 1;
        static final int INT_MIDDLE = 2;
        static final int INT_BOTTOM = 3;
        static final int INT_LEFT = 4;
        static final int INT_CENTER = 5;
        static final int INT_RIGHT = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("top", INT_TOP),
                new Enum("middle", INT_MIDDLE),
                new Enum("bottom", INT_BOTTOM),
                new Enum("left", INT_LEFT),
                new Enum("center", INT_CENTER),
                new Enum("right", INT_RIGHT),
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

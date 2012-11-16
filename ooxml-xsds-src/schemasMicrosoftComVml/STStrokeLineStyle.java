/*
 * XML Type:  ST_StrokeLineStyle
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.STStrokeLineStyle
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * An XML ST_StrokeLineStyle(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComVml.STStrokeLineStyle.
 */
public interface STStrokeLineStyle extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STStrokeLineStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ststrokelinestylea509type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SINGLE = Enum.forString("single");
    static final Enum THIN_THIN = Enum.forString("thinThin");
    static final Enum THIN_THICK = Enum.forString("thinThick");
    static final Enum THICK_THIN = Enum.forString("thickThin");
    static final Enum THICK_BETWEEN_THIN = Enum.forString("thickBetweenThin");
    
    static final int INT_SINGLE = Enum.INT_SINGLE;
    static final int INT_THIN_THIN = Enum.INT_THIN_THIN;
    static final int INT_THIN_THICK = Enum.INT_THIN_THICK;
    static final int INT_THICK_THIN = Enum.INT_THICK_THIN;
    static final int INT_THICK_BETWEEN_THIN = Enum.INT_THICK_BETWEEN_THIN;
    
    /**
     * Enumeration value class for schemasMicrosoftComVml.STStrokeLineStyle.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SINGLE
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
        
        static final int INT_SINGLE = 1;
        static final int INT_THIN_THIN = 2;
        static final int INT_THIN_THICK = 3;
        static final int INT_THICK_THIN = 4;
        static final int INT_THICK_BETWEEN_THIN = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("single", INT_SINGLE),
                new Enum("thinThin", INT_THIN_THIN),
                new Enum("thinThick", INT_THIN_THICK),
                new Enum("thickThin", INT_THICK_THIN),
                new Enum("thickBetweenThin", INT_THICK_BETWEEN_THIN),
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

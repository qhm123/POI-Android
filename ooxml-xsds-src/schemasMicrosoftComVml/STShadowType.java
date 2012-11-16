/*
 * XML Type:  ST_ShadowType
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.STShadowType
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * An XML ST_ShadowType(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComVml.STShadowType.
 */
public interface STShadowType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STShadowType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stshadowtype8b48type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SINGLE = Enum.forString("single");
    static final Enum DOUBLE = Enum.forString("double");
    static final Enum EMBOSS = Enum.forString("emboss");
    static final Enum PERSPECTIVE = Enum.forString("perspective");
    
    static final int INT_SINGLE = Enum.INT_SINGLE;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_EMBOSS = Enum.INT_EMBOSS;
    static final int INT_PERSPECTIVE = Enum.INT_PERSPECTIVE;
    
    /**
     * Enumeration value class for schemasMicrosoftComVml.STShadowType.
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
        static final int INT_DOUBLE = 2;
        static final int INT_EMBOSS = 3;
        static final int INT_PERSPECTIVE = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("single", INT_SINGLE),
                new Enum("double", INT_DOUBLE),
                new Enum("emboss", INT_EMBOSS),
                new Enum("perspective", INT_PERSPECTIVE),
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

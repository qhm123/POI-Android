/*
 * XML Type:  ST_FillMethod
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.STFillMethod
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * An XML ST_FillMethod(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComVml.STFillMethod.
 */
public interface STFillMethod extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STFillMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stfillmethoda592type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum LINEAR = Enum.forString("linear");
    static final Enum SIGMA = Enum.forString("sigma");
    static final Enum ANY = Enum.forString("any");
    static final Enum LINEAR_SIGMA = Enum.forString("linear sigma");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_LINEAR = Enum.INT_LINEAR;
    static final int INT_SIGMA = Enum.INT_SIGMA;
    static final int INT_ANY = Enum.INT_ANY;
    static final int INT_LINEAR_SIGMA = Enum.INT_LINEAR_SIGMA;
    
    /**
     * Enumeration value class for schemasMicrosoftComVml.STFillMethod.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
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
        
        static final int INT_NONE = 1;
        static final int INT_LINEAR = 2;
        static final int INT_SIGMA = 3;
        static final int INT_ANY = 4;
        static final int INT_LINEAR_SIGMA = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("linear", INT_LINEAR),
                new Enum("sigma", INT_SIGMA),
                new Enum("any", INT_ANY),
                new Enum("linear sigma", INT_LINEAR_SIGMA),
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

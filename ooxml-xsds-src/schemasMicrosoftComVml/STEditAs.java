/*
 * XML Type:  ST_EditAs
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.STEditAs
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * An XML ST_EditAs(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComVml.STEditAs.
 */
public interface STEditAs extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STEditAs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("steditas85aatype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CANVAS = Enum.forString("canvas");
    static final Enum ORGCHART = Enum.forString("orgchart");
    static final Enum RADIAL = Enum.forString("radial");
    static final Enum CYCLE = Enum.forString("cycle");
    static final Enum STACKED = Enum.forString("stacked");
    static final Enum VENN = Enum.forString("venn");
    static final Enum BULLSEYE = Enum.forString("bullseye");
    
    static final int INT_CANVAS = Enum.INT_CANVAS;
    static final int INT_ORGCHART = Enum.INT_ORGCHART;
    static final int INT_RADIAL = Enum.INT_RADIAL;
    static final int INT_CYCLE = Enum.INT_CYCLE;
    static final int INT_STACKED = Enum.INT_STACKED;
    static final int INT_VENN = Enum.INT_VENN;
    static final int INT_BULLSEYE = Enum.INT_BULLSEYE;
    
    /**
     * Enumeration value class for schemasMicrosoftComVml.STEditAs.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CANVAS
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
        
        static final int INT_CANVAS = 1;
        static final int INT_ORGCHART = 2;
        static final int INT_RADIAL = 3;
        static final int INT_CYCLE = 4;
        static final int INT_STACKED = 5;
        static final int INT_VENN = 6;
        static final int INT_BULLSEYE = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("canvas", INT_CANVAS),
                new Enum("orgchart", INT_ORGCHART),
                new Enum("radial", INT_RADIAL),
                new Enum("cycle", INT_CYCLE),
                new Enum("stacked", INT_STACKED),
                new Enum("venn", INT_VENN),
                new Enum("bullseye", INT_BULLSEYE),
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

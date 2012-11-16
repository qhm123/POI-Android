/*
 * XML Type:  ST_WrapSide
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.STWrapSide
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * An XML ST_WrapSide(@urn:schemas-microsoft-com:office:word).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComOfficeWord.STWrapSide.
 */
public interface STWrapSide extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STWrapSide.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stwrapside6d02type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BOTH = Enum.forString("both");
    static final Enum LEFT = Enum.forString("left");
    static final Enum RIGHT = Enum.forString("right");
    static final Enum LARGEST = Enum.forString("largest");
    
    static final int INT_BOTH = Enum.INT_BOTH;
    static final int INT_LEFT = Enum.INT_LEFT;
    static final int INT_RIGHT = Enum.INT_RIGHT;
    static final int INT_LARGEST = Enum.INT_LARGEST;
    
    /**
     * Enumeration value class for schemasMicrosoftComOfficeWord.STWrapSide.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BOTH
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
        
        static final int INT_BOTH = 1;
        static final int INT_LEFT = 2;
        static final int INT_RIGHT = 3;
        static final int INT_LARGEST = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("both", INT_BOTH),
                new Enum("left", INT_LEFT),
                new Enum("right", INT_RIGHT),
                new Enum("largest", INT_LARGEST),
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

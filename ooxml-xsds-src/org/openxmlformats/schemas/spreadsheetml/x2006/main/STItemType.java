/*
 * XML Type:  ST_ItemType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_ItemType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.
 */
public interface STItemType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STItemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stitemtype6186type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum DATA = Enum.forString("data");
    static final Enum DEFAULT = Enum.forString("default");
    static final Enum SUM = Enum.forString("sum");
    static final Enum COUNT_A = Enum.forString("countA");
    static final Enum AVG = Enum.forString("avg");
    static final Enum MAX = Enum.forString("max");
    static final Enum MIN = Enum.forString("min");
    static final Enum PRODUCT = Enum.forString("product");
    static final Enum COUNT = Enum.forString("count");
    static final Enum STD_DEV = Enum.forString("stdDev");
    static final Enum STD_DEV_P = Enum.forString("stdDevP");
    static final Enum VAR = Enum.forString("var");
    static final Enum VAR_P = Enum.forString("varP");
    static final Enum GRAND = Enum.forString("grand");
    static final Enum BLANK = Enum.forString("blank");
    
    static final int INT_DATA = Enum.INT_DATA;
    static final int INT_DEFAULT = Enum.INT_DEFAULT;
    static final int INT_SUM = Enum.INT_SUM;
    static final int INT_COUNT_A = Enum.INT_COUNT_A;
    static final int INT_AVG = Enum.INT_AVG;
    static final int INT_MAX = Enum.INT_MAX;
    static final int INT_MIN = Enum.INT_MIN;
    static final int INT_PRODUCT = Enum.INT_PRODUCT;
    static final int INT_COUNT = Enum.INT_COUNT;
    static final int INT_STD_DEV = Enum.INT_STD_DEV;
    static final int INT_STD_DEV_P = Enum.INT_STD_DEV_P;
    static final int INT_VAR = Enum.INT_VAR;
    static final int INT_VAR_P = Enum.INT_VAR_P;
    static final int INT_GRAND = Enum.INT_GRAND;
    static final int INT_BLANK = Enum.INT_BLANK;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DATA
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
        
        static final int INT_DATA = 1;
        static final int INT_DEFAULT = 2;
        static final int INT_SUM = 3;
        static final int INT_COUNT_A = 4;
        static final int INT_AVG = 5;
        static final int INT_MAX = 6;
        static final int INT_MIN = 7;
        static final int INT_PRODUCT = 8;
        static final int INT_COUNT = 9;
        static final int INT_STD_DEV = 10;
        static final int INT_STD_DEV_P = 11;
        static final int INT_VAR = 12;
        static final int INT_VAR_P = 13;
        static final int INT_GRAND = 14;
        static final int INT_BLANK = 15;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("data", INT_DATA),
                new Enum("default", INT_DEFAULT),
                new Enum("sum", INT_SUM),
                new Enum("countA", INT_COUNT_A),
                new Enum("avg", INT_AVG),
                new Enum("max", INT_MAX),
                new Enum("min", INT_MIN),
                new Enum("product", INT_PRODUCT),
                new Enum("count", INT_COUNT),
                new Enum("stdDev", INT_STD_DEV),
                new Enum("stdDevP", INT_STD_DEV_P),
                new Enum("var", INT_VAR),
                new Enum("varP", INT_VAR_P),
                new Enum("grand", INT_GRAND),
                new Enum("blank", INT_BLANK),
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

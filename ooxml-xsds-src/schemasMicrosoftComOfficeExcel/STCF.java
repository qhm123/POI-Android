/*
 * XML Type:  ST_CF
 * Namespace: urn:schemas-microsoft-com:office:excel
 * Java type: schemasMicrosoftComOfficeExcel.STCF
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeExcel;


/**
 * An XML ST_CF(@urn:schemas-microsoft-com:office:excel).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComOfficeExcel.STCF.
 */
public interface STCF extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STCF.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stcffa3dtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PICT_OLD = Enum.forString("PictOld");
    static final Enum PICT = Enum.forString("Pict");
    static final Enum BITMAP = Enum.forString("Bitmap");
    static final Enum PICT_PRINT = Enum.forString("PictPrint");
    static final Enum PICT_SCREEN = Enum.forString("PictScreen");
    
    static final int INT_PICT_OLD = Enum.INT_PICT_OLD;
    static final int INT_PICT = Enum.INT_PICT;
    static final int INT_BITMAP = Enum.INT_BITMAP;
    static final int INT_PICT_PRINT = Enum.INT_PICT_PRINT;
    static final int INT_PICT_SCREEN = Enum.INT_PICT_SCREEN;
    
    /**
     * Enumeration value class for schemasMicrosoftComOfficeExcel.STCF.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PICT_OLD
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
        
        static final int INT_PICT_OLD = 1;
        static final int INT_PICT = 2;
        static final int INT_BITMAP = 3;
        static final int INT_PICT_PRINT = 4;
        static final int INT_PICT_SCREEN = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("PictOld", INT_PICT_OLD),
                new Enum("Pict", INT_PICT),
                new Enum("Bitmap", INT_BITMAP),
                new Enum("PictPrint", INT_PICT_PRINT),
                new Enum("PictScreen", INT_PICT_SCREEN),
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

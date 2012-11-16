/*
 * XML Type:  ST_VectorBaseType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * An XML ST_VectorBaseType(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType.
 */
public interface STVectorBaseType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STVectorBaseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stvectorbasetype36e7type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum VARIANT = Enum.forString("variant");
    static final Enum I_1 = Enum.forString("i1");
    static final Enum I_2 = Enum.forString("i2");
    static final Enum I_4 = Enum.forString("i4");
    static final Enum I_8 = Enum.forString("i8");
    static final Enum UI_1 = Enum.forString("ui1");
    static final Enum UI_2 = Enum.forString("ui2");
    static final Enum UI_4 = Enum.forString("ui4");
    static final Enum UI_8 = Enum.forString("ui8");
    static final Enum R_4 = Enum.forString("r4");
    static final Enum R_8 = Enum.forString("r8");
    static final Enum LPSTR = Enum.forString("lpstr");
    static final Enum LPWSTR = Enum.forString("lpwstr");
    static final Enum BSTR = Enum.forString("bstr");
    static final Enum DATE = Enum.forString("date");
    static final Enum FILETIME = Enum.forString("filetime");
    static final Enum BOOL = Enum.forString("bool");
    static final Enum CY = Enum.forString("cy");
    static final Enum ERROR = Enum.forString("error");
    static final Enum CLSID = Enum.forString("clsid");
    static final Enum CF = Enum.forString("cf");
    
    static final int INT_VARIANT = Enum.INT_VARIANT;
    static final int INT_I_1 = Enum.INT_I_1;
    static final int INT_I_2 = Enum.INT_I_2;
    static final int INT_I_4 = Enum.INT_I_4;
    static final int INT_I_8 = Enum.INT_I_8;
    static final int INT_UI_1 = Enum.INT_UI_1;
    static final int INT_UI_2 = Enum.INT_UI_2;
    static final int INT_UI_4 = Enum.INT_UI_4;
    static final int INT_UI_8 = Enum.INT_UI_8;
    static final int INT_R_4 = Enum.INT_R_4;
    static final int INT_R_8 = Enum.INT_R_8;
    static final int INT_LPSTR = Enum.INT_LPSTR;
    static final int INT_LPWSTR = Enum.INT_LPWSTR;
    static final int INT_BSTR = Enum.INT_BSTR;
    static final int INT_DATE = Enum.INT_DATE;
    static final int INT_FILETIME = Enum.INT_FILETIME;
    static final int INT_BOOL = Enum.INT_BOOL;
    static final int INT_CY = Enum.INT_CY;
    static final int INT_ERROR = Enum.INT_ERROR;
    static final int INT_CLSID = Enum.INT_CLSID;
    static final int INT_CF = Enum.INT_CF;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_VARIANT
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
        
        static final int INT_VARIANT = 1;
        static final int INT_I_1 = 2;
        static final int INT_I_2 = 3;
        static final int INT_I_4 = 4;
        static final int INT_I_8 = 5;
        static final int INT_UI_1 = 6;
        static final int INT_UI_2 = 7;
        static final int INT_UI_4 = 8;
        static final int INT_UI_8 = 9;
        static final int INT_R_4 = 10;
        static final int INT_R_8 = 11;
        static final int INT_LPSTR = 12;
        static final int INT_LPWSTR = 13;
        static final int INT_BSTR = 14;
        static final int INT_DATE = 15;
        static final int INT_FILETIME = 16;
        static final int INT_BOOL = 17;
        static final int INT_CY = 18;
        static final int INT_ERROR = 19;
        static final int INT_CLSID = 20;
        static final int INT_CF = 21;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("variant", INT_VARIANT),
                new Enum("i1", INT_I_1),
                new Enum("i2", INT_I_2),
                new Enum("i4", INT_I_4),
                new Enum("i8", INT_I_8),
                new Enum("ui1", INT_UI_1),
                new Enum("ui2", INT_UI_2),
                new Enum("ui4", INT_UI_4),
                new Enum("ui8", INT_UI_8),
                new Enum("r4", INT_R_4),
                new Enum("r8", INT_R_8),
                new Enum("lpstr", INT_LPSTR),
                new Enum("lpwstr", INT_LPWSTR),
                new Enum("bstr", INT_BSTR),
                new Enum("date", INT_DATE),
                new Enum("filetime", INT_FILETIME),
                new Enum("bool", INT_BOOL),
                new Enum("cy", INT_CY),
                new Enum("error", INT_ERROR),
                new Enum("clsid", INT_CLSID),
                new Enum("cf", INT_CF),
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

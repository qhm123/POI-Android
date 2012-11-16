/*
 * XML Type:  ST_XmlDataType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_XmlDataType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType.
 */
public interface STXmlDataType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STXmlDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stxmldatatyped64atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum STRING = Enum.forString("string");
    static final Enum NORMALIZED_STRING = Enum.forString("normalizedString");
    static final Enum TOKEN = Enum.forString("token");
    static final Enum BYTE = Enum.forString("byte");
    static final Enum UNSIGNED_BYTE = Enum.forString("unsignedByte");
    static final Enum BASE_64_BINARY = Enum.forString("base64Binary");
    static final Enum HEX_BINARY = Enum.forString("hexBinary");
    static final Enum INTEGER = Enum.forString("integer");
    static final Enum POSITIVE_INTEGER = Enum.forString("positiveInteger");
    static final Enum NEGATIVE_INTEGER = Enum.forString("negativeInteger");
    static final Enum NON_POSITIVE_INTEGER = Enum.forString("nonPositiveInteger");
    static final Enum NON_NEGATIVE_INTEGER = Enum.forString("nonNegativeInteger");
    static final Enum INT = Enum.forString("int");
    static final Enum UNSIGNED_INT = Enum.forString("unsignedInt");
    static final Enum LONG = Enum.forString("long");
    static final Enum UNSIGNED_LONG = Enum.forString("unsignedLong");
    static final Enum SHORT = Enum.forString("short");
    static final Enum UNSIGNED_SHORT = Enum.forString("unsignedShort");
    static final Enum DECIMAL = Enum.forString("decimal");
    static final Enum FLOAT = Enum.forString("float");
    static final Enum DOUBLE = Enum.forString("double");
    static final Enum BOOLEAN = Enum.forString("boolean");
    static final Enum TIME = Enum.forString("time");
    static final Enum DATE_TIME = Enum.forString("dateTime");
    static final Enum DURATION = Enum.forString("duration");
    static final Enum DATE = Enum.forString("date");
    static final Enum G_MONTH = Enum.forString("gMonth");
    static final Enum G_YEAR = Enum.forString("gYear");
    static final Enum G_YEAR_MONTH = Enum.forString("gYearMonth");
    static final Enum G_DAY = Enum.forString("gDay");
    static final Enum G_MONTH_DAY = Enum.forString("gMonthDay");
    static final Enum NAME = Enum.forString("Name");
    static final Enum Q_NAME = Enum.forString("QName");
    static final Enum NC_NAME = Enum.forString("NCName");
    static final Enum ANY_URI = Enum.forString("anyURI");
    static final Enum LANGUAGE = Enum.forString("language");
    static final Enum ID = Enum.forString("ID");
    static final Enum IDREF = Enum.forString("IDREF");
    static final Enum IDREFS = Enum.forString("IDREFS");
    static final Enum ENTITY = Enum.forString("ENTITY");
    static final Enum ENTITIES = Enum.forString("ENTITIES");
    static final Enum NOTATION = Enum.forString("NOTATION");
    static final Enum NMTOKEN = Enum.forString("NMTOKEN");
    static final Enum NMTOKENS = Enum.forString("NMTOKENS");
    static final Enum ANY_TYPE = Enum.forString("anyType");
    
    static final int INT_STRING = Enum.INT_STRING;
    static final int INT_NORMALIZED_STRING = Enum.INT_NORMALIZED_STRING;
    static final int INT_TOKEN = Enum.INT_TOKEN;
    static final int INT_BYTE = Enum.INT_BYTE;
    static final int INT_UNSIGNED_BYTE = Enum.INT_UNSIGNED_BYTE;
    static final int INT_BASE_64_BINARY = Enum.INT_BASE_64_BINARY;
    static final int INT_HEX_BINARY = Enum.INT_HEX_BINARY;
    static final int INT_INTEGER = Enum.INT_INTEGER;
    static final int INT_POSITIVE_INTEGER = Enum.INT_POSITIVE_INTEGER;
    static final int INT_NEGATIVE_INTEGER = Enum.INT_NEGATIVE_INTEGER;
    static final int INT_NON_POSITIVE_INTEGER = Enum.INT_NON_POSITIVE_INTEGER;
    static final int INT_NON_NEGATIVE_INTEGER = Enum.INT_NON_NEGATIVE_INTEGER;
    static final int INT_INT = Enum.INT_INT;
    static final int INT_UNSIGNED_INT = Enum.INT_UNSIGNED_INT;
    static final int INT_LONG = Enum.INT_LONG;
    static final int INT_UNSIGNED_LONG = Enum.INT_UNSIGNED_LONG;
    static final int INT_SHORT = Enum.INT_SHORT;
    static final int INT_UNSIGNED_SHORT = Enum.INT_UNSIGNED_SHORT;
    static final int INT_DECIMAL = Enum.INT_DECIMAL;
    static final int INT_FLOAT = Enum.INT_FLOAT;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_BOOLEAN = Enum.INT_BOOLEAN;
    static final int INT_TIME = Enum.INT_TIME;
    static final int INT_DATE_TIME = Enum.INT_DATE_TIME;
    static final int INT_DURATION = Enum.INT_DURATION;
    static final int INT_DATE = Enum.INT_DATE;
    static final int INT_G_MONTH = Enum.INT_G_MONTH;
    static final int INT_G_YEAR = Enum.INT_G_YEAR;
    static final int INT_G_YEAR_MONTH = Enum.INT_G_YEAR_MONTH;
    static final int INT_G_DAY = Enum.INT_G_DAY;
    static final int INT_G_MONTH_DAY = Enum.INT_G_MONTH_DAY;
    static final int INT_NAME = Enum.INT_NAME;
    static final int INT_Q_NAME = Enum.INT_Q_NAME;
    static final int INT_NC_NAME = Enum.INT_NC_NAME;
    static final int INT_ANY_URI = Enum.INT_ANY_URI;
    static final int INT_LANGUAGE = Enum.INT_LANGUAGE;
    static final int INT_ID = Enum.INT_ID;
    static final int INT_IDREF = Enum.INT_IDREF;
    static final int INT_IDREFS = Enum.INT_IDREFS;
    static final int INT_ENTITY = Enum.INT_ENTITY;
    static final int INT_ENTITIES = Enum.INT_ENTITIES;
    static final int INT_NOTATION = Enum.INT_NOTATION;
    static final int INT_NMTOKEN = Enum.INT_NMTOKEN;
    static final int INT_NMTOKENS = Enum.INT_NMTOKENS;
    static final int INT_ANY_TYPE = Enum.INT_ANY_TYPE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_STRING
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
        
        static final int INT_STRING = 1;
        static final int INT_NORMALIZED_STRING = 2;
        static final int INT_TOKEN = 3;
        static final int INT_BYTE = 4;
        static final int INT_UNSIGNED_BYTE = 5;
        static final int INT_BASE_64_BINARY = 6;
        static final int INT_HEX_BINARY = 7;
        static final int INT_INTEGER = 8;
        static final int INT_POSITIVE_INTEGER = 9;
        static final int INT_NEGATIVE_INTEGER = 10;
        static final int INT_NON_POSITIVE_INTEGER = 11;
        static final int INT_NON_NEGATIVE_INTEGER = 12;
        static final int INT_INT = 13;
        static final int INT_UNSIGNED_INT = 14;
        static final int INT_LONG = 15;
        static final int INT_UNSIGNED_LONG = 16;
        static final int INT_SHORT = 17;
        static final int INT_UNSIGNED_SHORT = 18;
        static final int INT_DECIMAL = 19;
        static final int INT_FLOAT = 20;
        static final int INT_DOUBLE = 21;
        static final int INT_BOOLEAN = 22;
        static final int INT_TIME = 23;
        static final int INT_DATE_TIME = 24;
        static final int INT_DURATION = 25;
        static final int INT_DATE = 26;
        static final int INT_G_MONTH = 27;
        static final int INT_G_YEAR = 28;
        static final int INT_G_YEAR_MONTH = 29;
        static final int INT_G_DAY = 30;
        static final int INT_G_MONTH_DAY = 31;
        static final int INT_NAME = 32;
        static final int INT_Q_NAME = 33;
        static final int INT_NC_NAME = 34;
        static final int INT_ANY_URI = 35;
        static final int INT_LANGUAGE = 36;
        static final int INT_ID = 37;
        static final int INT_IDREF = 38;
        static final int INT_IDREFS = 39;
        static final int INT_ENTITY = 40;
        static final int INT_ENTITIES = 41;
        static final int INT_NOTATION = 42;
        static final int INT_NMTOKEN = 43;
        static final int INT_NMTOKENS = 44;
        static final int INT_ANY_TYPE = 45;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("string", INT_STRING),
                new Enum("normalizedString", INT_NORMALIZED_STRING),
                new Enum("token", INT_TOKEN),
                new Enum("byte", INT_BYTE),
                new Enum("unsignedByte", INT_UNSIGNED_BYTE),
                new Enum("base64Binary", INT_BASE_64_BINARY),
                new Enum("hexBinary", INT_HEX_BINARY),
                new Enum("integer", INT_INTEGER),
                new Enum("positiveInteger", INT_POSITIVE_INTEGER),
                new Enum("negativeInteger", INT_NEGATIVE_INTEGER),
                new Enum("nonPositiveInteger", INT_NON_POSITIVE_INTEGER),
                new Enum("nonNegativeInteger", INT_NON_NEGATIVE_INTEGER),
                new Enum("int", INT_INT),
                new Enum("unsignedInt", INT_UNSIGNED_INT),
                new Enum("long", INT_LONG),
                new Enum("unsignedLong", INT_UNSIGNED_LONG),
                new Enum("short", INT_SHORT),
                new Enum("unsignedShort", INT_UNSIGNED_SHORT),
                new Enum("decimal", INT_DECIMAL),
                new Enum("float", INT_FLOAT),
                new Enum("double", INT_DOUBLE),
                new Enum("boolean", INT_BOOLEAN),
                new Enum("time", INT_TIME),
                new Enum("dateTime", INT_DATE_TIME),
                new Enum("duration", INT_DURATION),
                new Enum("date", INT_DATE),
                new Enum("gMonth", INT_G_MONTH),
                new Enum("gYear", INT_G_YEAR),
                new Enum("gYearMonth", INT_G_YEAR_MONTH),
                new Enum("gDay", INT_G_DAY),
                new Enum("gMonthDay", INT_G_MONTH_DAY),
                new Enum("Name", INT_NAME),
                new Enum("QName", INT_Q_NAME),
                new Enum("NCName", INT_NC_NAME),
                new Enum("anyURI", INT_ANY_URI),
                new Enum("language", INT_LANGUAGE),
                new Enum("ID", INT_ID),
                new Enum("IDREF", INT_IDREF),
                new Enum("IDREFS", INT_IDREFS),
                new Enum("ENTITY", INT_ENTITY),
                new Enum("ENTITIES", INT_ENTITIES),
                new Enum("NOTATION", INT_NOTATION),
                new Enum("NMTOKEN", INT_NMTOKEN),
                new Enum("NMTOKENS", INT_NMTOKENS),
                new Enum("anyType", INT_ANY_TYPE),
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

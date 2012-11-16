/*
 * XML Type:  ST_MailMergeDataType
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STMailMergeDataType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_MailMergeDataType(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STMailMergeDataType.
 */
public interface STMailMergeDataType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STMailMergeDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stmailmergedatatype729dtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum TEXT_FILE = Enum.forString("textFile");
    static final Enum DATABASE = Enum.forString("database");
    static final Enum SPREADSHEET = Enum.forString("spreadsheet");
    static final Enum QUERY = Enum.forString("query");
    static final Enum ODBC = Enum.forString("odbc");
    static final Enum NATIVE = Enum.forString("native");
    
    static final int INT_TEXT_FILE = Enum.INT_TEXT_FILE;
    static final int INT_DATABASE = Enum.INT_DATABASE;
    static final int INT_SPREADSHEET = Enum.INT_SPREADSHEET;
    static final int INT_QUERY = Enum.INT_QUERY;
    static final int INT_ODBC = Enum.INT_ODBC;
    static final int INT_NATIVE = Enum.INT_NATIVE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STMailMergeDataType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TEXT_FILE
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
        
        static final int INT_TEXT_FILE = 1;
        static final int INT_DATABASE = 2;
        static final int INT_SPREADSHEET = 3;
        static final int INT_QUERY = 4;
        static final int INT_ODBC = 5;
        static final int INT_NATIVE = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("textFile", INT_TEXT_FILE),
                new Enum("database", INT_DATABASE),
                new Enum("spreadsheet", INT_SPREADSHEET),
                new Enum("query", INT_QUERY),
                new Enum("odbc", INT_ODBC),
                new Enum("native", INT_NATIVE),
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

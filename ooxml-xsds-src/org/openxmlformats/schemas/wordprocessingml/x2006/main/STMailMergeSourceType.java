/*
 * XML Type:  ST_MailMergeSourceType
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STMailMergeSourceType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_MailMergeSourceType(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STMailMergeSourceType.
 */
public interface STMailMergeSourceType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STMailMergeSourceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stmailmergesourcetype534ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum DATABASE = Enum.forString("database");
    static final Enum ADDRESS_BOOK = Enum.forString("addressBook");
    static final Enum DOCUMENT_1 = Enum.forString("document1");
    static final Enum DOCUMENT_2 = Enum.forString("document2");
    static final Enum TEXT = Enum.forString("text");
    static final Enum EMAIL = Enum.forString("email");
    static final Enum NATIVE = Enum.forString("native");
    static final Enum LEGACY = Enum.forString("legacy");
    static final Enum MASTER = Enum.forString("master");
    
    static final int INT_DATABASE = Enum.INT_DATABASE;
    static final int INT_ADDRESS_BOOK = Enum.INT_ADDRESS_BOOK;
    static final int INT_DOCUMENT_1 = Enum.INT_DOCUMENT_1;
    static final int INT_DOCUMENT_2 = Enum.INT_DOCUMENT_2;
    static final int INT_TEXT = Enum.INT_TEXT;
    static final int INT_EMAIL = Enum.INT_EMAIL;
    static final int INT_NATIVE = Enum.INT_NATIVE;
    static final int INT_LEGACY = Enum.INT_LEGACY;
    static final int INT_MASTER = Enum.INT_MASTER;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STMailMergeSourceType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DATABASE
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
        
        static final int INT_DATABASE = 1;
        static final int INT_ADDRESS_BOOK = 2;
        static final int INT_DOCUMENT_1 = 3;
        static final int INT_DOCUMENT_2 = 4;
        static final int INT_TEXT = 5;
        static final int INT_EMAIL = 6;
        static final int INT_NATIVE = 7;
        static final int INT_LEGACY = 8;
        static final int INT_MASTER = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("database", INT_DATABASE),
                new Enum("addressBook", INT_ADDRESS_BOOK),
                new Enum("document1", INT_DOCUMENT_1),
                new Enum("document2", INT_DOCUMENT_2),
                new Enum("text", INT_TEXT),
                new Enum("email", INT_EMAIL),
                new Enum("native", INT_NATIVE),
                new Enum("legacy", INT_LEGACY),
                new Enum("master", INT_MASTER),
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

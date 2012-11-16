/*
 * XML Type:  ST_TextboxTightWrap
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextboxTightWrap
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_TextboxTightWrap(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextboxTightWrap.
 */
public interface STTextboxTightWrap extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTextboxTightWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttextboxtightwrap8c6etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum ALL_LINES = Enum.forString("allLines");
    static final Enum FIRST_AND_LAST_LINE = Enum.forString("firstAndLastLine");
    static final Enum FIRST_LINE_ONLY = Enum.forString("firstLineOnly");
    static final Enum LAST_LINE_ONLY = Enum.forString("lastLineOnly");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_ALL_LINES = Enum.INT_ALL_LINES;
    static final int INT_FIRST_AND_LAST_LINE = Enum.INT_FIRST_AND_LAST_LINE;
    static final int INT_FIRST_LINE_ONLY = Enum.INT_FIRST_LINE_ONLY;
    static final int INT_LAST_LINE_ONLY = Enum.INT_LAST_LINE_ONLY;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextboxTightWrap.
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
        static final int INT_ALL_LINES = 2;
        static final int INT_FIRST_AND_LAST_LINE = 3;
        static final int INT_FIRST_LINE_ONLY = 4;
        static final int INT_LAST_LINE_ONLY = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("allLines", INT_ALL_LINES),
                new Enum("firstAndLastLine", INT_FIRST_AND_LAST_LINE),
                new Enum("firstLineOnly", INT_FIRST_LINE_ONLY),
                new Enum("lastLineOnly", INT_LAST_LINE_ONLY),
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

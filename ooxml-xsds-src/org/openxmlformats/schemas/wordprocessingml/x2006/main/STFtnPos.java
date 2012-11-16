/*
 * XML Type:  ST_FtnPos
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STFtnPos
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_FtnPos(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STFtnPos.
 */
public interface STFtnPos extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STFtnPos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stftnposdc44type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PAGE_BOTTOM = Enum.forString("pageBottom");
    static final Enum BENEATH_TEXT = Enum.forString("beneathText");
    static final Enum SECT_END = Enum.forString("sectEnd");
    static final Enum DOC_END = Enum.forString("docEnd");
    
    static final int INT_PAGE_BOTTOM = Enum.INT_PAGE_BOTTOM;
    static final int INT_BENEATH_TEXT = Enum.INT_BENEATH_TEXT;
    static final int INT_SECT_END = Enum.INT_SECT_END;
    static final int INT_DOC_END = Enum.INT_DOC_END;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STFtnPos.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PAGE_BOTTOM
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
        
        static final int INT_PAGE_BOTTOM = 1;
        static final int INT_BENEATH_TEXT = 2;
        static final int INT_SECT_END = 3;
        static final int INT_DOC_END = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("pageBottom", INT_PAGE_BOTTOM),
                new Enum("beneathText", INT_BENEATH_TEXT),
                new Enum("sectEnd", INT_SECT_END),
                new Enum("docEnd", INT_DOC_END),
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

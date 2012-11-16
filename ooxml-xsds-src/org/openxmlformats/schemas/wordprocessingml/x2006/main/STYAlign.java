/*
 * XML Type:  ST_YAlign
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_YAlign(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign.
 */
public interface STYAlign extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STYAlign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("styalign0e0ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INLINE = Enum.forString("inline");
    static final Enum TOP = Enum.forString("top");
    static final Enum CENTER = Enum.forString("center");
    static final Enum BOTTOM = Enum.forString("bottom");
    static final Enum INSIDE = Enum.forString("inside");
    static final Enum OUTSIDE = Enum.forString("outside");
    
    static final int INT_INLINE = Enum.INT_INLINE;
    static final int INT_TOP = Enum.INT_TOP;
    static final int INT_CENTER = Enum.INT_CENTER;
    static final int INT_BOTTOM = Enum.INT_BOTTOM;
    static final int INT_INSIDE = Enum.INT_INSIDE;
    static final int INT_OUTSIDE = Enum.INT_OUTSIDE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INLINE
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
        
        static final int INT_INLINE = 1;
        static final int INT_TOP = 2;
        static final int INT_CENTER = 3;
        static final int INT_BOTTOM = 4;
        static final int INT_INSIDE = 5;
        static final int INT_OUTSIDE = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("inline", INT_INLINE),
                new Enum("top", INT_TOP),
                new Enum("center", INT_CENTER),
                new Enum("bottom", INT_BOTTOM),
                new Enum("inside", INT_INSIDE),
                new Enum("outside", INT_OUTSIDE),
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

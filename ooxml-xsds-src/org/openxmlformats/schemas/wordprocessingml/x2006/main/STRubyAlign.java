/*
 * XML Type:  ST_RubyAlign
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STRubyAlign
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_RubyAlign(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STRubyAlign.
 */
public interface STRubyAlign extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STRubyAlign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("strubyalignb1f7type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CENTER = Enum.forString("center");
    static final Enum DISTRIBUTE_LETTER = Enum.forString("distributeLetter");
    static final Enum DISTRIBUTE_SPACE = Enum.forString("distributeSpace");
    static final Enum LEFT = Enum.forString("left");
    static final Enum RIGHT = Enum.forString("right");
    static final Enum RIGHT_VERTICAL = Enum.forString("rightVertical");
    
    static final int INT_CENTER = Enum.INT_CENTER;
    static final int INT_DISTRIBUTE_LETTER = Enum.INT_DISTRIBUTE_LETTER;
    static final int INT_DISTRIBUTE_SPACE = Enum.INT_DISTRIBUTE_SPACE;
    static final int INT_LEFT = Enum.INT_LEFT;
    static final int INT_RIGHT = Enum.INT_RIGHT;
    static final int INT_RIGHT_VERTICAL = Enum.INT_RIGHT_VERTICAL;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STRubyAlign.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CENTER
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
        
        static final int INT_CENTER = 1;
        static final int INT_DISTRIBUTE_LETTER = 2;
        static final int INT_DISTRIBUTE_SPACE = 3;
        static final int INT_LEFT = 4;
        static final int INT_RIGHT = 5;
        static final int INT_RIGHT_VERTICAL = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("center", INT_CENTER),
                new Enum("distributeLetter", INT_DISTRIBUTE_LETTER),
                new Enum("distributeSpace", INT_DISTRIBUTE_SPACE),
                new Enum("left", INT_LEFT),
                new Enum("right", INT_RIGHT),
                new Enum("rightVertical", INT_RIGHT_VERTICAL),
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

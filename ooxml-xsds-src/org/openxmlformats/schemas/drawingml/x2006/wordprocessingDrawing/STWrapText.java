/*
 * XML Type:  ST_WrapText
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing;


/**
 * An XML ST_WrapText(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText.
 */
public interface STWrapText extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STWrapText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stwraptext4a98type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BOTH_SIDES = Enum.forString("bothSides");
    static final Enum LEFT = Enum.forString("left");
    static final Enum RIGHT = Enum.forString("right");
    static final Enum LARGEST = Enum.forString("largest");
    
    static final int INT_BOTH_SIDES = Enum.INT_BOTH_SIDES;
    static final int INT_LEFT = Enum.INT_LEFT;
    static final int INT_RIGHT = Enum.INT_RIGHT;
    static final int INT_LARGEST = Enum.INT_LARGEST;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BOTH_SIDES
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
        
        static final int INT_BOTH_SIDES = 1;
        static final int INT_LEFT = 2;
        static final int INT_RIGHT = 3;
        static final int INT_LARGEST = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("bothSides", INT_BOTH_SIDES),
                new Enum("left", INT_LEFT),
                new Enum("right", INT_RIGHT),
                new Enum("largest", INT_LARGEST),
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

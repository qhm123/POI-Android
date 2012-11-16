/*
 * XML Type:  ST_RelFromH
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing;


/**
 * An XML ST_RelFromH(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH.
 */
public interface STRelFromH extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STRelFromH.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("strelfromh72aatype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum MARGIN = Enum.forString("margin");
    static final Enum PAGE = Enum.forString("page");
    static final Enum COLUMN = Enum.forString("column");
    static final Enum CHARACTER = Enum.forString("character");
    static final Enum LEFT_MARGIN = Enum.forString("leftMargin");
    static final Enum RIGHT_MARGIN = Enum.forString("rightMargin");
    static final Enum INSIDE_MARGIN = Enum.forString("insideMargin");
    static final Enum OUTSIDE_MARGIN = Enum.forString("outsideMargin");
    
    static final int INT_MARGIN = Enum.INT_MARGIN;
    static final int INT_PAGE = Enum.INT_PAGE;
    static final int INT_COLUMN = Enum.INT_COLUMN;
    static final int INT_CHARACTER = Enum.INT_CHARACTER;
    static final int INT_LEFT_MARGIN = Enum.INT_LEFT_MARGIN;
    static final int INT_RIGHT_MARGIN = Enum.INT_RIGHT_MARGIN;
    static final int INT_INSIDE_MARGIN = Enum.INT_INSIDE_MARGIN;
    static final int INT_OUTSIDE_MARGIN = Enum.INT_OUTSIDE_MARGIN;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_MARGIN
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
        
        static final int INT_MARGIN = 1;
        static final int INT_PAGE = 2;
        static final int INT_COLUMN = 3;
        static final int INT_CHARACTER = 4;
        static final int INT_LEFT_MARGIN = 5;
        static final int INT_RIGHT_MARGIN = 6;
        static final int INT_INSIDE_MARGIN = 7;
        static final int INT_OUTSIDE_MARGIN = 8;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("margin", INT_MARGIN),
                new Enum("page", INT_PAGE),
                new Enum("column", INT_COLUMN),
                new Enum("character", INT_CHARACTER),
                new Enum("leftMargin", INT_LEFT_MARGIN),
                new Enum("rightMargin", INT_RIGHT_MARGIN),
                new Enum("insideMargin", INT_INSIDE_MARGIN),
                new Enum("outsideMargin", INT_OUTSIDE_MARGIN),
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

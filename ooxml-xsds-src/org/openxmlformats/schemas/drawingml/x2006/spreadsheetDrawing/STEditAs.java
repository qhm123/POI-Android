/*
 * XML Type:  ST_EditAs
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;


/**
 * An XML ST_EditAs(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs.
 */
public interface STEditAs extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STEditAs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("steditasad40type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum TWO_CELL = Enum.forString("twoCell");
    static final Enum ONE_CELL = Enum.forString("oneCell");
    static final Enum ABSOLUTE = Enum.forString("absolute");
    
    static final int INT_TWO_CELL = Enum.INT_TWO_CELL;
    static final int INT_ONE_CELL = Enum.INT_ONE_CELL;
    static final int INT_ABSOLUTE = Enum.INT_ABSOLUTE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TWO_CELL
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
        
        static final int INT_TWO_CELL = 1;
        static final int INT_ONE_CELL = 2;
        static final int INT_ABSOLUTE = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("twoCell", INT_TWO_CELL),
                new Enum("oneCell", INT_ONE_CELL),
                new Enum("absolute", INT_ABSOLUTE),
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

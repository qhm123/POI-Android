/*
 * XML Type:  ST_RectAlignment
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_RectAlignment(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment.
 */
public interface STRectAlignment extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STRectAlignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("strectalignmentd400type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum TL = Enum.forString("tl");
    static final Enum T = Enum.forString("t");
    static final Enum TR = Enum.forString("tr");
    static final Enum L = Enum.forString("l");
    static final Enum CTR = Enum.forString("ctr");
    static final Enum R = Enum.forString("r");
    static final Enum BL = Enum.forString("bl");
    static final Enum B = Enum.forString("b");
    static final Enum BR = Enum.forString("br");
    
    static final int INT_TL = Enum.INT_TL;
    static final int INT_T = Enum.INT_T;
    static final int INT_TR = Enum.INT_TR;
    static final int INT_L = Enum.INT_L;
    static final int INT_CTR = Enum.INT_CTR;
    static final int INT_R = Enum.INT_R;
    static final int INT_BL = Enum.INT_BL;
    static final int INT_B = Enum.INT_B;
    static final int INT_BR = Enum.INT_BR;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TL
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
        
        static final int INT_TL = 1;
        static final int INT_T = 2;
        static final int INT_TR = 3;
        static final int INT_L = 4;
        static final int INT_CTR = 5;
        static final int INT_R = 6;
        static final int INT_BL = 7;
        static final int INT_B = 8;
        static final int INT_BR = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("tl", INT_TL),
                new Enum("t", INT_T),
                new Enum("tr", INT_TR),
                new Enum("l", INT_L),
                new Enum("ctr", INT_CTR),
                new Enum("r", INT_R),
                new Enum("bl", INT_BL),
                new Enum("b", INT_B),
                new Enum("br", INT_BR),
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

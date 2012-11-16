/*
 * XML Type:  ST_ConnectorPoint
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.STConnectorPoint
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML ST_ConnectorPoint(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.diagram.STConnectorPoint.
 */
public interface STConnectorPoint extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STConnectorPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stconnectorpoint387etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AUTO = Enum.forString("auto");
    static final Enum B_CTR = Enum.forString("bCtr");
    static final Enum CTR = Enum.forString("ctr");
    static final Enum MID_L = Enum.forString("midL");
    static final Enum MID_R = Enum.forString("midR");
    static final Enum T_CTR = Enum.forString("tCtr");
    static final Enum B_L = Enum.forString("bL");
    static final Enum B_R = Enum.forString("bR");
    static final Enum T_L = Enum.forString("tL");
    static final Enum T_R = Enum.forString("tR");
    static final Enum RADIAL = Enum.forString("radial");
    
    static final int INT_AUTO = Enum.INT_AUTO;
    static final int INT_B_CTR = Enum.INT_B_CTR;
    static final int INT_CTR = Enum.INT_CTR;
    static final int INT_MID_L = Enum.INT_MID_L;
    static final int INT_MID_R = Enum.INT_MID_R;
    static final int INT_T_CTR = Enum.INT_T_CTR;
    static final int INT_B_L = Enum.INT_B_L;
    static final int INT_B_R = Enum.INT_B_R;
    static final int INT_T_L = Enum.INT_T_L;
    static final int INT_T_R = Enum.INT_T_R;
    static final int INT_RADIAL = Enum.INT_RADIAL;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.diagram.STConnectorPoint.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AUTO
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
        
        static final int INT_AUTO = 1;
        static final int INT_B_CTR = 2;
        static final int INT_CTR = 3;
        static final int INT_MID_L = 4;
        static final int INT_MID_R = 5;
        static final int INT_T_CTR = 6;
        static final int INT_B_L = 7;
        static final int INT_B_R = 8;
        static final int INT_T_L = 9;
        static final int INT_T_R = 10;
        static final int INT_RADIAL = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("auto", INT_AUTO),
                new Enum("bCtr", INT_B_CTR),
                new Enum("ctr", INT_CTR),
                new Enum("midL", INT_MID_L),
                new Enum("midR", INT_MID_R),
                new Enum("tCtr", INT_T_CTR),
                new Enum("bL", INT_B_L),
                new Enum("bR", INT_B_R),
                new Enum("tL", INT_T_L),
                new Enum("tR", INT_T_R),
                new Enum("radial", INT_RADIAL),
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

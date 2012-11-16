/*
 * XML Type:  ST_TLDiagramBuildType
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_TLDiagramBuildType(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType.
 */
public interface STTLDiagramBuildType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTLDiagramBuildType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttldiagrambuildtypeb208type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum WHOLE = Enum.forString("whole");
    static final Enum DEPTH_BY_NODE = Enum.forString("depthByNode");
    static final Enum DEPTH_BY_BRANCH = Enum.forString("depthByBranch");
    static final Enum BREADTH_BY_NODE = Enum.forString("breadthByNode");
    static final Enum BREADTH_BY_LVL = Enum.forString("breadthByLvl");
    static final Enum CW = Enum.forString("cw");
    static final Enum CW_IN = Enum.forString("cwIn");
    static final Enum CW_OUT = Enum.forString("cwOut");
    static final Enum CCW = Enum.forString("ccw");
    static final Enum CCW_IN = Enum.forString("ccwIn");
    static final Enum CCW_OUT = Enum.forString("ccwOut");
    static final Enum IN_BY_RING = Enum.forString("inByRing");
    static final Enum OUT_BY_RING = Enum.forString("outByRing");
    static final Enum UP = Enum.forString("up");
    static final Enum DOWN = Enum.forString("down");
    static final Enum ALL_AT_ONCE = Enum.forString("allAtOnce");
    static final Enum CUST = Enum.forString("cust");
    
    static final int INT_WHOLE = Enum.INT_WHOLE;
    static final int INT_DEPTH_BY_NODE = Enum.INT_DEPTH_BY_NODE;
    static final int INT_DEPTH_BY_BRANCH = Enum.INT_DEPTH_BY_BRANCH;
    static final int INT_BREADTH_BY_NODE = Enum.INT_BREADTH_BY_NODE;
    static final int INT_BREADTH_BY_LVL = Enum.INT_BREADTH_BY_LVL;
    static final int INT_CW = Enum.INT_CW;
    static final int INT_CW_IN = Enum.INT_CW_IN;
    static final int INT_CW_OUT = Enum.INT_CW_OUT;
    static final int INT_CCW = Enum.INT_CCW;
    static final int INT_CCW_IN = Enum.INT_CCW_IN;
    static final int INT_CCW_OUT = Enum.INT_CCW_OUT;
    static final int INT_IN_BY_RING = Enum.INT_IN_BY_RING;
    static final int INT_OUT_BY_RING = Enum.INT_OUT_BY_RING;
    static final int INT_UP = Enum.INT_UP;
    static final int INT_DOWN = Enum.INT_DOWN;
    static final int INT_ALL_AT_ONCE = Enum.INT_ALL_AT_ONCE;
    static final int INT_CUST = Enum.INT_CUST;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_WHOLE
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
        
        static final int INT_WHOLE = 1;
        static final int INT_DEPTH_BY_NODE = 2;
        static final int INT_DEPTH_BY_BRANCH = 3;
        static final int INT_BREADTH_BY_NODE = 4;
        static final int INT_BREADTH_BY_LVL = 5;
        static final int INT_CW = 6;
        static final int INT_CW_IN = 7;
        static final int INT_CW_OUT = 8;
        static final int INT_CCW = 9;
        static final int INT_CCW_IN = 10;
        static final int INT_CCW_OUT = 11;
        static final int INT_IN_BY_RING = 12;
        static final int INT_OUT_BY_RING = 13;
        static final int INT_UP = 14;
        static final int INT_DOWN = 15;
        static final int INT_ALL_AT_ONCE = 16;
        static final int INT_CUST = 17;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("whole", INT_WHOLE),
                new Enum("depthByNode", INT_DEPTH_BY_NODE),
                new Enum("depthByBranch", INT_DEPTH_BY_BRANCH),
                new Enum("breadthByNode", INT_BREADTH_BY_NODE),
                new Enum("breadthByLvl", INT_BREADTH_BY_LVL),
                new Enum("cw", INT_CW),
                new Enum("cwIn", INT_CW_IN),
                new Enum("cwOut", INT_CW_OUT),
                new Enum("ccw", INT_CCW),
                new Enum("ccwIn", INT_CCW_IN),
                new Enum("ccwOut", INT_CCW_OUT),
                new Enum("inByRing", INT_IN_BY_RING),
                new Enum("outByRing", INT_OUT_BY_RING),
                new Enum("up", INT_UP),
                new Enum("down", INT_DOWN),
                new Enum("allAtOnce", INT_ALL_AT_ONCE),
                new Enum("cust", INT_CUST),
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

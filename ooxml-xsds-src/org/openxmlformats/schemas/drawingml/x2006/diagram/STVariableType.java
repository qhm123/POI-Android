/*
 * XML Type:  ST_VariableType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.STVariableType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML ST_VariableType(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.diagram.STVariableType.
 */
public interface STVariableType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STVariableType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stvariabletypef00btype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum ORG_CHART = Enum.forString("orgChart");
    static final Enum CH_MAX = Enum.forString("chMax");
    static final Enum CH_PREF = Enum.forString("chPref");
    static final Enum BUL_ENABLED = Enum.forString("bulEnabled");
    static final Enum DIR = Enum.forString("dir");
    static final Enum HIER_BRANCH = Enum.forString("hierBranch");
    static final Enum ANIM_ONE = Enum.forString("animOne");
    static final Enum ANIM_LVL = Enum.forString("animLvl");
    static final Enum RESIZE_HANDLES = Enum.forString("resizeHandles");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_ORG_CHART = Enum.INT_ORG_CHART;
    static final int INT_CH_MAX = Enum.INT_CH_MAX;
    static final int INT_CH_PREF = Enum.INT_CH_PREF;
    static final int INT_BUL_ENABLED = Enum.INT_BUL_ENABLED;
    static final int INT_DIR = Enum.INT_DIR;
    static final int INT_HIER_BRANCH = Enum.INT_HIER_BRANCH;
    static final int INT_ANIM_ONE = Enum.INT_ANIM_ONE;
    static final int INT_ANIM_LVL = Enum.INT_ANIM_LVL;
    static final int INT_RESIZE_HANDLES = Enum.INT_RESIZE_HANDLES;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.diagram.STVariableType.
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
        static final int INT_ORG_CHART = 2;
        static final int INT_CH_MAX = 3;
        static final int INT_CH_PREF = 4;
        static final int INT_BUL_ENABLED = 5;
        static final int INT_DIR = 6;
        static final int INT_HIER_BRANCH = 7;
        static final int INT_ANIM_ONE = 8;
        static final int INT_ANIM_LVL = 9;
        static final int INT_RESIZE_HANDLES = 10;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("orgChart", INT_ORG_CHART),
                new Enum("chMax", INT_CH_MAX),
                new Enum("chPref", INT_CH_PREF),
                new Enum("bulEnabled", INT_BUL_ENABLED),
                new Enum("dir", INT_DIR),
                new Enum("hierBranch", INT_HIER_BRANCH),
                new Enum("animOne", INT_ANIM_ONE),
                new Enum("animLvl", INT_ANIM_LVL),
                new Enum("resizeHandles", INT_RESIZE_HANDLES),
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

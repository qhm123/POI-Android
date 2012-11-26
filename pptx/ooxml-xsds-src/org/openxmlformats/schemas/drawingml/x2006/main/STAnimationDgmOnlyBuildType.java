/*
 * XML Type:  ST_AnimationDgmOnlyBuildType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmOnlyBuildType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_AnimationDgmOnlyBuildType(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmOnlyBuildType.
 */
public interface STAnimationDgmOnlyBuildType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STAnimationDgmOnlyBuildType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stanimationdgmonlybuildtypefbd7type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ONE = Enum.forString("one");
    static final Enum LVL_ONE = Enum.forString("lvlOne");
    static final Enum LVL_AT_ONCE = Enum.forString("lvlAtOnce");
    
    static final int INT_ONE = Enum.INT_ONE;
    static final int INT_LVL_ONE = Enum.INT_LVL_ONE;
    static final int INT_LVL_AT_ONCE = Enum.INT_LVL_AT_ONCE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmOnlyBuildType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ONE
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
        
        static final int INT_ONE = 1;
        static final int INT_LVL_ONE = 2;
        static final int INT_LVL_AT_ONCE = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("one", INT_ONE),
                new Enum("lvlOne", INT_LVL_ONE),
                new Enum("lvlAtOnce", INT_LVL_AT_ONCE),
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

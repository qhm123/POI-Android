/*
 * XML Type:  ST_AxisType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML ST_AxisType(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisType.
 */
public interface STAxisType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STAxisType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("staxistypeca86type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SELF = Enum.forString("self");
    static final Enum CH = Enum.forString("ch");
    static final Enum DES = Enum.forString("des");
    static final Enum DES_OR_SELF = Enum.forString("desOrSelf");
    static final Enum PAR = Enum.forString("par");
    static final Enum ANCST = Enum.forString("ancst");
    static final Enum ANCST_OR_SELF = Enum.forString("ancstOrSelf");
    static final Enum FOLLOW_SIB = Enum.forString("followSib");
    static final Enum PRECED_SIB = Enum.forString("precedSib");
    static final Enum FOLLOW = Enum.forString("follow");
    static final Enum PRECED = Enum.forString("preced");
    static final Enum ROOT = Enum.forString("root");
    static final Enum NONE = Enum.forString("none");
    
    static final int INT_SELF = Enum.INT_SELF;
    static final int INT_CH = Enum.INT_CH;
    static final int INT_DES = Enum.INT_DES;
    static final int INT_DES_OR_SELF = Enum.INT_DES_OR_SELF;
    static final int INT_PAR = Enum.INT_PAR;
    static final int INT_ANCST = Enum.INT_ANCST;
    static final int INT_ANCST_OR_SELF = Enum.INT_ANCST_OR_SELF;
    static final int INT_FOLLOW_SIB = Enum.INT_FOLLOW_SIB;
    static final int INT_PRECED_SIB = Enum.INT_PRECED_SIB;
    static final int INT_FOLLOW = Enum.INT_FOLLOW;
    static final int INT_PRECED = Enum.INT_PRECED;
    static final int INT_ROOT = Enum.INT_ROOT;
    static final int INT_NONE = Enum.INT_NONE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SELF
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
        
        static final int INT_SELF = 1;
        static final int INT_CH = 2;
        static final int INT_DES = 3;
        static final int INT_DES_OR_SELF = 4;
        static final int INT_PAR = 5;
        static final int INT_ANCST = 6;
        static final int INT_ANCST_OR_SELF = 7;
        static final int INT_FOLLOW_SIB = 8;
        static final int INT_PRECED_SIB = 9;
        static final int INT_FOLLOW = 10;
        static final int INT_PRECED = 11;
        static final int INT_ROOT = 12;
        static final int INT_NONE = 13;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("self", INT_SELF),
                new Enum("ch", INT_CH),
                new Enum("des", INT_DES),
                new Enum("desOrSelf", INT_DES_OR_SELF),
                new Enum("par", INT_PAR),
                new Enum("ancst", INT_ANCST),
                new Enum("ancstOrSelf", INT_ANCST_OR_SELF),
                new Enum("followSib", INT_FOLLOW_SIB),
                new Enum("precedSib", INT_PRECED_SIB),
                new Enum("follow", INT_FOLLOW),
                new Enum("preced", INT_PRECED),
                new Enum("root", INT_ROOT),
                new Enum("none", INT_NONE),
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

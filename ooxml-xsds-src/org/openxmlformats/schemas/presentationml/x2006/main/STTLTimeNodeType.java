/*
 * XML Type:  ST_TLTimeNodeType
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_TLTimeNodeType(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType.
 */
public interface STTLTimeNodeType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTLTimeNodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttltimenodetypebbf4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CLICK_EFFECT = Enum.forString("clickEffect");
    static final Enum WITH_EFFECT = Enum.forString("withEffect");
    static final Enum AFTER_EFFECT = Enum.forString("afterEffect");
    static final Enum MAIN_SEQ = Enum.forString("mainSeq");
    static final Enum INTERACTIVE_SEQ = Enum.forString("interactiveSeq");
    static final Enum CLICK_PAR = Enum.forString("clickPar");
    static final Enum WITH_GROUP = Enum.forString("withGroup");
    static final Enum AFTER_GROUP = Enum.forString("afterGroup");
    static final Enum TM_ROOT = Enum.forString("tmRoot");
    
    static final int INT_CLICK_EFFECT = Enum.INT_CLICK_EFFECT;
    static final int INT_WITH_EFFECT = Enum.INT_WITH_EFFECT;
    static final int INT_AFTER_EFFECT = Enum.INT_AFTER_EFFECT;
    static final int INT_MAIN_SEQ = Enum.INT_MAIN_SEQ;
    static final int INT_INTERACTIVE_SEQ = Enum.INT_INTERACTIVE_SEQ;
    static final int INT_CLICK_PAR = Enum.INT_CLICK_PAR;
    static final int INT_WITH_GROUP = Enum.INT_WITH_GROUP;
    static final int INT_AFTER_GROUP = Enum.INT_AFTER_GROUP;
    static final int INT_TM_ROOT = Enum.INT_TM_ROOT;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CLICK_EFFECT
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
        
        static final int INT_CLICK_EFFECT = 1;
        static final int INT_WITH_EFFECT = 2;
        static final int INT_AFTER_EFFECT = 3;
        static final int INT_MAIN_SEQ = 4;
        static final int INT_INTERACTIVE_SEQ = 5;
        static final int INT_CLICK_PAR = 6;
        static final int INT_WITH_GROUP = 7;
        static final int INT_AFTER_GROUP = 8;
        static final int INT_TM_ROOT = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("clickEffect", INT_CLICK_EFFECT),
                new Enum("withEffect", INT_WITH_EFFECT),
                new Enum("afterEffect", INT_AFTER_EFFECT),
                new Enum("mainSeq", INT_MAIN_SEQ),
                new Enum("interactiveSeq", INT_INTERACTIVE_SEQ),
                new Enum("clickPar", INT_CLICK_PAR),
                new Enum("withGroup", INT_WITH_GROUP),
                new Enum("afterGroup", INT_AFTER_GROUP),
                new Enum("tmRoot", INT_TM_ROOT),
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

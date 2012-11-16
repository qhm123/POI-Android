/*
 * XML Type:  ST_TLTriggerEvent
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_TLTriggerEvent(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent.
 */
public interface STTLTriggerEvent extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTLTriggerEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttltriggerevent36dbtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ON_BEGIN = Enum.forString("onBegin");
    static final Enum ON_END = Enum.forString("onEnd");
    static final Enum BEGIN = Enum.forString("begin");
    static final Enum END = Enum.forString("end");
    static final Enum ON_CLICK = Enum.forString("onClick");
    static final Enum ON_DBL_CLICK = Enum.forString("onDblClick");
    static final Enum ON_MOUSE_OVER = Enum.forString("onMouseOver");
    static final Enum ON_MOUSE_OUT = Enum.forString("onMouseOut");
    static final Enum ON_NEXT = Enum.forString("onNext");
    static final Enum ON_PREV = Enum.forString("onPrev");
    static final Enum ON_STOP_AUDIO = Enum.forString("onStopAudio");
    
    static final int INT_ON_BEGIN = Enum.INT_ON_BEGIN;
    static final int INT_ON_END = Enum.INT_ON_END;
    static final int INT_BEGIN = Enum.INT_BEGIN;
    static final int INT_END = Enum.INT_END;
    static final int INT_ON_CLICK = Enum.INT_ON_CLICK;
    static final int INT_ON_DBL_CLICK = Enum.INT_ON_DBL_CLICK;
    static final int INT_ON_MOUSE_OVER = Enum.INT_ON_MOUSE_OVER;
    static final int INT_ON_MOUSE_OUT = Enum.INT_ON_MOUSE_OUT;
    static final int INT_ON_NEXT = Enum.INT_ON_NEXT;
    static final int INT_ON_PREV = Enum.INT_ON_PREV;
    static final int INT_ON_STOP_AUDIO = Enum.INT_ON_STOP_AUDIO;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ON_BEGIN
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
        
        static final int INT_ON_BEGIN = 1;
        static final int INT_ON_END = 2;
        static final int INT_BEGIN = 3;
        static final int INT_END = 4;
        static final int INT_ON_CLICK = 5;
        static final int INT_ON_DBL_CLICK = 6;
        static final int INT_ON_MOUSE_OVER = 7;
        static final int INT_ON_MOUSE_OUT = 8;
        static final int INT_ON_NEXT = 9;
        static final int INT_ON_PREV = 10;
        static final int INT_ON_STOP_AUDIO = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("onBegin", INT_ON_BEGIN),
                new Enum("onEnd", INT_ON_END),
                new Enum("begin", INT_BEGIN),
                new Enum("end", INT_END),
                new Enum("onClick", INT_ON_CLICK),
                new Enum("onDblClick", INT_ON_DBL_CLICK),
                new Enum("onMouseOver", INT_ON_MOUSE_OVER),
                new Enum("onMouseOut", INT_ON_MOUSE_OUT),
                new Enum("onNext", INT_ON_NEXT),
                new Enum("onPrev", INT_ON_PREV),
                new Enum("onStopAudio", INT_ON_STOP_AUDIO),
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

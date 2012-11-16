/*
 * XML Type:  ST_TextEffect
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML ST_TextEffect(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextEffect.
 */
public interface STTextEffect extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTextEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttexteffecteebatype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BLINK_BACKGROUND = Enum.forString("blinkBackground");
    static final Enum LIGHTS = Enum.forString("lights");
    static final Enum ANTS_BLACK = Enum.forString("antsBlack");
    static final Enum ANTS_RED = Enum.forString("antsRed");
    static final Enum SHIMMER = Enum.forString("shimmer");
    static final Enum SPARKLE = Enum.forString("sparkle");
    static final Enum NONE = Enum.forString("none");
    
    static final int INT_BLINK_BACKGROUND = Enum.INT_BLINK_BACKGROUND;
    static final int INT_LIGHTS = Enum.INT_LIGHTS;
    static final int INT_ANTS_BLACK = Enum.INT_ANTS_BLACK;
    static final int INT_ANTS_RED = Enum.INT_ANTS_RED;
    static final int INT_SHIMMER = Enum.INT_SHIMMER;
    static final int INT_SPARKLE = Enum.INT_SPARKLE;
    static final int INT_NONE = Enum.INT_NONE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextEffect.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BLINK_BACKGROUND
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
        
        static final int INT_BLINK_BACKGROUND = 1;
        static final int INT_LIGHTS = 2;
        static final int INT_ANTS_BLACK = 3;
        static final int INT_ANTS_RED = 4;
        static final int INT_SHIMMER = 5;
        static final int INT_SPARKLE = 6;
        static final int INT_NONE = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("blinkBackground", INT_BLINK_BACKGROUND),
                new Enum("lights", INT_LIGHTS),
                new Enum("antsBlack", INT_ANTS_BLACK),
                new Enum("antsRed", INT_ANTS_RED),
                new Enum("shimmer", INT_SHIMMER),
                new Enum("sparkle", INT_SPARKLE),
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

/*
 * XML Type:  ST_PrintWhat
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_PrintWhat(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat.
 */
public interface STPrintWhat extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STPrintWhat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stprintwhat9feetype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SLIDES = Enum.forString("slides");
    static final Enum HANDOUTS_1 = Enum.forString("handouts1");
    static final Enum HANDOUTS_2 = Enum.forString("handouts2");
    static final Enum HANDOUTS_3 = Enum.forString("handouts3");
    static final Enum HANDOUTS_4 = Enum.forString("handouts4");
    static final Enum HANDOUTS_6 = Enum.forString("handouts6");
    static final Enum HANDOUTS_9 = Enum.forString("handouts9");
    static final Enum NOTES = Enum.forString("notes");
    static final Enum OUTLINE = Enum.forString("outline");
    
    static final int INT_SLIDES = Enum.INT_SLIDES;
    static final int INT_HANDOUTS_1 = Enum.INT_HANDOUTS_1;
    static final int INT_HANDOUTS_2 = Enum.INT_HANDOUTS_2;
    static final int INT_HANDOUTS_3 = Enum.INT_HANDOUTS_3;
    static final int INT_HANDOUTS_4 = Enum.INT_HANDOUTS_4;
    static final int INT_HANDOUTS_6 = Enum.INT_HANDOUTS_6;
    static final int INT_HANDOUTS_9 = Enum.INT_HANDOUTS_9;
    static final int INT_NOTES = Enum.INT_NOTES;
    static final int INT_OUTLINE = Enum.INT_OUTLINE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SLIDES
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
        
        static final int INT_SLIDES = 1;
        static final int INT_HANDOUTS_1 = 2;
        static final int INT_HANDOUTS_2 = 3;
        static final int INT_HANDOUTS_3 = 4;
        static final int INT_HANDOUTS_4 = 5;
        static final int INT_HANDOUTS_6 = 6;
        static final int INT_HANDOUTS_9 = 7;
        static final int INT_NOTES = 8;
        static final int INT_OUTLINE = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("slides", INT_SLIDES),
                new Enum("handouts1", INT_HANDOUTS_1),
                new Enum("handouts2", INT_HANDOUTS_2),
                new Enum("handouts3", INT_HANDOUTS_3),
                new Enum("handouts4", INT_HANDOUTS_4),
                new Enum("handouts6", INT_HANDOUTS_6),
                new Enum("handouts9", INT_HANDOUTS_9),
                new Enum("notes", INT_NOTES),
                new Enum("outline", INT_OUTLINE),
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

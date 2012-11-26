/*
 * XML Type:  ST_PhotoAlbumLayout
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_PhotoAlbumLayout(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout.
 */
public interface STPhotoAlbumLayout extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STPhotoAlbumLayout.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stphotoalbumlayout894etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum FIT_TO_SLIDE = Enum.forString("fitToSlide");
    static final Enum X_1_PIC = Enum.forString("1pic");
    static final Enum X_2_PIC = Enum.forString("2pic");
    static final Enum X_4_PIC = Enum.forString("4pic");
    static final Enum X_1_PIC_TITLE = Enum.forString("1picTitle");
    static final Enum X_2_PIC_TITLE = Enum.forString("2picTitle");
    static final Enum X_4_PIC_TITLE = Enum.forString("4picTitle");
    
    static final int INT_FIT_TO_SLIDE = Enum.INT_FIT_TO_SLIDE;
    static final int INT_X_1_PIC = Enum.INT_X_1_PIC;
    static final int INT_X_2_PIC = Enum.INT_X_2_PIC;
    static final int INT_X_4_PIC = Enum.INT_X_4_PIC;
    static final int INT_X_1_PIC_TITLE = Enum.INT_X_1_PIC_TITLE;
    static final int INT_X_2_PIC_TITLE = Enum.INT_X_2_PIC_TITLE;
    static final int INT_X_4_PIC_TITLE = Enum.INT_X_4_PIC_TITLE;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_FIT_TO_SLIDE
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
        
        static final int INT_FIT_TO_SLIDE = 1;
        static final int INT_X_1_PIC = 2;
        static final int INT_X_2_PIC = 3;
        static final int INT_X_4_PIC = 4;
        static final int INT_X_1_PIC_TITLE = 5;
        static final int INT_X_2_PIC_TITLE = 6;
        static final int INT_X_4_PIC_TITLE = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("fitToSlide", INT_FIT_TO_SLIDE),
                new Enum("1pic", INT_X_1_PIC),
                new Enum("2pic", INT_X_2_PIC),
                new Enum("4pic", INT_X_4_PIC),
                new Enum("1picTitle", INT_X_1_PIC_TITLE),
                new Enum("2picTitle", INT_X_2_PIC_TITLE),
                new Enum("4picTitle", INT_X_4_PIC_TITLE),
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

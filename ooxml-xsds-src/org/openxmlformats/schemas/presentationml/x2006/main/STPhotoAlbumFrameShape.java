/*
 * XML Type:  ST_PhotoAlbumFrameShape
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_PhotoAlbumFrameShape(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape.
 */
public interface STPhotoAlbumFrameShape extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STPhotoAlbumFrameShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stphotoalbumframeshapeed04type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum FRAME_STYLE_1 = Enum.forString("frameStyle1");
    static final Enum FRAME_STYLE_2 = Enum.forString("frameStyle2");
    static final Enum FRAME_STYLE_3 = Enum.forString("frameStyle3");
    static final Enum FRAME_STYLE_4 = Enum.forString("frameStyle4");
    static final Enum FRAME_STYLE_5 = Enum.forString("frameStyle5");
    static final Enum FRAME_STYLE_6 = Enum.forString("frameStyle6");
    static final Enum FRAME_STYLE_7 = Enum.forString("frameStyle7");
    
    static final int INT_FRAME_STYLE_1 = Enum.INT_FRAME_STYLE_1;
    static final int INT_FRAME_STYLE_2 = Enum.INT_FRAME_STYLE_2;
    static final int INT_FRAME_STYLE_3 = Enum.INT_FRAME_STYLE_3;
    static final int INT_FRAME_STYLE_4 = Enum.INT_FRAME_STYLE_4;
    static final int INT_FRAME_STYLE_5 = Enum.INT_FRAME_STYLE_5;
    static final int INT_FRAME_STYLE_6 = Enum.INT_FRAME_STYLE_6;
    static final int INT_FRAME_STYLE_7 = Enum.INT_FRAME_STYLE_7;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_FRAME_STYLE_1
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
        
        static final int INT_FRAME_STYLE_1 = 1;
        static final int INT_FRAME_STYLE_2 = 2;
        static final int INT_FRAME_STYLE_3 = 3;
        static final int INT_FRAME_STYLE_4 = 4;
        static final int INT_FRAME_STYLE_5 = 5;
        static final int INT_FRAME_STYLE_6 = 6;
        static final int INT_FRAME_STYLE_7 = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("frameStyle1", INT_FRAME_STYLE_1),
                new Enum("frameStyle2", INT_FRAME_STYLE_2),
                new Enum("frameStyle3", INT_FRAME_STYLE_3),
                new Enum("frameStyle4", INT_FRAME_STYLE_4),
                new Enum("frameStyle5", INT_FRAME_STYLE_5),
                new Enum("frameStyle6", INT_FRAME_STYLE_6),
                new Enum("frameStyle7", INT_FRAME_STYLE_7),
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

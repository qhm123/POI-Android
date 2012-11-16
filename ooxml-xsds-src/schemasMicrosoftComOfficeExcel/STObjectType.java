/*
 * XML Type:  ST_ObjectType
 * Namespace: urn:schemas-microsoft-com:office:excel
 * Java type: schemasMicrosoftComOfficeExcel.STObjectType
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeExcel;


/**
 * An XML ST_ObjectType(@urn:schemas-microsoft-com:office:excel).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComOfficeExcel.STObjectType.
 */
public interface STObjectType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STObjectType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stobjecttype97a7type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BUTTON = Enum.forString("Button");
    static final Enum CHECKBOX = Enum.forString("Checkbox");
    static final Enum DIALOG = Enum.forString("Dialog");
    static final Enum DROP = Enum.forString("Drop");
    static final Enum EDIT = Enum.forString("Edit");
    static final Enum G_BOX = Enum.forString("GBox");
    static final Enum LABEL = Enum.forString("Label");
    static final Enum LINE_A = Enum.forString("LineA");
    static final Enum LIST = Enum.forString("List");
    static final Enum MOVIE = Enum.forString("Movie");
    static final Enum NOTE = Enum.forString("Note");
    static final Enum PICT = Enum.forString("Pict");
    static final Enum RADIO = Enum.forString("Radio");
    static final Enum RECT_A = Enum.forString("RectA");
    static final Enum SCROLL = Enum.forString("Scroll");
    static final Enum SPIN = Enum.forString("Spin");
    static final Enum SHAPE = Enum.forString("Shape");
    static final Enum GROUP = Enum.forString("Group");
    static final Enum RECT = Enum.forString("Rect");
    
    static final int INT_BUTTON = Enum.INT_BUTTON;
    static final int INT_CHECKBOX = Enum.INT_CHECKBOX;
    static final int INT_DIALOG = Enum.INT_DIALOG;
    static final int INT_DROP = Enum.INT_DROP;
    static final int INT_EDIT = Enum.INT_EDIT;
    static final int INT_G_BOX = Enum.INT_G_BOX;
    static final int INT_LABEL = Enum.INT_LABEL;
    static final int INT_LINE_A = Enum.INT_LINE_A;
    static final int INT_LIST = Enum.INT_LIST;
    static final int INT_MOVIE = Enum.INT_MOVIE;
    static final int INT_NOTE = Enum.INT_NOTE;
    static final int INT_PICT = Enum.INT_PICT;
    static final int INT_RADIO = Enum.INT_RADIO;
    static final int INT_RECT_A = Enum.INT_RECT_A;
    static final int INT_SCROLL = Enum.INT_SCROLL;
    static final int INT_SPIN = Enum.INT_SPIN;
    static final int INT_SHAPE = Enum.INT_SHAPE;
    static final int INT_GROUP = Enum.INT_GROUP;
    static final int INT_RECT = Enum.INT_RECT;
    
    /**
     * Enumeration value class for schemasMicrosoftComOfficeExcel.STObjectType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BUTTON
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
        
        static final int INT_BUTTON = 1;
        static final int INT_CHECKBOX = 2;
        static final int INT_DIALOG = 3;
        static final int INT_DROP = 4;
        static final int INT_EDIT = 5;
        static final int INT_G_BOX = 6;
        static final int INT_LABEL = 7;
        static final int INT_LINE_A = 8;
        static final int INT_LIST = 9;
        static final int INT_MOVIE = 10;
        static final int INT_NOTE = 11;
        static final int INT_PICT = 12;
        static final int INT_RADIO = 13;
        static final int INT_RECT_A = 14;
        static final int INT_SCROLL = 15;
        static final int INT_SPIN = 16;
        static final int INT_SHAPE = 17;
        static final int INT_GROUP = 18;
        static final int INT_RECT = 19;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Button", INT_BUTTON),
                new Enum("Checkbox", INT_CHECKBOX),
                new Enum("Dialog", INT_DIALOG),
                new Enum("Drop", INT_DROP),
                new Enum("Edit", INT_EDIT),
                new Enum("GBox", INT_G_BOX),
                new Enum("Label", INT_LABEL),
                new Enum("LineA", INT_LINE_A),
                new Enum("List", INT_LIST),
                new Enum("Movie", INT_MOVIE),
                new Enum("Note", INT_NOTE),
                new Enum("Pict", INT_PICT),
                new Enum("Radio", INT_RADIO),
                new Enum("RectA", INT_RECT_A),
                new Enum("Scroll", INT_SCROLL),
                new Enum("Spin", INT_SPIN),
                new Enum("Shape", INT_SHAPE),
                new Enum("Group", INT_GROUP),
                new Enum("Rect", INT_RECT),
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

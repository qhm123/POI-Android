/*
 * XML Type:  ST_TableStyleType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableStyleType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_TableStyleType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableStyleType.
 */
public interface STTableStyleType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTableStyleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttablestyletype9936type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum WHOLE_TABLE = Enum.forString("wholeTable");
    static final Enum HEADER_ROW = Enum.forString("headerRow");
    static final Enum TOTAL_ROW = Enum.forString("totalRow");
    static final Enum FIRST_COLUMN = Enum.forString("firstColumn");
    static final Enum LAST_COLUMN = Enum.forString("lastColumn");
    static final Enum FIRST_ROW_STRIPE = Enum.forString("firstRowStripe");
    static final Enum SECOND_ROW_STRIPE = Enum.forString("secondRowStripe");
    static final Enum FIRST_COLUMN_STRIPE = Enum.forString("firstColumnStripe");
    static final Enum SECOND_COLUMN_STRIPE = Enum.forString("secondColumnStripe");
    static final Enum FIRST_HEADER_CELL = Enum.forString("firstHeaderCell");
    static final Enum LAST_HEADER_CELL = Enum.forString("lastHeaderCell");
    static final Enum FIRST_TOTAL_CELL = Enum.forString("firstTotalCell");
    static final Enum LAST_TOTAL_CELL = Enum.forString("lastTotalCell");
    static final Enum FIRST_SUBTOTAL_COLUMN = Enum.forString("firstSubtotalColumn");
    static final Enum SECOND_SUBTOTAL_COLUMN = Enum.forString("secondSubtotalColumn");
    static final Enum THIRD_SUBTOTAL_COLUMN = Enum.forString("thirdSubtotalColumn");
    static final Enum FIRST_SUBTOTAL_ROW = Enum.forString("firstSubtotalRow");
    static final Enum SECOND_SUBTOTAL_ROW = Enum.forString("secondSubtotalRow");
    static final Enum THIRD_SUBTOTAL_ROW = Enum.forString("thirdSubtotalRow");
    static final Enum BLANK_ROW = Enum.forString("blankRow");
    static final Enum FIRST_COLUMN_SUBHEADING = Enum.forString("firstColumnSubheading");
    static final Enum SECOND_COLUMN_SUBHEADING = Enum.forString("secondColumnSubheading");
    static final Enum THIRD_COLUMN_SUBHEADING = Enum.forString("thirdColumnSubheading");
    static final Enum FIRST_ROW_SUBHEADING = Enum.forString("firstRowSubheading");
    static final Enum SECOND_ROW_SUBHEADING = Enum.forString("secondRowSubheading");
    static final Enum THIRD_ROW_SUBHEADING = Enum.forString("thirdRowSubheading");
    static final Enum PAGE_FIELD_LABELS = Enum.forString("pageFieldLabels");
    static final Enum PAGE_FIELD_VALUES = Enum.forString("pageFieldValues");
    
    static final int INT_WHOLE_TABLE = Enum.INT_WHOLE_TABLE;
    static final int INT_HEADER_ROW = Enum.INT_HEADER_ROW;
    static final int INT_TOTAL_ROW = Enum.INT_TOTAL_ROW;
    static final int INT_FIRST_COLUMN = Enum.INT_FIRST_COLUMN;
    static final int INT_LAST_COLUMN = Enum.INT_LAST_COLUMN;
    static final int INT_FIRST_ROW_STRIPE = Enum.INT_FIRST_ROW_STRIPE;
    static final int INT_SECOND_ROW_STRIPE = Enum.INT_SECOND_ROW_STRIPE;
    static final int INT_FIRST_COLUMN_STRIPE = Enum.INT_FIRST_COLUMN_STRIPE;
    static final int INT_SECOND_COLUMN_STRIPE = Enum.INT_SECOND_COLUMN_STRIPE;
    static final int INT_FIRST_HEADER_CELL = Enum.INT_FIRST_HEADER_CELL;
    static final int INT_LAST_HEADER_CELL = Enum.INT_LAST_HEADER_CELL;
    static final int INT_FIRST_TOTAL_CELL = Enum.INT_FIRST_TOTAL_CELL;
    static final int INT_LAST_TOTAL_CELL = Enum.INT_LAST_TOTAL_CELL;
    static final int INT_FIRST_SUBTOTAL_COLUMN = Enum.INT_FIRST_SUBTOTAL_COLUMN;
    static final int INT_SECOND_SUBTOTAL_COLUMN = Enum.INT_SECOND_SUBTOTAL_COLUMN;
    static final int INT_THIRD_SUBTOTAL_COLUMN = Enum.INT_THIRD_SUBTOTAL_COLUMN;
    static final int INT_FIRST_SUBTOTAL_ROW = Enum.INT_FIRST_SUBTOTAL_ROW;
    static final int INT_SECOND_SUBTOTAL_ROW = Enum.INT_SECOND_SUBTOTAL_ROW;
    static final int INT_THIRD_SUBTOTAL_ROW = Enum.INT_THIRD_SUBTOTAL_ROW;
    static final int INT_BLANK_ROW = Enum.INT_BLANK_ROW;
    static final int INT_FIRST_COLUMN_SUBHEADING = Enum.INT_FIRST_COLUMN_SUBHEADING;
    static final int INT_SECOND_COLUMN_SUBHEADING = Enum.INT_SECOND_COLUMN_SUBHEADING;
    static final int INT_THIRD_COLUMN_SUBHEADING = Enum.INT_THIRD_COLUMN_SUBHEADING;
    static final int INT_FIRST_ROW_SUBHEADING = Enum.INT_FIRST_ROW_SUBHEADING;
    static final int INT_SECOND_ROW_SUBHEADING = Enum.INT_SECOND_ROW_SUBHEADING;
    static final int INT_THIRD_ROW_SUBHEADING = Enum.INT_THIRD_ROW_SUBHEADING;
    static final int INT_PAGE_FIELD_LABELS = Enum.INT_PAGE_FIELD_LABELS;
    static final int INT_PAGE_FIELD_VALUES = Enum.INT_PAGE_FIELD_VALUES;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableStyleType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_WHOLE_TABLE
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
        
        static final int INT_WHOLE_TABLE = 1;
        static final int INT_HEADER_ROW = 2;
        static final int INT_TOTAL_ROW = 3;
        static final int INT_FIRST_COLUMN = 4;
        static final int INT_LAST_COLUMN = 5;
        static final int INT_FIRST_ROW_STRIPE = 6;
        static final int INT_SECOND_ROW_STRIPE = 7;
        static final int INT_FIRST_COLUMN_STRIPE = 8;
        static final int INT_SECOND_COLUMN_STRIPE = 9;
        static final int INT_FIRST_HEADER_CELL = 10;
        static final int INT_LAST_HEADER_CELL = 11;
        static final int INT_FIRST_TOTAL_CELL = 12;
        static final int INT_LAST_TOTAL_CELL = 13;
        static final int INT_FIRST_SUBTOTAL_COLUMN = 14;
        static final int INT_SECOND_SUBTOTAL_COLUMN = 15;
        static final int INT_THIRD_SUBTOTAL_COLUMN = 16;
        static final int INT_FIRST_SUBTOTAL_ROW = 17;
        static final int INT_SECOND_SUBTOTAL_ROW = 18;
        static final int INT_THIRD_SUBTOTAL_ROW = 19;
        static final int INT_BLANK_ROW = 20;
        static final int INT_FIRST_COLUMN_SUBHEADING = 21;
        static final int INT_SECOND_COLUMN_SUBHEADING = 22;
        static final int INT_THIRD_COLUMN_SUBHEADING = 23;
        static final int INT_FIRST_ROW_SUBHEADING = 24;
        static final int INT_SECOND_ROW_SUBHEADING = 25;
        static final int INT_THIRD_ROW_SUBHEADING = 26;
        static final int INT_PAGE_FIELD_LABELS = 27;
        static final int INT_PAGE_FIELD_VALUES = 28;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("wholeTable", INT_WHOLE_TABLE),
                new Enum("headerRow", INT_HEADER_ROW),
                new Enum("totalRow", INT_TOTAL_ROW),
                new Enum("firstColumn", INT_FIRST_COLUMN),
                new Enum("lastColumn", INT_LAST_COLUMN),
                new Enum("firstRowStripe", INT_FIRST_ROW_STRIPE),
                new Enum("secondRowStripe", INT_SECOND_ROW_STRIPE),
                new Enum("firstColumnStripe", INT_FIRST_COLUMN_STRIPE),
                new Enum("secondColumnStripe", INT_SECOND_COLUMN_STRIPE),
                new Enum("firstHeaderCell", INT_FIRST_HEADER_CELL),
                new Enum("lastHeaderCell", INT_LAST_HEADER_CELL),
                new Enum("firstTotalCell", INT_FIRST_TOTAL_CELL),
                new Enum("lastTotalCell", INT_LAST_TOTAL_CELL),
                new Enum("firstSubtotalColumn", INT_FIRST_SUBTOTAL_COLUMN),
                new Enum("secondSubtotalColumn", INT_SECOND_SUBTOTAL_COLUMN),
                new Enum("thirdSubtotalColumn", INT_THIRD_SUBTOTAL_COLUMN),
                new Enum("firstSubtotalRow", INT_FIRST_SUBTOTAL_ROW),
                new Enum("secondSubtotalRow", INT_SECOND_SUBTOTAL_ROW),
                new Enum("thirdSubtotalRow", INT_THIRD_SUBTOTAL_ROW),
                new Enum("blankRow", INT_BLANK_ROW),
                new Enum("firstColumnSubheading", INT_FIRST_COLUMN_SUBHEADING),
                new Enum("secondColumnSubheading", INT_SECOND_COLUMN_SUBHEADING),
                new Enum("thirdColumnSubheading", INT_THIRD_COLUMN_SUBHEADING),
                new Enum("firstRowSubheading", INT_FIRST_ROW_SUBHEADING),
                new Enum("secondRowSubheading", INT_SECOND_ROW_SUBHEADING),
                new Enum("thirdRowSubheading", INT_THIRD_ROW_SUBHEADING),
                new Enum("pageFieldLabels", INT_PAGE_FIELD_LABELS),
                new Enum("pageFieldValues", INT_PAGE_FIELD_VALUES),
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

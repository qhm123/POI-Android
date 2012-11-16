/*
 * XML Type:  ST_PivotFilterType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_PivotFilterType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType.
 */
public interface STPivotFilterType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STPivotFilterType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stpivotfiltertype4503type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum UNKNOWN = Enum.forString("unknown");
    static final Enum COUNT = Enum.forString("count");
    static final Enum PERCENT = Enum.forString("percent");
    static final Enum SUM = Enum.forString("sum");
    static final Enum CAPTION_EQUAL = Enum.forString("captionEqual");
    static final Enum CAPTION_NOT_EQUAL = Enum.forString("captionNotEqual");
    static final Enum CAPTION_BEGINS_WITH = Enum.forString("captionBeginsWith");
    static final Enum CAPTION_NOT_BEGINS_WITH = Enum.forString("captionNotBeginsWith");
    static final Enum CAPTION_ENDS_WITH = Enum.forString("captionEndsWith");
    static final Enum CAPTION_NOT_ENDS_WITH = Enum.forString("captionNotEndsWith");
    static final Enum CAPTION_CONTAINS = Enum.forString("captionContains");
    static final Enum CAPTION_NOT_CONTAINS = Enum.forString("captionNotContains");
    static final Enum CAPTION_GREATER_THAN = Enum.forString("captionGreaterThan");
    static final Enum CAPTION_GREATER_THAN_OR_EQUAL = Enum.forString("captionGreaterThanOrEqual");
    static final Enum CAPTION_LESS_THAN = Enum.forString("captionLessThan");
    static final Enum CAPTION_LESS_THAN_OR_EQUAL = Enum.forString("captionLessThanOrEqual");
    static final Enum CAPTION_BETWEEN = Enum.forString("captionBetween");
    static final Enum CAPTION_NOT_BETWEEN = Enum.forString("captionNotBetween");
    static final Enum VALUE_EQUAL = Enum.forString("valueEqual");
    static final Enum VALUE_NOT_EQUAL = Enum.forString("valueNotEqual");
    static final Enum VALUE_GREATER_THAN = Enum.forString("valueGreaterThan");
    static final Enum VALUE_GREATER_THAN_OR_EQUAL = Enum.forString("valueGreaterThanOrEqual");
    static final Enum VALUE_LESS_THAN = Enum.forString("valueLessThan");
    static final Enum VALUE_LESS_THAN_OR_EQUAL = Enum.forString("valueLessThanOrEqual");
    static final Enum VALUE_BETWEEN = Enum.forString("valueBetween");
    static final Enum VALUE_NOT_BETWEEN = Enum.forString("valueNotBetween");
    static final Enum DATE_EQUAL = Enum.forString("dateEqual");
    static final Enum DATE_NOT_EQUAL = Enum.forString("dateNotEqual");
    static final Enum DATE_OLDER_THAN = Enum.forString("dateOlderThan");
    static final Enum DATE_OLDER_THAN_OR_EQUAL = Enum.forString("dateOlderThanOrEqual");
    static final Enum DATE_NEWER_THAN = Enum.forString("dateNewerThan");
    static final Enum DATE_NEWER_THAN_OR_EQUAL = Enum.forString("dateNewerThanOrEqual");
    static final Enum DATE_BETWEEN = Enum.forString("dateBetween");
    static final Enum DATE_NOT_BETWEEN = Enum.forString("dateNotBetween");
    static final Enum TOMORROW = Enum.forString("tomorrow");
    static final Enum TODAY = Enum.forString("today");
    static final Enum YESTERDAY = Enum.forString("yesterday");
    static final Enum NEXT_WEEK = Enum.forString("nextWeek");
    static final Enum THIS_WEEK = Enum.forString("thisWeek");
    static final Enum LAST_WEEK = Enum.forString("lastWeek");
    static final Enum NEXT_MONTH = Enum.forString("nextMonth");
    static final Enum THIS_MONTH = Enum.forString("thisMonth");
    static final Enum LAST_MONTH = Enum.forString("lastMonth");
    static final Enum NEXT_QUARTER = Enum.forString("nextQuarter");
    static final Enum THIS_QUARTER = Enum.forString("thisQuarter");
    static final Enum LAST_QUARTER = Enum.forString("lastQuarter");
    static final Enum NEXT_YEAR = Enum.forString("nextYear");
    static final Enum THIS_YEAR = Enum.forString("thisYear");
    static final Enum LAST_YEAR = Enum.forString("lastYear");
    static final Enum YEAR_TO_DATE = Enum.forString("yearToDate");
    static final Enum Q_1 = Enum.forString("Q1");
    static final Enum Q_2 = Enum.forString("Q2");
    static final Enum Q_3 = Enum.forString("Q3");
    static final Enum Q_4 = Enum.forString("Q4");
    static final Enum M_1 = Enum.forString("M1");
    static final Enum M_2 = Enum.forString("M2");
    static final Enum M_3 = Enum.forString("M3");
    static final Enum M_4 = Enum.forString("M4");
    static final Enum M_5 = Enum.forString("M5");
    static final Enum M_6 = Enum.forString("M6");
    static final Enum M_7 = Enum.forString("M7");
    static final Enum M_8 = Enum.forString("M8");
    static final Enum M_9 = Enum.forString("M9");
    static final Enum M_10 = Enum.forString("M10");
    static final Enum M_11 = Enum.forString("M11");
    static final Enum M_12 = Enum.forString("M12");
    
    static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
    static final int INT_COUNT = Enum.INT_COUNT;
    static final int INT_PERCENT = Enum.INT_PERCENT;
    static final int INT_SUM = Enum.INT_SUM;
    static final int INT_CAPTION_EQUAL = Enum.INT_CAPTION_EQUAL;
    static final int INT_CAPTION_NOT_EQUAL = Enum.INT_CAPTION_NOT_EQUAL;
    static final int INT_CAPTION_BEGINS_WITH = Enum.INT_CAPTION_BEGINS_WITH;
    static final int INT_CAPTION_NOT_BEGINS_WITH = Enum.INT_CAPTION_NOT_BEGINS_WITH;
    static final int INT_CAPTION_ENDS_WITH = Enum.INT_CAPTION_ENDS_WITH;
    static final int INT_CAPTION_NOT_ENDS_WITH = Enum.INT_CAPTION_NOT_ENDS_WITH;
    static final int INT_CAPTION_CONTAINS = Enum.INT_CAPTION_CONTAINS;
    static final int INT_CAPTION_NOT_CONTAINS = Enum.INT_CAPTION_NOT_CONTAINS;
    static final int INT_CAPTION_GREATER_THAN = Enum.INT_CAPTION_GREATER_THAN;
    static final int INT_CAPTION_GREATER_THAN_OR_EQUAL = Enum.INT_CAPTION_GREATER_THAN_OR_EQUAL;
    static final int INT_CAPTION_LESS_THAN = Enum.INT_CAPTION_LESS_THAN;
    static final int INT_CAPTION_LESS_THAN_OR_EQUAL = Enum.INT_CAPTION_LESS_THAN_OR_EQUAL;
    static final int INT_CAPTION_BETWEEN = Enum.INT_CAPTION_BETWEEN;
    static final int INT_CAPTION_NOT_BETWEEN = Enum.INT_CAPTION_NOT_BETWEEN;
    static final int INT_VALUE_EQUAL = Enum.INT_VALUE_EQUAL;
    static final int INT_VALUE_NOT_EQUAL = Enum.INT_VALUE_NOT_EQUAL;
    static final int INT_VALUE_GREATER_THAN = Enum.INT_VALUE_GREATER_THAN;
    static final int INT_VALUE_GREATER_THAN_OR_EQUAL = Enum.INT_VALUE_GREATER_THAN_OR_EQUAL;
    static final int INT_VALUE_LESS_THAN = Enum.INT_VALUE_LESS_THAN;
    static final int INT_VALUE_LESS_THAN_OR_EQUAL = Enum.INT_VALUE_LESS_THAN_OR_EQUAL;
    static final int INT_VALUE_BETWEEN = Enum.INT_VALUE_BETWEEN;
    static final int INT_VALUE_NOT_BETWEEN = Enum.INT_VALUE_NOT_BETWEEN;
    static final int INT_DATE_EQUAL = Enum.INT_DATE_EQUAL;
    static final int INT_DATE_NOT_EQUAL = Enum.INT_DATE_NOT_EQUAL;
    static final int INT_DATE_OLDER_THAN = Enum.INT_DATE_OLDER_THAN;
    static final int INT_DATE_OLDER_THAN_OR_EQUAL = Enum.INT_DATE_OLDER_THAN_OR_EQUAL;
    static final int INT_DATE_NEWER_THAN = Enum.INT_DATE_NEWER_THAN;
    static final int INT_DATE_NEWER_THAN_OR_EQUAL = Enum.INT_DATE_NEWER_THAN_OR_EQUAL;
    static final int INT_DATE_BETWEEN = Enum.INT_DATE_BETWEEN;
    static final int INT_DATE_NOT_BETWEEN = Enum.INT_DATE_NOT_BETWEEN;
    static final int INT_TOMORROW = Enum.INT_TOMORROW;
    static final int INT_TODAY = Enum.INT_TODAY;
    static final int INT_YESTERDAY = Enum.INT_YESTERDAY;
    static final int INT_NEXT_WEEK = Enum.INT_NEXT_WEEK;
    static final int INT_THIS_WEEK = Enum.INT_THIS_WEEK;
    static final int INT_LAST_WEEK = Enum.INT_LAST_WEEK;
    static final int INT_NEXT_MONTH = Enum.INT_NEXT_MONTH;
    static final int INT_THIS_MONTH = Enum.INT_THIS_MONTH;
    static final int INT_LAST_MONTH = Enum.INT_LAST_MONTH;
    static final int INT_NEXT_QUARTER = Enum.INT_NEXT_QUARTER;
    static final int INT_THIS_QUARTER = Enum.INT_THIS_QUARTER;
    static final int INT_LAST_QUARTER = Enum.INT_LAST_QUARTER;
    static final int INT_NEXT_YEAR = Enum.INT_NEXT_YEAR;
    static final int INT_THIS_YEAR = Enum.INT_THIS_YEAR;
    static final int INT_LAST_YEAR = Enum.INT_LAST_YEAR;
    static final int INT_YEAR_TO_DATE = Enum.INT_YEAR_TO_DATE;
    static final int INT_Q_1 = Enum.INT_Q_1;
    static final int INT_Q_2 = Enum.INT_Q_2;
    static final int INT_Q_3 = Enum.INT_Q_3;
    static final int INT_Q_4 = Enum.INT_Q_4;
    static final int INT_M_1 = Enum.INT_M_1;
    static final int INT_M_2 = Enum.INT_M_2;
    static final int INT_M_3 = Enum.INT_M_3;
    static final int INT_M_4 = Enum.INT_M_4;
    static final int INT_M_5 = Enum.INT_M_5;
    static final int INT_M_6 = Enum.INT_M_6;
    static final int INT_M_7 = Enum.INT_M_7;
    static final int INT_M_8 = Enum.INT_M_8;
    static final int INT_M_9 = Enum.INT_M_9;
    static final int INT_M_10 = Enum.INT_M_10;
    static final int INT_M_11 = Enum.INT_M_11;
    static final int INT_M_12 = Enum.INT_M_12;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_UNKNOWN
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
        
        static final int INT_UNKNOWN = 1;
        static final int INT_COUNT = 2;
        static final int INT_PERCENT = 3;
        static final int INT_SUM = 4;
        static final int INT_CAPTION_EQUAL = 5;
        static final int INT_CAPTION_NOT_EQUAL = 6;
        static final int INT_CAPTION_BEGINS_WITH = 7;
        static final int INT_CAPTION_NOT_BEGINS_WITH = 8;
        static final int INT_CAPTION_ENDS_WITH = 9;
        static final int INT_CAPTION_NOT_ENDS_WITH = 10;
        static final int INT_CAPTION_CONTAINS = 11;
        static final int INT_CAPTION_NOT_CONTAINS = 12;
        static final int INT_CAPTION_GREATER_THAN = 13;
        static final int INT_CAPTION_GREATER_THAN_OR_EQUAL = 14;
        static final int INT_CAPTION_LESS_THAN = 15;
        static final int INT_CAPTION_LESS_THAN_OR_EQUAL = 16;
        static final int INT_CAPTION_BETWEEN = 17;
        static final int INT_CAPTION_NOT_BETWEEN = 18;
        static final int INT_VALUE_EQUAL = 19;
        static final int INT_VALUE_NOT_EQUAL = 20;
        static final int INT_VALUE_GREATER_THAN = 21;
        static final int INT_VALUE_GREATER_THAN_OR_EQUAL = 22;
        static final int INT_VALUE_LESS_THAN = 23;
        static final int INT_VALUE_LESS_THAN_OR_EQUAL = 24;
        static final int INT_VALUE_BETWEEN = 25;
        static final int INT_VALUE_NOT_BETWEEN = 26;
        static final int INT_DATE_EQUAL = 27;
        static final int INT_DATE_NOT_EQUAL = 28;
        static final int INT_DATE_OLDER_THAN = 29;
        static final int INT_DATE_OLDER_THAN_OR_EQUAL = 30;
        static final int INT_DATE_NEWER_THAN = 31;
        static final int INT_DATE_NEWER_THAN_OR_EQUAL = 32;
        static final int INT_DATE_BETWEEN = 33;
        static final int INT_DATE_NOT_BETWEEN = 34;
        static final int INT_TOMORROW = 35;
        static final int INT_TODAY = 36;
        static final int INT_YESTERDAY = 37;
        static final int INT_NEXT_WEEK = 38;
        static final int INT_THIS_WEEK = 39;
        static final int INT_LAST_WEEK = 40;
        static final int INT_NEXT_MONTH = 41;
        static final int INT_THIS_MONTH = 42;
        static final int INT_LAST_MONTH = 43;
        static final int INT_NEXT_QUARTER = 44;
        static final int INT_THIS_QUARTER = 45;
        static final int INT_LAST_QUARTER = 46;
        static final int INT_NEXT_YEAR = 47;
        static final int INT_THIS_YEAR = 48;
        static final int INT_LAST_YEAR = 49;
        static final int INT_YEAR_TO_DATE = 50;
        static final int INT_Q_1 = 51;
        static final int INT_Q_2 = 52;
        static final int INT_Q_3 = 53;
        static final int INT_Q_4 = 54;
        static final int INT_M_1 = 55;
        static final int INT_M_2 = 56;
        static final int INT_M_3 = 57;
        static final int INT_M_4 = 58;
        static final int INT_M_5 = 59;
        static final int INT_M_6 = 60;
        static final int INT_M_7 = 61;
        static final int INT_M_8 = 62;
        static final int INT_M_9 = 63;
        static final int INT_M_10 = 64;
        static final int INT_M_11 = 65;
        static final int INT_M_12 = 66;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("unknown", INT_UNKNOWN),
                new Enum("count", INT_COUNT),
                new Enum("percent", INT_PERCENT),
                new Enum("sum", INT_SUM),
                new Enum("captionEqual", INT_CAPTION_EQUAL),
                new Enum("captionNotEqual", INT_CAPTION_NOT_EQUAL),
                new Enum("captionBeginsWith", INT_CAPTION_BEGINS_WITH),
                new Enum("captionNotBeginsWith", INT_CAPTION_NOT_BEGINS_WITH),
                new Enum("captionEndsWith", INT_CAPTION_ENDS_WITH),
                new Enum("captionNotEndsWith", INT_CAPTION_NOT_ENDS_WITH),
                new Enum("captionContains", INT_CAPTION_CONTAINS),
                new Enum("captionNotContains", INT_CAPTION_NOT_CONTAINS),
                new Enum("captionGreaterThan", INT_CAPTION_GREATER_THAN),
                new Enum("captionGreaterThanOrEqual", INT_CAPTION_GREATER_THAN_OR_EQUAL),
                new Enum("captionLessThan", INT_CAPTION_LESS_THAN),
                new Enum("captionLessThanOrEqual", INT_CAPTION_LESS_THAN_OR_EQUAL),
                new Enum("captionBetween", INT_CAPTION_BETWEEN),
                new Enum("captionNotBetween", INT_CAPTION_NOT_BETWEEN),
                new Enum("valueEqual", INT_VALUE_EQUAL),
                new Enum("valueNotEqual", INT_VALUE_NOT_EQUAL),
                new Enum("valueGreaterThan", INT_VALUE_GREATER_THAN),
                new Enum("valueGreaterThanOrEqual", INT_VALUE_GREATER_THAN_OR_EQUAL),
                new Enum("valueLessThan", INT_VALUE_LESS_THAN),
                new Enum("valueLessThanOrEqual", INT_VALUE_LESS_THAN_OR_EQUAL),
                new Enum("valueBetween", INT_VALUE_BETWEEN),
                new Enum("valueNotBetween", INT_VALUE_NOT_BETWEEN),
                new Enum("dateEqual", INT_DATE_EQUAL),
                new Enum("dateNotEqual", INT_DATE_NOT_EQUAL),
                new Enum("dateOlderThan", INT_DATE_OLDER_THAN),
                new Enum("dateOlderThanOrEqual", INT_DATE_OLDER_THAN_OR_EQUAL),
                new Enum("dateNewerThan", INT_DATE_NEWER_THAN),
                new Enum("dateNewerThanOrEqual", INT_DATE_NEWER_THAN_OR_EQUAL),
                new Enum("dateBetween", INT_DATE_BETWEEN),
                new Enum("dateNotBetween", INT_DATE_NOT_BETWEEN),
                new Enum("tomorrow", INT_TOMORROW),
                new Enum("today", INT_TODAY),
                new Enum("yesterday", INT_YESTERDAY),
                new Enum("nextWeek", INT_NEXT_WEEK),
                new Enum("thisWeek", INT_THIS_WEEK),
                new Enum("lastWeek", INT_LAST_WEEK),
                new Enum("nextMonth", INT_NEXT_MONTH),
                new Enum("thisMonth", INT_THIS_MONTH),
                new Enum("lastMonth", INT_LAST_MONTH),
                new Enum("nextQuarter", INT_NEXT_QUARTER),
                new Enum("thisQuarter", INT_THIS_QUARTER),
                new Enum("lastQuarter", INT_LAST_QUARTER),
                new Enum("nextYear", INT_NEXT_YEAR),
                new Enum("thisYear", INT_THIS_YEAR),
                new Enum("lastYear", INT_LAST_YEAR),
                new Enum("yearToDate", INT_YEAR_TO_DATE),
                new Enum("Q1", INT_Q_1),
                new Enum("Q2", INT_Q_2),
                new Enum("Q3", INT_Q_3),
                new Enum("Q4", INT_Q_4),
                new Enum("M1", INT_M_1),
                new Enum("M2", INT_M_2),
                new Enum("M3", INT_M_3),
                new Enum("M4", INT_M_4),
                new Enum("M5", INT_M_5),
                new Enum("M6", INT_M_6),
                new Enum("M7", INT_M_7),
                new Enum("M8", INT_M_8),
                new Enum("M9", INT_M_9),
                new Enum("M10", INT_M_10),
                new Enum("M11", INT_M_11),
                new Enum("M12", INT_M_12),
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

/*
 * XML Type:  ST_ShowDataAs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML ST_ShowDataAs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs.
 */
public interface STShowDataAs extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STShowDataAs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stshowdataas0732type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NORMAL = Enum.forString("normal");
    static final Enum DIFFERENCE = Enum.forString("difference");
    static final Enum PERCENT = Enum.forString("percent");
    static final Enum PERCENT_DIFF = Enum.forString("percentDiff");
    static final Enum RUN_TOTAL = Enum.forString("runTotal");
    static final Enum PERCENT_OF_ROW = Enum.forString("percentOfRow");
    static final Enum PERCENT_OF_COL = Enum.forString("percentOfCol");
    static final Enum PERCENT_OF_TOTAL = Enum.forString("percentOfTotal");
    static final Enum INDEX = Enum.forString("index");
    
    static final int INT_NORMAL = Enum.INT_NORMAL;
    static final int INT_DIFFERENCE = Enum.INT_DIFFERENCE;
    static final int INT_PERCENT = Enum.INT_PERCENT;
    static final int INT_PERCENT_DIFF = Enum.INT_PERCENT_DIFF;
    static final int INT_RUN_TOTAL = Enum.INT_RUN_TOTAL;
    static final int INT_PERCENT_OF_ROW = Enum.INT_PERCENT_OF_ROW;
    static final int INT_PERCENT_OF_COL = Enum.INT_PERCENT_OF_COL;
    static final int INT_PERCENT_OF_TOTAL = Enum.INT_PERCENT_OF_TOTAL;
    static final int INT_INDEX = Enum.INT_INDEX;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NORMAL
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
        
        static final int INT_NORMAL = 1;
        static final int INT_DIFFERENCE = 2;
        static final int INT_PERCENT = 3;
        static final int INT_PERCENT_DIFF = 4;
        static final int INT_RUN_TOTAL = 5;
        static final int INT_PERCENT_OF_ROW = 6;
        static final int INT_PERCENT_OF_COL = 7;
        static final int INT_PERCENT_OF_TOTAL = 8;
        static final int INT_INDEX = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("normal", INT_NORMAL),
                new Enum("difference", INT_DIFFERENCE),
                new Enum("percent", INT_PERCENT),
                new Enum("percentDiff", INT_PERCENT_DIFF),
                new Enum("runTotal", INT_RUN_TOTAL),
                new Enum("percentOfRow", INT_PERCENT_OF_ROW),
                new Enum("percentOfCol", INT_PERCENT_OF_COL),
                new Enum("percentOfTotal", INT_PERCENT_OF_TOTAL),
                new Enum("index", INT_INDEX),
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

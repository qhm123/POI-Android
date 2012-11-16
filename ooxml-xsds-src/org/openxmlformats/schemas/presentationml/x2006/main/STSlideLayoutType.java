/*
 * XML Type:  ST_SlideLayoutType
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_SlideLayoutType(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType.
 */
public interface STSlideLayoutType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STSlideLayoutType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stslidelayouttype3aaatype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum TITLE = Enum.forString("title");
    static final Enum TX = Enum.forString("tx");
    static final Enum TWO_COL_TX = Enum.forString("twoColTx");
    static final Enum TBL = Enum.forString("tbl");
    static final Enum TX_AND_CHART = Enum.forString("txAndChart");
    static final Enum CHART_AND_TX = Enum.forString("chartAndTx");
    static final Enum DGM = Enum.forString("dgm");
    static final Enum CHART = Enum.forString("chart");
    static final Enum TX_AND_CLIP_ART = Enum.forString("txAndClipArt");
    static final Enum CLIP_ART_AND_TX = Enum.forString("clipArtAndTx");
    static final Enum TITLE_ONLY = Enum.forString("titleOnly");
    static final Enum BLANK = Enum.forString("blank");
    static final Enum TX_AND_OBJ = Enum.forString("txAndObj");
    static final Enum OBJ_AND_TX = Enum.forString("objAndTx");
    static final Enum OBJ_ONLY = Enum.forString("objOnly");
    static final Enum OBJ = Enum.forString("obj");
    static final Enum TX_AND_MEDIA = Enum.forString("txAndMedia");
    static final Enum MEDIA_AND_TX = Enum.forString("mediaAndTx");
    static final Enum OBJ_OVER_TX = Enum.forString("objOverTx");
    static final Enum TX_OVER_OBJ = Enum.forString("txOverObj");
    static final Enum TX_AND_TWO_OBJ = Enum.forString("txAndTwoObj");
    static final Enum TWO_OBJ_AND_TX = Enum.forString("twoObjAndTx");
    static final Enum TWO_OBJ_OVER_TX = Enum.forString("twoObjOverTx");
    static final Enum FOUR_OBJ = Enum.forString("fourObj");
    static final Enum VERT_TX = Enum.forString("vertTx");
    static final Enum CLIP_ART_AND_VERT_TX = Enum.forString("clipArtAndVertTx");
    static final Enum VERT_TITLE_AND_TX = Enum.forString("vertTitleAndTx");
    static final Enum VERT_TITLE_AND_TX_OVER_CHART = Enum.forString("vertTitleAndTxOverChart");
    static final Enum TWO_OBJ = Enum.forString("twoObj");
    static final Enum OBJ_AND_TWO_OBJ = Enum.forString("objAndTwoObj");
    static final Enum TWO_OBJ_AND_OBJ = Enum.forString("twoObjAndObj");
    static final Enum CUST = Enum.forString("cust");
    static final Enum SEC_HEAD = Enum.forString("secHead");
    static final Enum TWO_TX_TWO_OBJ = Enum.forString("twoTxTwoObj");
    static final Enum OBJ_TX = Enum.forString("objTx");
    static final Enum PIC_TX = Enum.forString("picTx");
    
    static final int INT_TITLE = Enum.INT_TITLE;
    static final int INT_TX = Enum.INT_TX;
    static final int INT_TWO_COL_TX = Enum.INT_TWO_COL_TX;
    static final int INT_TBL = Enum.INT_TBL;
    static final int INT_TX_AND_CHART = Enum.INT_TX_AND_CHART;
    static final int INT_CHART_AND_TX = Enum.INT_CHART_AND_TX;
    static final int INT_DGM = Enum.INT_DGM;
    static final int INT_CHART = Enum.INT_CHART;
    static final int INT_TX_AND_CLIP_ART = Enum.INT_TX_AND_CLIP_ART;
    static final int INT_CLIP_ART_AND_TX = Enum.INT_CLIP_ART_AND_TX;
    static final int INT_TITLE_ONLY = Enum.INT_TITLE_ONLY;
    static final int INT_BLANK = Enum.INT_BLANK;
    static final int INT_TX_AND_OBJ = Enum.INT_TX_AND_OBJ;
    static final int INT_OBJ_AND_TX = Enum.INT_OBJ_AND_TX;
    static final int INT_OBJ_ONLY = Enum.INT_OBJ_ONLY;
    static final int INT_OBJ = Enum.INT_OBJ;
    static final int INT_TX_AND_MEDIA = Enum.INT_TX_AND_MEDIA;
    static final int INT_MEDIA_AND_TX = Enum.INT_MEDIA_AND_TX;
    static final int INT_OBJ_OVER_TX = Enum.INT_OBJ_OVER_TX;
    static final int INT_TX_OVER_OBJ = Enum.INT_TX_OVER_OBJ;
    static final int INT_TX_AND_TWO_OBJ = Enum.INT_TX_AND_TWO_OBJ;
    static final int INT_TWO_OBJ_AND_TX = Enum.INT_TWO_OBJ_AND_TX;
    static final int INT_TWO_OBJ_OVER_TX = Enum.INT_TWO_OBJ_OVER_TX;
    static final int INT_FOUR_OBJ = Enum.INT_FOUR_OBJ;
    static final int INT_VERT_TX = Enum.INT_VERT_TX;
    static final int INT_CLIP_ART_AND_VERT_TX = Enum.INT_CLIP_ART_AND_VERT_TX;
    static final int INT_VERT_TITLE_AND_TX = Enum.INT_VERT_TITLE_AND_TX;
    static final int INT_VERT_TITLE_AND_TX_OVER_CHART = Enum.INT_VERT_TITLE_AND_TX_OVER_CHART;
    static final int INT_TWO_OBJ = Enum.INT_TWO_OBJ;
    static final int INT_OBJ_AND_TWO_OBJ = Enum.INT_OBJ_AND_TWO_OBJ;
    static final int INT_TWO_OBJ_AND_OBJ = Enum.INT_TWO_OBJ_AND_OBJ;
    static final int INT_CUST = Enum.INT_CUST;
    static final int INT_SEC_HEAD = Enum.INT_SEC_HEAD;
    static final int INT_TWO_TX_TWO_OBJ = Enum.INT_TWO_TX_TWO_OBJ;
    static final int INT_OBJ_TX = Enum.INT_OBJ_TX;
    static final int INT_PIC_TX = Enum.INT_PIC_TX;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TITLE
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
        
        static final int INT_TITLE = 1;
        static final int INT_TX = 2;
        static final int INT_TWO_COL_TX = 3;
        static final int INT_TBL = 4;
        static final int INT_TX_AND_CHART = 5;
        static final int INT_CHART_AND_TX = 6;
        static final int INT_DGM = 7;
        static final int INT_CHART = 8;
        static final int INT_TX_AND_CLIP_ART = 9;
        static final int INT_CLIP_ART_AND_TX = 10;
        static final int INT_TITLE_ONLY = 11;
        static final int INT_BLANK = 12;
        static final int INT_TX_AND_OBJ = 13;
        static final int INT_OBJ_AND_TX = 14;
        static final int INT_OBJ_ONLY = 15;
        static final int INT_OBJ = 16;
        static final int INT_TX_AND_MEDIA = 17;
        static final int INT_MEDIA_AND_TX = 18;
        static final int INT_OBJ_OVER_TX = 19;
        static final int INT_TX_OVER_OBJ = 20;
        static final int INT_TX_AND_TWO_OBJ = 21;
        static final int INT_TWO_OBJ_AND_TX = 22;
        static final int INT_TWO_OBJ_OVER_TX = 23;
        static final int INT_FOUR_OBJ = 24;
        static final int INT_VERT_TX = 25;
        static final int INT_CLIP_ART_AND_VERT_TX = 26;
        static final int INT_VERT_TITLE_AND_TX = 27;
        static final int INT_VERT_TITLE_AND_TX_OVER_CHART = 28;
        static final int INT_TWO_OBJ = 29;
        static final int INT_OBJ_AND_TWO_OBJ = 30;
        static final int INT_TWO_OBJ_AND_OBJ = 31;
        static final int INT_CUST = 32;
        static final int INT_SEC_HEAD = 33;
        static final int INT_TWO_TX_TWO_OBJ = 34;
        static final int INT_OBJ_TX = 35;
        static final int INT_PIC_TX = 36;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("title", INT_TITLE),
                new Enum("tx", INT_TX),
                new Enum("twoColTx", INT_TWO_COL_TX),
                new Enum("tbl", INT_TBL),
                new Enum("txAndChart", INT_TX_AND_CHART),
                new Enum("chartAndTx", INT_CHART_AND_TX),
                new Enum("dgm", INT_DGM),
                new Enum("chart", INT_CHART),
                new Enum("txAndClipArt", INT_TX_AND_CLIP_ART),
                new Enum("clipArtAndTx", INT_CLIP_ART_AND_TX),
                new Enum("titleOnly", INT_TITLE_ONLY),
                new Enum("blank", INT_BLANK),
                new Enum("txAndObj", INT_TX_AND_OBJ),
                new Enum("objAndTx", INT_OBJ_AND_TX),
                new Enum("objOnly", INT_OBJ_ONLY),
                new Enum("obj", INT_OBJ),
                new Enum("txAndMedia", INT_TX_AND_MEDIA),
                new Enum("mediaAndTx", INT_MEDIA_AND_TX),
                new Enum("objOverTx", INT_OBJ_OVER_TX),
                new Enum("txOverObj", INT_TX_OVER_OBJ),
                new Enum("txAndTwoObj", INT_TX_AND_TWO_OBJ),
                new Enum("twoObjAndTx", INT_TWO_OBJ_AND_TX),
                new Enum("twoObjOverTx", INT_TWO_OBJ_OVER_TX),
                new Enum("fourObj", INT_FOUR_OBJ),
                new Enum("vertTx", INT_VERT_TX),
                new Enum("clipArtAndVertTx", INT_CLIP_ART_AND_VERT_TX),
                new Enum("vertTitleAndTx", INT_VERT_TITLE_AND_TX),
                new Enum("vertTitleAndTxOverChart", INT_VERT_TITLE_AND_TX_OVER_CHART),
                new Enum("twoObj", INT_TWO_OBJ),
                new Enum("objAndTwoObj", INT_OBJ_AND_TWO_OBJ),
                new Enum("twoObjAndObj", INT_TWO_OBJ_AND_OBJ),
                new Enum("cust", INT_CUST),
                new Enum("secHead", INT_SEC_HEAD),
                new Enum("twoTxTwoObj", INT_TWO_TX_TWO_OBJ),
                new Enum("objTx", INT_OBJ_TX),
                new Enum("picTx", INT_PIC_TX),
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

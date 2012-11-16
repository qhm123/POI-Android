/*
 * XML Type:  CT_ChartFormat
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ChartFormat(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTChartFormat extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTChartFormat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctchartformat0e14type");
    
    /**
     * Gets the "pivotArea" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea getPivotArea();
    
    /**
     * Sets the "pivotArea" element
     */
    void setPivotArea(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea pivotArea);
    
    /**
     * Appends and returns a new empty "pivotArea" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea addNewPivotArea();
    
    /**
     * Gets the "chart" attribute
     */
    long getChart();
    
    /**
     * Gets (as xml) the "chart" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetChart();
    
    /**
     * Sets the "chart" attribute
     */
    void setChart(long chart);
    
    /**
     * Sets (as xml) the "chart" attribute
     */
    void xsetChart(org.apache.xmlbeans.XmlUnsignedInt chart);
    
    /**
     * Gets the "format" attribute
     */
    long getFormat();
    
    /**
     * Gets (as xml) the "format" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFormat();
    
    /**
     * Sets the "format" attribute
     */
    void setFormat(long format);
    
    /**
     * Sets (as xml) the "format" attribute
     */
    void xsetFormat(org.apache.xmlbeans.XmlUnsignedInt format);
    
    /**
     * Gets the "series" attribute
     */
    boolean getSeries();
    
    /**
     * Gets (as xml) the "series" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSeries();
    
    /**
     * True if has "series" attribute
     */
    boolean isSetSeries();
    
    /**
     * Sets the "series" attribute
     */
    void setSeries(boolean series);
    
    /**
     * Sets (as xml) the "series" attribute
     */
    void xsetSeries(org.apache.xmlbeans.XmlBoolean series);
    
    /**
     * Unsets the "series" attribute
     */
    void unsetSeries();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

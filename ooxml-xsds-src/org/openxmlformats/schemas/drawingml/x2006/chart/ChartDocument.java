/*
 * An XML document type.
 * Localname: chart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.ChartDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * A document containing one chart(@http://schemas.openxmlformats.org/drawingml/2006/chart) element.
 *
 * This is a complex type.
 */
public interface ChartDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChartDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("chartf85cdoctype");
    
    /**
     * Gets the "chart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId getChart();
    
    /**
     * Sets the "chart" element
     */
    void setChart(org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId chart);
    
    /**
     * Appends and returns a new empty "chart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId addNewChart();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

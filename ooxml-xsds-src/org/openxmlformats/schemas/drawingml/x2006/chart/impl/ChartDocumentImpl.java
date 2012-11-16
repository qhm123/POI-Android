/*
 * An XML document type.
 * Localname: chart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.ChartDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * A document containing one chart(@http://schemas.openxmlformats.org/drawingml/2006/chart) element.
 *
 * This is a complex type.
 */
public class ChartDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.ChartDocument
{
    
    public ChartDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHART$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "chart");
    
    
    /**
     * Gets the "chart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId getChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().find_element_user(CHART$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "chart" element
     */
    public void setChart(org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId chart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().find_element_user(CHART$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().add_element_user(CHART$0);
            }
            target.set(chart);
        }
    }
    
    /**
     * Appends and returns a new empty "chart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId addNewChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().add_element_user(CHART$0);
            return target;
        }
    }
}

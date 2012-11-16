/*
 * An XML document type.
 * Localname: chartSpace
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.ChartSpaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * A document containing one chartSpace(@http://schemas.openxmlformats.org/drawingml/2006/chart) element.
 *
 * This is a complex type.
 */
public class ChartSpaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.ChartSpaceDocument
{
    
    public ChartSpaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARTSPACE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "chartSpace");
    
    
    /**
     * Gets the "chartSpace" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace getChartSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace)get_store().find_element_user(CHARTSPACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "chartSpace" element
     */
    public void setChartSpace(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace chartSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace)get_store().find_element_user(CHARTSPACE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace)get_store().add_element_user(CHARTSPACE$0);
            }
            target.set(chartSpace);
        }
    }
    
    /**
     * Appends and returns a new empty "chartSpace" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace addNewChartSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace)get_store().add_element_user(CHARTSPACE$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: chartsheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ChartsheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one chartsheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class ChartsheetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.ChartsheetDocument
{
    
    public ChartsheetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARTSHEET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "chartsheet");
    
    
    /**
     * Gets the "chartsheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet getChartsheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet)get_store().find_element_user(CHARTSHEET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "chartsheet" element
     */
    public void setChartsheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet chartsheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet)get_store().find_element_user(CHARTSHEET$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet)get_store().add_element_user(CHARTSHEET$0);
            }
            target.set(chartsheet);
        }
    }
    
    /**
     * Appends and returns a new empty "chartsheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet addNewChartsheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet)get_store().add_element_user(CHARTSHEET$0);
            return target;
        }
    }
}

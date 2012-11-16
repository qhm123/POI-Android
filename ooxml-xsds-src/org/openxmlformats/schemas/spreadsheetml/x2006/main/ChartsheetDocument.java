/*
 * An XML document type.
 * Localname: chartsheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ChartsheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one chartsheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface ChartsheetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChartsheetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("chartsheet99dedoctype");
    
    /**
     * Gets the "chartsheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet getChartsheet();
    
    /**
     * Sets the "chartsheet" element
     */
    void setChartsheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet chartsheet);
    
    /**
     * Appends and returns a new empty "chartsheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet addNewChartsheet();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

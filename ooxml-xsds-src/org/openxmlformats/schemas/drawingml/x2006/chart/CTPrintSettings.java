/*
 * XML Type:  CT_PrintSettings
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_PrintSettings(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTPrintSettings extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPrintSettings.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctprintsettings61b6type");
    
    /**
     * Gets the "headerFooter" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter getHeaderFooter();
    
    /**
     * True if has "headerFooter" element
     */
    boolean isSetHeaderFooter();
    
    /**
     * Sets the "headerFooter" element
     */
    void setHeaderFooter(org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter headerFooter);
    
    /**
     * Appends and returns a new empty "headerFooter" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter addNewHeaderFooter();
    
    /**
     * Unsets the "headerFooter" element
     */
    void unsetHeaderFooter();
    
    /**
     * Gets the "pageMargins" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins getPageMargins();
    
    /**
     * True if has "pageMargins" element
     */
    boolean isSetPageMargins();
    
    /**
     * Sets the "pageMargins" element
     */
    void setPageMargins(org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins pageMargins);
    
    /**
     * Appends and returns a new empty "pageMargins" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins addNewPageMargins();
    
    /**
     * Unsets the "pageMargins" element
     */
    void unsetPageMargins();
    
    /**
     * Gets the "pageSetup" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup getPageSetup();
    
    /**
     * True if has "pageSetup" element
     */
    boolean isSetPageSetup();
    
    /**
     * Sets the "pageSetup" element
     */
    void setPageSetup(org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup pageSetup);
    
    /**
     * Appends and returns a new empty "pageSetup" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup addNewPageSetup();
    
    /**
     * Unsets the "pageSetup" element
     */
    void unsetPageSetup();
    
    /**
     * Gets the "legacyDrawingHF" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId getLegacyDrawingHF();
    
    /**
     * True if has "legacyDrawingHF" element
     */
    boolean isSetLegacyDrawingHF();
    
    /**
     * Sets the "legacyDrawingHF" element
     */
    void setLegacyDrawingHF(org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId legacyDrawingHF);
    
    /**
     * Appends and returns a new empty "legacyDrawingHF" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId addNewLegacyDrawingHF();
    
    /**
     * Unsets the "legacyDrawingHF" element
     */
    void unsetLegacyDrawingHF();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

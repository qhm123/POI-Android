/*
 * XML Type:  CT_ChartsheetPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ChartsheetPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTChartsheetPr extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTChartsheetPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctchartsheetpre0actype");
    
    /**
     * Gets the "tabColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getTabColor();
    
    /**
     * True if has "tabColor" element
     */
    boolean isSetTabColor();
    
    /**
     * Sets the "tabColor" element
     */
    void setTabColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor tabColor);
    
    /**
     * Appends and returns a new empty "tabColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewTabColor();
    
    /**
     * Unsets the "tabColor" element
     */
    void unsetTabColor();
    
    /**
     * Gets the "published" attribute
     */
    boolean getPublished();
    
    /**
     * Gets (as xml) the "published" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPublished();
    
    /**
     * True if has "published" attribute
     */
    boolean isSetPublished();
    
    /**
     * Sets the "published" attribute
     */
    void setPublished(boolean published);
    
    /**
     * Sets (as xml) the "published" attribute
     */
    void xsetPublished(org.apache.xmlbeans.XmlBoolean published);
    
    /**
     * Unsets the "published" attribute
     */
    void unsetPublished();
    
    /**
     * Gets the "codeName" attribute
     */
    java.lang.String getCodeName();
    
    /**
     * Gets (as xml) the "codeName" attribute
     */
    org.apache.xmlbeans.XmlString xgetCodeName();
    
    /**
     * True if has "codeName" attribute
     */
    boolean isSetCodeName();
    
    /**
     * Sets the "codeName" attribute
     */
    void setCodeName(java.lang.String codeName);
    
    /**
     * Sets (as xml) the "codeName" attribute
     */
    void xsetCodeName(org.apache.xmlbeans.XmlString codeName);
    
    /**
     * Unsets the "codeName" attribute
     */
    void unsetCodeName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

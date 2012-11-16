/*
 * An XML document type.
 * Localname: workbook
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one workbook(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface WorkbookDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkbookDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("workbookec17doctype");
    
    /**
     * Gets the "workbook" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook getWorkbook();
    
    /**
     * Sets the "workbook" element
     */
    void setWorkbook(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook workbook);
    
    /**
     * Appends and returns a new empty "workbook" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook addNewWorkbook();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

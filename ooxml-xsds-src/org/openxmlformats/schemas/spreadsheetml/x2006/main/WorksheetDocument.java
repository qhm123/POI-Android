/*
 * An XML document type.
 * Localname: worksheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one worksheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface WorksheetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorksheetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("worksheetf539doctype");
    
    /**
     * Gets the "worksheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet getWorksheet();
    
    /**
     * Sets the "worksheet" element
     */
    void setWorksheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet worksheet);
    
    /**
     * Appends and returns a new empty "worksheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet addNewWorksheet();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

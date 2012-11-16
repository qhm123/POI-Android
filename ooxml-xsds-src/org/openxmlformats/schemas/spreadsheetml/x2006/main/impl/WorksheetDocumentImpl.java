/*
 * An XML document type.
 * Localname: worksheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one worksheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class WorksheetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument
{
    
    public WorksheetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKSHEET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "worksheet");
    
    
    /**
     * Gets the "worksheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet getWorksheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet)get_store().find_element_user(WORKSHEET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "worksheet" element
     */
    public void setWorksheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet worksheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet)get_store().find_element_user(WORKSHEET$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet)get_store().add_element_user(WORKSHEET$0);
            }
            target.set(worksheet);
        }
    }
    
    /**
     * Appends and returns a new empty "worksheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet addNewWorksheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet)get_store().add_element_user(WORKSHEET$0);
            return target;
        }
    }
}

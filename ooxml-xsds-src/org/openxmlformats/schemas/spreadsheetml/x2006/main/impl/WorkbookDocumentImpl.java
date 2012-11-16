/*
 * An XML document type.
 * Localname: workbook
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one workbook(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class WorkbookDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument
{
    
    public WorkbookDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKBOOK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbook");
    
    
    /**
     * Gets the "workbook" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook getWorkbook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook)get_store().find_element_user(WORKBOOK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "workbook" element
     */
    public void setWorkbook(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook workbook)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook)get_store().find_element_user(WORKBOOK$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook)get_store().add_element_user(WORKBOOK$0);
            }
            target.set(workbook);
        }
    }
    
    /**
     * Appends and returns a new empty "workbook" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook addNewWorkbook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook)get_store().add_element_user(WORKBOOK$0);
            return target;
        }
    }
}

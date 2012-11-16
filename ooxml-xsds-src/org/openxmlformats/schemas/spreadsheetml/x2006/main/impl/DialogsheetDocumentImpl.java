/*
 * An XML document type.
 * Localname: dialogsheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.DialogsheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one dialogsheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class DialogsheetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.DialogsheetDocument
{
    
    public DialogsheetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIALOGSHEET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dialogsheet");
    
    
    /**
     * Gets the "dialogsheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet getDialogsheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet)get_store().find_element_user(DIALOGSHEET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dialogsheet" element
     */
    public void setDialogsheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet dialogsheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet)get_store().find_element_user(DIALOGSHEET$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet)get_store().add_element_user(DIALOGSHEET$0);
            }
            target.set(dialogsheet);
        }
    }
    
    /**
     * Appends and returns a new empty "dialogsheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet addNewDialogsheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet)get_store().add_element_user(DIALOGSHEET$0);
            return target;
        }
    }
}

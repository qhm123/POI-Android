/*
 * An XML document type.
 * Localname: datastoreItem
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/customXml
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customXml.DatastoreItemDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customXml.impl;
/**
 * A document containing one datastoreItem(@http://schemas.openxmlformats.org/officeDocument/2006/customXml) element.
 *
 * This is a complex type.
 */
public class DatastoreItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.customXml.DatastoreItemDocument
{
    
    public DatastoreItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTOREITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/customXml", "datastoreItem");
    
    
    /**
     * Gets the "datastoreItem" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem getDatastoreItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem)get_store().find_element_user(DATASTOREITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "datastoreItem" element
     */
    public void setDatastoreItem(org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem datastoreItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem)get_store().find_element_user(DATASTOREITEM$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem)get_store().add_element_user(DATASTOREITEM$0);
            }
            target.set(datastoreItem);
        }
    }
    
    /**
     * Appends and returns a new empty "datastoreItem" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem addNewDatastoreItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem)get_store().add_element_user(DATASTOREITEM$0);
            return target;
        }
    }
}

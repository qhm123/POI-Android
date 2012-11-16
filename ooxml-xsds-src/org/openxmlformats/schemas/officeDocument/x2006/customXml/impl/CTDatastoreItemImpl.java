/*
 * XML Type:  CT_DatastoreItem
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/customXml
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customXml.impl;
/**
 * An XML CT_DatastoreItem(@http://schemas.openxmlformats.org/officeDocument/2006/customXml).
 *
 * This is a complex type.
 */
public class CTDatastoreItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem
{
    
    public CTDatastoreItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMAREFS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/customXml", "schemaRefs");
    private static final javax.xml.namespace.QName ITEMID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/customXml", "itemID");
    
    
    /**
     * Gets the "schemaRefs" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs getSchemaRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs)get_store().find_element_user(SCHEMAREFS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schemaRefs" element
     */
    public boolean isSetSchemaRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMAREFS$0) != 0;
        }
    }
    
    /**
     * Sets the "schemaRefs" element
     */
    public void setSchemaRefs(org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs schemaRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs)get_store().find_element_user(SCHEMAREFS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs)get_store().add_element_user(SCHEMAREFS$0);
            }
            target.set(schemaRefs);
        }
    }
    
    /**
     * Appends and returns a new empty "schemaRefs" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs addNewSchemaRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs)get_store().add_element_user(SCHEMAREFS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "schemaRefs" element
     */
    public void unsetSchemaRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMAREFS$0, 0);
        }
    }
    
    /**
     * Gets the "itemID" attribute
     */
    public java.lang.String getItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "itemID" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid xgetItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid)get_store().find_attribute_user(ITEMID$2);
            return target;
        }
    }
    
    /**
     * Sets the "itemID" attribute
     */
    public void setItemID(java.lang.String itemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMID$2);
            }
            target.setStringValue(itemID);
        }
    }
    
    /**
     * Sets (as xml) the "itemID" attribute
     */
    public void xsetItemID(org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid itemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid)get_store().find_attribute_user(ITEMID$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid)get_store().add_attribute_user(ITEMID$2);
            }
            target.set(itemID);
        }
    }
}

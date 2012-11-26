/*
 * XML Type:  CT_HandoutMasterIdList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_HandoutMasterIdList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTHandoutMasterIdListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList
{
    
    public CTHandoutMasterIdListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HANDOUTMASTERID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "handoutMasterId");
    
    
    /**
     * Gets the "handoutMasterId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry getHandoutMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry)get_store().find_element_user(HANDOUTMASTERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "handoutMasterId" element
     */
    public boolean isSetHandoutMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDOUTMASTERID$0) != 0;
        }
    }
    
    /**
     * Sets the "handoutMasterId" element
     */
    public void setHandoutMasterId(org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry handoutMasterId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry)get_store().find_element_user(HANDOUTMASTERID$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry)get_store().add_element_user(HANDOUTMASTERID$0);
            }
            target.set(handoutMasterId);
        }
    }
    
    /**
     * Appends and returns a new empty "handoutMasterId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry addNewHandoutMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdListEntry)get_store().add_element_user(HANDOUTMASTERID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "handoutMasterId" element
     */
    public void unsetHandoutMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDOUTMASTERID$0, 0);
        }
    }
}

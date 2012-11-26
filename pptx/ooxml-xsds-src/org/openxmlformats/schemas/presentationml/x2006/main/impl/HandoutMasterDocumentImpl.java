/*
 * An XML document type.
 * Localname: handoutMaster
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.HandoutMasterDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one handoutMaster(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class HandoutMasterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.HandoutMasterDocument
{
    
    public HandoutMasterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HANDOUTMASTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "handoutMaster");
    
    
    /**
     * Gets the "handoutMaster" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster getHandoutMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster)get_store().find_element_user(HANDOUTMASTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "handoutMaster" element
     */
    public void setHandoutMaster(org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster handoutMaster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster)get_store().find_element_user(HANDOUTMASTER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster)get_store().add_element_user(HANDOUTMASTER$0);
            }
            target.set(handoutMaster);
        }
    }
    
    /**
     * Appends and returns a new empty "handoutMaster" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster addNewHandoutMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster)get_store().add_element_user(HANDOUTMASTER$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: sldSyncPr
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.SldSyncPrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one sldSyncPr(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class SldSyncPrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.SldSyncPrDocument
{
    
    public SldSyncPrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDSYNCPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldSyncPr");
    
    
    /**
     * Gets the "sldSyncPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties getSldSyncPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties)get_store().find_element_user(SLDSYNCPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sldSyncPr" element
     */
    public void setSldSyncPr(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties sldSyncPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties)get_store().find_element_user(SLDSYNCPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties)get_store().add_element_user(SLDSYNCPR$0);
            }
            target.set(sldSyncPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sldSyncPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties addNewSldSyncPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties)get_store().add_element_user(SLDSYNCPR$0);
            return target;
        }
    }
}

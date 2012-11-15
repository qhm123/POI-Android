/*
 * An XML document type.
 * Localname: sldMaster
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.SldMasterDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one sldMaster(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class SldMasterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.SldMasterDocument
{
    
    public SldMasterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDMASTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldMaster");
    
    
    /**
     * Gets the "sldMaster" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster getSldMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster)get_store().find_element_user(SLDMASTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sldMaster" element
     */
    public void setSldMaster(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster sldMaster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster)get_store().find_element_user(SLDMASTER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster)get_store().add_element_user(SLDMASTER$0);
            }
            target.set(sldMaster);
        }
    }
    
    /**
     * Appends and returns a new empty "sldMaster" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster addNewSldMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster)get_store().add_element_user(SLDMASTER$0);
            return target;
        }
    }
}

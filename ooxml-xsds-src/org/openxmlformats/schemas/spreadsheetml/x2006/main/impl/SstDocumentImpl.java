/*
 * An XML document type.
 * Localname: sst
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.SstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one sst(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class SstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.SstDocument
{
    
    public SstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sst");
    
    
    /**
     * Gets the "sst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst getSst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst)get_store().find_element_user(SST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sst" element
     */
    public void setSst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst sst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst)get_store().find_element_user(SST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst)get_store().add_element_user(SST$0);
            }
            target.set(sst);
        }
    }
    
    /**
     * Appends and returns a new empty "sst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst addNewSst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst)get_store().add_element_user(SST$0);
            return target;
        }
    }
}

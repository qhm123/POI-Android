/*
 * An XML document type.
 * Localname: hdr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one hdr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class HdrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument
{
    
    public HdrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hdr");
    
    
    /**
     * Gets the "hdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr getHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().find_element_user(HDR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hdr" element
     */
    public void setHdr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr hdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().find_element_user(HDR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().add_element_user(HDR$0);
            }
            target.set(hdr);
        }
    }
    
    /**
     * Appends and returns a new empty "hdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr addNewHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().add_element_user(HDR$0);
            return target;
        }
    }
}

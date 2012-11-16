/*
 * An XML document type.
 * Localname: ftr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.FtrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one ftr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class FtrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.FtrDocument
{
    
    public FtrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FTR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ftr");
    
    
    /**
     * Gets the "ftr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr getFtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().find_element_user(FTR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ftr" element
     */
    public void setFtr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr ftr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().find_element_user(FTR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().add_element_user(FTR$0);
            }
            target.set(ftr);
        }
    }
    
    /**
     * Appends and returns a new empty "ftr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr addNewFtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().add_element_user(FTR$0);
            return target;
        }
    }
}

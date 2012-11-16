/*
 * An XML document type.
 * Localname: cf
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CfDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one cf(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class CfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CfDocument
{
    
    public CfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cf");
    
    
    /**
     * Gets the "cf" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf getCf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().find_element_user(CF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cf" element
     */
    public void setCf(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf cf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().find_element_user(CF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().add_element_user(CF$0);
            }
            target.set(cf);
        }
    }
    
    /**
     * Appends and returns a new empty "cf" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf addNewCf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().add_element_user(CF$0);
            return target;
        }
    }
}

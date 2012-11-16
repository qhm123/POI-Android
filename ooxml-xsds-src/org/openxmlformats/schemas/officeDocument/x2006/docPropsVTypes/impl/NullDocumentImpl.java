/*
 * An XML document type.
 * Localname: null
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.NullDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one null(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class NullDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.NullDocument
{
    
    public NullDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NULL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "null");
    
    
    /**
     * Gets the "null" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "null" element
     */
    public void setNull(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull)get_store().add_element_user(NULL$0);
            }
            target.set(xnull);
        }
    }
    
    /**
     * Appends and returns a new empty "null" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull)get_store().add_element_user(NULL$0);
            return target;
        }
    }
}

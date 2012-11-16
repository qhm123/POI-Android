/*
 * An XML document type.
 * Localname: error
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one error(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.ErrorDocument
{
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "error");
    
    
    /**
     * Gets the "error" element
     */
    public java.lang.String getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "error" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError xgetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(ERROR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$0);
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) the "error" element
     */
    public void xsetError(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
}

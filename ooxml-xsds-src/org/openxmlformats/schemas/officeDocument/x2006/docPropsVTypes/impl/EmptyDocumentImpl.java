/*
 * An XML document type.
 * Localname: empty
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.EmptyDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one empty(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class EmptyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.EmptyDocument
{
    
    public EmptyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPTY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "empty");
    
    
    /**
     * Gets the "empty" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty getEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty)get_store().find_element_user(EMPTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "empty" element
     */
    public void setEmpty(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty empty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty)get_store().find_element_user(EMPTY$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty)get_store().add_element_user(EMPTY$0);
            }
            target.set(empty);
        }
    }
    
    /**
     * Appends and returns a new empty "empty" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty addNewEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty)get_store().add_element_user(EMPTY$0);
            return target;
        }
    }
}

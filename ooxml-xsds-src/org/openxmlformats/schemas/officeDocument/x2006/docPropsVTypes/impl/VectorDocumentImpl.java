/*
 * An XML document type.
 * Localname: vector
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.VectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one vector(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class VectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.VectorDocument
{
    
    public VectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VECTOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "vector");
    
    
    /**
     * Gets the "vector" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector getVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector)get_store().find_element_user(VECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vector" element
     */
    public void setVector(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector vector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector)get_store().find_element_user(VECTOR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector)get_store().add_element_user(VECTOR$0);
            }
            target.set(vector);
        }
    }
    
    /**
     * Appends and returns a new empty "vector" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector addNewVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector)get_store().add_element_user(VECTOR$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: array
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.ArrayDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one array(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class ArrayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.ArrayDocument
{
    
    public ArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "array");
    
    
    /**
     * Gets the "array" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "array" element
     */
    public void setArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray)get_store().add_element_user(ARRAY$0);
            }
            target.set(array);
        }
    }
    
    /**
     * Appends and returns a new empty "array" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray addNewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray)get_store().add_element_user(ARRAY$0);
            return target;
        }
    }
}

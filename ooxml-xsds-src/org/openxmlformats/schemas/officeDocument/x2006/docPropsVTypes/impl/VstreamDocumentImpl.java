/*
 * An XML document type.
 * Localname: vstream
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.VstreamDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one vstream(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class VstreamDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.VstreamDocument
{
    
    public VstreamDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VSTREAM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "vstream");
    
    
    /**
     * Gets the "vstream" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream getVstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream)get_store().find_element_user(VSTREAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vstream" element
     */
    public void setVstream(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream vstream)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream)get_store().find_element_user(VSTREAM$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream)get_store().add_element_user(VSTREAM$0);
            }
            target.set(vstream);
        }
    }
    
    /**
     * Appends and returns a new empty "vstream" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream addNewVstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream)get_store().add_element_user(VSTREAM$0);
            return target;
        }
    }
}

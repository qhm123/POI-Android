/*
 * An XML document type.
 * Localname: cy
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CyDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one cy(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class CyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CyDocument
{
    
    public CyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cy");
    
    
    /**
     * Gets the "cy" element
     */
    public java.lang.String getCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cy" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy xgetCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(CY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cy" element
     */
    public void setCy(java.lang.String cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CY$0);
            }
            target.setStringValue(cy);
        }
    }
    
    /**
     * Sets (as xml) the "cy" element
     */
    public void xsetCy(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(CY$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().add_element_user(CY$0);
            }
            target.set(cy);
        }
    }
}

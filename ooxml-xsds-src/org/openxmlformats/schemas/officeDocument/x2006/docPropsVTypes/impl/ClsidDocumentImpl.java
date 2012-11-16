/*
 * An XML document type.
 * Localname: clsid
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.ClsidDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one clsid(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class ClsidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.ClsidDocument
{
    
    public ClsidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLSID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "clsid");
    
    
    /**
     * Gets the "clsid" element
     */
    public java.lang.String getClsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clsid" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid xgetClsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().find_element_user(CLSID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "clsid" element
     */
    public void setClsid(java.lang.String clsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSID$0);
            }
            target.setStringValue(clsid);
        }
    }
    
    /**
     * Sets (as xml) the "clsid" element
     */
    public void xsetClsid(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid clsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().find_element_user(CLSID$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().add_element_user(CLSID$0);
            }
            target.set(clsid);
        }
    }
}

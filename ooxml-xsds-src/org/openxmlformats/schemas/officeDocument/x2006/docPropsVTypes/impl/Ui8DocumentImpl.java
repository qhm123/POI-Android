/*
 * An XML document type.
 * Localname: ui8
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.Ui8Document
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * A document containing one ui8(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public class Ui8DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.Ui8Document
{
    
    public Ui8DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UI8$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui8");
    
    
    /**
     * Gets the "ui8" element
     */
    public java.math.BigInteger getUi8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI8$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ui8" element
     */
    public org.apache.xmlbeans.XmlUnsignedLong xgetUi8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UI8$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ui8" element
     */
    public void setUi8(java.math.BigInteger ui8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI8$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI8$0);
            }
            target.setBigIntegerValue(ui8);
        }
    }
    
    /**
     * Sets (as xml) the "ui8" element
     */
    public void xsetUi8(org.apache.xmlbeans.XmlUnsignedLong ui8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UI8$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_element_user(UI8$0);
            }
            target.set(ui8);
        }
    }
}

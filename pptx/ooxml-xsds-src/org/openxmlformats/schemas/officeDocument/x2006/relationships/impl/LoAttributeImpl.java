/*
 * An XML attribute type.
 * Localname: lo
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.LoAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships.impl;
/**
 * A document containing one lo(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public class LoAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.relationships.LoAttribute
{
    
    public LoAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LO$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "lo");
    
    
    /**
     * Gets the "lo" attribute
     */
    public java.lang.String getLo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LO$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lo" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetLo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(LO$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_default_attribute_value(LO$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "lo" attribute
     */
    public boolean isSetLo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LO$0) != null;
        }
    }
    
    /**
     * Sets the "lo" attribute
     */
    public void setLo(java.lang.String lo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LO$0);
            }
            target.setStringValue(lo);
        }
    }
    
    /**
     * Sets (as xml) the "lo" attribute
     */
    public void xsetLo(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId lo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(LO$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(LO$0);
            }
            target.set(lo);
        }
    }
    
    /**
     * Unsets the "lo" attribute
     */
    public void unsetLo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LO$0);
        }
    }
}

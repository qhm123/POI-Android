/*
 * An XML attribute type.
 * Localname: dm
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.DmAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships.impl;
/**
 * A document containing one dm(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public class DmAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.relationships.DmAttribute
{
    
    public DmAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "dm");
    
    
    /**
     * Gets the "dm" attribute
     */
    public java.lang.String getDm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DM$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dm" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetDm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(DM$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_default_attribute_value(DM$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "dm" attribute
     */
    public boolean isSetDm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DM$0) != null;
        }
    }
    
    /**
     * Sets the "dm" attribute
     */
    public void setDm(java.lang.String dm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DM$0);
            }
            target.setStringValue(dm);
        }
    }
    
    /**
     * Sets (as xml) the "dm" attribute
     */
    public void xsetDm(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId dm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(DM$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(DM$0);
            }
            target.set(dm);
        }
    }
    
    /**
     * Unsets the "dm" attribute
     */
    public void unsetDm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DM$0);
        }
    }
}

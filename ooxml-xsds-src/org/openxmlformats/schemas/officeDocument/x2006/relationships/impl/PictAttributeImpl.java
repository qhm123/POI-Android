/*
 * An XML attribute type.
 * Localname: pict
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.PictAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships.impl;
/**
 * A document containing one pict(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public class PictAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.relationships.PictAttribute
{
    
    public PictAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "pict");
    
    
    /**
     * Gets the "pict" attribute
     */
    public java.lang.String getPict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PICT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pict" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetPict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PICT$0);
            return target;
        }
    }
    
    /**
     * True if has "pict" attribute
     */
    public boolean isSetPict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PICT$0) != null;
        }
    }
    
    /**
     * Sets the "pict" attribute
     */
    public void setPict(java.lang.String pict)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PICT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PICT$0);
            }
            target.setStringValue(pict);
        }
    }
    
    /**
     * Sets (as xml) the "pict" attribute
     */
    public void xsetPict(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId pict)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PICT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(PICT$0);
            }
            target.set(pict);
        }
    }
    
    /**
     * Unsets the "pict" attribute
     */
    public void unsetPict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PICT$0);
        }
    }
}

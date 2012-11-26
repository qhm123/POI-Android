/*
 * An XML attribute type.
 * Localname: link
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.LinkAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships.impl;
/**
 * A document containing one link(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public class LinkAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.relationships.LinkAttribute
{
    
    public LinkAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "link");
    
    
    /**
     * Gets the "link" attribute
     */
    public java.lang.String getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINK$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "link" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(LINK$0);
            return target;
        }
    }
    
    /**
     * True if has "link" attribute
     */
    public boolean isSetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINK$0) != null;
        }
    }
    
    /**
     * Sets the "link" attribute
     */
    public void setLink(java.lang.String link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINK$0);
            }
            target.setStringValue(link);
        }
    }
    
    /**
     * Sets (as xml) the "link" attribute
     */
    public void xsetLink(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(LINK$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(LINK$0);
            }
            target.set(link);
        }
    }
    
    /**
     * Unsets the "link" attribute
     */
    public void unsetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINK$0);
        }
    }
}

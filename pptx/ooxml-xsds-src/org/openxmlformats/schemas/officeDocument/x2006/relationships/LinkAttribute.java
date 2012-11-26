/*
 * An XML attribute type.
 * Localname: link
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.LinkAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships;


/**
 * A document containing one link(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public interface LinkAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("linkf4d1attrtypetype");
    
    /**
     * Gets the "link" attribute
     */
    java.lang.String getLink();
    
    /**
     * Gets (as xml) the "link" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetLink();
    
    /**
     * True if has "link" attribute
     */
    boolean isSetLink();
    
    /**
     * Sets the "link" attribute
     */
    void setLink(java.lang.String link);
    
    /**
     * Sets (as xml) the "link" attribute
     */
    void xsetLink(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId link);
    
    /**
     * Unsets the "link" attribute
     */
    void unsetLink();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

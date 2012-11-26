/*
 * An XML attribute type.
 * Localname: pict
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.PictAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships;


/**
 * A document containing one pict(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public interface PictAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PictAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("pictad01attrtypetype");
    
    /**
     * Gets the "pict" attribute
     */
    java.lang.String getPict();
    
    /**
     * Gets (as xml) the "pict" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetPict();
    
    /**
     * True if has "pict" attribute
     */
    boolean isSetPict();
    
    /**
     * Sets the "pict" attribute
     */
    void setPict(java.lang.String pict);
    
    /**
     * Sets (as xml) the "pict" attribute
     */
    void xsetPict(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId pict);
    
    /**
     * Unsets the "pict" attribute
     */
    void unsetPict();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

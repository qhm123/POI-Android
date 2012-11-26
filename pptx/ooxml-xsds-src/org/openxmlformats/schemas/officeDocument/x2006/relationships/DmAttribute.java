/*
 * An XML attribute type.
 * Localname: dm
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.DmAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships;


/**
 * A document containing one dm(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public interface DmAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DmAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("dm48a0attrtypetype");
    
    /**
     * Gets the "dm" attribute
     */
    java.lang.String getDm();
    
    /**
     * Gets (as xml) the "dm" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetDm();
    
    /**
     * True if has "dm" attribute
     */
    boolean isSetDm();
    
    /**
     * Sets the "dm" attribute
     */
    void setDm(java.lang.String dm);
    
    /**
     * Sets (as xml) the "dm" attribute
     */
    void xsetDm(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId dm);
    
    /**
     * Unsets the "dm" attribute
     */
    void unsetDm();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML attribute type.
 * Localname: cs
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.CsAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships;


/**
 * A document containing one cs(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public interface CsAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CsAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cs4507attrtypetype");
    
    /**
     * Gets the "cs" attribute
     */
    java.lang.String getCs();
    
    /**
     * Gets (as xml) the "cs" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetCs();
    
    /**
     * True if has "cs" attribute
     */
    boolean isSetCs();
    
    /**
     * Sets the "cs" attribute
     */
    void setCs(java.lang.String cs);
    
    /**
     * Sets (as xml) the "cs" attribute
     */
    void xsetCs(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId cs);
    
    /**
     * Unsets the "cs" attribute
     */
    void unsetCs();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML attribute type.
 * Localname: lo
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.LoAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships;


/**
 * A document containing one lo(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public interface LoAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("lo6c9aattrtypetype");
    
    /**
     * Gets the "lo" attribute
     */
    java.lang.String getLo();
    
    /**
     * Gets (as xml) the "lo" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetLo();
    
    /**
     * True if has "lo" attribute
     */
    boolean isSetLo();
    
    /**
     * Sets the "lo" attribute
     */
    void setLo(java.lang.String lo);
    
    /**
     * Sets (as xml) the "lo" attribute
     */
    void xsetLo(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId lo);
    
    /**
     * Unsets the "lo" attribute
     */
    void unsetLo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

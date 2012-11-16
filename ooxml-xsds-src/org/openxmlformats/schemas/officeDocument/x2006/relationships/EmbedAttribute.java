/*
 * An XML attribute type.
 * Localname: embed
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/relationships
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.relationships.EmbedAttribute
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.relationships;


/**
 * A document containing one embed(@http://schemas.openxmlformats.org/officeDocument/2006/relationships) attribute.
 *
 * This is a complex type.
 */
public interface EmbedAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmbedAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("embedcb3aattrtypetype");
    
    /**
     * Gets the "embed" attribute
     */
    java.lang.String getEmbed();
    
    /**
     * Gets (as xml) the "embed" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetEmbed();
    
    /**
     * True if has "embed" attribute
     */
    boolean isSetEmbed();
    
    /**
     * Sets the "embed" attribute
     */
    void setEmbed(java.lang.String embed);
    
    /**
     * Sets (as xml) the "embed" attribute
     */
    void xsetEmbed(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId embed);
    
    /**
     * Unsets the "embed" attribute
     */
    void unsetEmbed();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

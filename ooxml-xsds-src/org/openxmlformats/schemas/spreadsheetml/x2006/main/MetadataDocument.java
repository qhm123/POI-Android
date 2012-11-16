/*
 * An XML document type.
 * Localname: metadata
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.MetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one metadata(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface MetadataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetadataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("metadatad98cdoctype");
    
    /**
     * Gets the "metadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata getMetadata();
    
    /**
     * Sets the "metadata" element
     */
    void setMetadata(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata metadata);
    
    /**
     * Appends and returns a new empty "metadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata addNewMetadata();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

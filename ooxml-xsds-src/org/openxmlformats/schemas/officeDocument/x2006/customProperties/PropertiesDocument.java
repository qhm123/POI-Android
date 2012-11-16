/*
 * An XML document type.
 * Localname: Properties
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/custom-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customProperties;


/**
 * A document containing one Properties(@http://schemas.openxmlformats.org/officeDocument/2006/custom-properties) element.
 *
 * This is a complex type.
 */
public interface PropertiesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertiesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("properties288cdoctype");
    
    /**
     * Gets the "Properties" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties getProperties();
    
    /**
     * Sets the "Properties" element
     */
    void setProperties(org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties properties);
    
    /**
     * Appends and returns a new empty "Properties" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties addNewProperties();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML document type.
 * Localname: storage
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.StorageDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one storage(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface StorageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StorageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("storage44e8doctype");
    
    /**
     * Gets the "storage" element
     */
    byte[] getStorage();
    
    /**
     * Gets (as xml) the "storage" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetStorage();
    
    /**
     * Sets the "storage" element
     */
    void setStorage(byte[] storage);
    
    /**
     * Sets (as xml) the "storage" element
     */
    void xsetStorage(org.apache.xmlbeans.XmlBase64Binary storage);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

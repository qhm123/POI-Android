/*
 * An XML document type.
 * Localname: ostorage
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.OstorageDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one ostorage(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface OstorageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OstorageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ostoraged805doctype");
    
    /**
     * Gets the "ostorage" element
     */
    byte[] getOstorage();
    
    /**
     * Gets (as xml) the "ostorage" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetOstorage();
    
    /**
     * Sets the "ostorage" element
     */
    void setOstorage(byte[] ostorage);
    
    /**
     * Sets (as xml) the "ostorage" element
     */
    void xsetOstorage(org.apache.xmlbeans.XmlBase64Binary ostorage);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

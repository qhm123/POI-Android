/*
 * An XML document type.
 * Localname: blob
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.BlobDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one blob(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface BlobDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BlobDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("blob31b4doctype");
    
    /**
     * Gets the "blob" element
     */
    byte[] getBlob();
    
    /**
     * Gets (as xml) the "blob" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetBlob();
    
    /**
     * Sets the "blob" element
     */
    void setBlob(byte[] blob);
    
    /**
     * Sets (as xml) the "blob" element
     */
    void xsetBlob(org.apache.xmlbeans.XmlBase64Binary blob);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

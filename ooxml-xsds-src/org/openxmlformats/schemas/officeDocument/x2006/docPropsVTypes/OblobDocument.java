/*
 * An XML document type.
 * Localname: oblob
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.OblobDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one oblob(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface OblobDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OblobDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("oblobbbb7doctype");
    
    /**
     * Gets the "oblob" element
     */
    byte[] getOblob();
    
    /**
     * Gets (as xml) the "oblob" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetOblob();
    
    /**
     * Sets the "oblob" element
     */
    void setOblob(byte[] oblob);
    
    /**
     * Sets (as xml) the "oblob" element
     */
    void xsetOblob(org.apache.xmlbeans.XmlBase64Binary oblob);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

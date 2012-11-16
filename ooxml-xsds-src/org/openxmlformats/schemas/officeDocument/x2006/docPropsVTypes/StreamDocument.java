/*
 * An XML document type.
 * Localname: stream
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.StreamDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one stream(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface StreamDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StreamDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("streamd1f1doctype");
    
    /**
     * Gets the "stream" element
     */
    byte[] getStream();
    
    /**
     * Gets (as xml) the "stream" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetStream();
    
    /**
     * Sets the "stream" element
     */
    void setStream(byte[] stream);
    
    /**
     * Sets (as xml) the "stream" element
     */
    void xsetStream(org.apache.xmlbeans.XmlBase64Binary stream);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

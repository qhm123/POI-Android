/*
 * An XML document type.
 * Localname: ostream
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.OstreamDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one ostream(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface OstreamDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OstreamDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ostreame734doctype");
    
    /**
     * Gets the "ostream" element
     */
    byte[] getOstream();
    
    /**
     * Gets (as xml) the "ostream" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetOstream();
    
    /**
     * Sets the "ostream" element
     */
    void setOstream(byte[] ostream);
    
    /**
     * Sets (as xml) the "ostream" element
     */
    void xsetOstream(org.apache.xmlbeans.XmlBase64Binary ostream);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

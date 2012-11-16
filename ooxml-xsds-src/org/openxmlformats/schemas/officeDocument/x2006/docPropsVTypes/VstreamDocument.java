/*
 * An XML document type.
 * Localname: vstream
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.VstreamDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one vstream(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface VstreamDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VstreamDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("vstream24cddoctype");
    
    /**
     * Gets the "vstream" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream getVstream();
    
    /**
     * Sets the "vstream" element
     */
    void setVstream(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream vstream);
    
    /**
     * Appends and returns a new empty "vstream" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream addNewVstream();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

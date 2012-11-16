/*
 * An XML document type.
 * Localname: error
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one error(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface ErrorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("errorb7bbdoctype");
    
    /**
     * Gets the "error" element
     */
    java.lang.String getError();
    
    /**
     * Gets (as xml) the "error" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError xgetError();
    
    /**
     * Sets the "error" element
     */
    void setError(java.lang.String error);
    
    /**
     * Sets (as xml) the "error" element
     */
    void xsetError(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError error);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

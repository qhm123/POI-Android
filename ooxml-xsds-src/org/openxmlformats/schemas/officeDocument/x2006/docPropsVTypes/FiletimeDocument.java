/*
 * An XML document type.
 * Localname: filetime
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.FiletimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one filetime(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface FiletimeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FiletimeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("filetime3708doctype");
    
    /**
     * Gets the "filetime" element
     */
    java.util.Calendar getFiletime();
    
    /**
     * Gets (as xml) the "filetime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetFiletime();
    
    /**
     * Sets the "filetime" element
     */
    void setFiletime(java.util.Calendar filetime);
    
    /**
     * Sets (as xml) the "filetime" element
     */
    void xsetFiletime(org.apache.xmlbeans.XmlDateTime filetime);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

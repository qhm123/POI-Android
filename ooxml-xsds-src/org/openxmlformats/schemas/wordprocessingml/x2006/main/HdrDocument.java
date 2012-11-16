/*
 * An XML document type.
 * Localname: hdr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * A document containing one hdr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public interface HdrDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HdrDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("hdra530doctype");
    
    /**
     * Gets the "hdr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr getHdr();
    
    /**
     * Sets the "hdr" element
     */
    void setHdr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr hdr);
    
    /**
     * Appends and returns a new empty "hdr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr addNewHdr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

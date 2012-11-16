/*
 * An XML document type.
 * Localname: externalLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ExternalLinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one externalLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface ExternalLinkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalLinkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("externallinkb4c2doctype");
    
    /**
     * Gets the "externalLink" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink getExternalLink();
    
    /**
     * Sets the "externalLink" element
     */
    void setExternalLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink externalLink);
    
    /**
     * Appends and returns a new empty "externalLink" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink addNewExternalLink();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

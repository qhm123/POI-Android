/*
 * An XML document type.
 * Localname: headers
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.HeadersDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one headers(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface HeadersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeadersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("headers2b91doctype");
    
    /**
     * Gets the "headers" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders getHeaders();
    
    /**
     * Sets the "headers" element
     */
    void setHeaders(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders headers);
    
    /**
     * Appends and returns a new empty "headers" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders addNewHeaders();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

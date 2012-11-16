/*
 * An XML document type.
 * Localname: comments
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CommentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one comments(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface CommentsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CommentsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("comments4c11doctype");
    
    /**
     * Gets the "comments" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments getComments();
    
    /**
     * Sets the "comments" element
     */
    void setComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments comments);
    
    /**
     * Appends and returns a new empty "comments" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments addNewComments();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

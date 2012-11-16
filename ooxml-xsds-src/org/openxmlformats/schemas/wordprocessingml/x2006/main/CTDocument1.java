/*
 * XML Type:  CT_Document
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Document(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocument1 extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocumentBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocument64adtype");
    
    /**
     * Gets the "body" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody getBody();
    
    /**
     * True if has "body" element
     */
    boolean isSetBody();
    
    /**
     * Sets the "body" element
     */
    void setBody(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody body);
    
    /**
     * Appends and returns a new empty "body" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody addNewBody();
    
    /**
     * Unsets the "body" element
     */
    void unsetBody();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_DocumentBase
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocumentBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocumentBase(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocumentBase extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocumentBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocumentbasedf5ctype");
    
    /**
     * Gets the "background" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground getBackground();
    
    /**
     * True if has "background" element
     */
    boolean isSetBackground();
    
    /**
     * Sets the "background" element
     */
    void setBackground(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground background);
    
    /**
     * Appends and returns a new empty "background" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground addNewBackground();
    
    /**
     * Unsets the "background" element
     */
    void unsetBackground();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

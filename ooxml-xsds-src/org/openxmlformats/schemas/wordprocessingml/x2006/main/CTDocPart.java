/*
 * XML Type:  CT_DocPart
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocPart(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocPart extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocPart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocpart7f27type");
    
    /**
     * Gets the "docPartPr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr getDocPartPr();
    
    /**
     * True if has "docPartPr" element
     */
    boolean isSetDocPartPr();
    
    /**
     * Sets the "docPartPr" element
     */
    void setDocPartPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr docPartPr);
    
    /**
     * Appends and returns a new empty "docPartPr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr addNewDocPartPr();
    
    /**
     * Unsets the "docPartPr" element
     */
    void unsetDocPartPr();
    
    /**
     * Gets the "docPartBody" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody getDocPartBody();
    
    /**
     * True if has "docPartBody" element
     */
    boolean isSetDocPartBody();
    
    /**
     * Sets the "docPartBody" element
     */
    void setDocPartBody(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody docPartBody);
    
    /**
     * Appends and returns a new empty "docPartBody" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody addNewDocPartBody();
    
    /**
     * Unsets the "docPartBody" element
     */
    void unsetDocPartBody();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

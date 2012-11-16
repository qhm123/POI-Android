/*
 * An XML document type.
 * Localname: numbering
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.NumberingDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * A document containing one numbering(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public interface NumberingDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumberingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("numbering1c4ddoctype");
    
    /**
     * Gets the "numbering" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering getNumbering();
    
    /**
     * Sets the "numbering" element
     */
    void setNumbering(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering numbering);
    
    /**
     * Appends and returns a new empty "numbering" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering addNewNumbering();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML document type.
 * Localname: fonts
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.FontsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * A document containing one fonts(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public interface FontsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FontsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("fonts7aa2doctype");
    
    /**
     * Gets the "fonts" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList getFonts();
    
    /**
     * Sets the "fonts" element
     */
    void setFonts(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList fonts);
    
    /**
     * Appends and returns a new empty "fonts" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList addNewFonts();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

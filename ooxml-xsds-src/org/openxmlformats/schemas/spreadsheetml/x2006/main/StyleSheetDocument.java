/*
 * An XML document type.
 * Localname: styleSheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.StyleSheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one styleSheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface StyleSheetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StyleSheetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stylesheet5d8bdoctype");
    
    /**
     * Gets the "styleSheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet getStyleSheet();
    
    /**
     * Sets the "styleSheet" element
     */
    void setStyleSheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet styleSheet);
    
    /**
     * Appends and returns a new empty "styleSheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet addNewStyleSheet();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML document type.
 * Localname: styleDefHdr
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.StyleDefHdrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * A document containing one styleDefHdr(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public interface StyleDefHdrDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StyleDefHdrDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("styledefhdr2daddoctype");
    
    /**
     * Gets the "styleDefHdr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader getStyleDefHdr();
    
    /**
     * Sets the "styleDefHdr" element
     */
    void setStyleDefHdr(org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader styleDefHdr);
    
    /**
     * Appends and returns a new empty "styleDefHdr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader addNewStyleDefHdr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

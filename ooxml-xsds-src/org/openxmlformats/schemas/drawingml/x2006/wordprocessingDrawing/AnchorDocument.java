/*
 * An XML document type.
 * Localname: anchor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.AnchorDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing;


/**
 * A document containing one anchor(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing) element.
 *
 * This is a complex type.
 */
public interface AnchorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnchorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("anchordab6doctype");
    
    /**
     * Gets the "anchor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor getAnchor();
    
    /**
     * Sets the "anchor" element
     */
    void setAnchor(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor anchor);
    
    /**
     * Appends and returns a new empty "anchor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor addNewAnchor();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

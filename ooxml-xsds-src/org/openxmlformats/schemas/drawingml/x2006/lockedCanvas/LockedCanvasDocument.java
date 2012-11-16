/*
 * An XML document type.
 * Localname: lockedCanvas
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/lockedCanvas
 * Java type: org.openxmlformats.schemas.drawingml.x2006.lockedCanvas.LockedCanvasDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.lockedCanvas;


/**
 * A document containing one lockedCanvas(@http://schemas.openxmlformats.org/drawingml/2006/lockedCanvas) element.
 *
 * This is a complex type.
 */
public interface LockedCanvasDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LockedCanvasDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("lockedcanvas3d3adoctype");
    
    /**
     * Gets the "lockedCanvas" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape getLockedCanvas();
    
    /**
     * Sets the "lockedCanvas" element
     */
    void setLockedCanvas(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape lockedCanvas);
    
    /**
     * Appends and returns a new empty "lockedCanvas" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape addNewLockedCanvas();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

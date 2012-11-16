/*
 * An XML document type.
 * Localname: graphic
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.GraphicDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * A document containing one graphic(@http://schemas.openxmlformats.org/drawingml/2006/main) element.
 *
 * This is a complex type.
 */
public interface GraphicDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GraphicDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("graphic6f45doctype");
    
    /**
     * Gets the "graphic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject getGraphic();
    
    /**
     * Sets the "graphic" element
     */
    void setGraphic(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject graphic);
    
    /**
     * Appends and returns a new empty "graphic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject addNewGraphic();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

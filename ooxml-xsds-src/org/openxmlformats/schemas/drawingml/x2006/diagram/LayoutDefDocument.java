/*
 * An XML document type.
 * Localname: layoutDef
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.LayoutDefDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * A document containing one layoutDef(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public interface LayoutDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LayoutDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("layoutdef2354doctype");
    
    /**
     * Gets the "layoutDef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition getLayoutDef();
    
    /**
     * Sets the "layoutDef" element
     */
    void setLayoutDef(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition layoutDef);
    
    /**
     * Appends and returns a new empty "layoutDef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition addNewLayoutDef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

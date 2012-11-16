/*
 * An XML document type.
 * Localname: styleDef
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.StyleDefDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * A document containing one styleDef(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public interface StyleDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StyleDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("styledefb1c9doctype");
    
    /**
     * Gets the "styleDef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition getStyleDef();
    
    /**
     * Sets the "styleDef" element
     */
    void setStyleDef(org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition styleDef);
    
    /**
     * Appends and returns a new empty "styleDef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition addNewStyleDef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

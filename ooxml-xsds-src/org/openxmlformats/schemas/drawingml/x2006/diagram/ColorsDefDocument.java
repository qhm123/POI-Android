/*
 * An XML document type.
 * Localname: colorsDef
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * A document containing one colorsDef(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public interface ColorsDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColorsDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("colorsdefc89adoctype");
    
    /**
     * Gets the "colorsDef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform getColorsDef();
    
    /**
     * Sets the "colorsDef" element
     */
    void setColorsDef(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform colorsDef);
    
    /**
     * Appends and returns a new empty "colorsDef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform addNewColorsDef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML document type.
 * Localname: styleDef
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.StyleDefDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one styleDef(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class StyleDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.StyleDefDocument
{
    
    public StyleDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLEDEF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "styleDef");
    
    
    /**
     * Gets the "styleDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition getStyleDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition)get_store().find_element_user(STYLEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styleDef" element
     */
    public void setStyleDef(org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition styleDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition)get_store().find_element_user(STYLEDEF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition)get_store().add_element_user(STYLEDEF$0);
            }
            target.set(styleDef);
        }
    }
    
    /**
     * Appends and returns a new empty "styleDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition addNewStyleDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinition)get_store().add_element_user(STYLEDEF$0);
            return target;
        }
    }
}

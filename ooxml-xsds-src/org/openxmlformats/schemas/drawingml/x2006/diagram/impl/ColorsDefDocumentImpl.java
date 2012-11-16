/*
 * An XML document type.
 * Localname: colorsDef
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one colorsDef(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class ColorsDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefDocument
{
    
    public ColorsDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLORSDEF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "colorsDef");
    
    
    /**
     * Gets the "colorsDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform getColorsDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform)get_store().find_element_user(COLORSDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "colorsDef" element
     */
    public void setColorsDef(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform colorsDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform)get_store().find_element_user(COLORSDEF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform)get_store().add_element_user(COLORSDEF$0);
            }
            target.set(colorsDef);
        }
    }
    
    /**
     * Appends and returns a new empty "colorsDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform addNewColorsDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform)get_store().add_element_user(COLORSDEF$0);
            return target;
        }
    }
}

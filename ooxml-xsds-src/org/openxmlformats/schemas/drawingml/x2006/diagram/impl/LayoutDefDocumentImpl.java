/*
 * An XML document type.
 * Localname: layoutDef
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.LayoutDefDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one layoutDef(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class LayoutDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.LayoutDefDocument
{
    
    public LayoutDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYOUTDEF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "layoutDef");
    
    
    /**
     * Gets the "layoutDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition getLayoutDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition)get_store().find_element_user(LAYOUTDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "layoutDef" element
     */
    public void setLayoutDef(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition layoutDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition)get_store().find_element_user(LAYOUTDEF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition)get_store().add_element_user(LAYOUTDEF$0);
            }
            target.set(layoutDef);
        }
    }
    
    /**
     * Appends and returns a new empty "layoutDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition addNewLayoutDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition)get_store().add_element_user(LAYOUTDEF$0);
            return target;
        }
    }
}

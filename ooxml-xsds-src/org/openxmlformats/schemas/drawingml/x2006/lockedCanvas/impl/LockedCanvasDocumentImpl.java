/*
 * An XML document type.
 * Localname: lockedCanvas
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/lockedCanvas
 * Java type: org.openxmlformats.schemas.drawingml.x2006.lockedCanvas.LockedCanvasDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.lockedCanvas.impl;
/**
 * A document containing one lockedCanvas(@http://schemas.openxmlformats.org/drawingml/2006/lockedCanvas) element.
 *
 * This is a complex type.
 */
public class LockedCanvasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.lockedCanvas.LockedCanvasDocument
{
    
    public LockedCanvasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCKEDCANVAS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/lockedCanvas", "lockedCanvas");
    
    
    /**
     * Gets the "lockedCanvas" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape getLockedCanvas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape)get_store().find_element_user(LOCKEDCANVAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lockedCanvas" element
     */
    public void setLockedCanvas(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape lockedCanvas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape)get_store().find_element_user(LOCKEDCANVAS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape)get_store().add_element_user(LOCKEDCANVAS$0);
            }
            target.set(lockedCanvas);
        }
    }
    
    /**
     * Appends and returns a new empty "lockedCanvas" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape addNewLockedCanvas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape)get_store().add_element_user(LOCKEDCANVAS$0);
            return target;
        }
    }
}

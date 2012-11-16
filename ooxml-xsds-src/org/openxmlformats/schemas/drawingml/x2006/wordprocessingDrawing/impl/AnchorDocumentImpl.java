/*
 * An XML document type.
 * Localname: anchor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.AnchorDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * A document containing one anchor(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing) element.
 *
 * This is a complex type.
 */
public class AnchorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.AnchorDocument
{
    
    public AnchorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANCHOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "anchor");
    
    
    /**
     * Gets the "anchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor getAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor)get_store().find_element_user(ANCHOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "anchor" element
     */
    public void setAnchor(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor anchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor)get_store().find_element_user(ANCHOR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor)get_store().add_element_user(ANCHOR$0);
            }
            target.set(anchor);
        }
    }
    
    /**
     * Appends and returns a new empty "anchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor addNewAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor)get_store().add_element_user(ANCHOR$0);
            return target;
        }
    }
}

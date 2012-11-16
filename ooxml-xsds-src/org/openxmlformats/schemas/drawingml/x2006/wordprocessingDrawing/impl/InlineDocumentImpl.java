/*
 * An XML document type.
 * Localname: inline
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.InlineDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * A document containing one inline(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing) element.
 *
 * This is a complex type.
 */
public class InlineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.InlineDocument
{
    
    public InlineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INLINE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "inline");
    
    
    /**
     * Gets the "inline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline getInline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline)get_store().find_element_user(INLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inline" element
     */
    public void setInline(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline inline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline)get_store().find_element_user(INLINE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline)get_store().add_element_user(INLINE$0);
            }
            target.set(inline);
        }
    }
    
    /**
     * Appends and returns a new empty "inline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline addNewInline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline)get_store().add_element_user(INLINE$0);
            return target;
        }
    }
}

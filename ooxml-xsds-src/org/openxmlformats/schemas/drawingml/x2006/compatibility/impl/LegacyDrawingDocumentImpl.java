/*
 * An XML document type.
 * Localname: legacyDrawing
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/compatibility
 * Java type: org.openxmlformats.schemas.drawingml.x2006.compatibility.LegacyDrawingDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.compatibility.impl;
/**
 * A document containing one legacyDrawing(@http://schemas.openxmlformats.org/drawingml/2006/compatibility) element.
 *
 * This is a complex type.
 */
public class LegacyDrawingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.compatibility.LegacyDrawingDocument
{
    
    public LegacyDrawingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEGACYDRAWING$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/compatibility", "legacyDrawing");
    
    
    /**
     * Gets the "legacyDrawing" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat getLegacyDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat)get_store().find_element_user(LEGACYDRAWING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "legacyDrawing" element
     */
    public void setLegacyDrawing(org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat legacyDrawing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat)get_store().find_element_user(LEGACYDRAWING$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat)get_store().add_element_user(LEGACYDRAWING$0);
            }
            target.set(legacyDrawing);
        }
    }
    
    /**
     * Appends and returns a new empty "legacyDrawing" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat addNewLegacyDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat)get_store().add_element_user(LEGACYDRAWING$0);
            return target;
        }
    }
}

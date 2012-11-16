/*
 * An XML document type.
 * Localname: wsDr
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.WsDrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;
/**
 * A document containing one wsDr(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing) element.
 *
 * This is a complex type.
 */
public class WsDrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.WsDrDocument
{
    
    public WsDrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WSDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "wsDr");
    
    
    /**
     * Gets the "wsDr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing getWsDr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing)get_store().find_element_user(WSDR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsDr" element
     */
    public void setWsDr(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing wsDr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing)get_store().find_element_user(WSDR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing)get_store().add_element_user(WSDR$0);
            }
            target.set(wsDr);
        }
    }
    
    /**
     * Appends and returns a new empty "wsDr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing addNewWsDr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing)get_store().add_element_user(WSDR$0);
            return target;
        }
    }
}

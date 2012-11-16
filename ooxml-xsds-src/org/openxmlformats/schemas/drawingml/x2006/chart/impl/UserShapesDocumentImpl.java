/*
 * An XML document type.
 * Localname: userShapes
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.UserShapesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * A document containing one userShapes(@http://schemas.openxmlformats.org/drawingml/2006/chart) element.
 *
 * This is a complex type.
 */
public class UserShapesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.UserShapesDocument
{
    
    public UserShapesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERSHAPES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "userShapes");
    
    
    /**
     * Gets the "userShapes" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing getUserShapes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing)get_store().find_element_user(USERSHAPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "userShapes" element
     */
    public void setUserShapes(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing userShapes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing)get_store().find_element_user(USERSHAPES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing)get_store().add_element_user(USERSHAPES$0);
            }
            target.set(userShapes);
        }
    }
    
    /**
     * Appends and returns a new empty "userShapes" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing addNewUserShapes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing)get_store().add_element_user(USERSHAPES$0);
            return target;
        }
    }
}

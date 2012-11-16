/*
 * XML Type:  CT_Marker
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chartDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chartDrawing.impl;
/**
 * An XML CT_Marker(@http://schemas.openxmlformats.org/drawingml/2006/chartDrawing).
 *
 * This is a complex type.
 */
public class CTMarkerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker
{
    
    public CTMarkerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "x");
    private static final javax.xml.namespace.QName Y$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "y");
    
    
    /**
     * Gets the "x" element
     */
    public double getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "x" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate xgetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate)get_store().find_element_user(X$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "x" element
     */
    public void setX(double x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(X$0);
            }
            target.setDoubleValue(x);
        }
    }
    
    /**
     * Sets (as xml) the "x" element
     */
    public void xsetX(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate)get_store().add_element_user(X$0);
            }
            target.set(x);
        }
    }
    
    /**
     * Gets the "y" element
     */
    public double getY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "y" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate xgetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate)get_store().find_element_user(Y$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "y" element
     */
    public void setY(double y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Y$2);
            }
            target.setDoubleValue(y);
        }
    }
    
    /**
     * Sets (as xml) the "y" element
     */
    public void xsetY(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.STMarkerCoordinate)get_store().add_element_user(Y$2);
            }
            target.set(y);
        }
    }
}

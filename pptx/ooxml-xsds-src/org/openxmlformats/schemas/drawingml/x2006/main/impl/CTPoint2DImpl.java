/*
 * XML Type:  CT_Point2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Point2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPoint2DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D
{
    
    public CTPoint2DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("", "x");
    private static final javax.xml.namespace.QName Y$2 = 
        new javax.xml.namespace.QName("", "y");
    
    
    /**
     * Gets the "x" attribute
     */
    public long getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "x" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(X$0);
            return target;
        }
    }
    
    /**
     * Sets the "x" attribute
     */
    public void setX(long x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(X$0);
            }
            target.setLongValue(x);
        }
    }
    
    /**
     * Sets (as xml) the "x" attribute
     */
    public void xsetX(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(X$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(X$0);
            }
            target.set(x);
        }
    }
    
    /**
     * Gets the "y" attribute
     */
    public long getY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Y$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "y" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(Y$2);
            return target;
        }
    }
    
    /**
     * Sets the "y" attribute
     */
    public void setY(long y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Y$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(Y$2);
            }
            target.setLongValue(y);
        }
    }
    
    /**
     * Sets (as xml) the "y" attribute
     */
    public void xsetY(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(Y$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(Y$2);
            }
            target.set(y);
        }
    }
}

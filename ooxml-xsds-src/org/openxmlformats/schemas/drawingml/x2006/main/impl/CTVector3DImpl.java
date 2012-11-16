/*
 * XML Type:  CT_Vector3D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Vector3D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTVector3DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D
{
    
    public CTVector3DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DX$0 = 
        new javax.xml.namespace.QName("", "dx");
    private static final javax.xml.namespace.QName DY$2 = 
        new javax.xml.namespace.QName("", "dy");
    private static final javax.xml.namespace.QName DZ$4 = 
        new javax.xml.namespace.QName("", "dz");
    
    
    /**
     * Gets the "dx" attribute
     */
    public long getDx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DX$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dx" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetDx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(DX$0);
            return target;
        }
    }
    
    /**
     * Sets the "dx" attribute
     */
    public void setDx(long dx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DX$0);
            }
            target.setLongValue(dx);
        }
    }
    
    /**
     * Sets (as xml) the "dx" attribute
     */
    public void xsetDx(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate dx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(DX$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(DX$0);
            }
            target.set(dx);
        }
    }
    
    /**
     * Gets the "dy" attribute
     */
    public long getDy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DY$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dy" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetDy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(DY$2);
            return target;
        }
    }
    
    /**
     * Sets the "dy" attribute
     */
    public void setDy(long dy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DY$2);
            }
            target.setLongValue(dy);
        }
    }
    
    /**
     * Sets (as xml) the "dy" attribute
     */
    public void xsetDy(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate dy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(DY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(DY$2);
            }
            target.set(dy);
        }
    }
    
    /**
     * Gets the "dz" attribute
     */
    public long getDz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DZ$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dz" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetDz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(DZ$4);
            return target;
        }
    }
    
    /**
     * Sets the "dz" attribute
     */
    public void setDz(long dz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DZ$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DZ$4);
            }
            target.setLongValue(dz);
        }
    }
    
    /**
     * Sets (as xml) the "dz" attribute
     */
    public void xsetDz(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate dz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(DZ$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(DZ$4);
            }
            target.set(dz);
        }
    }
}

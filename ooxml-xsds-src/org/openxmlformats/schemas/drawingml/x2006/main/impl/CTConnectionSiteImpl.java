/*
 * XML Type:  CT_ConnectionSite
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ConnectionSite(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTConnectionSiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite
{
    
    public CTConnectionSiteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pos");
    private static final javax.xml.namespace.QName ANG$2 = 
        new javax.xml.namespace.QName("", "ang");
    
    
    /**
     * Gets the "pos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().add_element_user(POS$0);
            }
            target.set(pos);
        }
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().add_element_user(POS$0);
            return target;
        }
    }
    
    /**
     * Gets the "ang" attribute
     */
    public java.lang.Object getAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANG$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "ang" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle xgetAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().find_attribute_user(ANG$2);
            return target;
        }
    }
    
    /**
     * Sets the "ang" attribute
     */
    public void setAng(java.lang.Object ang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANG$2);
            }
            target.setObjectValue(ang);
        }
    }
    
    /**
     * Sets (as xml) the "ang" attribute
     */
    public void xsetAng(org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle ang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().find_attribute_user(ANG$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().add_attribute_user(ANG$2);
            }
            target.set(ang);
        }
    }
}

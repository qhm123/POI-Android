/*
 * XML Type:  CT_LinearShadeProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_LinearShadeProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLinearShadePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties
{
    
    public CTLinearShadePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANG$0 = 
        new javax.xml.namespace.QName("", "ang");
    private static final javax.xml.namespace.QName SCALED$2 = 
        new javax.xml.namespace.QName("", "scaled");
    
    
    /**
     * Gets the "ang" attribute
     */
    public int getAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANG$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ang" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(ANG$0);
            return target;
        }
    }
    
    /**
     * True if has "ang" attribute
     */
    public boolean isSetAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANG$0) != null;
        }
    }
    
    /**
     * Sets the "ang" attribute
     */
    public void setAng(int ang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANG$0);
            }
            target.setIntValue(ang);
        }
    }
    
    /**
     * Sets (as xml) the "ang" attribute
     */
    public void xsetAng(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle ang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(ANG$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(ANG$0);
            }
            target.set(ang);
        }
    }
    
    /**
     * Unsets the "ang" attribute
     */
    public void unsetAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANG$0);
        }
    }
    
    /**
     * Gets the "scaled" attribute
     */
    public boolean getScaled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALED$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "scaled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetScaled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCALED$2);
            return target;
        }
    }
    
    /**
     * True if has "scaled" attribute
     */
    public boolean isSetScaled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALED$2) != null;
        }
    }
    
    /**
     * Sets the "scaled" attribute
     */
    public void setScaled(boolean scaled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALED$2);
            }
            target.setBooleanValue(scaled);
        }
    }
    
    /**
     * Sets (as xml) the "scaled" attribute
     */
    public void xsetScaled(org.apache.xmlbeans.XmlBoolean scaled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCALED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SCALED$2);
            }
            target.set(scaled);
        }
    }
    
    /**
     * Unsets the "scaled" attribute
     */
    public void unsetScaled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALED$2);
        }
    }
}

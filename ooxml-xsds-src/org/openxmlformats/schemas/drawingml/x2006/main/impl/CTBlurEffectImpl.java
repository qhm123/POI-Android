/*
 * XML Type:  CT_BlurEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_BlurEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBlurEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect
{
    
    public CTBlurEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RAD$0 = 
        new javax.xml.namespace.QName("", "rad");
    private static final javax.xml.namespace.QName GROW$2 = 
        new javax.xml.namespace.QName("", "grow");
    
    
    /**
     * Gets the "rad" attribute
     */
    public long getRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RAD$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rad" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(RAD$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "rad" attribute
     */
    public boolean isSetRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RAD$0) != null;
        }
    }
    
    /**
     * Sets the "rad" attribute
     */
    public void setRad(long rad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RAD$0);
            }
            target.setLongValue(rad);
        }
    }
    
    /**
     * Sets (as xml) the "rad" attribute
     */
    public void xsetRad(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate rad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(RAD$0);
            }
            target.set(rad);
        }
    }
    
    /**
     * Unsets the "rad" attribute
     */
    public void unsetRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RAD$0);
        }
    }
    
    /**
     * Gets the "grow" attribute
     */
    public boolean getGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GROW$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "grow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GROW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GROW$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "grow" attribute
     */
    public boolean isSetGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROW$2) != null;
        }
    }
    
    /**
     * Sets the "grow" attribute
     */
    public void setGrow(boolean grow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROW$2);
            }
            target.setBooleanValue(grow);
        }
    }
    
    /**
     * Sets (as xml) the "grow" attribute
     */
    public void xsetGrow(org.apache.xmlbeans.XmlBoolean grow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GROW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GROW$2);
            }
            target.set(grow);
        }
    }
    
    /**
     * Unsets the "grow" attribute
     */
    public void unsetGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROW$2);
        }
    }
}

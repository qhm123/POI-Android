/*
 * XML Type:  CT_LuminanceEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_LuminanceEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLuminanceEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect
{
    
    public CTLuminanceEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRIGHT$0 = 
        new javax.xml.namespace.QName("", "bright");
    private static final javax.xml.namespace.QName CONTRAST$2 = 
        new javax.xml.namespace.QName("", "contrast");
    
    
    /**
     * Gets the "bright" attribute
     */
    public int getBright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRIGHT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BRIGHT$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "bright" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetBright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(BRIGHT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_default_attribute_value(BRIGHT$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "bright" attribute
     */
    public boolean isSetBright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BRIGHT$0) != null;
        }
    }
    
    /**
     * Sets the "bright" attribute
     */
    public void setBright(int bright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRIGHT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BRIGHT$0);
            }
            target.setIntValue(bright);
        }
    }
    
    /**
     * Sets (as xml) the "bright" attribute
     */
    public void xsetBright(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage bright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(BRIGHT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().add_attribute_user(BRIGHT$0);
            }
            target.set(bright);
        }
    }
    
    /**
     * Unsets the "bright" attribute
     */
    public void unsetBright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BRIGHT$0);
        }
    }
    
    /**
     * Gets the "contrast" attribute
     */
    public int getContrast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTRAST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTRAST$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "contrast" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetContrast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(CONTRAST$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_default_attribute_value(CONTRAST$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "contrast" attribute
     */
    public boolean isSetContrast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTRAST$2) != null;
        }
    }
    
    /**
     * Sets the "contrast" attribute
     */
    public void setContrast(int contrast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTRAST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTRAST$2);
            }
            target.setIntValue(contrast);
        }
    }
    
    /**
     * Sets (as xml) the "contrast" attribute
     */
    public void xsetContrast(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage contrast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(CONTRAST$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().add_attribute_user(CONTRAST$2);
            }
            target.set(contrast);
        }
    }
    
    /**
     * Unsets the "contrast" attribute
     */
    public void unsetContrast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTRAST$2);
        }
    }
}

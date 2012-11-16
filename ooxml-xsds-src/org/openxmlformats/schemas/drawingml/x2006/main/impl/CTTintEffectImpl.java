/*
 * XML Type:  CT_TintEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TintEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTintEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect
{
    
    public CTTintEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HUE$0 = 
        new javax.xml.namespace.QName("", "hue");
    private static final javax.xml.namespace.QName AMT$2 = 
        new javax.xml.namespace.QName("", "amt");
    
    
    /**
     * Gets the "hue" attribute
     */
    public int getHue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HUE$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "hue" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetHue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(HUE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_default_attribute_value(HUE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "hue" attribute
     */
    public boolean isSetHue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HUE$0) != null;
        }
    }
    
    /**
     * Sets the "hue" attribute
     */
    public void setHue(int hue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HUE$0);
            }
            target.setIntValue(hue);
        }
    }
    
    /**
     * Sets (as xml) the "hue" attribute
     */
    public void xsetHue(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle hue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(HUE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(HUE$0);
            }
            target.set(hue);
        }
    }
    
    /**
     * Unsets the "hue" attribute
     */
    public void unsetHue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HUE$0);
        }
    }
    
    /**
     * Gets the "amt" attribute
     */
    public int getAmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AMT$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "amt" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetAmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(AMT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_default_attribute_value(AMT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "amt" attribute
     */
    public boolean isSetAmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AMT$2) != null;
        }
    }
    
    /**
     * Sets the "amt" attribute
     */
    public void setAmt(int amt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMT$2);
            }
            target.setIntValue(amt);
        }
    }
    
    /**
     * Sets (as xml) the "amt" attribute
     */
    public void xsetAmt(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage amt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(AMT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().add_attribute_user(AMT$2);
            }
            target.set(amt);
        }
    }
    
    /**
     * Unsets the "amt" attribute
     */
    public void unsetAmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AMT$2);
        }
    }
}

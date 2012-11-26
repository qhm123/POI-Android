/*
 * XML Type:  CT_HSLEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_HSLEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTHSLEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect
{
    
    public CTHSLEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HUE$0 = 
        new javax.xml.namespace.QName("", "hue");
    private static final javax.xml.namespace.QName SAT$2 = 
        new javax.xml.namespace.QName("", "sat");
    private static final javax.xml.namespace.QName LUM$4 = 
        new javax.xml.namespace.QName("", "lum");
    
    
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
     * Gets the "sat" attribute
     */
    public int getSat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAT$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sat" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetSat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(SAT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_default_attribute_value(SAT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "sat" attribute
     */
    public boolean isSetSat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SAT$2) != null;
        }
    }
    
    /**
     * Sets the "sat" attribute
     */
    public void setSat(int sat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAT$2);
            }
            target.setIntValue(sat);
        }
    }
    
    /**
     * Sets (as xml) the "sat" attribute
     */
    public void xsetSat(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage sat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(SAT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().add_attribute_user(SAT$2);
            }
            target.set(sat);
        }
    }
    
    /**
     * Unsets the "sat" attribute
     */
    public void unsetSat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SAT$2);
        }
    }
    
    /**
     * Gets the "lum" attribute
     */
    public int getLum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LUM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LUM$4);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lum" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetLum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(LUM$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_default_attribute_value(LUM$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "lum" attribute
     */
    public boolean isSetLum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LUM$4) != null;
        }
    }
    
    /**
     * Sets the "lum" attribute
     */
    public void setLum(int lum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LUM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LUM$4);
            }
            target.setIntValue(lum);
        }
    }
    
    /**
     * Sets (as xml) the "lum" attribute
     */
    public void xsetLum(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage lum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(LUM$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().add_attribute_user(LUM$4);
            }
            target.set(lum);
        }
    }
    
    /**
     * Unsets the "lum" attribute
     */
    public void unsetLum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LUM$4);
        }
    }
}

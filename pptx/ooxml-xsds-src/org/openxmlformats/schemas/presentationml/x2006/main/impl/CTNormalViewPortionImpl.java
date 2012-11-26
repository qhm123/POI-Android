/*
 * XML Type:  CT_NormalViewPortion
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_NormalViewPortion(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTNormalViewPortionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion
{
    
    public CTNormalViewPortionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SZ$0 = 
        new javax.xml.namespace.QName("", "sz");
    private static final javax.xml.namespace.QName AUTOADJUST$2 = 
        new javax.xml.namespace.QName("", "autoAdjust");
    
    
    /**
     * Gets the "sz" attribute
     */
    public int getSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SZ$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sz" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(SZ$0);
            return target;
        }
    }
    
    /**
     * Sets the "sz" attribute
     */
    public void setSz(int sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SZ$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SZ$0);
            }
            target.setIntValue(sz);
        }
    }
    
    /**
     * Sets (as xml) the "sz" attribute
     */
    public void xsetSz(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(SZ$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(SZ$0);
            }
            target.set(sz);
        }
    }
    
    /**
     * Gets the "autoAdjust" attribute
     */
    public boolean getAutoAdjust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOADJUST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOADJUST$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoAdjust" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoAdjust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOADJUST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOADJUST$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoAdjust" attribute
     */
    public boolean isSetAutoAdjust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOADJUST$2) != null;
        }
    }
    
    /**
     * Sets the "autoAdjust" attribute
     */
    public void setAutoAdjust(boolean autoAdjust)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOADJUST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOADJUST$2);
            }
            target.setBooleanValue(autoAdjust);
        }
    }
    
    /**
     * Sets (as xml) the "autoAdjust" attribute
     */
    public void xsetAutoAdjust(org.apache.xmlbeans.XmlBoolean autoAdjust)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOADJUST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOADJUST$2);
            }
            target.set(autoAdjust);
        }
    }
    
    /**
     * Unsets the "autoAdjust" attribute
     */
    public void unsetAutoAdjust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOADJUST$2);
        }
    }
}

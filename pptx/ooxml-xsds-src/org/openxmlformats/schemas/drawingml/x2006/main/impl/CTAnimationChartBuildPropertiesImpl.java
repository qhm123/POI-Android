/*
 * XML Type:  CT_AnimationChartBuildProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AnimationChartBuildProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAnimationChartBuildPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties
{
    
    public CTAnimationChartBuildPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLD$0 = 
        new javax.xml.namespace.QName("", "bld");
    private static final javax.xml.namespace.QName ANIMBG$2 = 
        new javax.xml.namespace.QName("", "animBg");
    
    
    /**
     * Gets the "bld" attribute
     */
    public java.lang.String getBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLD$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bld" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAnimationChartBuildType xgetBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAnimationChartBuildType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAnimationChartBuildType)get_store().find_attribute_user(BLD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAnimationChartBuildType)get_default_attribute_value(BLD$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "bld" attribute
     */
    public boolean isSetBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLD$0) != null;
        }
    }
    
    /**
     * Sets the "bld" attribute
     */
    public void setBld(java.lang.String bld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLD$0);
            }
            target.setStringValue(bld);
        }
    }
    
    /**
     * Sets (as xml) the "bld" attribute
     */
    public void xsetBld(org.openxmlformats.schemas.drawingml.x2006.main.STAnimationChartBuildType bld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAnimationChartBuildType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAnimationChartBuildType)get_store().find_attribute_user(BLD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAnimationChartBuildType)get_store().add_attribute_user(BLD$0);
            }
            target.set(bld);
        }
    }
    
    /**
     * Unsets the "bld" attribute
     */
    public void unsetBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLD$0);
        }
    }
    
    /**
     * Gets the "animBg" attribute
     */
    public boolean getAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANIMBG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ANIMBG$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "animBg" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ANIMBG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ANIMBG$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "animBg" attribute
     */
    public boolean isSetAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANIMBG$2) != null;
        }
    }
    
    /**
     * Sets the "animBg" attribute
     */
    public void setAnimBg(boolean animBg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANIMBG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANIMBG$2);
            }
            target.setBooleanValue(animBg);
        }
    }
    
    /**
     * Sets (as xml) the "animBg" attribute
     */
    public void xsetAnimBg(org.apache.xmlbeans.XmlBoolean animBg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ANIMBG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ANIMBG$2);
            }
            target.set(animBg);
        }
    }
    
    /**
     * Unsets the "animBg" attribute
     */
    public void unsetAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANIMBG$2);
        }
    }
}

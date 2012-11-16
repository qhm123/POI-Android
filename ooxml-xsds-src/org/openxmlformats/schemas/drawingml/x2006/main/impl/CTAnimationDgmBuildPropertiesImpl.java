/*
 * XML Type:  CT_AnimationDgmBuildProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AnimationDgmBuildProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAnimationDgmBuildPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties
{
    
    public CTAnimationDgmBuildPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLD$0 = 
        new javax.xml.namespace.QName("", "bld");
    private static final javax.xml.namespace.QName REV$2 = 
        new javax.xml.namespace.QName("", "rev");
    
    
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
    public org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmBuildType xgetBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmBuildType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmBuildType)get_store().find_attribute_user(BLD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmBuildType)get_default_attribute_value(BLD$0);
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
    public void xsetBld(org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmBuildType bld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmBuildType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmBuildType)get_store().find_attribute_user(BLD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAnimationDgmBuildType)get_store().add_attribute_user(BLD$0);
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
     * Gets the "rev" attribute
     */
    public boolean getRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REV$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rev" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REV$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REV$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "rev" attribute
     */
    public boolean isSetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REV$2) != null;
        }
    }
    
    /**
     * Sets the "rev" attribute
     */
    public void setRev(boolean rev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REV$2);
            }
            target.setBooleanValue(rev);
        }
    }
    
    /**
     * Sets (as xml) the "rev" attribute
     */
    public void xsetRev(org.apache.xmlbeans.XmlBoolean rev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REV$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REV$2);
            }
            target.set(rev);
        }
    }
    
    /**
     * Unsets the "rev" attribute
     */
    public void unsetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REV$2);
        }
    }
}

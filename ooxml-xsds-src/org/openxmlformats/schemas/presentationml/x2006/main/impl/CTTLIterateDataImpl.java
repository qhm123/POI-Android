/*
 * XML Type:  CT_TLIterateData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLIterateData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLIterateDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData
{
    
    public CTTLIterateDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TMABS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tmAbs");
    private static final javax.xml.namespace.QName TMPCT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tmPct");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName BACKWARDS$6 = 
        new javax.xml.namespace.QName("", "backwards");
    
    
    /**
     * Gets the "tmAbs" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime getTmAbs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime)get_store().find_element_user(TMABS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tmAbs" element
     */
    public boolean isSetTmAbs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TMABS$0) != 0;
        }
    }
    
    /**
     * Sets the "tmAbs" element
     */
    public void setTmAbs(org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime tmAbs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime)get_store().find_element_user(TMABS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime)get_store().add_element_user(TMABS$0);
            }
            target.set(tmAbs);
        }
    }
    
    /**
     * Appends and returns a new empty "tmAbs" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime addNewTmAbs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime)get_store().add_element_user(TMABS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tmAbs" element
     */
    public void unsetTmAbs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TMABS$0, 0);
        }
    }
    
    /**
     * Gets the "tmPct" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage getTmPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage)get_store().find_element_user(TMPCT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tmPct" element
     */
    public boolean isSetTmPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TMPCT$2) != 0;
        }
    }
    
    /**
     * Sets the "tmPct" element
     */
    public void setTmPct(org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage tmPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage)get_store().find_element_user(TMPCT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage)get_store().add_element_user(TMPCT$2);
            }
            target.set(tmPct);
        }
    }
    
    /**
     * Appends and returns a new empty "tmPct" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage addNewTmPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage)get_store().add_element_user(TMPCT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tmPct" element
     */
    public void unsetTmPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TMPCT$2, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STIterateType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STIterateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STIterateType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STIterateType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STIterateType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STIterateType)get_default_attribute_value(TYPE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.presentationml.x2006.main.STIterateType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.presentationml.x2006.main.STIterateType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STIterateType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STIterateType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STIterateType)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$4);
        }
    }
    
    /**
     * Gets the "backwards" attribute
     */
    public boolean getBackwards()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKWARDS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BACKWARDS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "backwards" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBackwards()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKWARDS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BACKWARDS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "backwards" attribute
     */
    public boolean isSetBackwards()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BACKWARDS$6) != null;
        }
    }
    
    /**
     * Sets the "backwards" attribute
     */
    public void setBackwards(boolean backwards)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKWARDS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BACKWARDS$6);
            }
            target.setBooleanValue(backwards);
        }
    }
    
    /**
     * Sets (as xml) the "backwards" attribute
     */
    public void xsetBackwards(org.apache.xmlbeans.XmlBoolean backwards)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKWARDS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BACKWARDS$6);
            }
            target.set(backwards);
        }
    }
    
    /**
     * Unsets the "backwards" attribute
     */
    public void unsetBackwards()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BACKWARDS$6);
        }
    }
}

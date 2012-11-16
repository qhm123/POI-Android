/*
 * XML Type:  CT_TLByAnimateColorTransform
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLByAnimateColorTransform(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLByAnimateColorTransformImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform
{
    
    public CTTLByAnimateColorTransformImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RGB$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "rgb");
    private static final javax.xml.namespace.QName HSL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "hsl");
    
    
    /**
     * Gets the "rgb" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform getRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform)get_store().find_element_user(RGB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rgb" element
     */
    public boolean isSetRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RGB$0) != 0;
        }
    }
    
    /**
     * Sets the "rgb" element
     */
    public void setRgb(org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform rgb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform)get_store().find_element_user(RGB$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform)get_store().add_element_user(RGB$0);
            }
            target.set(rgb);
        }
    }
    
    /**
     * Appends and returns a new empty "rgb" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform addNewRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform)get_store().add_element_user(RGB$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rgb" element
     */
    public void unsetRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RGB$0, 0);
        }
    }
    
    /**
     * Gets the "hsl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform getHsl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform)get_store().find_element_user(HSL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hsl" element
     */
    public boolean isSetHsl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HSL$2) != 0;
        }
    }
    
    /**
     * Sets the "hsl" element
     */
    public void setHsl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform hsl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform)get_store().find_element_user(HSL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform)get_store().add_element_user(HSL$2);
            }
            target.set(hsl);
        }
    }
    
    /**
     * Appends and returns a new empty "hsl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform addNewHsl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform)get_store().add_element_user(HSL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "hsl" element
     */
    public void unsetHsl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HSL$2, 0);
        }
    }
}

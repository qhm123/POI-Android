/*
 * XML Type:  CT_SlideSize
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideSize(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideSizeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize
{
    
    public CTSlideSizeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CX$0 = 
        new javax.xml.namespace.QName("", "cx");
    private static final javax.xml.namespace.QName CY$2 = 
        new javax.xml.namespace.QName("", "cy");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "cx" attribute
     */
    public int getCx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CX$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cx" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate xgetCx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate)get_store().find_attribute_user(CX$0);
            return target;
        }
    }
    
    /**
     * Sets the "cx" attribute
     */
    public void setCx(int cx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CX$0);
            }
            target.setIntValue(cx);
        }
    }
    
    /**
     * Sets (as xml) the "cx" attribute
     */
    public void xsetCx(org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate cx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate)get_store().find_attribute_user(CX$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate)get_store().add_attribute_user(CX$0);
            }
            target.set(cx);
        }
    }
    
    /**
     * Gets the "cy" attribute
     */
    public int getCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CY$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cy" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate xgetCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate)get_store().find_attribute_user(CY$2);
            return target;
        }
    }
    
    /**
     * Sets the "cy" attribute
     */
    public void setCy(int cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CY$2);
            }
            target.setIntValue(cy);
        }
    }
    
    /**
     * Sets (as xml) the "cy" attribute
     */
    public void xsetCy(org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate)get_store().find_attribute_user(CY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate)get_store().add_attribute_user(CY$2);
            }
            target.set(cy);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType.Enum getType()
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
            return (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType)get_default_attribute_value(TYPE$4);
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
    public void setType(org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType.Enum type)
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
    public void xsetType(org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType)get_store().add_attribute_user(TYPE$4);
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
}

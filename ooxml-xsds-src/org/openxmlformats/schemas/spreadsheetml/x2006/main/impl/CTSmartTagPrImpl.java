/*
 * XML Type:  CT_SmartTagPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SmartTagPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSmartTagPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr
{
    
    public CTSmartTagPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMBED$0 = 
        new javax.xml.namespace.QName("", "embed");
    private static final javax.xml.namespace.QName SHOW$2 = 
        new javax.xml.namespace.QName("", "show");
    
    
    /**
     * Gets the "embed" attribute
     */
    public boolean getEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMBED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EMBED$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "embed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EMBED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EMBED$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "embed" attribute
     */
    public boolean isSetEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EMBED$0) != null;
        }
    }
    
    /**
     * Sets the "embed" attribute
     */
    public void setEmbed(boolean embed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMBED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EMBED$0);
            }
            target.setBooleanValue(embed);
        }
    }
    
    /**
     * Sets (as xml) the "embed" attribute
     */
    public void xsetEmbed(org.apache.xmlbeans.XmlBoolean embed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EMBED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EMBED$0);
            }
            target.set(embed);
        }
    }
    
    /**
     * Unsets the "embed" attribute
     */
    public void unsetEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EMBED$0);
        }
    }
    
    /**
     * Gets the "show" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow.Enum getShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOW$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "show" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow xgetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow)get_store().find_attribute_user(SHOW$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow)get_default_attribute_value(SHOW$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "show" attribute
     */
    public boolean isSetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOW$2) != null;
        }
    }
    
    /**
     * Sets the "show" attribute
     */
    public void setShow(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow.Enum show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOW$2);
            }
            target.setEnumValue(show);
        }
    }
    
    /**
     * Sets (as xml) the "show" attribute
     */
    public void xsetShow(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow)get_store().find_attribute_user(SHOW$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow)get_store().add_attribute_user(SHOW$2);
            }
            target.set(show);
        }
    }
    
    /**
     * Unsets the "show" attribute
     */
    public void unsetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOW$2);
        }
    }
}

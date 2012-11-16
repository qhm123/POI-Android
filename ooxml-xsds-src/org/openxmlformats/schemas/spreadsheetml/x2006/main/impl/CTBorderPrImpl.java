/*
 * XML Type:  CT_BorderPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_BorderPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBorderPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr
{
    
    public CTBorderPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");
    private static final javax.xml.namespace.QName STYLE$2 = 
        new javax.xml.namespace.QName("", "style");
    
    
    /**
     * Gets the "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "color" element
     */
    public boolean isSetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLOR$0) != 0;
        }
    }
    
    /**
     * Sets the "color" element
     */
    public void setColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(COLOR$0);
            }
            target.set(color);
        }
    }
    
    /**
     * Appends and returns a new empty "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(COLOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "color" element
     */
    public void unsetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLOR$0, 0);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle.Enum getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STYLE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle)get_default_attribute_value(STYLE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$2) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle.Enum style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$2);
            }
            target.setEnumValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle)get_store().add_attribute_user(STYLE$2);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$2);
        }
    }
}

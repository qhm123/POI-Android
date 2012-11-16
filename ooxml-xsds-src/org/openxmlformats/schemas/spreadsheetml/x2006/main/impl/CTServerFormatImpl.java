/*
 * XML Type:  CT_ServerFormat
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ServerFormat(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTServerFormatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat
{
    
    public CTServerFormatImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CULTURE$0 = 
        new javax.xml.namespace.QName("", "culture");
    private static final javax.xml.namespace.QName FORMAT$2 = 
        new javax.xml.namespace.QName("", "format");
    
    
    /**
     * Gets the "culture" attribute
     */
    public java.lang.String getCulture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CULTURE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "culture" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCulture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CULTURE$0);
            return target;
        }
    }
    
    /**
     * True if has "culture" attribute
     */
    public boolean isSetCulture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CULTURE$0) != null;
        }
    }
    
    /**
     * Sets the "culture" attribute
     */
    public void setCulture(java.lang.String culture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CULTURE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CULTURE$0);
            }
            target.setStringValue(culture);
        }
    }
    
    /**
     * Sets (as xml) the "culture" attribute
     */
    public void xsetCulture(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring culture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CULTURE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CULTURE$0);
            }
            target.set(culture);
        }
    }
    
    /**
     * Unsets the "culture" attribute
     */
    public void unsetCulture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CULTURE$0);
        }
    }
    
    /**
     * Gets the "format" attribute
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "format" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(FORMAT$2);
            return target;
        }
    }
    
    /**
     * True if has "format" attribute
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMAT$2) != null;
        }
    }
    
    /**
     * Sets the "format" attribute
     */
    public void setFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$2);
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "format" attribute
     */
    public void xsetFormat(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(FORMAT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(FORMAT$2);
            }
            target.set(format);
        }
    }
    
    /**
     * Unsets the "format" attribute
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMAT$2);
        }
    }
}

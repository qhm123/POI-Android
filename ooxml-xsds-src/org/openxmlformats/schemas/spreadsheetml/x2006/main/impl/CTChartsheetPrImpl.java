/*
 * XML Type:  CT_ChartsheetPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ChartsheetPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTChartsheetPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr
{
    
    public CTChartsheetPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABCOLOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tabColor");
    private static final javax.xml.namespace.QName PUBLISHED$2 = 
        new javax.xml.namespace.QName("", "published");
    private static final javax.xml.namespace.QName CODENAME$4 = 
        new javax.xml.namespace.QName("", "codeName");
    
    
    /**
     * Gets the "tabColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getTabColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(TABCOLOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tabColor" element
     */
    public boolean isSetTabColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABCOLOR$0) != 0;
        }
    }
    
    /**
     * Sets the "tabColor" element
     */
    public void setTabColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor tabColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(TABCOLOR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(TABCOLOR$0);
            }
            target.set(tabColor);
        }
    }
    
    /**
     * Appends and returns a new empty "tabColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewTabColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(TABCOLOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tabColor" element
     */
    public void unsetTabColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABCOLOR$0, 0);
        }
    }
    
    /**
     * Gets the "published" attribute
     */
    public boolean getPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PUBLISHED$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "published" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PUBLISHED$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "published" attribute
     */
    public boolean isSetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLISHED$2) != null;
        }
    }
    
    /**
     * Sets the "published" attribute
     */
    public void setPublished(boolean published)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHED$2);
            }
            target.setBooleanValue(published);
        }
    }
    
    /**
     * Sets (as xml) the "published" attribute
     */
    public void xsetPublished(org.apache.xmlbeans.XmlBoolean published)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PUBLISHED$2);
            }
            target.set(published);
        }
    }
    
    /**
     * Unsets the "published" attribute
     */
    public void unsetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLISHED$2);
        }
    }
    
    /**
     * Gets the "codeName" attribute
     */
    public java.lang.String getCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODENAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODENAME$4);
            return target;
        }
    }
    
    /**
     * True if has "codeName" attribute
     */
    public boolean isSetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODENAME$4) != null;
        }
    }
    
    /**
     * Sets the "codeName" attribute
     */
    public void setCodeName(java.lang.String codeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODENAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODENAME$4);
            }
            target.setStringValue(codeName);
        }
    }
    
    /**
     * Sets (as xml) the "codeName" attribute
     */
    public void xsetCodeName(org.apache.xmlbeans.XmlString codeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODENAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODENAME$4);
            }
            target.set(codeName);
        }
    }
    
    /**
     * Unsets the "codeName" attribute
     */
    public void unsetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODENAME$4);
        }
    }
}

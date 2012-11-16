/*
 * XML Type:  CT_PageSetUpPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PageSetUpPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPageSetUpPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr
{
    
    public CTPageSetUpPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOPAGEBREAKS$0 = 
        new javax.xml.namespace.QName("", "autoPageBreaks");
    private static final javax.xml.namespace.QName FITTOPAGE$2 = 
        new javax.xml.namespace.QName("", "fitToPage");
    
    
    /**
     * Gets the "autoPageBreaks" attribute
     */
    public boolean getAutoPageBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOPAGEBREAKS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOPAGEBREAKS$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoPageBreaks" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoPageBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOPAGEBREAKS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOPAGEBREAKS$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoPageBreaks" attribute
     */
    public boolean isSetAutoPageBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOPAGEBREAKS$0) != null;
        }
    }
    
    /**
     * Sets the "autoPageBreaks" attribute
     */
    public void setAutoPageBreaks(boolean autoPageBreaks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOPAGEBREAKS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOPAGEBREAKS$0);
            }
            target.setBooleanValue(autoPageBreaks);
        }
    }
    
    /**
     * Sets (as xml) the "autoPageBreaks" attribute
     */
    public void xsetAutoPageBreaks(org.apache.xmlbeans.XmlBoolean autoPageBreaks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOPAGEBREAKS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOPAGEBREAKS$0);
            }
            target.set(autoPageBreaks);
        }
    }
    
    /**
     * Unsets the "autoPageBreaks" attribute
     */
    public void unsetAutoPageBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOPAGEBREAKS$0);
        }
    }
    
    /**
     * Gets the "fitToPage" attribute
     */
    public boolean getFitToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTOPAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FITTOPAGE$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fitToPage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFitToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FITTOPAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FITTOPAGE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "fitToPage" attribute
     */
    public boolean isSetFitToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FITTOPAGE$2) != null;
        }
    }
    
    /**
     * Sets the "fitToPage" attribute
     */
    public void setFitToPage(boolean fitToPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTOPAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FITTOPAGE$2);
            }
            target.setBooleanValue(fitToPage);
        }
    }
    
    /**
     * Sets (as xml) the "fitToPage" attribute
     */
    public void xsetFitToPage(org.apache.xmlbeans.XmlBoolean fitToPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FITTOPAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FITTOPAGE$2);
            }
            target.set(fitToPage);
        }
    }
    
    /**
     * Unsets the "fitToPage" attribute
     */
    public void unsetFitToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FITTOPAGE$2);
        }
    }
}

/*
 * XML Type:  CT_Consolidation
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Consolidation(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTConsolidationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation
{
    
    public CTConsolidationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pages");
    private static final javax.xml.namespace.QName RANGESETS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rangeSets");
    private static final javax.xml.namespace.QName AUTOPAGE$4 = 
        new javax.xml.namespace.QName("", "autoPage");
    
    
    /**
     * Gets the "pages" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages getPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages)get_store().find_element_user(PAGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pages" element
     */
    public boolean isSetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGES$0) != 0;
        }
    }
    
    /**
     * Sets the "pages" element
     */
    public void setPages(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages)get_store().find_element_user(PAGES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages)get_store().add_element_user(PAGES$0);
            }
            target.set(pages);
        }
    }
    
    /**
     * Appends and returns a new empty "pages" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages addNewPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages)get_store().add_element_user(PAGES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "pages" element
     */
    public void unsetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGES$0, 0);
        }
    }
    
    /**
     * Gets the "rangeSets" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets getRangeSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets)get_store().find_element_user(RANGESETS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeSets" element
     */
    public void setRangeSets(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets rangeSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets)get_store().find_element_user(RANGESETS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets)get_store().add_element_user(RANGESETS$2);
            }
            target.set(rangeSets);
        }
    }
    
    /**
     * Appends and returns a new empty "rangeSets" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets addNewRangeSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets)get_store().add_element_user(RANGESETS$2);
            return target;
        }
    }
    
    /**
     * Gets the "autoPage" attribute
     */
    public boolean getAutoPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOPAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOPAGE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoPage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOPAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOPAGE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoPage" attribute
     */
    public boolean isSetAutoPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOPAGE$4) != null;
        }
    }
    
    /**
     * Sets the "autoPage" attribute
     */
    public void setAutoPage(boolean autoPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOPAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOPAGE$4);
            }
            target.setBooleanValue(autoPage);
        }
    }
    
    /**
     * Sets (as xml) the "autoPage" attribute
     */
    public void xsetAutoPage(org.apache.xmlbeans.XmlBoolean autoPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOPAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOPAGE$4);
            }
            target.set(autoPage);
        }
    }
    
    /**
     * Unsets the "autoPage" attribute
     */
    public void unsetAutoPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOPAGE$4);
        }
    }
}

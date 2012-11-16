/*
 * XML Type:  CT_FilterColumn
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_FilterColumn(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFilterColumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn
{
    
    public CTFilterColumnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "filters");
    private static final javax.xml.namespace.QName TOP10$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "top10");
    private static final javax.xml.namespace.QName CUSTOMFILTERS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customFilters");
    private static final javax.xml.namespace.QName DYNAMICFILTER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dynamicFilter");
    private static final javax.xml.namespace.QName COLORFILTER$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colorFilter");
    private static final javax.xml.namespace.QName ICONFILTER$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "iconFilter");
    private static final javax.xml.namespace.QName EXTLST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName COLID$14 = 
        new javax.xml.namespace.QName("", "colId");
    private static final javax.xml.namespace.QName HIDDENBUTTON$16 = 
        new javax.xml.namespace.QName("", "hiddenButton");
    private static final javax.xml.namespace.QName SHOWBUTTON$18 = 
        new javax.xml.namespace.QName("", "showButton");
    
    
    /**
     * Gets the "filters" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters getFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters)get_store().find_element_user(FILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filters" element
     */
    public boolean isSetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERS$0) != 0;
        }
    }
    
    /**
     * Sets the "filters" element
     */
    public void setFilters(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters filters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters)get_store().find_element_user(FILTERS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters)get_store().add_element_user(FILTERS$0);
            }
            target.set(filters);
        }
    }
    
    /**
     * Appends and returns a new empty "filters" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters addNewFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters)get_store().add_element_user(FILTERS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "filters" element
     */
    public void unsetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERS$0, 0);
        }
    }
    
    /**
     * Gets the "top10" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 getTop10()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10)get_store().find_element_user(TOP10$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "top10" element
     */
    public boolean isSetTop10()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOP10$2) != 0;
        }
    }
    
    /**
     * Sets the "top10" element
     */
    public void setTop10(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 top10)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10)get_store().find_element_user(TOP10$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10)get_store().add_element_user(TOP10$2);
            }
            target.set(top10);
        }
    }
    
    /**
     * Appends and returns a new empty "top10" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 addNewTop10()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10 target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10)get_store().add_element_user(TOP10$2);
            return target;
        }
    }
    
    /**
     * Unsets the "top10" element
     */
    public void unsetTop10()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOP10$2, 0);
        }
    }
    
    /**
     * Gets the "customFilters" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters getCustomFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters)get_store().find_element_user(CUSTOMFILTERS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customFilters" element
     */
    public boolean isSetCustomFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMFILTERS$4) != 0;
        }
    }
    
    /**
     * Sets the "customFilters" element
     */
    public void setCustomFilters(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters customFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters)get_store().find_element_user(CUSTOMFILTERS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters)get_store().add_element_user(CUSTOMFILTERS$4);
            }
            target.set(customFilters);
        }
    }
    
    /**
     * Appends and returns a new empty "customFilters" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters addNewCustomFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters)get_store().add_element_user(CUSTOMFILTERS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "customFilters" element
     */
    public void unsetCustomFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMFILTERS$4, 0);
        }
    }
    
    /**
     * Gets the "dynamicFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter getDynamicFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter)get_store().find_element_user(DYNAMICFILTER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dynamicFilter" element
     */
    public boolean isSetDynamicFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DYNAMICFILTER$6) != 0;
        }
    }
    
    /**
     * Sets the "dynamicFilter" element
     */
    public void setDynamicFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter dynamicFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter)get_store().find_element_user(DYNAMICFILTER$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter)get_store().add_element_user(DYNAMICFILTER$6);
            }
            target.set(dynamicFilter);
        }
    }
    
    /**
     * Appends and returns a new empty "dynamicFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter addNewDynamicFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter)get_store().add_element_user(DYNAMICFILTER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "dynamicFilter" element
     */
    public void unsetDynamicFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DYNAMICFILTER$6, 0);
        }
    }
    
    /**
     * Gets the "colorFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter getColorFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter)get_store().find_element_user(COLORFILTER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colorFilter" element
     */
    public boolean isSetColorFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLORFILTER$8) != 0;
        }
    }
    
    /**
     * Sets the "colorFilter" element
     */
    public void setColorFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter colorFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter)get_store().find_element_user(COLORFILTER$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter)get_store().add_element_user(COLORFILTER$8);
            }
            target.set(colorFilter);
        }
    }
    
    /**
     * Appends and returns a new empty "colorFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter addNewColorFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter)get_store().add_element_user(COLORFILTER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "colorFilter" element
     */
    public void unsetColorFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLORFILTER$8, 0);
        }
    }
    
    /**
     * Gets the "iconFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter getIconFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter)get_store().find_element_user(ICONFILTER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "iconFilter" element
     */
    public boolean isSetIconFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICONFILTER$10) != 0;
        }
    }
    
    /**
     * Sets the "iconFilter" element
     */
    public void setIconFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter iconFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter)get_store().find_element_user(ICONFILTER$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter)get_store().add_element_user(ICONFILTER$10);
            }
            target.set(iconFilter);
        }
    }
    
    /**
     * Appends and returns a new empty "iconFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter addNewIconFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter)get_store().add_element_user(ICONFILTER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "iconFilter" element
     */
    public void unsetIconFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICONFILTER$10, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$12) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$12);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$12, 0);
        }
    }
    
    /**
     * Gets the "colId" attribute
     */
    public long getColId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLID$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "colId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetColId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLID$14);
            return target;
        }
    }
    
    /**
     * Sets the "colId" attribute
     */
    public void setColId(long colId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLID$14);
            }
            target.setLongValue(colId);
        }
    }
    
    /**
     * Sets (as xml) the "colId" attribute
     */
    public void xsetColId(org.apache.xmlbeans.XmlUnsignedInt colId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COLID$14);
            }
            target.set(colId);
        }
    }
    
    /**
     * Gets the "hiddenButton" attribute
     */
    public boolean getHiddenButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENBUTTON$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDENBUTTON$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hiddenButton" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHiddenButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENBUTTON$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDENBUTTON$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "hiddenButton" attribute
     */
    public boolean isSetHiddenButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDENBUTTON$16) != null;
        }
    }
    
    /**
     * Sets the "hiddenButton" attribute
     */
    public void setHiddenButton(boolean hiddenButton)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENBUTTON$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDENBUTTON$16);
            }
            target.setBooleanValue(hiddenButton);
        }
    }
    
    /**
     * Sets (as xml) the "hiddenButton" attribute
     */
    public void xsetHiddenButton(org.apache.xmlbeans.XmlBoolean hiddenButton)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENBUTTON$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDENBUTTON$16);
            }
            target.set(hiddenButton);
        }
    }
    
    /**
     * Unsets the "hiddenButton" attribute
     */
    public void unsetHiddenButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDENBUTTON$16);
        }
    }
    
    /**
     * Gets the "showButton" attribute
     */
    public boolean getShowButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWBUTTON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWBUTTON$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showButton" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWBUTTON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWBUTTON$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "showButton" attribute
     */
    public boolean isSetShowButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWBUTTON$18) != null;
        }
    }
    
    /**
     * Sets the "showButton" attribute
     */
    public void setShowButton(boolean showButton)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWBUTTON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWBUTTON$18);
            }
            target.setBooleanValue(showButton);
        }
    }
    
    /**
     * Sets (as xml) the "showButton" attribute
     */
    public void xsetShowButton(org.apache.xmlbeans.XmlBoolean showButton)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWBUTTON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWBUTTON$18);
            }
            target.set(showButton);
        }
    }
    
    /**
     * Unsets the "showButton" attribute
     */
    public void unsetShowButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWBUTTON$18);
        }
    }
}

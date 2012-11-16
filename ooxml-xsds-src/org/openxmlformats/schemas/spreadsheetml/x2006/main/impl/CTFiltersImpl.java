/*
 * XML Type:  CT_Filters
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Filters(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFiltersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilters
{
    
    public CTFiltersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "filter");
    private static final javax.xml.namespace.QName DATEGROUPITEM$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dateGroupItem");
    private static final javax.xml.namespace.QName BLANK$4 = 
        new javax.xml.namespace.QName("", "blank");
    private static final javax.xml.namespace.QName CALENDARTYPE$6 = 
        new javax.xml.namespace.QName("", "calendarType");
    
    
    /**
     * Gets a List of "filter" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter> getFilterList()
    {
        final class FilterList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter get(int i)
                { return CTFiltersImpl.this.getFilterArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter old = CTFiltersImpl.this.getFilterArray(i);
                CTFiltersImpl.this.setFilterArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter o)
                { CTFiltersImpl.this.insertNewFilter(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter old = CTFiltersImpl.this.getFilterArray(i);
                CTFiltersImpl.this.removeFilter(i);
                return old;
            }
            
            public int size()
                { return CTFiltersImpl.this.sizeOfFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterList();
        }
    }
    
    /**
     * Gets array of all "filter" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$0);
        }
    }
    
    /**
     * Sets array of all "filter" element
     */
    public void setFilterArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter[] filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$0);
        }
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter)get_store().insert_element_user(FILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter)get_store().add_element_user(FILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$0, i);
        }
    }
    
    /**
     * Gets a List of "dateGroupItem" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem> getDateGroupItemList()
    {
        final class DateGroupItemList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem get(int i)
                { return CTFiltersImpl.this.getDateGroupItemArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem old = CTFiltersImpl.this.getDateGroupItemArray(i);
                CTFiltersImpl.this.setDateGroupItemArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem o)
                { CTFiltersImpl.this.insertNewDateGroupItem(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem old = CTFiltersImpl.this.getDateGroupItemArray(i);
                CTFiltersImpl.this.removeDateGroupItem(i);
                return old;
            }
            
            public int size()
                { return CTFiltersImpl.this.sizeOfDateGroupItemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DateGroupItemList();
        }
    }
    
    /**
     * Gets array of all "dateGroupItem" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem[] getDateGroupItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATEGROUPITEM$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dateGroupItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem getDateGroupItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem)get_store().find_element_user(DATEGROUPITEM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dateGroupItem" element
     */
    public int sizeOfDateGroupItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEGROUPITEM$2);
        }
    }
    
    /**
     * Sets array of all "dateGroupItem" element
     */
    public void setDateGroupItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem[] dateGroupItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateGroupItemArray, DATEGROUPITEM$2);
        }
    }
    
    /**
     * Sets ith "dateGroupItem" element
     */
    public void setDateGroupItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem dateGroupItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem)get_store().find_element_user(DATEGROUPITEM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateGroupItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateGroupItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem insertNewDateGroupItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem)get_store().insert_element_user(DATEGROUPITEM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateGroupItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem addNewDateGroupItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem)get_store().add_element_user(DATEGROUPITEM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "dateGroupItem" element
     */
    public void removeDateGroupItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEGROUPITEM$2, i);
        }
    }
    
    /**
     * Gets the "blank" attribute
     */
    public boolean getBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLANK$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLANK$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "blank" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLANK$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BLANK$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "blank" attribute
     */
    public boolean isSetBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLANK$4) != null;
        }
    }
    
    /**
     * Sets the "blank" attribute
     */
    public void setBlank(boolean blank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLANK$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLANK$4);
            }
            target.setBooleanValue(blank);
        }
    }
    
    /**
     * Sets (as xml) the "blank" attribute
     */
    public void xsetBlank(org.apache.xmlbeans.XmlBoolean blank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLANK$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BLANK$4);
            }
            target.set(blank);
        }
    }
    
    /**
     * Unsets the "blank" attribute
     */
    public void unsetBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLANK$4);
        }
    }
    
    /**
     * Gets the "calendarType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType.Enum getCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALENDARTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CALENDARTYPE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "calendarType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType xgetCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType)get_store().find_attribute_user(CALENDARTYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType)get_default_attribute_value(CALENDARTYPE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "calendarType" attribute
     */
    public boolean isSetCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALENDARTYPE$6) != null;
        }
    }
    
    /**
     * Sets the "calendarType" attribute
     */
    public void setCalendarType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType.Enum calendarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALENDARTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALENDARTYPE$6);
            }
            target.setEnumValue(calendarType);
        }
    }
    
    /**
     * Sets (as xml) the "calendarType" attribute
     */
    public void xsetCalendarType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType calendarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType)get_store().find_attribute_user(CALENDARTYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalendarType)get_store().add_attribute_user(CALENDARTYPE$6);
            }
            target.set(calendarType);
        }
    }
    
    /**
     * Unsets the "calendarType" attribute
     */
    public void unsetCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALENDARTYPE$6);
        }
    }
}

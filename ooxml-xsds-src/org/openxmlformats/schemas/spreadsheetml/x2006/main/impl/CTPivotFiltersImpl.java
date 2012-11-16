/*
 * XML Type:  CT_PivotFilters
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotFilters(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotFiltersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters
{
    
    public CTPivotFiltersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "filter");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "filter" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter> getFilterList()
    {
        final class FilterList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter get(int i)
                { return CTPivotFiltersImpl.this.getFilterArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter old = CTPivotFiltersImpl.this.getFilterArray(i);
                CTPivotFiltersImpl.this.setFilterArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter o)
                { CTPivotFiltersImpl.this.insertNewFilter(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter old = CTPivotFiltersImpl.this.getFilterArray(i);
                CTPivotFiltersImpl.this.removeFilter(i);
                return old;
            }
            
            public int size()
                { return CTPivotFiltersImpl.this.sizeOfFilterArray(); }
            
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter)get_store().find_element_user(FILTER$0, i);
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
    public void setFilterArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter[] filterArray)
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
    public void setFilterArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter)get_store().find_element_user(FILTER$0, i);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter)get_store().insert_element_user(FILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter)get_store().add_element_user(FILTER$0);
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
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNT$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COUNT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$2) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$2);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$2);
        }
    }
}

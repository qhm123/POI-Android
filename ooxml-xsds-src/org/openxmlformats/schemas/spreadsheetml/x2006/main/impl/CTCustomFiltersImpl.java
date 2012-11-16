/*
 * XML Type:  CT_CustomFilters
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CustomFilters(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomFiltersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilters
{
    
    public CTCustomFiltersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMFILTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customFilter");
    private static final javax.xml.namespace.QName AND$2 = 
        new javax.xml.namespace.QName("", "and");
    
    
    /**
     * Gets a List of "customFilter" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter> getCustomFilterList()
    {
        final class CustomFilterList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter get(int i)
                { return CTCustomFiltersImpl.this.getCustomFilterArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter old = CTCustomFiltersImpl.this.getCustomFilterArray(i);
                CTCustomFiltersImpl.this.setCustomFilterArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter o)
                { CTCustomFiltersImpl.this.insertNewCustomFilter(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter old = CTCustomFiltersImpl.this.getCustomFilterArray(i);
                CTCustomFiltersImpl.this.removeCustomFilter(i);
                return old;
            }
            
            public int size()
                { return CTCustomFiltersImpl.this.sizeOfCustomFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomFilterList();
        }
    }
    
    /**
     * Gets array of all "customFilter" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter[] getCustomFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMFILTER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter getCustomFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter)get_store().find_element_user(CUSTOMFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customFilter" element
     */
    public int sizeOfCustomFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMFILTER$0);
        }
    }
    
    /**
     * Sets array of all "customFilter" element
     */
    public void setCustomFilterArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter[] customFilterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customFilterArray, CUSTOMFILTER$0);
        }
    }
    
    /**
     * Sets ith "customFilter" element
     */
    public void setCustomFilterArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter customFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter)get_store().find_element_user(CUSTOMFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customFilter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter insertNewCustomFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter)get_store().insert_element_user(CUSTOMFILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter addNewCustomFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter)get_store().add_element_user(CUSTOMFILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "customFilter" element
     */
    public void removeCustomFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMFILTER$0, i);
        }
    }
    
    /**
     * Gets the "and" attribute
     */
    public boolean getAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AND$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "and" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AND$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "and" attribute
     */
    public boolean isSetAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AND$2) != null;
        }
    }
    
    /**
     * Sets the "and" attribute
     */
    public void setAnd(boolean and)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AND$2);
            }
            target.setBooleanValue(and);
        }
    }
    
    /**
     * Sets (as xml) the "and" attribute
     */
    public void xsetAnd(org.apache.xmlbeans.XmlBoolean and)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AND$2);
            }
            target.set(and);
        }
    }
    
    /**
     * Unsets the "and" attribute
     */
    public void unsetAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AND$2);
        }
    }
}

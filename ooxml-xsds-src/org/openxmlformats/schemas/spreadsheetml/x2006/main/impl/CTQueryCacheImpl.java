/*
 * XML Type:  CT_QueryCache
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_QueryCache(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTQueryCacheImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache
{
    
    public CTQueryCacheImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "query");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "query" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery> getQueryList()
    {
        final class QueryList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery get(int i)
                { return CTQueryCacheImpl.this.getQueryArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery old = CTQueryCacheImpl.this.getQueryArray(i);
                CTQueryCacheImpl.this.setQueryArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery o)
                { CTQueryCacheImpl.this.insertNewQuery(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery old = CTQueryCacheImpl.this.getQueryArray(i);
                CTQueryCacheImpl.this.removeQuery(i);
                return old;
            }
            
            public int size()
                { return CTQueryCacheImpl.this.sizeOfQueryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new QueryList();
        }
    }
    
    /**
     * Gets array of all "query" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery[] getQueryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERY$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "query" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery getQueryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery)get_store().find_element_user(QUERY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "query" element
     */
    public int sizeOfQueryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERY$0);
        }
    }
    
    /**
     * Sets array of all "query" element
     */
    public void setQueryArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery[] queryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queryArray, QUERY$0);
        }
    }
    
    /**
     * Sets ith "query" element
     */
    public void setQueryArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery)get_store().find_element_user(QUERY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(query);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "query" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery insertNewQuery(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery)get_store().insert_element_user(QUERY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "query" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "query" element
     */
    public void removeQuery(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERY$0, i);
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

/*
 * XML Type:  CT_CacheHierarchies
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CacheHierarchies(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCacheHierarchiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies
{
    
    public CTCacheHierarchiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CACHEHIERARCHY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheHierarchy");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "cacheHierarchy" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy> getCacheHierarchyList()
    {
        final class CacheHierarchyList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy get(int i)
                { return CTCacheHierarchiesImpl.this.getCacheHierarchyArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy old = CTCacheHierarchiesImpl.this.getCacheHierarchyArray(i);
                CTCacheHierarchiesImpl.this.setCacheHierarchyArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy o)
                { CTCacheHierarchiesImpl.this.insertNewCacheHierarchy(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy old = CTCacheHierarchiesImpl.this.getCacheHierarchyArray(i);
                CTCacheHierarchiesImpl.this.removeCacheHierarchy(i);
                return old;
            }
            
            public int size()
                { return CTCacheHierarchiesImpl.this.sizeOfCacheHierarchyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CacheHierarchyList();
        }
    }
    
    /**
     * Gets array of all "cacheHierarchy" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy[] getCacheHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CACHEHIERARCHY$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cacheHierarchy" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy getCacheHierarchyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy)get_store().find_element_user(CACHEHIERARCHY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cacheHierarchy" element
     */
    public int sizeOfCacheHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CACHEHIERARCHY$0);
        }
    }
    
    /**
     * Sets array of all "cacheHierarchy" element
     */
    public void setCacheHierarchyArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy[] cacheHierarchyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cacheHierarchyArray, CACHEHIERARCHY$0);
        }
    }
    
    /**
     * Sets ith "cacheHierarchy" element
     */
    public void setCacheHierarchyArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy cacheHierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy)get_store().find_element_user(CACHEHIERARCHY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cacheHierarchy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cacheHierarchy" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy insertNewCacheHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy)get_store().insert_element_user(CACHEHIERARCHY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cacheHierarchy" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy addNewCacheHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy)get_store().add_element_user(CACHEHIERARCHY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cacheHierarchy" element
     */
    public void removeCacheHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CACHEHIERARCHY$0, i);
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

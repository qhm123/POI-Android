/*
 * XML Type:  CT_PivotCaches
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotCaches(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotCachesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches
{
    
    public CTPivotCachesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTCACHE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotCache");
    
    
    /**
     * Gets a List of "pivotCache" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache> getPivotCacheList()
    {
        final class PivotCacheList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache get(int i)
                { return CTPivotCachesImpl.this.getPivotCacheArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache old = CTPivotCachesImpl.this.getPivotCacheArray(i);
                CTPivotCachesImpl.this.setPivotCacheArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache o)
                { CTPivotCachesImpl.this.insertNewPivotCache(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache old = CTPivotCachesImpl.this.getPivotCacheArray(i);
                CTPivotCachesImpl.this.removePivotCache(i);
                return old;
            }
            
            public int size()
                { return CTPivotCachesImpl.this.sizeOfPivotCacheArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PivotCacheList();
        }
    }
    
    /**
     * Gets array of all "pivotCache" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache[] getPivotCacheArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIVOTCACHE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pivotCache" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache getPivotCacheArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache)get_store().find_element_user(PIVOTCACHE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pivotCache" element
     */
    public int sizeOfPivotCacheArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTCACHE$0);
        }
    }
    
    /**
     * Sets array of all "pivotCache" element
     */
    public void setPivotCacheArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache[] pivotCacheArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pivotCacheArray, PIVOTCACHE$0);
        }
    }
    
    /**
     * Sets ith "pivotCache" element
     */
    public void setPivotCacheArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache pivotCache)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache)get_store().find_element_user(PIVOTCACHE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pivotCache);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotCache" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache insertNewPivotCache(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache)get_store().insert_element_user(PIVOTCACHE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotCache" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache addNewPivotCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache)get_store().add_element_user(PIVOTCACHE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pivotCache" element
     */
    public void removePivotCache(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTCACHE$0, i);
        }
    }
}

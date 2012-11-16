/*
 * XML Type:  CT_CacheFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CacheFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCacheFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields
{
    
    public CTCacheFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CACHEFIELD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheField");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "cacheField" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField> getCacheFieldList()
    {
        final class CacheFieldList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField get(int i)
                { return CTCacheFieldsImpl.this.getCacheFieldArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField old = CTCacheFieldsImpl.this.getCacheFieldArray(i);
                CTCacheFieldsImpl.this.setCacheFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField o)
                { CTCacheFieldsImpl.this.insertNewCacheField(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField old = CTCacheFieldsImpl.this.getCacheFieldArray(i);
                CTCacheFieldsImpl.this.removeCacheField(i);
                return old;
            }
            
            public int size()
                { return CTCacheFieldsImpl.this.sizeOfCacheFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CacheFieldList();
        }
    }
    
    /**
     * Gets array of all "cacheField" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField[] getCacheFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CACHEFIELD$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cacheField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField getCacheFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField)get_store().find_element_user(CACHEFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cacheField" element
     */
    public int sizeOfCacheFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CACHEFIELD$0);
        }
    }
    
    /**
     * Sets array of all "cacheField" element
     */
    public void setCacheFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField[] cacheFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cacheFieldArray, CACHEFIELD$0);
        }
    }
    
    /**
     * Sets ith "cacheField" element
     */
    public void setCacheFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField cacheField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField)get_store().find_element_user(CACHEFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cacheField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cacheField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField insertNewCacheField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField)get_store().insert_element_user(CACHEFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cacheField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField addNewCacheField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField)get_store().add_element_user(CACHEFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cacheField" element
     */
    public void removeCacheField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CACHEFIELD$0, i);
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

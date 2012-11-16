/*
 * XML Type:  CT_DataRefs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DataRefs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDataRefsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs
{
    
    public CTDataRefsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAREF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataRef");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "dataRef" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef> getDataRefList()
    {
        final class DataRefList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef get(int i)
                { return CTDataRefsImpl.this.getDataRefArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef old = CTDataRefsImpl.this.getDataRefArray(i);
                CTDataRefsImpl.this.setDataRefArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef o)
                { CTDataRefsImpl.this.insertNewDataRef(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef old = CTDataRefsImpl.this.getDataRefArray(i);
                CTDataRefsImpl.this.removeDataRef(i);
                return old;
            }
            
            public int size()
                { return CTDataRefsImpl.this.sizeOfDataRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DataRefList();
        }
    }
    
    /**
     * Gets array of all "dataRef" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef[] getDataRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAREF$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataRef" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef getDataRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef)get_store().find_element_user(DATAREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataRef" element
     */
    public int sizeOfDataRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAREF$0);
        }
    }
    
    /**
     * Sets array of all "dataRef" element
     */
    public void setDataRefArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef[] dataRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataRefArray, DATAREF$0);
        }
    }
    
    /**
     * Sets ith "dataRef" element
     */
    public void setDataRefArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef dataRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef)get_store().find_element_user(DATAREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataRef" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef insertNewDataRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef)get_store().insert_element_user(DATAREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataRef" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef addNewDataRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef)get_store().add_element_user(DATAREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataRef" element
     */
    public void removeDataRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAREF$0, i);
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

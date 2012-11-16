/*
 * XML Type:  CT_Sets
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Sets(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets
{
    
    public CTSetsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "set");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "set" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet> getSetList()
    {
        final class SetList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet get(int i)
                { return CTSetsImpl.this.getSetArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet old = CTSetsImpl.this.getSetArray(i);
                CTSetsImpl.this.setSetArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet o)
                { CTSetsImpl.this.insertNewSet(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet old = CTSetsImpl.this.getSetArray(i);
                CTSetsImpl.this.removeSet(i);
                return old;
            }
            
            public int size()
                { return CTSetsImpl.this.sizeOfSetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SetList();
        }
    }
    
    /**
     * Gets array of all "set" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet[] getSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SET$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "set" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet getSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet)get_store().find_element_user(SET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "set" element
     */
    public int sizeOfSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SET$0);
        }
    }
    
    /**
     * Sets array of all "set" element
     */
    public void setSetArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet[] setArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(setArray, SET$0);
        }
    }
    
    /**
     * Sets ith "set" element
     */
    public void setSetArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet)get_store().find_element_user(SET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(set);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "set" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet insertNewSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet)get_store().insert_element_user(SET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "set" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet addNewSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet)get_store().add_element_user(SET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "set" element
     */
    public void removeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SET$0, i);
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

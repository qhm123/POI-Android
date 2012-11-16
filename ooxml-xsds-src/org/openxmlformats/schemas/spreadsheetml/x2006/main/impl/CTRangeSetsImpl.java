/*
 * XML Type:  CT_RangeSets
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RangeSets(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRangeSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets
{
    
    public CTRangeSetsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGESET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rangeSet");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "rangeSet" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet> getRangeSetList()
    {
        final class RangeSetList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet get(int i)
                { return CTRangeSetsImpl.this.getRangeSetArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet old = CTRangeSetsImpl.this.getRangeSetArray(i);
                CTRangeSetsImpl.this.setRangeSetArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet o)
                { CTRangeSetsImpl.this.insertNewRangeSet(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet old = CTRangeSetsImpl.this.getRangeSetArray(i);
                CTRangeSetsImpl.this.removeRangeSet(i);
                return old;
            }
            
            public int size()
                { return CTRangeSetsImpl.this.sizeOfRangeSetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RangeSetList();
        }
    }
    
    /**
     * Gets array of all "rangeSet" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet[] getRangeSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RANGESET$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rangeSet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet getRangeSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet)get_store().find_element_user(RANGESET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rangeSet" element
     */
    public int sizeOfRangeSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANGESET$0);
        }
    }
    
    /**
     * Sets array of all "rangeSet" element
     */
    public void setRangeSetArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet[] rangeSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rangeSetArray, RANGESET$0);
        }
    }
    
    /**
     * Sets ith "rangeSet" element
     */
    public void setRangeSetArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet rangeSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet)get_store().find_element_user(RANGESET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rangeSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rangeSet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet insertNewRangeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet)get_store().insert_element_user(RANGESET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rangeSet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet addNewRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet)get_store().add_element_user(RANGESET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rangeSet" element
     */
    public void removeRangeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANGESET$0, i);
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

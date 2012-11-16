/*
 * XML Type:  CT_MeasureGroups
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MeasureGroups(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMeasureGroupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups
{
    
    public CTMeasureGroupsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREGROUP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "measureGroup");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "measureGroup" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup> getMeasureGroupList()
    {
        final class MeasureGroupList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup get(int i)
                { return CTMeasureGroupsImpl.this.getMeasureGroupArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup old = CTMeasureGroupsImpl.this.getMeasureGroupArray(i);
                CTMeasureGroupsImpl.this.setMeasureGroupArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup o)
                { CTMeasureGroupsImpl.this.insertNewMeasureGroup(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup old = CTMeasureGroupsImpl.this.getMeasureGroupArray(i);
                CTMeasureGroupsImpl.this.removeMeasureGroup(i);
                return old;
            }
            
            public int size()
                { return CTMeasureGroupsImpl.this.sizeOfMeasureGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MeasureGroupList();
        }
    }
    
    /**
     * Gets array of all "measureGroup" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup[] getMeasureGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEASUREGROUP$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "measureGroup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup getMeasureGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup)get_store().find_element_user(MEASUREGROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "measureGroup" element
     */
    public int sizeOfMeasureGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREGROUP$0);
        }
    }
    
    /**
     * Sets array of all "measureGroup" element
     */
    public void setMeasureGroupArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup[] measureGroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(measureGroupArray, MEASUREGROUP$0);
        }
    }
    
    /**
     * Sets ith "measureGroup" element
     */
    public void setMeasureGroupArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup measureGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup)get_store().find_element_user(MEASUREGROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(measureGroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "measureGroup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup insertNewMeasureGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup)get_store().insert_element_user(MEASUREGROUP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "measureGroup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup addNewMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroup)get_store().add_element_user(MEASUREGROUP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "measureGroup" element
     */
    public void removeMeasureGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREGROUP$0, i);
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

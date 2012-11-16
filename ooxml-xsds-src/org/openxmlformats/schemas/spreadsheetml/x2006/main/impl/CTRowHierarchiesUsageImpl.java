/*
 * XML Type:  CT_RowHierarchiesUsage
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RowHierarchiesUsage(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRowHierarchiesUsageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage
{
    
    public CTRowHierarchiesUsageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROWHIERARCHYUSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowHierarchyUsage");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "rowHierarchyUsage" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage> getRowHierarchyUsageList()
    {
        final class RowHierarchyUsageList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage get(int i)
                { return CTRowHierarchiesUsageImpl.this.getRowHierarchyUsageArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage old = CTRowHierarchiesUsageImpl.this.getRowHierarchyUsageArray(i);
                CTRowHierarchiesUsageImpl.this.setRowHierarchyUsageArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage o)
                { CTRowHierarchiesUsageImpl.this.insertNewRowHierarchyUsage(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage old = CTRowHierarchiesUsageImpl.this.getRowHierarchyUsageArray(i);
                CTRowHierarchiesUsageImpl.this.removeRowHierarchyUsage(i);
                return old;
            }
            
            public int size()
                { return CTRowHierarchiesUsageImpl.this.sizeOfRowHierarchyUsageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RowHierarchyUsageList();
        }
    }
    
    /**
     * Gets array of all "rowHierarchyUsage" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[] getRowHierarchyUsageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROWHIERARCHYUSAGE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rowHierarchyUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage getRowHierarchyUsageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage)get_store().find_element_user(ROWHIERARCHYUSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rowHierarchyUsage" element
     */
    public int sizeOfRowHierarchyUsageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWHIERARCHYUSAGE$0);
        }
    }
    
    /**
     * Sets array of all "rowHierarchyUsage" element
     */
    public void setRowHierarchyUsageArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[] rowHierarchyUsageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rowHierarchyUsageArray, ROWHIERARCHYUSAGE$0);
        }
    }
    
    /**
     * Sets ith "rowHierarchyUsage" element
     */
    public void setRowHierarchyUsageArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage rowHierarchyUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage)get_store().find_element_user(ROWHIERARCHYUSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rowHierarchyUsage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rowHierarchyUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage insertNewRowHierarchyUsage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage)get_store().insert_element_user(ROWHIERARCHYUSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rowHierarchyUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage addNewRowHierarchyUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage)get_store().add_element_user(ROWHIERARCHYUSAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rowHierarchyUsage" element
     */
    public void removeRowHierarchyUsage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWHIERARCHYUSAGE$0, i);
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

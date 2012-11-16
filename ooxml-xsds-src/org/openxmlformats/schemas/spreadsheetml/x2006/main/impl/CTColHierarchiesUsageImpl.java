/*
 * XML Type:  CT_ColHierarchiesUsage
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ColHierarchiesUsage(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColHierarchiesUsageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage
{
    
    public CTColHierarchiesUsageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLHIERARCHYUSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colHierarchyUsage");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "colHierarchyUsage" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage> getColHierarchyUsageList()
    {
        final class ColHierarchyUsageList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage get(int i)
                { return CTColHierarchiesUsageImpl.this.getColHierarchyUsageArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage old = CTColHierarchiesUsageImpl.this.getColHierarchyUsageArray(i);
                CTColHierarchiesUsageImpl.this.setColHierarchyUsageArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage o)
                { CTColHierarchiesUsageImpl.this.insertNewColHierarchyUsage(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage old = CTColHierarchiesUsageImpl.this.getColHierarchyUsageArray(i);
                CTColHierarchiesUsageImpl.this.removeColHierarchyUsage(i);
                return old;
            }
            
            public int size()
                { return CTColHierarchiesUsageImpl.this.sizeOfColHierarchyUsageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColHierarchyUsageList();
        }
    }
    
    /**
     * Gets array of all "colHierarchyUsage" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[] getColHierarchyUsageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLHIERARCHYUSAGE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "colHierarchyUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage getColHierarchyUsageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage)get_store().find_element_user(COLHIERARCHYUSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "colHierarchyUsage" element
     */
    public int sizeOfColHierarchyUsageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLHIERARCHYUSAGE$0);
        }
    }
    
    /**
     * Sets array of all "colHierarchyUsage" element
     */
    public void setColHierarchyUsageArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[] colHierarchyUsageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colHierarchyUsageArray, COLHIERARCHYUSAGE$0);
        }
    }
    
    /**
     * Sets ith "colHierarchyUsage" element
     */
    public void setColHierarchyUsageArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage colHierarchyUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage)get_store().find_element_user(COLHIERARCHYUSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colHierarchyUsage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "colHierarchyUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage insertNewColHierarchyUsage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage)get_store().insert_element_user(COLHIERARCHYUSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "colHierarchyUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage addNewColHierarchyUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage)get_store().add_element_user(COLHIERARCHYUSAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "colHierarchyUsage" element
     */
    public void removeColHierarchyUsage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLHIERARCHYUSAGE$0, i);
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

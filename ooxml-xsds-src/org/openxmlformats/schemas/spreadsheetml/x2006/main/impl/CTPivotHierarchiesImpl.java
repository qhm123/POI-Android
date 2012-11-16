/*
 * XML Type:  CT_PivotHierarchies
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotHierarchies(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotHierarchiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies
{
    
    public CTPivotHierarchiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTHIERARCHY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotHierarchy");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "pivotHierarchy" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy> getPivotHierarchyList()
    {
        final class PivotHierarchyList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy get(int i)
                { return CTPivotHierarchiesImpl.this.getPivotHierarchyArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy old = CTPivotHierarchiesImpl.this.getPivotHierarchyArray(i);
                CTPivotHierarchiesImpl.this.setPivotHierarchyArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy o)
                { CTPivotHierarchiesImpl.this.insertNewPivotHierarchy(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy old = CTPivotHierarchiesImpl.this.getPivotHierarchyArray(i);
                CTPivotHierarchiesImpl.this.removePivotHierarchy(i);
                return old;
            }
            
            public int size()
                { return CTPivotHierarchiesImpl.this.sizeOfPivotHierarchyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PivotHierarchyList();
        }
    }
    
    /**
     * Gets array of all "pivotHierarchy" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy[] getPivotHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIVOTHIERARCHY$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pivotHierarchy" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy getPivotHierarchyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy)get_store().find_element_user(PIVOTHIERARCHY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pivotHierarchy" element
     */
    public int sizeOfPivotHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTHIERARCHY$0);
        }
    }
    
    /**
     * Sets array of all "pivotHierarchy" element
     */
    public void setPivotHierarchyArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy[] pivotHierarchyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pivotHierarchyArray, PIVOTHIERARCHY$0);
        }
    }
    
    /**
     * Sets ith "pivotHierarchy" element
     */
    public void setPivotHierarchyArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy pivotHierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy)get_store().find_element_user(PIVOTHIERARCHY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pivotHierarchy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotHierarchy" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy insertNewPivotHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy)get_store().insert_element_user(PIVOTHIERARCHY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotHierarchy" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy addNewPivotHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy)get_store().add_element_user(PIVOTHIERARCHY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pivotHierarchy" element
     */
    public void removePivotHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTHIERARCHY$0, i);
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

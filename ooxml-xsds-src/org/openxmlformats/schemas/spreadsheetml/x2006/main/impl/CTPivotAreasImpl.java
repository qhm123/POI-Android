/*
 * XML Type:  CT_PivotAreas
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreas
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotAreas(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotAreasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreas
{
    
    public CTPivotAreasImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTAREA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotArea");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "pivotArea" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea> getPivotAreaList()
    {
        final class PivotAreaList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea get(int i)
                { return CTPivotAreasImpl.this.getPivotAreaArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea old = CTPivotAreasImpl.this.getPivotAreaArray(i);
                CTPivotAreasImpl.this.setPivotAreaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea o)
                { CTPivotAreasImpl.this.insertNewPivotArea(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea old = CTPivotAreasImpl.this.getPivotAreaArray(i);
                CTPivotAreasImpl.this.removePivotArea(i);
                return old;
            }
            
            public int size()
                { return CTPivotAreasImpl.this.sizeOfPivotAreaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PivotAreaList();
        }
    }
    
    /**
     * Gets array of all "pivotArea" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea[] getPivotAreaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIVOTAREA$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea getPivotAreaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().find_element_user(PIVOTAREA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pivotArea" element
     */
    public int sizeOfPivotAreaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTAREA$0);
        }
    }
    
    /**
     * Sets array of all "pivotArea" element
     */
    public void setPivotAreaArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea[] pivotAreaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pivotAreaArray, PIVOTAREA$0);
        }
    }
    
    /**
     * Sets ith "pivotArea" element
     */
    public void setPivotAreaArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea pivotArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().find_element_user(PIVOTAREA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pivotArea);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea insertNewPivotArea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().insert_element_user(PIVOTAREA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea addNewPivotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().add_element_user(PIVOTAREA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pivotArea" element
     */
    public void removePivotArea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTAREA$0, i);
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

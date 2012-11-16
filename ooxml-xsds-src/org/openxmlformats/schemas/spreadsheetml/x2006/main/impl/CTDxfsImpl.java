/*
 * XML Type:  CT_Dxfs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Dxfs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDxfsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs
{
    
    public CTDxfsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DXF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dxf");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "dxf" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf> getDxfList()
    {
        final class DxfList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf get(int i)
                { return CTDxfsImpl.this.getDxfArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf old = CTDxfsImpl.this.getDxfArray(i);
                CTDxfsImpl.this.setDxfArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf o)
                { CTDxfsImpl.this.insertNewDxf(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf old = CTDxfsImpl.this.getDxfArray(i);
                CTDxfsImpl.this.removeDxf(i);
                return old;
            }
            
            public int size()
                { return CTDxfsImpl.this.sizeOfDxfArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DxfList();
        }
    }
    
    /**
     * Gets array of all "dxf" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf[] getDxfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DXF$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf getDxfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().find_element_user(DXF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dxf" element
     */
    public int sizeOfDxfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DXF$0);
        }
    }
    
    /**
     * Sets array of all "dxf" element
     */
    public void setDxfArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf[] dxfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dxfArray, DXF$0);
        }
    }
    
    /**
     * Sets ith "dxf" element
     */
    public void setDxfArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf dxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().find_element_user(DXF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dxf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf insertNewDxf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().insert_element_user(DXF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf addNewDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().add_element_user(DXF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dxf" element
     */
    public void removeDxf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DXF$0, i);
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

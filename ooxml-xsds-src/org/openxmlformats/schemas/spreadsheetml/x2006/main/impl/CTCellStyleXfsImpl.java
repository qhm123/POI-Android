/*
 * XML Type:  CT_CellStyleXfs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CellStyleXfs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellStyleXfsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs
{
    
    public CTCellStyleXfsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "xf");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "xf" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf> getXfList()
    {
        final class XfList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf get(int i)
                { return CTCellStyleXfsImpl.this.getXfArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf old = CTCellStyleXfsImpl.this.getXfArray(i);
                CTCellStyleXfsImpl.this.setXfArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf o)
                { CTCellStyleXfsImpl.this.insertNewXf(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf old = CTCellStyleXfsImpl.this.getXfArray(i);
                CTCellStyleXfsImpl.this.removeXf(i);
                return old;
            }
            
            public int size()
                { return CTCellStyleXfsImpl.this.sizeOfXfArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XfList();
        }
    }
    
    /**
     * Gets array of all "xf" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf[] getXfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(XF$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "xf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf getXfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf)get_store().find_element_user(XF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "xf" element
     */
    public int sizeOfXfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XF$0);
        }
    }
    
    /**
     * Sets array of all "xf" element
     */
    public void setXfArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf[] xfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xfArray, XF$0);
        }
    }
    
    /**
     * Sets ith "xf" element
     */
    public void setXfArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf xf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf)get_store().find_element_user(XF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf insertNewXf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf)get_store().insert_element_user(XF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf addNewXf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf)get_store().add_element_user(XF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "xf" element
     */
    public void removeXf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XF$0, i);
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

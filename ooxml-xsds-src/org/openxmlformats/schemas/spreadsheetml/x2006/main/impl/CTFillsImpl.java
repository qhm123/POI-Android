/*
 * XML Type:  CT_Fills
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Fills(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFillsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills
{
    
    public CTFillsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fill");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "fill" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill> getFillList()
    {
        final class FillList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill get(int i)
                { return CTFillsImpl.this.getFillArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill old = CTFillsImpl.this.getFillArray(i);
                CTFillsImpl.this.setFillArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill o)
                { CTFillsImpl.this.insertNewFill(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill old = CTFillsImpl.this.getFillArray(i);
                CTFillsImpl.this.removeFill(i);
                return old;
            }
            
            public int size()
                { return CTFillsImpl.this.sizeOfFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FillList();
        }
    }
    
    /**
     * Gets array of all "fill" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill[] getFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILL$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill getFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill)get_store().find_element_user(FILL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fill" element
     */
    public int sizeOfFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILL$0);
        }
    }
    
    /**
     * Sets array of all "fill" element
     */
    public void setFillArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill[] fillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fillArray, FILL$0);
        }
    }
    
    /**
     * Sets ith "fill" element
     */
    public void setFillArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill)get_store().find_element_user(FILL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill insertNewFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill)get_store().insert_element_user(FILL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill)get_store().add_element_user(FILL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "fill" element
     */
    public void removeFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILL$0, i);
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

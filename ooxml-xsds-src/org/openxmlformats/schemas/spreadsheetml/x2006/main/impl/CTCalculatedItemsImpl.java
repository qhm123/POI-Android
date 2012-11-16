/*
 * XML Type:  CT_CalculatedItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CalculatedItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCalculatedItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems
{
    
    public CTCalculatedItemsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATEDITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calculatedItem");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "calculatedItem" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem> getCalculatedItemList()
    {
        final class CalculatedItemList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem get(int i)
                { return CTCalculatedItemsImpl.this.getCalculatedItemArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem old = CTCalculatedItemsImpl.this.getCalculatedItemArray(i);
                CTCalculatedItemsImpl.this.setCalculatedItemArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem o)
                { CTCalculatedItemsImpl.this.insertNewCalculatedItem(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem old = CTCalculatedItemsImpl.this.getCalculatedItemArray(i);
                CTCalculatedItemsImpl.this.removeCalculatedItem(i);
                return old;
            }
            
            public int size()
                { return CTCalculatedItemsImpl.this.sizeOfCalculatedItemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CalculatedItemList();
        }
    }
    
    /**
     * Gets array of all "calculatedItem" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem[] getCalculatedItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CALCULATEDITEM$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "calculatedItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem getCalculatedItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem)get_store().find_element_user(CALCULATEDITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "calculatedItem" element
     */
    public int sizeOfCalculatedItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCULATEDITEM$0);
        }
    }
    
    /**
     * Sets array of all "calculatedItem" element
     */
    public void setCalculatedItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem[] calculatedItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(calculatedItemArray, CALCULATEDITEM$0);
        }
    }
    
    /**
     * Sets ith "calculatedItem" element
     */
    public void setCalculatedItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem calculatedItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem)get_store().find_element_user(CALCULATEDITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(calculatedItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "calculatedItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem insertNewCalculatedItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem)get_store().insert_element_user(CALCULATEDITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "calculatedItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem addNewCalculatedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem)get_store().add_element_user(CALCULATEDITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "calculatedItem" element
     */
    public void removeCalculatedItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCULATEDITEM$0, i);
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

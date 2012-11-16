/*
 * XML Type:  CT_Items
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Items(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems
{
    
    public CTItemsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "item");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "item" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem> getItemList()
    {
        final class ItemList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem get(int i)
                { return CTItemsImpl.this.getItemArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem old = CTItemsImpl.this.getItemArray(i);
                CTItemsImpl.this.setItemArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem o)
                { CTItemsImpl.this.insertNewItem(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem old = CTItemsImpl.this.getItemArray(i);
                CTItemsImpl.this.removeItem(i);
                return old;
            }
            
            public int size()
                { return CTItemsImpl.this.sizeOfItemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ItemList();
        }
    }
    
    /**
     * Gets array of all "item" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "item" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem)get_store().find_element_user(ITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$0);
        }
    }
    
    /**
     * Sets array of all "item" element
     */
    public void setItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem[] itemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemArray, ITEM$0);
        }
    }
    
    /**
     * Sets ith "item" element
     */
    public void setItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem)get_store().find_element_user(ITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "item" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem)get_store().insert_element_user(ITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "item" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem)get_store().add_element_user(ITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$0, i);
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

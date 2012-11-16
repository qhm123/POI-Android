/*
 * XML Type:  CT_OleItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_OleItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTOleItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems
{
    
    public CTOleItemsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleItem");
    
    
    /**
     * Gets a List of "oleItem" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem> getOleItemList()
    {
        final class OleItemList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem get(int i)
                { return CTOleItemsImpl.this.getOleItemArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem old = CTOleItemsImpl.this.getOleItemArray(i);
                CTOleItemsImpl.this.setOleItemArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem o)
                { CTOleItemsImpl.this.insertNewOleItem(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem old = CTOleItemsImpl.this.getOleItemArray(i);
                CTOleItemsImpl.this.removeOleItem(i);
                return old;
            }
            
            public int size()
                { return CTOleItemsImpl.this.sizeOfOleItemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OleItemList();
        }
    }
    
    /**
     * Gets array of all "oleItem" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem[] getOleItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OLEITEM$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oleItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem getOleItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem)get_store().find_element_user(OLEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oleItem" element
     */
    public int sizeOfOleItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLEITEM$0);
        }
    }
    
    /**
     * Sets array of all "oleItem" element
     */
    public void setOleItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem[] oleItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oleItemArray, OLEITEM$0);
        }
    }
    
    /**
     * Sets ith "oleItem" element
     */
    public void setOleItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem oleItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem)get_store().find_element_user(OLEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oleItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oleItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem insertNewOleItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem)get_store().insert_element_user(OLEITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oleItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem addNewOleItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem)get_store().add_element_user(OLEITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "oleItem" element
     */
    public void removeOleItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLEITEM$0, i);
        }
    }
}

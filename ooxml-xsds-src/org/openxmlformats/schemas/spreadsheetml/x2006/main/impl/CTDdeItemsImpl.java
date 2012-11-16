/*
 * XML Type:  CT_DdeItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DdeItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDdeItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems
{
    
    public CTDdeItemsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DDEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ddeItem");
    
    
    /**
     * Gets a List of "ddeItem" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem> getDdeItemList()
    {
        final class DdeItemList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem get(int i)
                { return CTDdeItemsImpl.this.getDdeItemArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem old = CTDdeItemsImpl.this.getDdeItemArray(i);
                CTDdeItemsImpl.this.setDdeItemArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem o)
                { CTDdeItemsImpl.this.insertNewDdeItem(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem old = CTDdeItemsImpl.this.getDdeItemArray(i);
                CTDdeItemsImpl.this.removeDdeItem(i);
                return old;
            }
            
            public int size()
                { return CTDdeItemsImpl.this.sizeOfDdeItemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DdeItemList();
        }
    }
    
    /**
     * Gets array of all "ddeItem" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem[] getDdeItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DDEITEM$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ddeItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem getDdeItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem)get_store().find_element_user(DDEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ddeItem" element
     */
    public int sizeOfDdeItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DDEITEM$0);
        }
    }
    
    /**
     * Sets array of all "ddeItem" element
     */
    public void setDdeItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem[] ddeItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ddeItemArray, DDEITEM$0);
        }
    }
    
    /**
     * Sets ith "ddeItem" element
     */
    public void setDdeItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem ddeItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem)get_store().find_element_user(DDEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ddeItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ddeItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem insertNewDdeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem)get_store().insert_element_user(DDEITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ddeItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem addNewDdeItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem)get_store().add_element_user(DDEITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ddeItem" element
     */
    public void removeDdeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DDEITEM$0, i);
        }
    }
}

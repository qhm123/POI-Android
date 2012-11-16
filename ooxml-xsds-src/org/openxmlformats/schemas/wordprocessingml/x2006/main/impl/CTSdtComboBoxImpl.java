/*
 * XML Type:  CT_SdtComboBox
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SdtComboBox(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSdtComboBoxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox
{
    
    public CTSdtComboBoxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "listItem");
    private static final javax.xml.namespace.QName LASTVALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lastValue");
    
    
    /**
     * Gets a List of "listItem" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem> getListItemList()
    {
        final class ListItemList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem get(int i)
                { return CTSdtComboBoxImpl.this.getListItemArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem old = CTSdtComboBoxImpl.this.getListItemArray(i);
                CTSdtComboBoxImpl.this.setListItemArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem o)
                { CTSdtComboBoxImpl.this.insertNewListItem(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem old = CTSdtComboBoxImpl.this.getListItemArray(i);
                CTSdtComboBoxImpl.this.removeListItem(i);
                return old;
            }
            
            public int size()
                { return CTSdtComboBoxImpl.this.sizeOfListItemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ListItemList();
        }
    }
    
    /**
     * Gets array of all "listItem" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem[] getListItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LISTITEM$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "listItem" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem getListItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem)get_store().find_element_user(LISTITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "listItem" element
     */
    public int sizeOfListItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTITEM$0);
        }
    }
    
    /**
     * Sets array of all "listItem" element
     */
    public void setListItemArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem[] listItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listItemArray, LISTITEM$0);
        }
    }
    
    /**
     * Sets ith "listItem" element
     */
    public void setListItemArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem listItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem)get_store().find_element_user(LISTITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(listItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listItem" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem insertNewListItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem)get_store().insert_element_user(LISTITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listItem" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem addNewListItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem)get_store().add_element_user(LISTITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "listItem" element
     */
    public void removeListItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTITEM$0, i);
        }
    }
    
    /**
     * Gets the "lastValue" attribute
     */
    public java.lang.String getLastValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTVALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastValue" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetLastValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(LASTVALUE$2);
            return target;
        }
    }
    
    /**
     * True if has "lastValue" attribute
     */
    public boolean isSetLastValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTVALUE$2) != null;
        }
    }
    
    /**
     * Sets the "lastValue" attribute
     */
    public void setLastValue(java.lang.String lastValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTVALUE$2);
            }
            target.setStringValue(lastValue);
        }
    }
    
    /**
     * Sets (as xml) the "lastValue" attribute
     */
    public void xsetLastValue(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString lastValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(LASTVALUE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(LASTVALUE$2);
            }
            target.set(lastValue);
        }
    }
    
    /**
     * Unsets the "lastValue" attribute
     */
    public void unsetLastValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTVALUE$2);
        }
    }
}

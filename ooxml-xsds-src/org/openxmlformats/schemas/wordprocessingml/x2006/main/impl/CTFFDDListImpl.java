/*
 * XML Type:  CT_FFDDList
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FFDDList(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFFDDListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList
{
    
    public CTFFDDListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "result");
    private static final javax.xml.namespace.QName DEFAULT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "default");
    private static final javax.xml.namespace.QName LISTENTRY$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "listEntry");
    
    
    /**
     * Gets the "result" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(RESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "result" element
     */
    public boolean isSetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULT$0) != 0;
        }
    }
    
    /**
     * Sets the "result" element
     */
    public void setResult(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(RESULT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(RESULT$0);
            }
            target.set(result);
        }
    }
    
    /**
     * Appends and returns a new empty "result" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(RESULT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "result" element
     */
    public void unsetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULT$0, 0);
        }
    }
    
    /**
     * Gets the "default" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(DEFAULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "default" element
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULT$2) != 0;
        }
    }
    
    /**
     * Sets the "default" element
     */
    public void setDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(DEFAULT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(DEFAULT$2);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Appends and returns a new empty "default" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(DEFAULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "default" element
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULT$2, 0);
        }
    }
    
    /**
     * Gets a List of "listEntry" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString> getListEntryList()
    {
        final class ListEntryList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString get(int i)
                { return CTFFDDListImpl.this.getListEntryArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTFFDDListImpl.this.getListEntryArray(i);
                CTFFDDListImpl.this.setListEntryArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
                { CTFFDDListImpl.this.insertNewListEntry(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTFFDDListImpl.this.getListEntryArray(i);
                CTFFDDListImpl.this.removeListEntry(i);
                return old;
            }
            
            public int size()
                { return CTFFDDListImpl.this.sizeOfListEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ListEntryList();
        }
    }
    
    /**
     * Gets array of all "listEntry" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] getListEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LISTENTRY$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "listEntry" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getListEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(LISTENTRY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "listEntry" element
     */
    public int sizeOfListEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTENTRY$4);
        }
    }
    
    /**
     * Sets array of all "listEntry" element
     */
    public void setListEntryArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] listEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listEntryArray, LISTENTRY$4);
        }
    }
    
    /**
     * Sets ith "listEntry" element
     */
    public void setListEntryArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString listEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(LISTENTRY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(listEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listEntry" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString insertNewListEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().insert_element_user(LISTENTRY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listEntry" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewListEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(LISTENTRY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "listEntry" element
     */
    public void removeListEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTENTRY$4, i);
        }
    }
}

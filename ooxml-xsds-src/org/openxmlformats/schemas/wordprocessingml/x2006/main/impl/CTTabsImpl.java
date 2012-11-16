/*
 * XML Type:  CT_Tabs
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Tabs(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTabsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabs
{
    
    public CTTabsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAB$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tab");
    
    
    /**
     * Gets a List of "tab" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop> getTabList()
    {
        final class TabList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop get(int i)
                { return CTTabsImpl.this.getTabArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop old = CTTabsImpl.this.getTabArray(i);
                CTTabsImpl.this.setTabArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop o)
                { CTTabsImpl.this.insertNewTab(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop old = CTTabsImpl.this.getTabArray(i);
                CTTabsImpl.this.removeTab(i);
                return old;
            }
            
            public int size()
                { return CTTabsImpl.this.sizeOfTabArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TabList();
        }
    }
    
    /**
     * Gets array of all "tab" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop[] getTabArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TAB$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop getTabArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop)get_store().find_element_user(TAB$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tab" element
     */
    public int sizeOfTabArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAB$0);
        }
    }
    
    /**
     * Sets array of all "tab" element
     */
    public void setTabArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop[] tabArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tabArray, TAB$0);
        }
    }
    
    /**
     * Sets ith "tab" element
     */
    public void setTabArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop tab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop)get_store().find_element_user(TAB$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tab);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop insertNewTab(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop)get_store().insert_element_user(TAB$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop addNewTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop)get_store().add_element_user(TAB$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tab" element
     */
    public void removeTab(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAB$0, i);
        }
    }
}

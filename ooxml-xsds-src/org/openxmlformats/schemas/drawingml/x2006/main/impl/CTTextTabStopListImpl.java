/*
 * XML Type:  CT_TextTabStopList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextTabStopList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextTabStopListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList
{
    
    public CTTextTabStopListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAB$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tab");
    
    
    /**
     * Gets a List of "tab" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop> getTabList()
    {
        final class TabList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop get(int i)
                { return CTTextTabStopListImpl.this.getTabArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop old = CTTextTabStopListImpl.this.getTabArray(i);
                CTTextTabStopListImpl.this.setTabArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop o)
                { CTTextTabStopListImpl.this.insertNewTab(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop old = CTTextTabStopListImpl.this.getTabArray(i);
                CTTextTabStopListImpl.this.removeTab(i);
                return old;
            }
            
            public int size()
                { return CTTextTabStopListImpl.this.sizeOfTabArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop[] getTabArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TAB$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tab" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop getTabArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop)get_store().find_element_user(TAB$0, i);
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
    public void setTabArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop[] tabArray)
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
    public void setTabArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop tab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop)get_store().find_element_user(TAB$0, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop insertNewTab(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop)get_store().insert_element_user(TAB$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tab" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop addNewTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop)get_store().add_element_user(TAB$0);
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

/*
 * XML Type:  CT_PCDSCPage
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PCDSCPage(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPCDSCPageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage
{
    
    public CTPCDSCPageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageItem");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "pageItem" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem> getPageItemList()
    {
        final class PageItemList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem get(int i)
                { return CTPCDSCPageImpl.this.getPageItemArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem old = CTPCDSCPageImpl.this.getPageItemArray(i);
                CTPCDSCPageImpl.this.setPageItemArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem o)
                { CTPCDSCPageImpl.this.insertNewPageItem(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem old = CTPCDSCPageImpl.this.getPageItemArray(i);
                CTPCDSCPageImpl.this.removePageItem(i);
                return old;
            }
            
            public int size()
                { return CTPCDSCPageImpl.this.sizeOfPageItemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PageItemList();
        }
    }
    
    /**
     * Gets array of all "pageItem" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem[] getPageItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PAGEITEM$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pageItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem getPageItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem)get_store().find_element_user(PAGEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pageItem" element
     */
    public int sizeOfPageItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEITEM$0);
        }
    }
    
    /**
     * Sets array of all "pageItem" element
     */
    public void setPageItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem[] pageItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pageItemArray, PAGEITEM$0);
        }
    }
    
    /**
     * Sets ith "pageItem" element
     */
    public void setPageItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem pageItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem)get_store().find_element_user(PAGEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pageItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pageItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem insertNewPageItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem)get_store().insert_element_user(PAGEITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pageItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem addNewPageItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageItem)get_store().add_element_user(PAGEITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pageItem" element
     */
    public void removePageItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEITEM$0, i);
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

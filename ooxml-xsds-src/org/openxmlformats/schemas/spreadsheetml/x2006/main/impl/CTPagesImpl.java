/*
 * XML Type:  CT_Pages
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Pages(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPagesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages
{
    
    public CTPagesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "page");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "page" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage> getPageList()
    {
        final class PageList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage get(int i)
                { return CTPagesImpl.this.getPageArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage old = CTPagesImpl.this.getPageArray(i);
                CTPagesImpl.this.setPageArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage o)
                { CTPagesImpl.this.insertNewPage(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage old = CTPagesImpl.this.getPageArray(i);
                CTPagesImpl.this.removePage(i);
                return old;
            }
            
            public int size()
                { return CTPagesImpl.this.sizeOfPageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PageList();
        }
    }
    
    /**
     * Gets array of all "page" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage[] getPageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PAGE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "page" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage getPageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage)get_store().find_element_user(PAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "page" element
     */
    public int sizeOfPageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGE$0);
        }
    }
    
    /**
     * Sets array of all "page" element
     */
    public void setPageArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage[] pageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pageArray, PAGE$0);
        }
    }
    
    /**
     * Sets ith "page" element
     */
    public void setPageArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage page)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage)get_store().find_element_user(PAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(page);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "page" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage insertNewPage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage)get_store().insert_element_user(PAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "page" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage addNewPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage)get_store().add_element_user(PAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "page" element
     */
    public void removePage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGE$0, i);
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

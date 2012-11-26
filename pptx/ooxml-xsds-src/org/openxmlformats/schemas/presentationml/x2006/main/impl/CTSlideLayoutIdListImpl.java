/*
 * XML Type:  CT_SlideLayoutIdList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideLayoutIdList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideLayoutIdListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList
{
    
    public CTSlideLayoutIdListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDLAYOUTID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldLayoutId");
    
    
    /**
     * Gets a List of "sldLayoutId" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry> getSldLayoutIdList()
    {
        final class SldLayoutIdList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry get(int i)
                { return CTSlideLayoutIdListImpl.this.getSldLayoutIdArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry old = CTSlideLayoutIdListImpl.this.getSldLayoutIdArray(i);
                CTSlideLayoutIdListImpl.this.setSldLayoutIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry o)
                { CTSlideLayoutIdListImpl.this.insertNewSldLayoutId(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry old = CTSlideLayoutIdListImpl.this.getSldLayoutIdArray(i);
                CTSlideLayoutIdListImpl.this.removeSldLayoutId(i);
                return old;
            }
            
            public int size()
                { return CTSlideLayoutIdListImpl.this.sizeOfSldLayoutIdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SldLayoutIdList();
        }
    }
    
    /**
     * Gets array of all "sldLayoutId" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry[] getSldLayoutIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SLDLAYOUTID$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sldLayoutId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry getSldLayoutIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry)get_store().find_element_user(SLDLAYOUTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sldLayoutId" element
     */
    public int sizeOfSldLayoutIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDLAYOUTID$0);
        }
    }
    
    /**
     * Sets array of all "sldLayoutId" element
     */
    public void setSldLayoutIdArray(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry[] sldLayoutIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sldLayoutIdArray, SLDLAYOUTID$0);
        }
    }
    
    /**
     * Sets ith "sldLayoutId" element
     */
    public void setSldLayoutIdArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry sldLayoutId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry)get_store().find_element_user(SLDLAYOUTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sldLayoutId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sldLayoutId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry insertNewSldLayoutId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry)get_store().insert_element_user(SLDLAYOUTID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sldLayoutId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry addNewSldLayoutId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry)get_store().add_element_user(SLDLAYOUTID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sldLayoutId" element
     */
    public void removeSldLayoutId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDLAYOUTID$0, i);
        }
    }
}

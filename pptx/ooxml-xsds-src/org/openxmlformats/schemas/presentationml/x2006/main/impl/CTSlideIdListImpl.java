/*
 * XML Type:  CT_SlideIdList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideIdList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideIdListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList
{
    
    public CTSlideIdListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldId");
    
    
    /**
     * Gets a List of "sldId" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry> getSldIdList()
    {
        final class SldIdList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry get(int i)
                { return CTSlideIdListImpl.this.getSldIdArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry old = CTSlideIdListImpl.this.getSldIdArray(i);
                CTSlideIdListImpl.this.setSldIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry o)
                { CTSlideIdListImpl.this.insertNewSldId(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry old = CTSlideIdListImpl.this.getSldIdArray(i);
                CTSlideIdListImpl.this.removeSldId(i);
                return old;
            }
            
            public int size()
                { return CTSlideIdListImpl.this.sizeOfSldIdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SldIdList();
        }
    }
    
    /**
     * Gets array of all "sldId" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry[] getSldIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SLDID$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sldId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry getSldIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry)get_store().find_element_user(SLDID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sldId" element
     */
    public int sizeOfSldIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDID$0);
        }
    }
    
    /**
     * Sets array of all "sldId" element
     */
    public void setSldIdArray(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry[] sldIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sldIdArray, SLDID$0);
        }
    }
    
    /**
     * Sets ith "sldId" element
     */
    public void setSldIdArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry sldId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry)get_store().find_element_user(SLDID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sldId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sldId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry insertNewSldId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry)get_store().insert_element_user(SLDID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sldId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry addNewSldId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry)get_store().add_element_user(SLDID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sldId" element
     */
    public void removeSldId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDID$0, i);
        }
    }
}

/*
 * XML Type:  CT_SlideMasterIdList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideMasterIdList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideMasterIdListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList
{
    
    public CTSlideMasterIdListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDMASTERID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldMasterId");
    
    
    /**
     * Gets a List of "sldMasterId" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry> getSldMasterIdList()
    {
        final class SldMasterIdList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry get(int i)
                { return CTSlideMasterIdListImpl.this.getSldMasterIdArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry old = CTSlideMasterIdListImpl.this.getSldMasterIdArray(i);
                CTSlideMasterIdListImpl.this.setSldMasterIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry o)
                { CTSlideMasterIdListImpl.this.insertNewSldMasterId(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry old = CTSlideMasterIdListImpl.this.getSldMasterIdArray(i);
                CTSlideMasterIdListImpl.this.removeSldMasterId(i);
                return old;
            }
            
            public int size()
                { return CTSlideMasterIdListImpl.this.sizeOfSldMasterIdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SldMasterIdList();
        }
    }
    
    /**
     * Gets array of all "sldMasterId" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry[] getSldMasterIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SLDMASTERID$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sldMasterId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry getSldMasterIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry)get_store().find_element_user(SLDMASTERID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sldMasterId" element
     */
    public int sizeOfSldMasterIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDMASTERID$0);
        }
    }
    
    /**
     * Sets array of all "sldMasterId" element
     */
    public void setSldMasterIdArray(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry[] sldMasterIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sldMasterIdArray, SLDMASTERID$0);
        }
    }
    
    /**
     * Sets ith "sldMasterId" element
     */
    public void setSldMasterIdArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry sldMasterId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry)get_store().find_element_user(SLDMASTERID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sldMasterId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sldMasterId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry insertNewSldMasterId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry)get_store().insert_element_user(SLDMASTERID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sldMasterId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry addNewSldMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry)get_store().add_element_user(SLDMASTERID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sldMasterId" element
     */
    public void removeSldMasterId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDMASTERID$0, i);
        }
    }
}

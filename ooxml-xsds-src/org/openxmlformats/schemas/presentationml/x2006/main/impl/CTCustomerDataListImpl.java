/*
 * XML Type:  CT_CustomerDataList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_CustomerDataList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomerDataListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList
{
    
    public CTCustomerDataListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custData");
    private static final javax.xml.namespace.QName TAGS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tags");
    
    
    /**
     * Gets a List of "custData" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData> getCustDataList()
    {
        final class CustDataList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData get(int i)
                { return CTCustomerDataListImpl.this.getCustDataArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData old = CTCustomerDataListImpl.this.getCustDataArray(i);
                CTCustomerDataListImpl.this.setCustDataArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData o)
                { CTCustomerDataListImpl.this.insertNewCustData(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData old = CTCustomerDataListImpl.this.getCustDataArray(i);
                CTCustomerDataListImpl.this.removeCustData(i);
                return old;
            }
            
            public int size()
                { return CTCustomerDataListImpl.this.sizeOfCustDataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustDataList();
        }
    }
    
    /**
     * Gets array of all "custData" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData[] getCustDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTDATA$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "custData" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData getCustDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData)get_store().find_element_user(CUSTDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "custData" element
     */
    public int sizeOfCustDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTDATA$0);
        }
    }
    
    /**
     * Sets array of all "custData" element
     */
    public void setCustDataArray(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData[] custDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(custDataArray, CUSTDATA$0);
        }
    }
    
    /**
     * Sets ith "custData" element
     */
    public void setCustDataArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData custData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData)get_store().find_element_user(CUSTDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(custData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "custData" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData insertNewCustData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData)get_store().insert_element_user(CUSTDATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "custData" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData addNewCustData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerData)get_store().add_element_user(CUSTDATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "custData" element
     */
    public void removeCustData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTDATA$0, i);
        }
    }
    
    /**
     * Gets the "tags" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData getTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData)get_store().find_element_user(TAGS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tags" element
     */
    public boolean isSetTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAGS$2) != 0;
        }
    }
    
    /**
     * Sets the "tags" element
     */
    public void setTags(org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData tags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData)get_store().find_element_user(TAGS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData)get_store().add_element_user(TAGS$2);
            }
            target.set(tags);
        }
    }
    
    /**
     * Appends and returns a new empty "tags" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData addNewTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTagsData)get_store().add_element_user(TAGS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tags" element
     */
    public void unsetTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAGS$2, 0);
        }
    }
}

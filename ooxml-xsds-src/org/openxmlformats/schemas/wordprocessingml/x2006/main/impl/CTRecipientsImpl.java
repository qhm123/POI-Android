/*
 * XML Type:  CT_Recipients
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Recipients(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRecipientsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients
{
    
    public CTRecipientsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIPIENTDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "recipientData");
    
    
    /**
     * Gets a List of "recipientData" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData> getRecipientDataList()
    {
        final class RecipientDataList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData get(int i)
                { return CTRecipientsImpl.this.getRecipientDataArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData old = CTRecipientsImpl.this.getRecipientDataArray(i);
                CTRecipientsImpl.this.setRecipientDataArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData o)
                { CTRecipientsImpl.this.insertNewRecipientData(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData old = CTRecipientsImpl.this.getRecipientDataArray(i);
                CTRecipientsImpl.this.removeRecipientData(i);
                return old;
            }
            
            public int size()
                { return CTRecipientsImpl.this.sizeOfRecipientDataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RecipientDataList();
        }
    }
    
    /**
     * Gets array of all "recipientData" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData[] getRecipientDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECIPIENTDATA$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recipientData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData getRecipientDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData)get_store().find_element_user(RECIPIENTDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recipientData" element
     */
    public int sizeOfRecipientDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIPIENTDATA$0);
        }
    }
    
    /**
     * Sets array of all "recipientData" element
     */
    public void setRecipientDataArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData[] recipientDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(recipientDataArray, RECIPIENTDATA$0);
        }
    }
    
    /**
     * Sets ith "recipientData" element
     */
    public void setRecipientDataArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData recipientData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData)get_store().find_element_user(RECIPIENTDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recipientData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recipientData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData insertNewRecipientData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData)get_store().insert_element_user(RECIPIENTDATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recipientData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData addNewRecipientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData)get_store().add_element_user(RECIPIENTDATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "recipientData" element
     */
    public void removeRecipientData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIPIENTDATA$0, i);
        }
    }
}

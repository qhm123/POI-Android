/*
 * XML Type:  CT_TLTimeAnimateValueList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTimeAnimateValueList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTimeAnimateValueListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList
{
    
    public CTTLTimeAnimateValueListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAV$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tav");
    
    
    /**
     * Gets a List of "tav" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue> getTavList()
    {
        final class TavList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue get(int i)
                { return CTTLTimeAnimateValueListImpl.this.getTavArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue old = CTTLTimeAnimateValueListImpl.this.getTavArray(i);
                CTTLTimeAnimateValueListImpl.this.setTavArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue o)
                { CTTLTimeAnimateValueListImpl.this.insertNewTav(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue old = CTTLTimeAnimateValueListImpl.this.getTavArray(i);
                CTTLTimeAnimateValueListImpl.this.removeTav(i);
                return old;
            }
            
            public int size()
                { return CTTLTimeAnimateValueListImpl.this.sizeOfTavArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TavList();
        }
    }
    
    /**
     * Gets array of all "tav" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue[] getTavArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TAV$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tav" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue getTavArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue)get_store().find_element_user(TAV$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tav" element
     */
    public int sizeOfTavArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAV$0);
        }
    }
    
    /**
     * Sets array of all "tav" element
     */
    public void setTavArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue[] tavArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tavArray, TAV$0);
        }
    }
    
    /**
     * Sets ith "tav" element
     */
    public void setTavArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue tav)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue)get_store().find_element_user(TAV$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tav);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tav" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue insertNewTav(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue)get_store().insert_element_user(TAV$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tav" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue addNewTav()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue)get_store().add_element_user(TAV$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tav" element
     */
    public void removeTav(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAV$0, i);
        }
    }
}

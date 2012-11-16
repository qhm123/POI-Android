/*
 * XML Type:  CT_VolMain
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_VolMain(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTVolMainImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain
{
    
    public CTVolMainImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tp");
    private static final javax.xml.namespace.QName FIRST$2 = 
        new javax.xml.namespace.QName("", "first");
    
    
    /**
     * Gets a List of "tp" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic> getTpList()
    {
        final class TpList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic get(int i)
                { return CTVolMainImpl.this.getTpArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic old = CTVolMainImpl.this.getTpArray(i);
                CTVolMainImpl.this.setTpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic o)
                { CTVolMainImpl.this.insertNewTp(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic old = CTVolMainImpl.this.getTpArray(i);
                CTVolMainImpl.this.removeTp(i);
                return old;
            }
            
            public int size()
                { return CTVolMainImpl.this.sizeOfTpArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TpList();
        }
    }
    
    /**
     * Gets array of all "tp" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic[] getTpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TP$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic getTpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic)get_store().find_element_user(TP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tp" element
     */
    public int sizeOfTpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TP$0);
        }
    }
    
    /**
     * Sets array of all "tp" element
     */
    public void setTpArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic[] tpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tpArray, TP$0);
        }
    }
    
    /**
     * Sets ith "tp" element
     */
    public void setTpArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic tp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic)get_store().find_element_user(TP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic insertNewTp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic)get_store().insert_element_user(TP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic addNewTp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic)get_store().add_element_user(TP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tp" element
     */
    public void removeTp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TP$0, i);
        }
    }
    
    /**
     * Gets the "first" attribute
     */
    public java.lang.String getFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRST$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "first" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(FIRST$2);
            return target;
        }
    }
    
    /**
     * Sets the "first" attribute
     */
    public void setFirst(java.lang.String first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRST$2);
            }
            target.setStringValue(first);
        }
    }
    
    /**
     * Sets (as xml) the "first" attribute
     */
    public void xsetFirst(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(FIRST$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(FIRST$2);
            }
            target.set(first);
        }
    }
}

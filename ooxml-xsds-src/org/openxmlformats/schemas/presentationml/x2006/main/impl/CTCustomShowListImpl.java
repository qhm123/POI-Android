/*
 * XML Type:  CT_CustomShowList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_CustomShowList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomShowListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList
{
    
    public CTCustomShowListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTSHOW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custShow");
    
    
    /**
     * Gets a List of "custShow" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow> getCustShowList()
    {
        final class CustShowList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow get(int i)
                { return CTCustomShowListImpl.this.getCustShowArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow old = CTCustomShowListImpl.this.getCustShowArray(i);
                CTCustomShowListImpl.this.setCustShowArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow o)
                { CTCustomShowListImpl.this.insertNewCustShow(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow old = CTCustomShowListImpl.this.getCustShowArray(i);
                CTCustomShowListImpl.this.removeCustShow(i);
                return old;
            }
            
            public int size()
                { return CTCustomShowListImpl.this.sizeOfCustShowArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustShowList();
        }
    }
    
    /**
     * Gets array of all "custShow" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow[] getCustShowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTSHOW$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "custShow" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow getCustShowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow)get_store().find_element_user(CUSTSHOW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "custShow" element
     */
    public int sizeOfCustShowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTSHOW$0);
        }
    }
    
    /**
     * Sets array of all "custShow" element
     */
    public void setCustShowArray(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow[] custShowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(custShowArray, CUSTSHOW$0);
        }
    }
    
    /**
     * Sets ith "custShow" element
     */
    public void setCustShowArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow custShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow)get_store().find_element_user(CUSTSHOW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(custShow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "custShow" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow insertNewCustShow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow)get_store().insert_element_user(CUSTSHOW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "custShow" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow addNewCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow)get_store().add_element_user(CUSTSHOW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "custShow" element
     */
    public void removeCustShow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTSHOW$0, i);
        }
    }
}

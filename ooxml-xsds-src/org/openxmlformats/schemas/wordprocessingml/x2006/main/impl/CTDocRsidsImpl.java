/*
 * XML Type:  CT_DocRsids
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocRsids(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocRsidsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids
{
    
    public CTDocRsidsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RSIDROOT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidRoot");
    private static final javax.xml.namespace.QName RSID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsid");
    
    
    /**
     * Gets the "rsidRoot" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber getRsidRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(RSIDROOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rsidRoot" element
     */
    public boolean isSetRsidRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSIDROOT$0) != 0;
        }
    }
    
    /**
     * Sets the "rsidRoot" element
     */
    public void setRsidRoot(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber rsidRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(RSIDROOT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(RSIDROOT$0);
            }
            target.set(rsidRoot);
        }
    }
    
    /**
     * Appends and returns a new empty "rsidRoot" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber addNewRsidRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(RSIDROOT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rsidRoot" element
     */
    public void unsetRsidRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSIDROOT$0, 0);
        }
    }
    
    /**
     * Gets a List of "rsid" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber> getRsidList()
    {
        final class RsidList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber get(int i)
                { return CTDocRsidsImpl.this.getRsidArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber old = CTDocRsidsImpl.this.getRsidArray(i);
                CTDocRsidsImpl.this.setRsidArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber o)
                { CTDocRsidsImpl.this.insertNewRsid(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber old = CTDocRsidsImpl.this.getRsidArray(i);
                CTDocRsidsImpl.this.removeRsid(i);
                return old;
            }
            
            public int size()
                { return CTDocRsidsImpl.this.sizeOfRsidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RsidList();
        }
    }
    
    /**
     * Gets array of all "rsid" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber[] getRsidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RSID$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rsid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber getRsidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(RSID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rsid" element
     */
    public int sizeOfRsidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSID$2);
        }
    }
    
    /**
     * Sets array of all "rsid" element
     */
    public void setRsidArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber[] rsidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rsidArray, RSID$2);
        }
    }
    
    /**
     * Sets ith "rsid" element
     */
    public void setRsidArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber rsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(RSID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rsid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rsid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber insertNewRsid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().insert_element_user(RSID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rsid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber addNewRsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(RSID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "rsid" element
     */
    public void removeRsid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSID$2, i);
        }
    }
}

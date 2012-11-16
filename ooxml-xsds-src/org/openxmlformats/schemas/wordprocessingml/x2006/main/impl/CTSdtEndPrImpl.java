/*
 * XML Type:  CT_SdtEndPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SdtEndPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSdtEndPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr
{
    
    public CTSdtEndPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    
    
    /**
     * Gets a List of "rPr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr> getRPrList()
    {
        final class RPrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr get(int i)
                { return CTSdtEndPrImpl.this.getRPrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr old = CTSdtEndPrImpl.this.getRPrArray(i);
                CTSdtEndPrImpl.this.setRPrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr o)
                { CTSdtEndPrImpl.this.insertNewRPr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr old = CTSdtEndPrImpl.this.getRPrArray(i);
                CTSdtEndPrImpl.this.removeRPr(i);
                return old;
            }
            
            public int size()
                { return CTSdtEndPrImpl.this.sizeOfRPrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RPrList();
        }
    }
    
    /**
     * Gets array of all "rPr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr[] getRPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RPR$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr getRPrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rPr" element
     */
    public int sizeOfRPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPR$0);
        }
    }
    
    /**
     * Sets array of all "rPr" element
     */
    public void setRPrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr[] rPrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rPrArray, RPR$0);
        }
    }
    
    /**
     * Sets ith "rPr" element
     */
    public void setRPrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rPr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr insertNewRPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().insert_element_user(RPR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rPr" element
     */
    public void removeRPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPR$0, i);
        }
    }
}

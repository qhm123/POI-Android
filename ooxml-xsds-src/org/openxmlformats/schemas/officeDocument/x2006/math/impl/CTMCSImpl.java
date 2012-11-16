/*
 * XML Type:  CT_MCS
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_MCS(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTMCSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS
{
    
    public CTMCSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mc");
    
    
    /**
     * Gets a List of "mc" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTMC> getMcList()
    {
        final class McList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.math.CTMC>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTMC get(int i)
                { return CTMCSImpl.this.getMcArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTMC set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTMC o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTMC old = CTMCSImpl.this.getMcArray(i);
                CTMCSImpl.this.setMcArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTMC o)
                { CTMCSImpl.this.insertNewMc(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTMC remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTMC old = CTMCSImpl.this.getMcArray(i);
                CTMCSImpl.this.removeMc(i);
                return old;
            }
            
            public int size()
                { return CTMCSImpl.this.sizeOfMcArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new McList();
        }
    }
    
    /**
     * Gets array of all "mc" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMC[] getMcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MC$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMC[] result = new org.openxmlformats.schemas.officeDocument.x2006.math.CTMC[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMC getMcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMC target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMC)get_store().find_element_user(MC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mc" element
     */
    public int sizeOfMcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MC$0);
        }
    }
    
    /**
     * Sets array of all "mc" element
     */
    public void setMcArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTMC[] mcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mcArray, MC$0);
        }
    }
    
    /**
     * Sets ith "mc" element
     */
    public void setMcArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTMC mc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMC target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMC)get_store().find_element_user(MC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMC insertNewMc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMC target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMC)get_store().insert_element_user(MC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMC addNewMc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMC target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMC)get_store().add_element_user(MC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "mc" element
     */
    public void removeMc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MC$0, i);
        }
    }
}

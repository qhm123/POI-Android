/*
 * XML Type:  CT_M
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTM
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_M(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTMImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTM
{
    
    public CTMImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mPr");
    private static final javax.xml.namespace.QName MR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mr");
    
    
    /**
     * Gets the "mPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr getMPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr)get_store().find_element_user(MPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mPr" element
     */
    public boolean isSetMPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MPR$0) != 0;
        }
    }
    
    /**
     * Sets the "mPr" element
     */
    public void setMPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr mPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr)get_store().find_element_user(MPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr)get_store().add_element_user(MPR$0);
            }
            target.set(mPr);
        }
    }
    
    /**
     * Appends and returns a new empty "mPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr addNewMPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr)get_store().add_element_user(MPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "mPr" element
     */
    public void unsetMPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MPR$0, 0);
        }
    }
    
    /**
     * Gets a List of "mr" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTMR> getMrList()
    {
        final class MrList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.math.CTMR>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTMR get(int i)
                { return CTMImpl.this.getMrArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTMR set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTMR o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTMR old = CTMImpl.this.getMrArray(i);
                CTMImpl.this.setMrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTMR o)
                { CTMImpl.this.insertNewMr(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTMR remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTMR old = CTMImpl.this.getMrArray(i);
                CTMImpl.this.removeMr(i);
                return old;
            }
            
            public int size()
                { return CTMImpl.this.sizeOfMrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MrList();
        }
    }
    
    /**
     * Gets array of all "mr" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMR[] getMrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MR$2, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMR[] result = new org.openxmlformats.schemas.officeDocument.x2006.math.CTMR[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMR getMrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMR target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMR)get_store().find_element_user(MR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mr" element
     */
    public int sizeOfMrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MR$2);
        }
    }
    
    /**
     * Sets array of all "mr" element
     */
    public void setMrArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTMR[] mrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mrArray, MR$2);
        }
    }
    
    /**
     * Sets ith "mr" element
     */
    public void setMrArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTMR mr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMR target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMR)get_store().find_element_user(MR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMR insertNewMr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMR target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMR)get_store().insert_element_user(MR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMR addNewMr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMR target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMR)get_store().add_element_user(MR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "mr" element
     */
    public void removeMr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MR$2, i);
        }
    }
}

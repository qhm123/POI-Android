/*
 * XML Type:  CT_EqArr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_EqArr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTEqArrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArr
{
    
    public CTEqArrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQARRPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "eqArrPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "eqArrPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr getEqArrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr)get_store().find_element_user(EQARRPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "eqArrPr" element
     */
    public boolean isSetEqArrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EQARRPR$0) != 0;
        }
    }
    
    /**
     * Sets the "eqArrPr" element
     */
    public void setEqArrPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr eqArrPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr)get_store().find_element_user(EQARRPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr)get_store().add_element_user(EQARRPR$0);
            }
            target.set(eqArrPr);
        }
    }
    
    /**
     * Appends and returns a new empty "eqArrPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr addNewEqArrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr)get_store().add_element_user(EQARRPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "eqArrPr" element
     */
    public void unsetEqArrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EQARRPR$0, 0);
        }
    }
    
    /**
     * Gets a List of "e" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg> getEList()
    {
        final class EList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg get(int i)
                { return CTEqArrImpl.this.getEArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg old = CTEqArrImpl.this.getEArray(i);
                CTEqArrImpl.this.setEArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg o)
                { CTEqArrImpl.this.insertNewE(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg old = CTEqArrImpl.this.getEArray(i);
                CTEqArrImpl.this.removeE(i);
                return old;
            }
            
            public int size()
                { return CTEqArrImpl.this.sizeOfEArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EList();
        }
    }
    
    /**
     * Gets array of all "e" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg[] getEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(E$2, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg[] result = new org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "e" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getEArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "e" element
     */
    public int sizeOfEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(E$2);
        }
    }
    
    /**
     * Sets array of all "e" element
     */
    public void setEArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg[] eArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eArray, E$2);
        }
    }
    
    /**
     * Sets ith "e" element
     */
    public void setEArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg e)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(e);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "e" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg insertNewE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().insert_element_user(E$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "e" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "e" element
     */
    public void removeE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(E$2, i);
        }
    }
}

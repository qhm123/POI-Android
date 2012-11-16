/*
 * XML Type:  CT_DocVars
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocVars(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocVarsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars
{
    
    public CTDocVarsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCVAR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docVar");
    
    
    /**
     * Gets a List of "docVar" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar> getDocVarList()
    {
        final class DocVarList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar get(int i)
                { return CTDocVarsImpl.this.getDocVarArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar old = CTDocVarsImpl.this.getDocVarArray(i);
                CTDocVarsImpl.this.setDocVarArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar o)
                { CTDocVarsImpl.this.insertNewDocVar(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar old = CTDocVarsImpl.this.getDocVarArray(i);
                CTDocVarsImpl.this.removeDocVar(i);
                return old;
            }
            
            public int size()
                { return CTDocVarsImpl.this.sizeOfDocVarArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DocVarList();
        }
    }
    
    /**
     * Gets array of all "docVar" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar[] getDocVarArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCVAR$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "docVar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar getDocVarArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar)get_store().find_element_user(DOCVAR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "docVar" element
     */
    public int sizeOfDocVarArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCVAR$0);
        }
    }
    
    /**
     * Sets array of all "docVar" element
     */
    public void setDocVarArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar[] docVarArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(docVarArray, DOCVAR$0);
        }
    }
    
    /**
     * Sets ith "docVar" element
     */
    public void setDocVarArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar docVar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar)get_store().find_element_user(DOCVAR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(docVar);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "docVar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar insertNewDocVar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar)get_store().insert_element_user(DOCVAR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "docVar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar addNewDocVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar)get_store().add_element_user(DOCVAR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "docVar" element
     */
    public void removeDocVar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCVAR$0, i);
        }
    }
}

/*
 * XML Type:  CT_TLTimeConditionList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTimeConditionList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTimeConditionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList
{
    
    public CTTLTimeConditionListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COND$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cond");
    
    
    /**
     * Gets a List of "cond" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition> getCondList()
    {
        final class CondList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition get(int i)
                { return CTTLTimeConditionListImpl.this.getCondArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition old = CTTLTimeConditionListImpl.this.getCondArray(i);
                CTTLTimeConditionListImpl.this.setCondArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition o)
                { CTTLTimeConditionListImpl.this.insertNewCond(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition old = CTTLTimeConditionListImpl.this.getCondArray(i);
                CTTLTimeConditionListImpl.this.removeCond(i);
                return old;
            }
            
            public int size()
                { return CTTLTimeConditionListImpl.this.sizeOfCondArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CondList();
        }
    }
    
    /**
     * Gets array of all "cond" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition[] getCondArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COND$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cond" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition getCondArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition)get_store().find_element_user(COND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cond" element
     */
    public int sizeOfCondArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COND$0);
        }
    }
    
    /**
     * Sets array of all "cond" element
     */
    public void setCondArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition[] condArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(condArray, COND$0);
        }
    }
    
    /**
     * Sets ith "cond" element
     */
    public void setCondArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition cond)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition)get_store().find_element_user(COND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cond);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cond" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition insertNewCond(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition)get_store().insert_element_user(COND$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cond" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition addNewCond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition)get_store().add_element_user(COND$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cond" element
     */
    public void removeCond(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COND$0, i);
        }
    }
}

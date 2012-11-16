/*
 * XML Type:  CT_DocPartBehaviors
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocPartBehaviors(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocPartBehaviorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors
{
    
    public CTDocPartBehaviorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEHAVIOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "behavior");
    
    
    /**
     * Gets a List of "behavior" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior> getBehaviorList()
    {
        final class BehaviorList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior get(int i)
                { return CTDocPartBehaviorsImpl.this.getBehaviorArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior old = CTDocPartBehaviorsImpl.this.getBehaviorArray(i);
                CTDocPartBehaviorsImpl.this.setBehaviorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior o)
                { CTDocPartBehaviorsImpl.this.insertNewBehavior(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior old = CTDocPartBehaviorsImpl.this.getBehaviorArray(i);
                CTDocPartBehaviorsImpl.this.removeBehavior(i);
                return old;
            }
            
            public int size()
                { return CTDocPartBehaviorsImpl.this.sizeOfBehaviorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BehaviorList();
        }
    }
    
    /**
     * Gets array of all "behavior" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior[] getBehaviorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BEHAVIOR$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "behavior" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior getBehaviorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior)get_store().find_element_user(BEHAVIOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "behavior" element
     */
    public int sizeOfBehaviorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEHAVIOR$0);
        }
    }
    
    /**
     * Sets array of all "behavior" element
     */
    public void setBehaviorArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior[] behaviorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(behaviorArray, BEHAVIOR$0);
        }
    }
    
    /**
     * Sets ith "behavior" element
     */
    public void setBehaviorArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior behavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior)get_store().find_element_user(BEHAVIOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(behavior);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "behavior" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior insertNewBehavior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior)get_store().insert_element_user(BEHAVIOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "behavior" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior addNewBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior)get_store().add_element_user(BEHAVIOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "behavior" element
     */
    public void removeBehavior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEHAVIOR$0, i);
        }
    }
}

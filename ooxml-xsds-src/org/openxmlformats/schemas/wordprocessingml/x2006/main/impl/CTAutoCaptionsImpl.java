/*
 * XML Type:  CT_AutoCaptions
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_AutoCaptions(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAutoCaptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions
{
    
    public CTAutoCaptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOCAPTION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoCaption");
    
    
    /**
     * Gets a List of "autoCaption" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption> getAutoCaptionList()
    {
        final class AutoCaptionList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption get(int i)
                { return CTAutoCaptionsImpl.this.getAutoCaptionArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption old = CTAutoCaptionsImpl.this.getAutoCaptionArray(i);
                CTAutoCaptionsImpl.this.setAutoCaptionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption o)
                { CTAutoCaptionsImpl.this.insertNewAutoCaption(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption old = CTAutoCaptionsImpl.this.getAutoCaptionArray(i);
                CTAutoCaptionsImpl.this.removeAutoCaption(i);
                return old;
            }
            
            public int size()
                { return CTAutoCaptionsImpl.this.sizeOfAutoCaptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AutoCaptionList();
        }
    }
    
    /**
     * Gets array of all "autoCaption" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption[] getAutoCaptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTOCAPTION$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "autoCaption" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption getAutoCaptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption)get_store().find_element_user(AUTOCAPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "autoCaption" element
     */
    public int sizeOfAutoCaptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOCAPTION$0);
        }
    }
    
    /**
     * Sets array of all "autoCaption" element
     */
    public void setAutoCaptionArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption[] autoCaptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(autoCaptionArray, AUTOCAPTION$0);
        }
    }
    
    /**
     * Sets ith "autoCaption" element
     */
    public void setAutoCaptionArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption autoCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption)get_store().find_element_user(AUTOCAPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(autoCaption);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "autoCaption" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption insertNewAutoCaption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption)get_store().insert_element_user(AUTOCAPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "autoCaption" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption addNewAutoCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption)get_store().add_element_user(AUTOCAPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "autoCaption" element
     */
    public void removeAutoCaption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOCAPTION$0, i);
        }
    }
}

/*
 * XML Type:  CT_EdnDocProps
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_EdnDocProps(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTEdnDocPropsImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTEdnPropsImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps
{
    
    public CTEdnDocPropsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDNOTE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnote");
    
    
    /**
     * Gets a List of "endnote" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef> getEndnoteList()
    {
        final class EndnoteList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef get(int i)
                { return CTEdnDocPropsImpl.this.getEndnoteArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef old = CTEdnDocPropsImpl.this.getEndnoteArray(i);
                CTEdnDocPropsImpl.this.setEndnoteArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef o)
                { CTEdnDocPropsImpl.this.insertNewEndnote(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef old = CTEdnDocPropsImpl.this.getEndnoteArray(i);
                CTEdnDocPropsImpl.this.removeEndnote(i);
                return old;
            }
            
            public int size()
                { return CTEdnDocPropsImpl.this.sizeOfEndnoteArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndnoteList();
        }
    }
    
    /**
     * Gets array of all "endnote" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] getEndnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENDNOTE$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "endnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef getEndnoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef)get_store().find_element_user(ENDNOTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "endnote" element
     */
    public int sizeOfEndnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDNOTE$0);
        }
    }
    
    /**
     * Sets array of all "endnote" element
     */
    public void setEndnoteArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] endnoteArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endnoteArray, ENDNOTE$0);
        }
    }
    
    /**
     * Sets ith "endnote" element
     */
    public void setEndnoteArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef endnote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef)get_store().find_element_user(ENDNOTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endnote);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef insertNewEndnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef)get_store().insert_element_user(ENDNOTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef addNewEndnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef)get_store().add_element_user(ENDNOTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "endnote" element
     */
    public void removeEndnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDNOTE$0, i);
        }
    }
}

/*
 * XML Type:  CT_Endnotes
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Endnotes(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTEndnotesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes
{
    
    public CTEndnotesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDNOTE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnote");
    
    
    /**
     * Gets a List of "endnote" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn> getEndnoteList()
    {
        final class EndnoteList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn get(int i)
                { return CTEndnotesImpl.this.getEndnoteArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn old = CTEndnotesImpl.this.getEndnoteArray(i);
                CTEndnotesImpl.this.setEndnoteArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn o)
                { CTEndnotesImpl.this.insertNewEndnote(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn old = CTEndnotesImpl.this.getEndnoteArray(i);
                CTEndnotesImpl.this.removeEndnote(i);
                return old;
            }
            
            public int size()
                { return CTEndnotesImpl.this.sizeOfEndnoteArray(); }
            
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn[] getEndnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENDNOTE$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "endnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn getEndnoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn)get_store().find_element_user(ENDNOTE$0, i);
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
    public void setEndnoteArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn[] endnoteArray)
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
    public void setEndnoteArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn endnote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn)get_store().find_element_user(ENDNOTE$0, i);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn insertNewEndnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn)get_store().insert_element_user(ENDNOTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn addNewEndnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn)get_store().add_element_user(ENDNOTE$0);
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

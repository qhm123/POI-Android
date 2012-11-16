/*
 * XML Type:  CT_Footnotes
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Footnotes(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFootnotesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes
{
    
    public CTFootnotesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOOTNOTE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnote");
    
    
    /**
     * Gets a List of "footnote" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn> getFootnoteList()
    {
        final class FootnoteList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn get(int i)
                { return CTFootnotesImpl.this.getFootnoteArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn old = CTFootnotesImpl.this.getFootnoteArray(i);
                CTFootnotesImpl.this.setFootnoteArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn o)
                { CTFootnotesImpl.this.insertNewFootnote(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn old = CTFootnotesImpl.this.getFootnoteArray(i);
                CTFootnotesImpl.this.removeFootnote(i);
                return old;
            }
            
            public int size()
                { return CTFootnotesImpl.this.sizeOfFootnoteArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FootnoteList();
        }
    }
    
    /**
     * Gets array of all "footnote" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn[] getFootnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOOTNOTE$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "footnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn getFootnoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn)get_store().find_element_user(FOOTNOTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "footnote" element
     */
    public int sizeOfFootnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTE$0);
        }
    }
    
    /**
     * Sets array of all "footnote" element
     */
    public void setFootnoteArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn[] footnoteArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(footnoteArray, FOOTNOTE$0);
        }
    }
    
    /**
     * Sets ith "footnote" element
     */
    public void setFootnoteArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn footnote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn)get_store().find_element_user(FOOTNOTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(footnote);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn insertNewFootnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn)get_store().insert_element_user(FOOTNOTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn addNewFootnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn)get_store().add_element_user(FOOTNOTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "footnote" element
     */
    public void removeFootnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTE$0, i);
        }
    }
}

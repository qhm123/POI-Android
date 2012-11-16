/*
 * XML Type:  CT_Divs
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Divs(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDivsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs
{
    
    public CTDivsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIV$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "div");
    
    
    /**
     * Gets a List of "div" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv> getDivList()
    {
        final class DivList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv get(int i)
                { return CTDivsImpl.this.getDivArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv old = CTDivsImpl.this.getDivArray(i);
                CTDivsImpl.this.setDivArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv o)
                { CTDivsImpl.this.insertNewDiv(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv old = CTDivsImpl.this.getDivArray(i);
                CTDivsImpl.this.removeDiv(i);
                return old;
            }
            
            public int size()
                { return CTDivsImpl.this.sizeOfDivArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DivList();
        }
    }
    
    /**
     * Gets array of all "div" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv[] getDivArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIV$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "div" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv getDivArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv)get_store().find_element_user(DIV$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "div" element
     */
    public int sizeOfDivArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIV$0);
        }
    }
    
    /**
     * Sets array of all "div" element
     */
    public void setDivArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv[] divArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(divArray, DIV$0);
        }
    }
    
    /**
     * Sets ith "div" element
     */
    public void setDivArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv div)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv)get_store().find_element_user(DIV$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(div);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "div" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv insertNewDiv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv)get_store().insert_element_user(DIV$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "div" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv addNewDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv)get_store().add_element_user(DIV$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "div" element
     */
    public void removeDiv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIV$0, i);
        }
    }
}

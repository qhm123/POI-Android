/*
 * XML Type:  CT_CommentList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_CommentList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTCommentListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList
{
    
    public CTCommentListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cm");
    
    
    /**
     * Gets a List of "cm" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTComment> getCmList()
    {
        final class CmList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTComment>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTComment get(int i)
                { return CTCommentListImpl.this.getCmArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTComment set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTComment o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTComment old = CTCommentListImpl.this.getCmArray(i);
                CTCommentListImpl.this.setCmArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTComment o)
                { CTCommentListImpl.this.insertNewCm(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTComment remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTComment old = CTCommentListImpl.this.getCmArray(i);
                CTCommentListImpl.this.removeCm(i);
                return old;
            }
            
            public int size()
                { return CTCommentListImpl.this.sizeOfCmArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CmList();
        }
    }
    
    /**
     * Gets array of all "cm" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTComment[] getCmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CM$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTComment[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTComment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cm" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTComment getCmArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTComment target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTComment)get_store().find_element_user(CM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cm" element
     */
    public int sizeOfCmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CM$0);
        }
    }
    
    /**
     * Sets array of all "cm" element
     */
    public void setCmArray(org.openxmlformats.schemas.presentationml.x2006.main.CTComment[] cmArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cmArray, CM$0);
        }
    }
    
    /**
     * Sets ith "cm" element
     */
    public void setCmArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTComment cm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTComment target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTComment)get_store().find_element_user(CM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cm" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTComment insertNewCm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTComment target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTComment)get_store().insert_element_user(CM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cm" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTComment addNewCm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTComment target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTComment)get_store().add_element_user(CM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cm" element
     */
    public void removeCm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CM$0, i);
        }
    }
}

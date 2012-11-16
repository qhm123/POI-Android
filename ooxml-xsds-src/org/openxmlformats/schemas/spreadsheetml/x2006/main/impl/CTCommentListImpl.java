/*
 * XML Type:  CT_CommentList
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CommentList(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCommentListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList
{
    
    public CTCommentListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "comment");
    
    
    /**
     * Gets a List of "comment" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment> getCommentList()
    {
        final class CommentList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment get(int i)
                { return CTCommentListImpl.this.getCommentArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment old = CTCommentListImpl.this.getCommentArray(i);
                CTCommentListImpl.this.setCommentArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment o)
                { CTCommentListImpl.this.insertNewComment(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment old = CTCommentListImpl.this.getCommentArray(i);
                CTCommentListImpl.this.removeComment(i);
                return old;
            }
            
            public int size()
                { return CTCommentListImpl.this.sizeOfCommentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CommentList();
        }
    }
    
    /**
     * Gets array of all "comment" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment[] getCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comment" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment getCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment)get_store().find_element_user(COMMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comment" element
     */
    public int sizeOfCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$0);
        }
    }
    
    /**
     * Sets array of all "comment" element
     */
    public void setCommentArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment[] commentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentArray, COMMENT$0);
        }
    }
    
    /**
     * Sets ith "comment" element
     */
    public void setCommentArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment)get_store().find_element_user(COMMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comment" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment insertNewComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment)get_store().insert_element_user(COMMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comment" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment addNewComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment)get_store().add_element_user(COMMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "comment" element
     */
    public void removeComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$0, i);
        }
    }
}

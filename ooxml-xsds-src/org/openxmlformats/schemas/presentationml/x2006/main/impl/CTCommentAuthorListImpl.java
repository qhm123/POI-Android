/*
 * XML Type:  CT_CommentAuthorList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_CommentAuthorList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTCommentAuthorListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList
{
    
    public CTCommentAuthorListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CMAUTHOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cmAuthor");
    
    
    /**
     * Gets a List of "cmAuthor" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor> getCmAuthorList()
    {
        final class CmAuthorList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor get(int i)
                { return CTCommentAuthorListImpl.this.getCmAuthorArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor old = CTCommentAuthorListImpl.this.getCmAuthorArray(i);
                CTCommentAuthorListImpl.this.setCmAuthorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor o)
                { CTCommentAuthorListImpl.this.insertNewCmAuthor(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor old = CTCommentAuthorListImpl.this.getCmAuthorArray(i);
                CTCommentAuthorListImpl.this.removeCmAuthor(i);
                return old;
            }
            
            public int size()
                { return CTCommentAuthorListImpl.this.sizeOfCmAuthorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CmAuthorList();
        }
    }
    
    /**
     * Gets array of all "cmAuthor" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor[] getCmAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CMAUTHOR$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cmAuthor" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor getCmAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor)get_store().find_element_user(CMAUTHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cmAuthor" element
     */
    public int sizeOfCmAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CMAUTHOR$0);
        }
    }
    
    /**
     * Sets array of all "cmAuthor" element
     */
    public void setCmAuthorArray(org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor[] cmAuthorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cmAuthorArray, CMAUTHOR$0);
        }
    }
    
    /**
     * Sets ith "cmAuthor" element
     */
    public void setCmAuthorArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor cmAuthor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor)get_store().find_element_user(CMAUTHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cmAuthor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cmAuthor" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor insertNewCmAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor)get_store().insert_element_user(CMAUTHOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cmAuthor" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor addNewCmAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor)get_store().add_element_user(CMAUTHOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cmAuthor" element
     */
    public void removeCmAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CMAUTHOR$0, i);
        }
    }
}

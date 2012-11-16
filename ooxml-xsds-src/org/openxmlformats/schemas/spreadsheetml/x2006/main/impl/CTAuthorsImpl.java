/*
 * XML Type:  CT_Authors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Authors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTAuthorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors
{
    
    public CTAuthorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "author");
    
    
    /**
     * Gets a List of "author" elements
     */
    public java.util.List<java.lang.String> getAuthorList()
    {
        final class AuthorList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTAuthorsImpl.this.getAuthorArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTAuthorsImpl.this.getAuthorArray(i);
                CTAuthorsImpl.this.setAuthorArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTAuthorsImpl.this.insertAuthor(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTAuthorsImpl.this.getAuthorArray(i);
                CTAuthorsImpl.this.removeAuthor(i);
                return old;
            }
            
            public int size()
                { return CTAuthorsImpl.this.sizeOfAuthorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AuthorList();
        }
    }
    
    /**
     * Gets array of all "author" elements
     */
    public java.lang.String[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public java.lang.String getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "author" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring> xgetAuthorList()
    {
        final class AuthorList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring get(int i)
                { return CTAuthorsImpl.this.xgetAuthorArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring old = CTAuthorsImpl.this.xgetAuthorArray(i);
                CTAuthorsImpl.this.xsetAuthorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring o)
                { CTAuthorsImpl.this.insertNewAuthor(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring old = CTAuthorsImpl.this.xgetAuthorArray(i);
                CTAuthorsImpl.this.removeAuthor(i);
                return old;
            }
            
            public int size()
                { return CTAuthorsImpl.this.sizeOfAuthorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AuthorList();
        }
    }
    
    /**
     * Gets (as xml) array of all "author" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring[] xgetAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "author" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(AUTHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)target;
        }
    }
    
    /**
     * Returns number of "author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$0);
        }
    }
    
    /**
     * Sets array of all "author" element
     */
    public void setAuthorArray(java.lang.String[] authorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authorArray, AUTHOR$0);
        }
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(author);
        }
    }
    
    /**
     * Sets (as xml) array of all "author" element
     */
    public void xsetAuthorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring[]authorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authorArray, AUTHOR$0);
        }
    }
    
    /**
     * Sets (as xml) ith "author" element
     */
    public void xsetAuthorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(AUTHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(author);
        }
    }
    
    /**
     * Inserts the value as the ith "author" element
     */
    public void insertAuthor(int i, java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AUTHOR$0, i);
            target.setStringValue(author);
        }
    }
    
    /**
     * Appends the value as the last "author" element
     */
    public void addAuthor(java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHOR$0);
            target.setStringValue(author);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().insert_element_user(AUTHOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(AUTHOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$0, i);
        }
    }
}

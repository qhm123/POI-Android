/*
 * XML Type:  CT_MoveBookmark
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_MoveBookmark(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTMoveBookmarkImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTBookmarkImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark
{
    
    public CTMoveBookmarkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "author");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "date");
    
    
    /**
     * Gets the "author" attribute
     */
    public java.lang.String getAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHOR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "author" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(AUTHOR$0);
            return target;
        }
    }
    
    /**
     * Sets the "author" attribute
     */
    public void setAuthor(java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHOR$0);
            }
            target.setStringValue(author);
        }
    }
    
    /**
     * Sets (as xml) the "author" attribute
     */
    public void xsetAuthor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(AUTHOR$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(AUTHOR$0);
            }
            target.set(author);
        }
    }
    
    /**
     * Gets the "date" attribute
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$2);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime)get_store().find_attribute_user(DATE$2);
            return target;
        }
    }
    
    /**
     * Sets the "date" attribute
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$2);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" attribute
     */
    public void xsetDate(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime)get_store().find_attribute_user(DATE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime)get_store().add_attribute_user(DATE$2);
            }
            target.set(date);
        }
    }
}

/*
 * An XML document type.
 * Localname: comments
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CommentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one comments(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class CommentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CommentsDocument
{
    
    public CommentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "comments");
    
    
    /**
     * Gets the "comments" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments)get_store().find_element_user(COMMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "comments" element
     */
    public void setComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments comments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments)get_store().find_element_user(COMMENTS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments)get_store().add_element_user(COMMENTS$0);
            }
            target.set(comments);
        }
    }
    
    /**
     * Appends and returns a new empty "comments" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments addNewComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments)get_store().add_element_user(COMMENTS$0);
            return target;
        }
    }
}

/*
 * XML Type:  CT_Comments
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Comments(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCommentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments
{
    
    public CTCommentsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "authors");
    private static final javax.xml.namespace.QName COMMENTLIST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "commentList");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "authors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors getAuthors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors)get_store().find_element_user(AUTHORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "authors" element
     */
    public void setAuthors(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors authors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors)get_store().find_element_user(AUTHORS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors)get_store().add_element_user(AUTHORS$0);
            }
            target.set(authors);
        }
    }
    
    /**
     * Appends and returns a new empty "authors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors addNewAuthors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors)get_store().add_element_user(AUTHORS$0);
            return target;
        }
    }
    
    /**
     * Gets the "commentList" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList getCommentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList)get_store().find_element_user(COMMENTLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "commentList" element
     */
    public void setCommentList(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList commentList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList)get_store().find_element_user(COMMENTLIST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList)get_store().add_element_user(COMMENTLIST$2);
            }
            target.set(commentList);
        }
    }
    
    /**
     * Appends and returns a new empty "commentList" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList addNewCommentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList)get_store().add_element_user(COMMENTLIST$2);
            return target;
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$4) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$4, 0);
        }
    }
}

/*
 * An XML document type.
 * Localname: cmAuthorLst
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CmAuthorLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one cmAuthorLst(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class CmAuthorLstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CmAuthorLstDocument
{
    
    public CmAuthorLstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CMAUTHORLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cmAuthorLst");
    
    
    /**
     * Gets the "cmAuthorLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList getCmAuthorLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList)get_store().find_element_user(CMAUTHORLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cmAuthorLst" element
     */
    public void setCmAuthorLst(org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList cmAuthorLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList)get_store().find_element_user(CMAUTHORLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList)get_store().add_element_user(CMAUTHORLST$0);
            }
            target.set(cmAuthorLst);
        }
    }
    
    /**
     * Appends and returns a new empty "cmAuthorLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList addNewCmAuthorLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList)get_store().add_element_user(CMAUTHORLST$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: cmLst
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CmLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one cmLst(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class CmLstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CmLstDocument
{
    
    public CmLstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CMLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cmLst");
    
    
    /**
     * Gets the "cmLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList getCmLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList)get_store().find_element_user(CMLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cmLst" element
     */
    public void setCmLst(org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList cmLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList)get_store().find_element_user(CMLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList)get_store().add_element_user(CMLST$0);
            }
            target.set(cmLst);
        }
    }
    
    /**
     * Appends and returns a new empty "cmLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList addNewCmLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList)get_store().add_element_user(CMLST$0);
            return target;
        }
    }
}

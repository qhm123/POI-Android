/*
 * An XML document type.
 * Localname: revisions
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.RevisionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one revisions(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class RevisionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.RevisionsDocument
{
    
    public RevisionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVISIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "revisions");
    
    
    /**
     * Gets the "revisions" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions getRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions)get_store().find_element_user(REVISIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "revisions" element
     */
    public void setRevisions(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions revisions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions)get_store().find_element_user(REVISIONS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions)get_store().add_element_user(REVISIONS$0);
            }
            target.set(revisions);
        }
    }
    
    /**
     * Appends and returns a new empty "revisions" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions addNewRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions)get_store().add_element_user(REVISIONS$0);
            return target;
        }
    }
}

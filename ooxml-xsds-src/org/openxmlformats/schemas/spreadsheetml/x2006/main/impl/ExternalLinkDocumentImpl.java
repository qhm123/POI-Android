/*
 * An XML document type.
 * Localname: externalLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ExternalLinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one externalLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class ExternalLinkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.ExternalLinkDocument
{
    
    public ExternalLinkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALLINK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalLink");
    
    
    /**
     * Gets the "externalLink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink getExternalLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink)get_store().find_element_user(EXTERNALLINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "externalLink" element
     */
    public void setExternalLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink externalLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink)get_store().find_element_user(EXTERNALLINK$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink)get_store().add_element_user(EXTERNALLINK$0);
            }
            target.set(externalLink);
        }
    }
    
    /**
     * Appends and returns a new empty "externalLink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink addNewExternalLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink)get_store().add_element_user(EXTERNALLINK$0);
            return target;
        }
    }
}

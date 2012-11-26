/*
 * An XML document type.
 * Localname: presentation
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.PresentationDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one presentation(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class PresentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.PresentationDocument
{
    
    public PresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRESENTATION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "presentation");
    
    
    /**
     * Gets the "presentation" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation getPresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation)get_store().find_element_user(PRESENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "presentation" element
     */
    public void setPresentation(org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation presentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation)get_store().find_element_user(PRESENTATION$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation)get_store().add_element_user(PRESENTATION$0);
            }
            target.set(presentation);
        }
    }
    
    /**
     * Appends and returns a new empty "presentation" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation addNewPresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation)get_store().add_element_user(PRESENTATION$0);
            return target;
        }
    }
}

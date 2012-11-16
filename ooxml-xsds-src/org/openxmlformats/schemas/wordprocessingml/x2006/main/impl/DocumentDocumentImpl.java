/*
 * An XML document type.
 * Localname: document
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.DocumentDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one document(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class DocumentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.DocumentDocument
{
    
    public DocumentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "document");
    
    
    /**
     * Gets the "document" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1 getDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1 target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1)get_store().find_element_user(DOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "document" element
     */
    public void setDocument(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1 document)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1 target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1)get_store().find_element_user(DOCUMENT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1)get_store().add_element_user(DOCUMENT$0);
            }
            target.set(document);
        }
    }
    
    /**
     * Appends and returns a new empty "document" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1 addNewDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1 target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1)get_store().add_element_user(DOCUMENT$0);
            return target;
        }
    }
}

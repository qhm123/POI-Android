/*
 * An XML document type.
 * Localname: recipients
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.RecipientsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one recipients(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class RecipientsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.RecipientsDocument
{
    
    public RecipientsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIPIENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "recipients");
    
    
    /**
     * Gets the "recipients" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients getRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients)get_store().find_element_user(RECIPIENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recipients" element
     */
    public void setRecipients(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients recipients)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients)get_store().find_element_user(RECIPIENTS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients)get_store().add_element_user(RECIPIENTS$0);
            }
            target.set(recipients);
        }
    }
    
    /**
     * Appends and returns a new empty "recipients" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients addNewRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients)get_store().add_element_user(RECIPIENTS$0);
            return target;
        }
    }
}

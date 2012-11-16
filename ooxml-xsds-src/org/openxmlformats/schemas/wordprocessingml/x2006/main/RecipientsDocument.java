/*
 * An XML document type.
 * Localname: recipients
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.RecipientsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * A document containing one recipients(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public interface RecipientsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecipientsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("recipients6a1adoctype");
    
    /**
     * Gets the "recipients" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients getRecipients();
    
    /**
     * Sets the "recipients" element
     */
    void setRecipients(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients recipients);
    
    /**
     * Appends and returns a new empty "recipients" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients addNewRecipients();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_GlossaryDocument
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_GlossaryDocument(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGlossaryDocument1Impl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTDocumentBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1
{
    
    public CTGlossaryDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCPARTS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docParts");
    
    
    /**
     * Gets the "docParts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts getDocParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts)get_store().find_element_user(DOCPARTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docParts" element
     */
    public boolean isSetDocParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPARTS$0) != 0;
        }
    }
    
    /**
     * Sets the "docParts" element
     */
    public void setDocParts(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts docParts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts)get_store().find_element_user(DOCPARTS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts)get_store().add_element_user(DOCPARTS$0);
            }
            target.set(docParts);
        }
    }
    
    /**
     * Appends and returns a new empty "docParts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts addNewDocParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts)get_store().add_element_user(DOCPARTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "docParts" element
     */
    public void unsetDocParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPARTS$0, 0);
        }
    }
}

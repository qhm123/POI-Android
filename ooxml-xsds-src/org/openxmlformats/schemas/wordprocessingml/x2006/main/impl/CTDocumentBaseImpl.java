/*
 * XML Type:  CT_DocumentBase
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocumentBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocumentBase(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocumentBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocumentBase
{
    
    public CTDocumentBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BACKGROUND$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "background");
    
    
    /**
     * Gets the "background" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground getBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground)get_store().find_element_user(BACKGROUND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "background" element
     */
    public boolean isSetBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BACKGROUND$0) != 0;
        }
    }
    
    /**
     * Sets the "background" element
     */
    public void setBackground(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground background)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground)get_store().find_element_user(BACKGROUND$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground)get_store().add_element_user(BACKGROUND$0);
            }
            target.set(background);
        }
    }
    
    /**
     * Appends and returns a new empty "background" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground addNewBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground)get_store().add_element_user(BACKGROUND$0);
            return target;
        }
    }
    
    /**
     * Unsets the "background" element
     */
    public void unsetBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BACKGROUND$0, 0);
        }
    }
}

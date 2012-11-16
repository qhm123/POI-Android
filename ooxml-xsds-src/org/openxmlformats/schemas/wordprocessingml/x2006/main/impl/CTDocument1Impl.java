/*
 * XML Type:  CT_Document
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Document(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocument1Impl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTDocumentBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1
{
    
    public CTDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "body");
    
    
    /**
     * Gets the "body" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "body" element
     */
    public boolean isSetBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODY$0) != 0;
        }
    }
    
    /**
     * Sets the "body" element
     */
    public void setBody(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody)get_store().add_element_user(BODY$0);
            }
            target.set(body);
        }
    }
    
    /**
     * Appends and returns a new empty "body" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody addNewBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody)get_store().add_element_user(BODY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "body" element
     */
    public void unsetBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODY$0, 0);
        }
    }
}

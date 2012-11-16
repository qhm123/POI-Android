/*
 * An XML document type.
 * Localname: endnotes
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.EndnotesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one endnotes(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class EndnotesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.EndnotesDocument
{
    
    public EndnotesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDNOTES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnotes");
    
    
    /**
     * Gets the "endnotes" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes getEndnotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes)get_store().find_element_user(ENDNOTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endnotes" element
     */
    public void setEndnotes(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes endnotes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes)get_store().find_element_user(ENDNOTES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes)get_store().add_element_user(ENDNOTES$0);
            }
            target.set(endnotes);
        }
    }
    
    /**
     * Appends and returns a new empty "endnotes" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes addNewEndnotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes)get_store().add_element_user(ENDNOTES$0);
            return target;
        }
    }
}

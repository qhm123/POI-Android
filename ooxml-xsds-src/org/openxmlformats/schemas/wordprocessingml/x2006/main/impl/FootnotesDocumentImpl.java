/*
 * An XML document type.
 * Localname: footnotes
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.FootnotesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one footnotes(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class FootnotesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.FootnotesDocument
{
    
    public FootnotesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOOTNOTES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnotes");
    
    
    /**
     * Gets the "footnotes" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes getFootnotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes)get_store().find_element_user(FOOTNOTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "footnotes" element
     */
    public void setFootnotes(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes footnotes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes)get_store().find_element_user(FOOTNOTES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes)get_store().add_element_user(FOOTNOTES$0);
            }
            target.set(footnotes);
        }
    }
    
    /**
     * Appends and returns a new empty "footnotes" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes addNewFootnotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes)get_store().add_element_user(FOOTNOTES$0);
            return target;
        }
    }
}

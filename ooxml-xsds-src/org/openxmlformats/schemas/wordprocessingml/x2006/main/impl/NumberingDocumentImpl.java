/*
 * An XML document type.
 * Localname: numbering
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.NumberingDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one numbering(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class NumberingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.NumberingDocument
{
    
    public NumberingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBERING$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numbering");
    
    
    /**
     * Gets the "numbering" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering getNumbering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering)get_store().find_element_user(NUMBERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numbering" element
     */
    public void setNumbering(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering numbering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering)get_store().find_element_user(NUMBERING$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering)get_store().add_element_user(NUMBERING$0);
            }
            target.set(numbering);
        }
    }
    
    /**
     * Appends and returns a new empty "numbering" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering addNewNumbering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering)get_store().add_element_user(NUMBERING$0);
            return target;
        }
    }
}

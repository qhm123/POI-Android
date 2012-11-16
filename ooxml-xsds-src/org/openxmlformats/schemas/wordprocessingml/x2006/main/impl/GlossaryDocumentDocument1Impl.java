/*
 * An XML document type.
 * Localname: glossaryDocument
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.GlossaryDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one glossaryDocument(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class GlossaryDocumentDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.GlossaryDocumentDocument1
{
    
    public GlossaryDocumentDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOSSARYDOCUMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "glossaryDocument");
    
    
    /**
     * Gets the "glossaryDocument" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1 getGlossaryDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1 target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1)get_store().find_element_user(GLOSSARYDOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "glossaryDocument" element
     */
    public void setGlossaryDocument(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1 glossaryDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1 target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1)get_store().find_element_user(GLOSSARYDOCUMENT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1)get_store().add_element_user(GLOSSARYDOCUMENT$0);
            }
            target.set(glossaryDocument);
        }
    }
    
    /**
     * Appends and returns a new empty "glossaryDocument" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1 addNewGlossaryDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1 target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGlossaryDocument1)get_store().add_element_user(GLOSSARYDOCUMENT$0);
            return target;
        }
    }
}

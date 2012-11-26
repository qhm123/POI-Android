/*
 * An XML document type.
 * Localname: notes
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.NotesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one notes(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class NotesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.NotesDocument
{
    
    public NotesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notes");
    
    
    /**
     * Gets the "notes" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide)get_store().find_element_user(NOTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notes" element
     */
    public void setNotes(org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide)get_store().find_element_user(NOTES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide)get_store().add_element_user(NOTES$0);
            }
            target.set(notes);
        }
    }
    
    /**
     * Appends and returns a new empty "notes" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide addNewNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide)get_store().add_element_user(NOTES$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: notesMaster
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.NotesMasterDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one notesMaster(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class NotesMasterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.NotesMasterDocument
{
    
    public NotesMasterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTESMASTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesMaster");
    
    
    /**
     * Gets the "notesMaster" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster getNotesMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster)get_store().find_element_user(NOTESMASTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notesMaster" element
     */
    public void setNotesMaster(org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster notesMaster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster)get_store().find_element_user(NOTESMASTER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster)get_store().add_element_user(NOTESMASTER$0);
            }
            target.set(notesMaster);
        }
    }
    
    /**
     * Appends and returns a new empty "notesMaster" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster addNewNotesMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster)get_store().add_element_user(NOTESMASTER$0);
            return target;
        }
    }
}

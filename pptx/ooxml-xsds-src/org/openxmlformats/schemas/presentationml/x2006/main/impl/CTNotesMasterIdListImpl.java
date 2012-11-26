/*
 * XML Type:  CT_NotesMasterIdList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_NotesMasterIdList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTNotesMasterIdListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList
{
    
    public CTNotesMasterIdListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTESMASTERID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesMasterId");
    
    
    /**
     * Gets the "notesMasterId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry getNotesMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry)get_store().find_element_user(NOTESMASTERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notesMasterId" element
     */
    public boolean isSetNotesMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTESMASTERID$0) != 0;
        }
    }
    
    /**
     * Sets the "notesMasterId" element
     */
    public void setNotesMasterId(org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry notesMasterId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry)get_store().find_element_user(NOTESMASTERID$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry)get_store().add_element_user(NOTESMASTERID$0);
            }
            target.set(notesMasterId);
        }
    }
    
    /**
     * Appends and returns a new empty "notesMasterId" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry addNewNotesMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry)get_store().add_element_user(NOTESMASTERID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "notesMasterId" element
     */
    public void unsetNotesMasterId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTESMASTERID$0, 0);
        }
    }
}

/*
 * XML Type:  CT_DocPartCategory
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocPartCategory(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocPartCategoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory
{
    
    public CTDocPartCategoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName GALLERY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gallery");
    
    
    /**
     * Gets the "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "gallery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery getGallery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery)get_store().find_element_user(GALLERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gallery" element
     */
    public void setGallery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery gallery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery)get_store().find_element_user(GALLERY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery)get_store().add_element_user(GALLERY$2);
            }
            target.set(gallery);
        }
    }
    
    /**
     * Appends and returns a new empty "gallery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery addNewGallery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery)get_store().add_element_user(GALLERY$2);
            return target;
        }
    }
}

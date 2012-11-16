/*
 * XML Type:  CT_SdtDocPart
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SdtDocPart(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSdtDocPartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart
{
    
    public CTSdtDocPartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCPARTGALLERY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartGallery");
    private static final javax.xml.namespace.QName DOCPARTCATEGORY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartCategory");
    private static final javax.xml.namespace.QName DOCPARTUNIQUE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartUnique");
    
    
    /**
     * Gets the "docPartGallery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getDocPartGallery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DOCPARTGALLERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docPartGallery" element
     */
    public boolean isSetDocPartGallery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPARTGALLERY$0) != 0;
        }
    }
    
    /**
     * Sets the "docPartGallery" element
     */
    public void setDocPartGallery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString docPartGallery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DOCPARTGALLERY$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DOCPARTGALLERY$0);
            }
            target.set(docPartGallery);
        }
    }
    
    /**
     * Appends and returns a new empty "docPartGallery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewDocPartGallery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DOCPARTGALLERY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "docPartGallery" element
     */
    public void unsetDocPartGallery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPARTGALLERY$0, 0);
        }
    }
    
    /**
     * Gets the "docPartCategory" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getDocPartCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DOCPARTCATEGORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docPartCategory" element
     */
    public boolean isSetDocPartCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPARTCATEGORY$2) != 0;
        }
    }
    
    /**
     * Sets the "docPartCategory" element
     */
    public void setDocPartCategory(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString docPartCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DOCPARTCATEGORY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DOCPARTCATEGORY$2);
            }
            target.set(docPartCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "docPartCategory" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewDocPartCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DOCPARTCATEGORY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "docPartCategory" element
     */
    public void unsetDocPartCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPARTCATEGORY$2, 0);
        }
    }
    
    /**
     * Gets the "docPartUnique" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDocPartUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DOCPARTUNIQUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docPartUnique" element
     */
    public boolean isSetDocPartUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPARTUNIQUE$4) != 0;
        }
    }
    
    /**
     * Sets the "docPartUnique" element
     */
    public void setDocPartUnique(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff docPartUnique)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DOCPARTUNIQUE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DOCPARTUNIQUE$4);
            }
            target.set(docPartUnique);
        }
    }
    
    /**
     * Appends and returns a new empty "docPartUnique" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDocPartUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DOCPARTUNIQUE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "docPartUnique" element
     */
    public void unsetDocPartUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPARTUNIQUE$4, 0);
        }
    }
}

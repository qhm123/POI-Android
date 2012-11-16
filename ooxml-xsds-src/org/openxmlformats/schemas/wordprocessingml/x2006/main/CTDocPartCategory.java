/*
 * XML Type:  CT_DocPartCategory
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocPartCategory(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocPartCategory extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocPartCategory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocpartcategory38c9type");
    
    /**
     * Gets the "name" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewName();
    
    /**
     * Gets the "gallery" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery getGallery();
    
    /**
     * Sets the "gallery" element
     */
    void setGallery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery gallery);
    
    /**
     * Appends and returns a new empty "gallery" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery addNewGallery();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

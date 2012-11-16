/*
 * An XML document type.
 * Localname: tagLst
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.TagLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * A document containing one tagLst(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public interface TagLstDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TagLstDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("taglst05dedoctype");
    
    /**
     * Gets the "tagLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTagList getTagLst();
    
    /**
     * Sets the "tagLst" element
     */
    void setTagLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTagList tagLst);
    
    /**
     * Appends and returns a new empty "tagLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTagList addNewTagLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

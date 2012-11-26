/*
 * An XML document type.
 * Localname: tagLst
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.TagLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one tagLst(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class TagLstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.TagLstDocument
{
    
    public TagLstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAGLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tagLst");
    
    
    /**
     * Gets the "tagLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTagList getTagLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTagList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTagList)get_store().find_element_user(TAGLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tagLst" element
     */
    public void setTagLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTagList tagLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTagList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTagList)get_store().find_element_user(TAGLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTagList)get_store().add_element_user(TAGLST$0);
            }
            target.set(tagLst);
        }
    }
    
    /**
     * Appends and returns a new empty "tagLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTagList addNewTagLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTagList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTagList)get_store().add_element_user(TAGLST$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: sldLayout
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.SldLayoutDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one sldLayout(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class SldLayoutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.SldLayoutDocument
{
    
    public SldLayoutDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDLAYOUT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldLayout");
    
    
    /**
     * Gets the "sldLayout" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout getSldLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout)get_store().find_element_user(SLDLAYOUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sldLayout" element
     */
    public void setSldLayout(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout sldLayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout)get_store().find_element_user(SLDLAYOUT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout)get_store().add_element_user(SLDLAYOUT$0);
            }
            target.set(sldLayout);
        }
    }
    
    /**
     * Appends and returns a new empty "sldLayout" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout addNewSldLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout)get_store().add_element_user(SLDLAYOUT$0);
            return target;
        }
    }
}

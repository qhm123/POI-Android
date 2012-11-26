/*
 * An XML document type.
 * Localname: sld
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.SldDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one sld(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class SldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.SldDocument
{
    
    public SldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sld");
    
    
    /**
     * Gets the "sld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlide getSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide)get_store().find_element_user(SLD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sld" element
     */
    public void setSld(org.openxmlformats.schemas.presentationml.x2006.main.CTSlide sld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide)get_store().find_element_user(SLD$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide)get_store().add_element_user(SLD$0);
            }
            target.set(sld);
        }
    }
    
    /**
     * Appends and returns a new empty "sld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlide addNewSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide)get_store().add_element_user(SLD$0);
            return target;
        }
    }
}

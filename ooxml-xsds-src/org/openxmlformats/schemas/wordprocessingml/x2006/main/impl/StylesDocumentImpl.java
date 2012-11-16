/*
 * An XML document type.
 * Localname: styles
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.StylesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one styles(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class StylesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.StylesDocument
{
    
    public StylesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styles");
    
    
    /**
     * Gets the "styles" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles getStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles)get_store().find_element_user(STYLES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styles" element
     */
    public void setStyles(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles styles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles)get_store().find_element_user(STYLES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles)get_store().add_element_user(STYLES$0);
            }
            target.set(styles);
        }
    }
    
    /**
     * Appends and returns a new empty "styles" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles addNewStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles)get_store().add_element_user(STYLES$0);
            return target;
        }
    }
}

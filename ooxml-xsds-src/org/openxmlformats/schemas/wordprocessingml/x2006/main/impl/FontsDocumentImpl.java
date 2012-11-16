/*
 * An XML document type.
 * Localname: fonts
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.FontsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one fonts(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class FontsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.FontsDocument
{
    
    public FontsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONTS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fonts");
    
    
    /**
     * Gets the "fonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList getFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList)get_store().find_element_user(FONTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fonts" element
     */
    public void setFonts(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList fonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList)get_store().find_element_user(FONTS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList)get_store().add_element_user(FONTS$0);
            }
            target.set(fonts);
        }
    }
    
    /**
     * Appends and returns a new empty "fonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList addNewFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList)get_store().add_element_user(FONTS$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: theme
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * A document containing one theme(@http://schemas.openxmlformats.org/drawingml/2006/main) element.
 *
 * This is a complex type.
 */
public class ThemeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument
{
    
    public ThemeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THEME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "theme");
    
    
    /**
     * Gets the "theme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet getTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet)get_store().find_element_user(THEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "theme" element
     */
    public void setTheme(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet theme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet)get_store().find_element_user(THEME$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet)get_store().add_element_user(THEME$0);
            }
            target.set(theme);
        }
    }
    
    /**
     * Appends and returns a new empty "theme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet addNewTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet)get_store().add_element_user(THEME$0);
            return target;
        }
    }
}

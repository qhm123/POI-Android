/*
 * An XML document type.
 * Localname: themeOverride
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.ThemeOverrideDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * A document containing one themeOverride(@http://schemas.openxmlformats.org/drawingml/2006/main) element.
 *
 * This is a complex type.
 */
public class ThemeOverrideDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.ThemeOverrideDocument
{
    
    public ThemeOverrideDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THEMEOVERRIDE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "themeOverride");
    
    
    /**
     * Gets the "themeOverride" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride getThemeOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride)get_store().find_element_user(THEMEOVERRIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "themeOverride" element
     */
    public void setThemeOverride(org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride themeOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride)get_store().find_element_user(THEMEOVERRIDE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride)get_store().add_element_user(THEMEOVERRIDE$0);
            }
            target.set(themeOverride);
        }
    }
    
    /**
     * Appends and returns a new empty "themeOverride" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride addNewThemeOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStylesOverride)get_store().add_element_user(THEMEOVERRIDE$0);
            return target;
        }
    }
}

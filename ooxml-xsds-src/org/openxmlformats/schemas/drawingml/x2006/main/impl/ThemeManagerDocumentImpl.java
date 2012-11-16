/*
 * An XML document type.
 * Localname: themeManager
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.ThemeManagerDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * A document containing one themeManager(@http://schemas.openxmlformats.org/drawingml/2006/main) element.
 *
 * This is a complex type.
 */
public class ThemeManagerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.ThemeManagerDocument
{
    
    public ThemeManagerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THEMEMANAGER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "themeManager");
    
    
    /**
     * Gets the "themeManager" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement getThemeManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement)get_store().find_element_user(THEMEMANAGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "themeManager" element
     */
    public void setThemeManager(org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement themeManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement)get_store().find_element_user(THEMEMANAGER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement)get_store().add_element_user(THEMEMANAGER$0);
            }
            target.set(themeManager);
        }
    }
    
    /**
     * Appends and returns a new empty "themeManager" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement addNewThemeManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement)get_store().add_element_user(THEMEMANAGER$0);
            return target;
        }
    }
}

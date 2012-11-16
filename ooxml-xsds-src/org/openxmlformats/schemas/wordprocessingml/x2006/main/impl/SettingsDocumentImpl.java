/*
 * An XML document type.
 * Localname: settings
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.SettingsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one settings(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class SettingsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.SettingsDocument
{
    
    public SettingsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTINGS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "settings");
    
    
    /**
     * Gets the "settings" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings getSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings)get_store().find_element_user(SETTINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "settings" element
     */
    public void setSettings(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings settings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings)get_store().find_element_user(SETTINGS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings)get_store().add_element_user(SETTINGS$0);
            }
            target.set(settings);
        }
    }
    
    /**
     * Appends and returns a new empty "settings" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings addNewSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings)get_store().add_element_user(SETTINGS$0);
            return target;
        }
    }
}

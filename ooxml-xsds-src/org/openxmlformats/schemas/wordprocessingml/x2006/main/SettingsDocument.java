/*
 * An XML document type.
 * Localname: settings
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.SettingsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * A document containing one settings(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public interface SettingsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SettingsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("settings9dd1doctype");
    
    /**
     * Gets the "settings" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings getSettings();
    
    /**
     * Sets the "settings" element
     */
    void setSettings(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings settings);
    
    /**
     * Appends and returns a new empty "settings" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings addNewSettings();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

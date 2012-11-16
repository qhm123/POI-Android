/*
 * An XML document type.
 * Localname: webSettings
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.WebSettingsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * A document containing one webSettings(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public interface WebSettingsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebSettingsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("websettings0b2fdoctype");
    
    /**
     * Gets the "webSettings" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings getWebSettings();
    
    /**
     * Sets the "webSettings" element
     */
    void setWebSettings(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings webSettings);
    
    /**
     * Appends and returns a new empty "webSettings" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings addNewWebSettings();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML document type.
 * Localname: webSettings
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.WebSettingsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one webSettings(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class WebSettingsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.WebSettingsDocument
{
    
    public WebSettingsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBSETTINGS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "webSettings");
    
    
    /**
     * Gets the "webSettings" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings getWebSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings)get_store().find_element_user(WEBSETTINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "webSettings" element
     */
    public void setWebSettings(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings webSettings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings)get_store().find_element_user(WEBSETTINGS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings)get_store().add_element_user(WEBSETTINGS$0);
            }
            target.set(webSettings);
        }
    }
    
    /**
     * Appends and returns a new empty "webSettings" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings addNewWebSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings)get_store().add_element_user(WEBSETTINGS$0);
            return target;
        }
    }
}

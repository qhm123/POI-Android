/*
 * XML Type:  CT_ClipboardStyleSheet
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTClipboardStyleSheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ClipboardStyleSheet(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTClipboardStyleSheetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTClipboardStyleSheet
{
    
    public CTClipboardStyleSheetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THEMEELEMENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "themeElements");
    private static final javax.xml.namespace.QName CLRMAP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrMap");
    
    
    /**
     * Gets the "themeElements" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles getThemeElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles)get_store().find_element_user(THEMEELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "themeElements" element
     */
    public void setThemeElements(org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles themeElements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles)get_store().find_element_user(THEMEELEMENTS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles)get_store().add_element_user(THEMEELEMENTS$0);
            }
            target.set(themeElements);
        }
    }
    
    /**
     * Appends and returns a new empty "themeElements" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles addNewThemeElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles)get_store().add_element_user(THEMEELEMENTS$0);
            return target;
        }
    }
    
    /**
     * Gets the "clrMap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping getClrMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(CLRMAP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clrMap" element
     */
    public void setClrMap(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping clrMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(CLRMAP$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(CLRMAP$2);
            }
            target.set(clrMap);
        }
    }
    
    /**
     * Appends and returns a new empty "clrMap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping addNewClrMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(CLRMAP$2);
            return target;
        }
    }
}

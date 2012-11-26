/*
 * XML Type:  CT_ColorSchemeAndMapping
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ColorSchemeAndMapping(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorSchemeAndMappingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping
{
    
    public CTColorSchemeAndMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLRSCHEME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrScheme");
    private static final javax.xml.namespace.QName CLRMAP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrMap");
    
    
    /**
     * Gets the "clrScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme getClrScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme)get_store().find_element_user(CLRSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clrScheme" element
     */
    public void setClrScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme clrScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme)get_store().find_element_user(CLRSCHEME$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme)get_store().add_element_user(CLRSCHEME$0);
            }
            target.set(clrScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "clrScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme addNewClrScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme)get_store().add_element_user(CLRSCHEME$0);
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
     * True if has "clrMap" element
     */
    public boolean isSetClrMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRMAP$2) != 0;
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
    
    /**
     * Unsets the "clrMap" element
     */
    public void unsetClrMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRMAP$2, 0);
        }
    }
}

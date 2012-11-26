/*
 * XML Type:  CT_ColorSchemeAndMapping
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_ColorSchemeAndMapping(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColorSchemeAndMapping extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColorSchemeAndMapping.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolorschemeandmappingbab0type");
    
    /**
     * Gets the "clrScheme" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme getClrScheme();
    
    /**
     * Sets the "clrScheme" element
     */
    void setClrScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme clrScheme);
    
    /**
     * Appends and returns a new empty "clrScheme" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme addNewClrScheme();
    
    /**
     * Gets the "clrMap" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping getClrMap();
    
    /**
     * True if has "clrMap" element
     */
    boolean isSetClrMap();
    
    /**
     * Sets the "clrMap" element
     */
    void setClrMap(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping clrMap);
    
    /**
     * Appends and returns a new empty "clrMap" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping addNewClrMap();
    
    /**
     * Unsets the "clrMap" element
     */
    void unsetClrMap();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

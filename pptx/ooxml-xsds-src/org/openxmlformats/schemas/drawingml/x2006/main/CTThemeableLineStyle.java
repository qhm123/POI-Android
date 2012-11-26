/*
 * XML Type:  CT_ThemeableLineStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_ThemeableLineStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTThemeableLineStyle extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTThemeableLineStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctthemeablelinestyle4d95type");
    
    /**
     * Gets the "ln" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLn();
    
    /**
     * True if has "ln" element
     */
    boolean isSetLn();
    
    /**
     * Sets the "ln" element
     */
    void setLn(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties ln);
    
    /**
     * Appends and returns a new empty "ln" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLn();
    
    /**
     * Unsets the "ln" element
     */
    void unsetLn();
    
    /**
     * Gets the "lnRef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getLnRef();
    
    /**
     * True if has "lnRef" element
     */
    boolean isSetLnRef();
    
    /**
     * Sets the "lnRef" element
     */
    void setLnRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference lnRef);
    
    /**
     * Appends and returns a new empty "lnRef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewLnRef();
    
    /**
     * Unsets the "lnRef" element
     */
    void unsetLnRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

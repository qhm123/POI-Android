/*
 * XML Type:  CT_BaseStyles
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_BaseStyles(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBaseStyles extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBaseStyles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctbasestyles122etype");
    
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
     * Gets the "fontScheme" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme getFontScheme();
    
    /**
     * Sets the "fontScheme" element
     */
    void setFontScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme fontScheme);
    
    /**
     * Appends and returns a new empty "fontScheme" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme addNewFontScheme();
    
    /**
     * Gets the "fmtScheme" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix getFmtScheme();
    
    /**
     * Sets the "fmtScheme" element
     */
    void setFmtScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix fmtScheme);
    
    /**
     * Appends and returns a new empty "fmtScheme" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix addNewFmtScheme();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

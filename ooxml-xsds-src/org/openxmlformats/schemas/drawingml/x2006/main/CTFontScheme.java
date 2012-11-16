/*
 * XML Type:  CT_FontScheme
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_FontScheme(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFontScheme extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFontScheme.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfontscheme232ftype");
    
    /**
     * Gets the "majorFont" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection getMajorFont();
    
    /**
     * Sets the "majorFont" element
     */
    void setMajorFont(org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection majorFont);
    
    /**
     * Appends and returns a new empty "majorFont" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection addNewMajorFont();
    
    /**
     * Gets the "minorFont" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection getMinorFont();
    
    /**
     * Sets the "minorFont" element
     */
    void setMinorFont(org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection minorFont);
    
    /**
     * Appends and returns a new empty "minorFont" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection addNewMinorFont();
    
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
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

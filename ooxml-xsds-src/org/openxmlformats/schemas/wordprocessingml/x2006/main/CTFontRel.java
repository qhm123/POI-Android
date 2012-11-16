/*
 * XML Type:  CT_FontRel
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_FontRel(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFontRel extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFontRel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfontrelc308type");
    
    /**
     * Gets the "fontKey" attribute
     */
    java.lang.String getFontKey();
    
    /**
     * Gets (as xml) the "fontKey" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid xgetFontKey();
    
    /**
     * True if has "fontKey" attribute
     */
    boolean isSetFontKey();
    
    /**
     * Sets the "fontKey" attribute
     */
    void setFontKey(java.lang.String fontKey);
    
    /**
     * Sets (as xml) the "fontKey" attribute
     */
    void xsetFontKey(org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid fontKey);
    
    /**
     * Unsets the "fontKey" attribute
     */
    void unsetFontKey();
    
    /**
     * Gets the "subsetted" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getSubsetted();
    
    /**
     * Gets (as xml) the "subsetted" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetSubsetted();
    
    /**
     * True if has "subsetted" attribute
     */
    boolean isSetSubsetted();
    
    /**
     * Sets the "subsetted" attribute
     */
    void setSubsetted(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum subsetted);
    
    /**
     * Sets (as xml) the "subsetted" attribute
     */
    void xsetSubsetted(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff subsetted);
    
    /**
     * Unsets the "subsetted" attribute
     */
    void unsetSubsetted();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

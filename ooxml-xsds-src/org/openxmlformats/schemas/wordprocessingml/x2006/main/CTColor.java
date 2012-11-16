/*
 * XML Type:  CT_Color
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Color(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColor extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolor6d4ftype");
    
    /**
     * Gets the "val" attribute
     */
    java.lang.Object getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor xgetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(java.lang.Object val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor val);
    
    /**
     * Gets the "themeColor" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor.Enum getThemeColor();
    
    /**
     * Gets (as xml) the "themeColor" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor xgetThemeColor();
    
    /**
     * True if has "themeColor" attribute
     */
    boolean isSetThemeColor();
    
    /**
     * Sets the "themeColor" attribute
     */
    void setThemeColor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor.Enum themeColor);
    
    /**
     * Sets (as xml) the "themeColor" attribute
     */
    void xsetThemeColor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor themeColor);
    
    /**
     * Unsets the "themeColor" attribute
     */
    void unsetThemeColor();
    
    /**
     * Gets the "themeTint" attribute
     */
    byte[] getThemeTint();
    
    /**
     * Gets (as xml) the "themeTint" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber xgetThemeTint();
    
    /**
     * True if has "themeTint" attribute
     */
    boolean isSetThemeTint();
    
    /**
     * Sets the "themeTint" attribute
     */
    void setThemeTint(byte[] themeTint);
    
    /**
     * Sets (as xml) the "themeTint" attribute
     */
    void xsetThemeTint(org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber themeTint);
    
    /**
     * Unsets the "themeTint" attribute
     */
    void unsetThemeTint();
    
    /**
     * Gets the "themeShade" attribute
     */
    byte[] getThemeShade();
    
    /**
     * Gets (as xml) the "themeShade" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber xgetThemeShade();
    
    /**
     * True if has "themeShade" attribute
     */
    boolean isSetThemeShade();
    
    /**
     * Sets the "themeShade" attribute
     */
    void setThemeShade(byte[] themeShade);
    
    /**
     * Sets (as xml) the "themeShade" attribute
     */
    void xsetThemeShade(org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber themeShade);
    
    /**
     * Unsets the "themeShade" attribute
     */
    void unsetThemeShade();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

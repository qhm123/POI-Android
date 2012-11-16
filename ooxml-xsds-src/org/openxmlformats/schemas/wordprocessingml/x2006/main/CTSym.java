/*
 * XML Type:  CT_Sym
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Sym(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSym extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSym.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsym0dabtype");
    
    /**
     * Gets the "font" attribute
     */
    java.lang.String getFont();
    
    /**
     * Gets (as xml) the "font" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetFont();
    
    /**
     * True if has "font" attribute
     */
    boolean isSetFont();
    
    /**
     * Sets the "font" attribute
     */
    void setFont(java.lang.String font);
    
    /**
     * Sets (as xml) the "font" attribute
     */
    void xsetFont(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString font);
    
    /**
     * Unsets the "font" attribute
     */
    void unsetFont();
    
    /**
     * Gets the "char" attribute
     */
    byte[] getChar();
    
    /**
     * Gets (as xml) the "char" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber xgetChar();
    
    /**
     * True if has "char" attribute
     */
    boolean isSetChar();
    
    /**
     * Sets the "char" attribute
     */
    void setChar(byte[] xchar);
    
    /**
     * Sets (as xml) the "char" attribute
     */
    void xsetChar(org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber xchar);
    
    /**
     * Unsets the "char" attribute
     */
    void unsetChar();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_PhoneticPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PhoneticPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPhoneticPr extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPhoneticPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctphoneticpr898btype");
    
    /**
     * Gets the "fontId" attribute
     */
    long getFontId();
    
    /**
     * Gets (as xml) the "fontId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId xgetFontId();
    
    /**
     * Sets the "fontId" attribute
     */
    void setFontId(long fontId);
    
    /**
     * Sets (as xml) the "fontId" attribute
     */
    void xsetFontId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId fontId);
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "alignment" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment.Enum getAlignment();
    
    /**
     * Gets (as xml) the "alignment" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment xgetAlignment();
    
    /**
     * True if has "alignment" attribute
     */
    boolean isSetAlignment();
    
    /**
     * Sets the "alignment" attribute
     */
    void setAlignment(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment.Enum alignment);
    
    /**
     * Sets (as xml) the "alignment" attribute
     */
    void xsetAlignment(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment alignment);
    
    /**
     * Unsets the "alignment" attribute
     */
    void unsetAlignment();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

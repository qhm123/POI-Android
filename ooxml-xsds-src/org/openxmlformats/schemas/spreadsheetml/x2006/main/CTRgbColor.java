/*
 * XML Type:  CT_RgbColor
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RgbColor(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRgbColor extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRgbColor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrgbcolor95dftype");
    
    /**
     * Gets the "rgb" attribute
     */
    byte[] getRgb();
    
    /**
     * Gets (as xml) the "rgb" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetRgb();
    
    /**
     * True if has "rgb" attribute
     */
    boolean isSetRgb();
    
    /**
     * Sets the "rgb" attribute
     */
    void setRgb(byte[] rgb);
    
    /**
     * Sets (as xml) the "rgb" attribute
     */
    void xsetRgb(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex rgb);
    
    /**
     * Unsets the "rgb" attribute
     */
    void unsetRgb();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

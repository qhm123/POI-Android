/*
 * XML Type:  CT_Fill
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Fill(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFill extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFill.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfill550ctype");
    
    /**
     * Gets the "patternFill" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill getPatternFill();
    
    /**
     * True if has "patternFill" element
     */
    boolean isSetPatternFill();
    
    /**
     * Sets the "patternFill" element
     */
    void setPatternFill(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill patternFill);
    
    /**
     * Appends and returns a new empty "patternFill" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill addNewPatternFill();
    
    /**
     * Unsets the "patternFill" element
     */
    void unsetPatternFill();
    
    /**
     * Gets the "gradientFill" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill getGradientFill();
    
    /**
     * True if has "gradientFill" element
     */
    boolean isSetGradientFill();
    
    /**
     * Sets the "gradientFill" element
     */
    void setGradientFill(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill gradientFill);
    
    /**
     * Appends and returns a new empty "gradientFill" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill addNewGradientFill();
    
    /**
     * Unsets the "gradientFill" element
     */
    void unsetGradientFill();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_PatternFill
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PatternFill(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPatternFill extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPatternFill.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpatternfill7452type");
    
    /**
     * Gets the "fgColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getFgColor();
    
    /**
     * True if has "fgColor" element
     */
    boolean isSetFgColor();
    
    /**
     * Sets the "fgColor" element
     */
    void setFgColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor fgColor);
    
    /**
     * Appends and returns a new empty "fgColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewFgColor();
    
    /**
     * Unsets the "fgColor" element
     */
    void unsetFgColor();
    
    /**
     * Gets the "bgColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getBgColor();
    
    /**
     * True if has "bgColor" element
     */
    boolean isSetBgColor();
    
    /**
     * Sets the "bgColor" element
     */
    void setBgColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor bgColor);
    
    /**
     * Appends and returns a new empty "bgColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewBgColor();
    
    /**
     * Unsets the "bgColor" element
     */
    void unsetBgColor();
    
    /**
     * Gets the "patternType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.Enum getPatternType();
    
    /**
     * Gets (as xml) the "patternType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType xgetPatternType();
    
    /**
     * True if has "patternType" attribute
     */
    boolean isSetPatternType();
    
    /**
     * Sets the "patternType" attribute
     */
    void setPatternType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.Enum patternType);
    
    /**
     * Sets (as xml) the "patternType" attribute
     */
    void xsetPatternType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType patternType);
    
    /**
     * Unsets the "patternType" attribute
     */
    void unsetPatternType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

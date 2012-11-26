/*
 * XML Type:  CT_PresetShadowEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_PresetShadowEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPresetShadowEffect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPresetShadowEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpresetshadoweffecta9abtype");
    
    /**
     * Gets the "scrgbClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor getScrgbClr();
    
    /**
     * True if has "scrgbClr" element
     */
    boolean isSetScrgbClr();
    
    /**
     * Sets the "scrgbClr" element
     */
    void setScrgbClr(org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor scrgbClr);
    
    /**
     * Appends and returns a new empty "scrgbClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor addNewScrgbClr();
    
    /**
     * Unsets the "scrgbClr" element
     */
    void unsetScrgbClr();
    
    /**
     * Gets the "srgbClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor getSrgbClr();
    
    /**
     * True if has "srgbClr" element
     */
    boolean isSetSrgbClr();
    
    /**
     * Sets the "srgbClr" element
     */
    void setSrgbClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor srgbClr);
    
    /**
     * Appends and returns a new empty "srgbClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor addNewSrgbClr();
    
    /**
     * Unsets the "srgbClr" element
     */
    void unsetSrgbClr();
    
    /**
     * Gets the "hslClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor getHslClr();
    
    /**
     * True if has "hslClr" element
     */
    boolean isSetHslClr();
    
    /**
     * Sets the "hslClr" element
     */
    void setHslClr(org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor hslClr);
    
    /**
     * Appends and returns a new empty "hslClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor addNewHslClr();
    
    /**
     * Unsets the "hslClr" element
     */
    void unsetHslClr();
    
    /**
     * Gets the "sysClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor getSysClr();
    
    /**
     * True if has "sysClr" element
     */
    boolean isSetSysClr();
    
    /**
     * Sets the "sysClr" element
     */
    void setSysClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor sysClr);
    
    /**
     * Appends and returns a new empty "sysClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor addNewSysClr();
    
    /**
     * Unsets the "sysClr" element
     */
    void unsetSysClr();
    
    /**
     * Gets the "schemeClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor getSchemeClr();
    
    /**
     * True if has "schemeClr" element
     */
    boolean isSetSchemeClr();
    
    /**
     * Sets the "schemeClr" element
     */
    void setSchemeClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor schemeClr);
    
    /**
     * Appends and returns a new empty "schemeClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor addNewSchemeClr();
    
    /**
     * Unsets the "schemeClr" element
     */
    void unsetSchemeClr();
    
    /**
     * Gets the "prstClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor getPrstClr();
    
    /**
     * True if has "prstClr" element
     */
    boolean isSetPrstClr();
    
    /**
     * Sets the "prstClr" element
     */
    void setPrstClr(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor prstClr);
    
    /**
     * Appends and returns a new empty "prstClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor addNewPrstClr();
    
    /**
     * Unsets the "prstClr" element
     */
    void unsetPrstClr();
    
    /**
     * Gets the "prst" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetShadowVal.Enum getPrst();
    
    /**
     * Gets (as xml) the "prst" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetShadowVal xgetPrst();
    
    /**
     * Sets the "prst" attribute
     */
    void setPrst(org.openxmlformats.schemas.drawingml.x2006.main.STPresetShadowVal.Enum prst);
    
    /**
     * Sets (as xml) the "prst" attribute
     */
    void xsetPrst(org.openxmlformats.schemas.drawingml.x2006.main.STPresetShadowVal prst);
    
    /**
     * Gets the "dist" attribute
     */
    long getDist();
    
    /**
     * Gets (as xml) the "dist" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetDist();
    
    /**
     * True if has "dist" attribute
     */
    boolean isSetDist();
    
    /**
     * Sets the "dist" attribute
     */
    void setDist(long dist);
    
    /**
     * Sets (as xml) the "dist" attribute
     */
    void xsetDist(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate dist);
    
    /**
     * Unsets the "dist" attribute
     */
    void unsetDist();
    
    /**
     * Gets the "dir" attribute
     */
    int getDir();
    
    /**
     * Gets (as xml) the "dir" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetDir();
    
    /**
     * True if has "dir" attribute
     */
    boolean isSetDir();
    
    /**
     * Sets the "dir" attribute
     */
    void setDir(int dir);
    
    /**
     * Sets (as xml) the "dir" attribute
     */
    void xsetDir(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle dir);
    
    /**
     * Unsets the "dir" attribute
     */
    void unsetDir();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

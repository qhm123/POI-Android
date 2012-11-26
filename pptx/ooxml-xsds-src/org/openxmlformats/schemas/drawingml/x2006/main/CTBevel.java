/*
 * XML Type:  CT_Bevel
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBevel
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Bevel(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBevel extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBevel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctbevel1aebtype");
    
    /**
     * Gets the "w" attribute
     */
    long getW();
    
    /**
     * Gets (as xml) the "w" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetW();
    
    /**
     * True if has "w" attribute
     */
    boolean isSetW();
    
    /**
     * Sets the "w" attribute
     */
    void setW(long w);
    
    /**
     * Sets (as xml) the "w" attribute
     */
    void xsetW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate w);
    
    /**
     * Unsets the "w" attribute
     */
    void unsetW();
    
    /**
     * Gets the "h" attribute
     */
    long getH();
    
    /**
     * Gets (as xml) the "h" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetH();
    
    /**
     * True if has "h" attribute
     */
    boolean isSetH();
    
    /**
     * Sets the "h" attribute
     */
    void setH(long h);
    
    /**
     * Sets (as xml) the "h" attribute
     */
    void xsetH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate h);
    
    /**
     * Unsets the "h" attribute
     */
    void unsetH();
    
    /**
     * Gets the "prst" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType.Enum getPrst();
    
    /**
     * Gets (as xml) the "prst" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType xgetPrst();
    
    /**
     * True if has "prst" attribute
     */
    boolean isSetPrst();
    
    /**
     * Sets the "prst" attribute
     */
    void setPrst(org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType.Enum prst);
    
    /**
     * Sets (as xml) the "prst" attribute
     */
    void xsetPrst(org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType prst);
    
    /**
     * Unsets the "prst" attribute
     */
    void unsetPrst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

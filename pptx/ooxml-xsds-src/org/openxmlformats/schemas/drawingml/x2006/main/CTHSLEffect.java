/*
 * XML Type:  CT_HSLEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_HSLEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTHSLEffect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTHSLEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cthsleffectdca3type");
    
    /**
     * Gets the "hue" attribute
     */
    int getHue();
    
    /**
     * Gets (as xml) the "hue" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetHue();
    
    /**
     * True if has "hue" attribute
     */
    boolean isSetHue();
    
    /**
     * Sets the "hue" attribute
     */
    void setHue(int hue);
    
    /**
     * Sets (as xml) the "hue" attribute
     */
    void xsetHue(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle hue);
    
    /**
     * Unsets the "hue" attribute
     */
    void unsetHue();
    
    /**
     * Gets the "sat" attribute
     */
    int getSat();
    
    /**
     * Gets (as xml) the "sat" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetSat();
    
    /**
     * True if has "sat" attribute
     */
    boolean isSetSat();
    
    /**
     * Sets the "sat" attribute
     */
    void setSat(int sat);
    
    /**
     * Sets (as xml) the "sat" attribute
     */
    void xsetSat(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage sat);
    
    /**
     * Unsets the "sat" attribute
     */
    void unsetSat();
    
    /**
     * Gets the "lum" attribute
     */
    int getLum();
    
    /**
     * Gets (as xml) the "lum" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetLum();
    
    /**
     * True if has "lum" attribute
     */
    boolean isSetLum();
    
    /**
     * Sets the "lum" attribute
     */
    void setLum(int lum);
    
    /**
     * Sets (as xml) the "lum" attribute
     */
    void xsetLum(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage lum);
    
    /**
     * Unsets the "lum" attribute
     */
    void unsetLum();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

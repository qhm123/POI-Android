/*
 * XML Type:  CT_TintEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TintEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTintEffect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTintEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttinteffect1ac7type");
    
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
     * Gets the "amt" attribute
     */
    int getAmt();
    
    /**
     * Gets (as xml) the "amt" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetAmt();
    
    /**
     * True if has "amt" attribute
     */
    boolean isSetAmt();
    
    /**
     * Sets the "amt" attribute
     */
    void setAmt(int amt);
    
    /**
     * Sets (as xml) the "amt" attribute
     */
    void xsetAmt(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage amt);
    
    /**
     * Unsets the "amt" attribute
     */
    void unsetAmt();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

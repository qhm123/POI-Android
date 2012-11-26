/*
 * XML Type:  CT_LuminanceEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_LuminanceEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTLuminanceEffect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTLuminanceEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctluminanceeffectb41atype");
    
    /**
     * Gets the "bright" attribute
     */
    int getBright();
    
    /**
     * Gets (as xml) the "bright" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetBright();
    
    /**
     * True if has "bright" attribute
     */
    boolean isSetBright();
    
    /**
     * Sets the "bright" attribute
     */
    void setBright(int bright);
    
    /**
     * Sets (as xml) the "bright" attribute
     */
    void xsetBright(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage bright);
    
    /**
     * Unsets the "bright" attribute
     */
    void unsetBright();
    
    /**
     * Gets the "contrast" attribute
     */
    int getContrast();
    
    /**
     * Gets (as xml) the "contrast" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetContrast();
    
    /**
     * True if has "contrast" attribute
     */
    boolean isSetContrast();
    
    /**
     * Sets the "contrast" attribute
     */
    void setContrast(int contrast);
    
    /**
     * Sets (as xml) the "contrast" attribute
     */
    void xsetContrast(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage contrast);
    
    /**
     * Unsets the "contrast" attribute
     */
    void unsetContrast();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

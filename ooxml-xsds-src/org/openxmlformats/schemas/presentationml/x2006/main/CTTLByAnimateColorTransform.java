/*
 * XML Type:  CT_TLByAnimateColorTransform
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLByAnimateColorTransform(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLByAnimateColorTransform extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLByAnimateColorTransform.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlbyanimatecolortransform87b4type");
    
    /**
     * Gets the "rgb" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform getRgb();
    
    /**
     * True if has "rgb" element
     */
    boolean isSetRgb();
    
    /**
     * Sets the "rgb" element
     */
    void setRgb(org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform rgb);
    
    /**
     * Appends and returns a new empty "rgb" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform addNewRgb();
    
    /**
     * Unsets the "rgb" element
     */
    void unsetRgb();
    
    /**
     * Gets the "hsl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform getHsl();
    
    /**
     * True if has "hsl" element
     */
    boolean isSetHsl();
    
    /**
     * Sets the "hsl" element
     */
    void setHsl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform hsl);
    
    /**
     * Appends and returns a new empty "hsl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLByHslColorTransform addNewHsl();
    
    /**
     * Unsets the "hsl" element
     */
    void unsetHsl();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

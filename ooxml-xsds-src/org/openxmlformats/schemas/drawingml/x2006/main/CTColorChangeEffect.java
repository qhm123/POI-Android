/*
 * XML Type:  CT_ColorChangeEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_ColorChangeEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColorChangeEffect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColorChangeEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolorchangeeffect12d5type");
    
    /**
     * Gets the "clrFrom" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColor getClrFrom();
    
    /**
     * Sets the "clrFrom" element
     */
    void setClrFrom(org.openxmlformats.schemas.drawingml.x2006.main.CTColor clrFrom);
    
    /**
     * Appends and returns a new empty "clrFrom" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewClrFrom();
    
    /**
     * Gets the "clrTo" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColor getClrTo();
    
    /**
     * Sets the "clrTo" element
     */
    void setClrTo(org.openxmlformats.schemas.drawingml.x2006.main.CTColor clrTo);
    
    /**
     * Appends and returns a new empty "clrTo" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewClrTo();
    
    /**
     * Gets the "useA" attribute
     */
    boolean getUseA();
    
    /**
     * Gets (as xml) the "useA" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUseA();
    
    /**
     * True if has "useA" attribute
     */
    boolean isSetUseA();
    
    /**
     * Sets the "useA" attribute
     */
    void setUseA(boolean useA);
    
    /**
     * Sets (as xml) the "useA" attribute
     */
    void xsetUseA(org.apache.xmlbeans.XmlBoolean useA);
    
    /**
     * Unsets the "useA" attribute
     */
    void unsetUseA();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

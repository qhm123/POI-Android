/*
 * XML Type:  CT_BlendEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_BlendEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBlendEffect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBlendEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctblendeffect9173type");
    
    /**
     * Gets the "cont" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer getCont();
    
    /**
     * Sets the "cont" element
     */
    void setCont(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer cont);
    
    /**
     * Appends and returns a new empty "cont" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer addNewCont();
    
    /**
     * Gets the "blend" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode.Enum getBlend();
    
    /**
     * Gets (as xml) the "blend" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode xgetBlend();
    
    /**
     * Sets the "blend" attribute
     */
    void setBlend(org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode.Enum blend);
    
    /**
     * Sets (as xml) the "blend" attribute
     */
    void xsetBlend(org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode blend);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

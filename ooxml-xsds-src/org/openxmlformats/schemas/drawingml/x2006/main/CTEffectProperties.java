/*
 * XML Type:  CT_EffectProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_EffectProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTEffectProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTEffectProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cteffectpropertiese23ftype");
    
    /**
     * Gets the "effectLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList getEffectLst();
    
    /**
     * True if has "effectLst" element
     */
    boolean isSetEffectLst();
    
    /**
     * Sets the "effectLst" element
     */
    void setEffectLst(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList effectLst);
    
    /**
     * Appends and returns a new empty "effectLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList addNewEffectLst();
    
    /**
     * Unsets the "effectLst" element
     */
    void unsetEffectLst();
    
    /**
     * Gets the "effectDag" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer getEffectDag();
    
    /**
     * True if has "effectDag" element
     */
    boolean isSetEffectDag();
    
    /**
     * Sets the "effectDag" element
     */
    void setEffectDag(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer effectDag);
    
    /**
     * Appends and returns a new empty "effectDag" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer addNewEffectDag();
    
    /**
     * Unsets the "effectDag" element
     */
    void unsetEffectDag();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

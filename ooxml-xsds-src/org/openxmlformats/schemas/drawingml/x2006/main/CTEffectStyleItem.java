/*
 * XML Type:  CT_EffectStyleItem
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_EffectStyleItem(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTEffectStyleItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTEffectStyleItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cteffectstyleitem05c4type");
    
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
     * Gets the "scene3d" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D getScene3D();
    
    /**
     * True if has "scene3d" element
     */
    boolean isSetScene3D();
    
    /**
     * Sets the "scene3d" element
     */
    void setScene3D(org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D scene3D);
    
    /**
     * Appends and returns a new empty "scene3d" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D addNewScene3D();
    
    /**
     * Unsets the "scene3d" element
     */
    void unsetScene3D();
    
    /**
     * Gets the "sp3d" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D getSp3D();
    
    /**
     * True if has "sp3d" element
     */
    boolean isSetSp3D();
    
    /**
     * Sets the "sp3d" element
     */
    void setSp3D(org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D sp3D);
    
    /**
     * Appends and returns a new empty "sp3d" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D addNewSp3D();
    
    /**
     * Unsets the "sp3d" element
     */
    void unsetSp3D();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

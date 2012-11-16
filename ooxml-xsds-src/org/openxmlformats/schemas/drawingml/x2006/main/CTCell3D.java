/*
 * XML Type:  CT_Cell3D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Cell3D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCell3D extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCell3D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcell3d10eetype");
    
    /**
     * Gets the "bevel" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBevel getBevel();
    
    /**
     * Sets the "bevel" element
     */
    void setBevel(org.openxmlformats.schemas.drawingml.x2006.main.CTBevel bevel);
    
    /**
     * Appends and returns a new empty "bevel" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBevel addNewBevel();
    
    /**
     * Gets the "lightRig" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig getLightRig();
    
    /**
     * True if has "lightRig" element
     */
    boolean isSetLightRig();
    
    /**
     * Sets the "lightRig" element
     */
    void setLightRig(org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig lightRig);
    
    /**
     * Appends and returns a new empty "lightRig" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig addNewLightRig();
    
    /**
     * Unsets the "lightRig" element
     */
    void unsetLightRig();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "prstMaterial" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType.Enum getPrstMaterial();
    
    /**
     * Gets (as xml) the "prstMaterial" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType xgetPrstMaterial();
    
    /**
     * True if has "prstMaterial" attribute
     */
    boolean isSetPrstMaterial();
    
    /**
     * Sets the "prstMaterial" attribute
     */
    void setPrstMaterial(org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType.Enum prstMaterial);
    
    /**
     * Sets (as xml) the "prstMaterial" attribute
     */
    void xsetPrstMaterial(org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType prstMaterial);
    
    /**
     * Unsets the "prstMaterial" attribute
     */
    void unsetPrstMaterial();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

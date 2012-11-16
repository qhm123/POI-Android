/*
 * XML Type:  CT_ShapeProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_ShapeProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTShapeProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTShapeProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctshapeproperties30e5type");
    
    /**
     * Gets the "xfrm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D getXfrm();
    
    /**
     * True if has "xfrm" element
     */
    boolean isSetXfrm();
    
    /**
     * Sets the "xfrm" element
     */
    void setXfrm(org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D xfrm);
    
    /**
     * Appends and returns a new empty "xfrm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D addNewXfrm();
    
    /**
     * Unsets the "xfrm" element
     */
    void unsetXfrm();
    
    /**
     * Gets the "custGeom" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D getCustGeom();
    
    /**
     * True if has "custGeom" element
     */
    boolean isSetCustGeom();
    
    /**
     * Sets the "custGeom" element
     */
    void setCustGeom(org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D custGeom);
    
    /**
     * Appends and returns a new empty "custGeom" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D addNewCustGeom();
    
    /**
     * Unsets the "custGeom" element
     */
    void unsetCustGeom();
    
    /**
     * Gets the "prstGeom" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D getPrstGeom();
    
    /**
     * True if has "prstGeom" element
     */
    boolean isSetPrstGeom();
    
    /**
     * Sets the "prstGeom" element
     */
    void setPrstGeom(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D prstGeom);
    
    /**
     * Appends and returns a new empty "prstGeom" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D addNewPrstGeom();
    
    /**
     * Unsets the "prstGeom" element
     */
    void unsetPrstGeom();
    
    /**
     * Gets the "noFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties getNoFill();
    
    /**
     * True if has "noFill" element
     */
    boolean isSetNoFill();
    
    /**
     * Sets the "noFill" element
     */
    void setNoFill(org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties noFill);
    
    /**
     * Appends and returns a new empty "noFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties addNewNoFill();
    
    /**
     * Unsets the "noFill" element
     */
    void unsetNoFill();
    
    /**
     * Gets the "solidFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getSolidFill();
    
    /**
     * True if has "solidFill" element
     */
    boolean isSetSolidFill();
    
    /**
     * Sets the "solidFill" element
     */
    void setSolidFill(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties solidFill);
    
    /**
     * Appends and returns a new empty "solidFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewSolidFill();
    
    /**
     * Unsets the "solidFill" element
     */
    void unsetSolidFill();
    
    /**
     * Gets the "gradFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties getGradFill();
    
    /**
     * True if has "gradFill" element
     */
    boolean isSetGradFill();
    
    /**
     * Sets the "gradFill" element
     */
    void setGradFill(org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties gradFill);
    
    /**
     * Appends and returns a new empty "gradFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties addNewGradFill();
    
    /**
     * Unsets the "gradFill" element
     */
    void unsetGradFill();
    
    /**
     * Gets the "blipFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties getBlipFill();
    
    /**
     * True if has "blipFill" element
     */
    boolean isSetBlipFill();
    
    /**
     * Sets the "blipFill" element
     */
    void setBlipFill(org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties blipFill);
    
    /**
     * Appends and returns a new empty "blipFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties addNewBlipFill();
    
    /**
     * Unsets the "blipFill" element
     */
    void unsetBlipFill();
    
    /**
     * Gets the "pattFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties getPattFill();
    
    /**
     * True if has "pattFill" element
     */
    boolean isSetPattFill();
    
    /**
     * Sets the "pattFill" element
     */
    void setPattFill(org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties pattFill);
    
    /**
     * Appends and returns a new empty "pattFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties addNewPattFill();
    
    /**
     * Unsets the "pattFill" element
     */
    void unsetPattFill();
    
    /**
     * Gets the "grpFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties getGrpFill();
    
    /**
     * True if has "grpFill" element
     */
    boolean isSetGrpFill();
    
    /**
     * Sets the "grpFill" element
     */
    void setGrpFill(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties grpFill);
    
    /**
     * Appends and returns a new empty "grpFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties addNewGrpFill();
    
    /**
     * Unsets the "grpFill" element
     */
    void unsetGrpFill();
    
    /**
     * Gets the "ln" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLn();
    
    /**
     * True if has "ln" element
     */
    boolean isSetLn();
    
    /**
     * Sets the "ln" element
     */
    void setLn(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties ln);
    
    /**
     * Appends and returns a new empty "ln" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLn();
    
    /**
     * Unsets the "ln" element
     */
    void unsetLn();
    
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
     * Gets the "bwMode" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode.Enum getBwMode();
    
    /**
     * Gets (as xml) the "bwMode" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode xgetBwMode();
    
    /**
     * True if has "bwMode" attribute
     */
    boolean isSetBwMode();
    
    /**
     * Sets the "bwMode" attribute
     */
    void setBwMode(org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode.Enum bwMode);
    
    /**
     * Sets (as xml) the "bwMode" attribute
     */
    void xsetBwMode(org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode bwMode);
    
    /**
     * Unsets the "bwMode" attribute
     */
    void unsetBwMode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

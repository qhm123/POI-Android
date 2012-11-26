/*
 * XML Type:  CT_GvmlGraphicalObjectFrame
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_GvmlGraphicalObjectFrame(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGvmlGraphicalObjectFrame extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGvmlGraphicalObjectFrame.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgvmlgraphicalobjectframe4824type");
    
    /**
     * Gets the "nvGraphicFramePr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicFrameNonVisual getNvGraphicFramePr();
    
    /**
     * Sets the "nvGraphicFramePr" element
     */
    void setNvGraphicFramePr(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicFrameNonVisual nvGraphicFramePr);
    
    /**
     * Appends and returns a new empty "nvGraphicFramePr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicFrameNonVisual addNewNvGraphicFramePr();
    
    /**
     * Gets the "graphic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject getGraphic();
    
    /**
     * Sets the "graphic" element
     */
    void setGraphic(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject graphic);
    
    /**
     * Appends and returns a new empty "graphic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject addNewGraphic();
    
    /**
     * Gets the "xfrm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D getXfrm();
    
    /**
     * Sets the "xfrm" element
     */
    void setXfrm(org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D xfrm);
    
    /**
     * Appends and returns a new empty "xfrm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D addNewXfrm();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

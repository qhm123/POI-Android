/*
 * XML Type:  CT_GraphicalObjectFrameNonVisual
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_GraphicalObjectFrameNonVisual(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGraphicalObjectFrameNonVisual extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGraphicalObjectFrameNonVisual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgraphicalobjectframenonvisual257dtype");
    
    /**
     * Gets the "cNvPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps getCNvPr();
    
    /**
     * Sets the "cNvPr" element
     */
    void setCNvPr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps cNvPr);
    
    /**
     * Appends and returns a new empty "cNvPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps addNewCNvPr();
    
    /**
     * Gets the "cNvGraphicFramePr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties getCNvGraphicFramePr();
    
    /**
     * Sets the "cNvGraphicFramePr" element
     */
    void setCNvGraphicFramePr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties cNvGraphicFramePr);
    
    /**
     * Appends and returns a new empty "cNvGraphicFramePr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr();
    
    /**
     * Gets the "nvPr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps getNvPr();
    
    /**
     * Sets the "nvPr" element
     */
    void setNvPr(org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps nvPr);
    
    /**
     * Appends and returns a new empty "nvPr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps addNewNvPr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

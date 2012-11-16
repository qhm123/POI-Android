/*
 * XML Type:  CT_Inline
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing;


/**
 * An XML CT_Inline(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public interface CTInline extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTInline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctinline5726type");
    
    /**
     * Gets the "extent" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D getExtent();
    
    /**
     * Sets the "extent" element
     */
    void setExtent(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D extent);
    
    /**
     * Appends and returns a new empty "extent" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D addNewExtent();
    
    /**
     * Gets the "effectExtent" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent getEffectExtent();
    
    /**
     * True if has "effectExtent" element
     */
    boolean isSetEffectExtent();
    
    /**
     * Sets the "effectExtent" element
     */
    void setEffectExtent(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent effectExtent);
    
    /**
     * Appends and returns a new empty "effectExtent" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent addNewEffectExtent();
    
    /**
     * Unsets the "effectExtent" element
     */
    void unsetEffectExtent();
    
    /**
     * Gets the "docPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps getDocPr();
    
    /**
     * Sets the "docPr" element
     */
    void setDocPr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps docPr);
    
    /**
     * Appends and returns a new empty "docPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps addNewDocPr();
    
    /**
     * Gets the "cNvGraphicFramePr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties getCNvGraphicFramePr();
    
    /**
     * True if has "cNvGraphicFramePr" element
     */
    boolean isSetCNvGraphicFramePr();
    
    /**
     * Sets the "cNvGraphicFramePr" element
     */
    void setCNvGraphicFramePr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties cNvGraphicFramePr);
    
    /**
     * Appends and returns a new empty "cNvGraphicFramePr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr();
    
    /**
     * Unsets the "cNvGraphicFramePr" element
     */
    void unsetCNvGraphicFramePr();
    
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
     * Gets the "distT" attribute
     */
    long getDistT();
    
    /**
     * Gets (as xml) the "distT" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistT();
    
    /**
     * True if has "distT" attribute
     */
    boolean isSetDistT();
    
    /**
     * Sets the "distT" attribute
     */
    void setDistT(long distT);
    
    /**
     * Sets (as xml) the "distT" attribute
     */
    void xsetDistT(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distT);
    
    /**
     * Unsets the "distT" attribute
     */
    void unsetDistT();
    
    /**
     * Gets the "distB" attribute
     */
    long getDistB();
    
    /**
     * Gets (as xml) the "distB" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistB();
    
    /**
     * True if has "distB" attribute
     */
    boolean isSetDistB();
    
    /**
     * Sets the "distB" attribute
     */
    void setDistB(long distB);
    
    /**
     * Sets (as xml) the "distB" attribute
     */
    void xsetDistB(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distB);
    
    /**
     * Unsets the "distB" attribute
     */
    void unsetDistB();
    
    /**
     * Gets the "distL" attribute
     */
    long getDistL();
    
    /**
     * Gets (as xml) the "distL" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistL();
    
    /**
     * True if has "distL" attribute
     */
    boolean isSetDistL();
    
    /**
     * Sets the "distL" attribute
     */
    void setDistL(long distL);
    
    /**
     * Sets (as xml) the "distL" attribute
     */
    void xsetDistL(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distL);
    
    /**
     * Unsets the "distL" attribute
     */
    void unsetDistL();
    
    /**
     * Gets the "distR" attribute
     */
    long getDistR();
    
    /**
     * Gets (as xml) the "distR" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistR();
    
    /**
     * True if has "distR" attribute
     */
    boolean isSetDistR();
    
    /**
     * Sets the "distR" attribute
     */
    void setDistR(long distR);
    
    /**
     * Sets (as xml) the "distR" attribute
     */
    void xsetDistR(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distR);
    
    /**
     * Unsets the "distR" attribute
     */
    void unsetDistR();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

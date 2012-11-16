/*
 * XML Type:  CT_GraphicFrame
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chartDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chartDrawing;


/**
 * An XML CT_GraphicFrame(@http://schemas.openxmlformats.org/drawingml/2006/chartDrawing).
 *
 * This is a complex type.
 */
public interface CTGraphicFrame extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGraphicFrame.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgraphicframe5967type");
    
    /**
     * Gets the "nvGraphicFramePr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual getNvGraphicFramePr();
    
    /**
     * Sets the "nvGraphicFramePr" element
     */
    void setNvGraphicFramePr(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual nvGraphicFramePr);
    
    /**
     * Appends and returns a new empty "nvGraphicFramePr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual addNewNvGraphicFramePr();
    
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
     * Gets the "macro" attribute
     */
    java.lang.String getMacro();
    
    /**
     * Gets (as xml) the "macro" attribute
     */
    org.apache.xmlbeans.XmlString xgetMacro();
    
    /**
     * True if has "macro" attribute
     */
    boolean isSetMacro();
    
    /**
     * Sets the "macro" attribute
     */
    void setMacro(java.lang.String macro);
    
    /**
     * Sets (as xml) the "macro" attribute
     */
    void xsetMacro(org.apache.xmlbeans.XmlString macro);
    
    /**
     * Unsets the "macro" attribute
     */
    void unsetMacro();
    
    /**
     * Gets the "fPublished" attribute
     */
    boolean getFPublished();
    
    /**
     * Gets (as xml) the "fPublished" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFPublished();
    
    /**
     * True if has "fPublished" attribute
     */
    boolean isSetFPublished();
    
    /**
     * Sets the "fPublished" attribute
     */
    void setFPublished(boolean fPublished);
    
    /**
     * Sets (as xml) the "fPublished" attribute
     */
    void xsetFPublished(org.apache.xmlbeans.XmlBoolean fPublished);
    
    /**
     * Unsets the "fPublished" attribute
     */
    void unsetFPublished();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

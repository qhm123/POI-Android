/*
 * XML Type:  CT_Anchor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing;


/**
 * An XML CT_Anchor(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public interface CTAnchor extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAnchor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctanchorff8atype");
    
    /**
     * Gets the "simplePos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getSimplePos();
    
    /**
     * Sets the "simplePos" element
     */
    void setSimplePos(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D simplePos);
    
    /**
     * Appends and returns a new empty "simplePos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewSimplePos();
    
    /**
     * Gets the "positionH" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH getPositionH();
    
    /**
     * Sets the "positionH" element
     */
    void setPositionH(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH positionH);
    
    /**
     * Appends and returns a new empty "positionH" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH addNewPositionH();
    
    /**
     * Gets the "positionV" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV getPositionV();
    
    /**
     * Sets the "positionV" element
     */
    void setPositionV(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV positionV);
    
    /**
     * Appends and returns a new empty "positionV" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV addNewPositionV();
    
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
     * Gets the "wrapNone" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone getWrapNone();
    
    /**
     * True if has "wrapNone" element
     */
    boolean isSetWrapNone();
    
    /**
     * Sets the "wrapNone" element
     */
    void setWrapNone(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone wrapNone);
    
    /**
     * Appends and returns a new empty "wrapNone" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone addNewWrapNone();
    
    /**
     * Unsets the "wrapNone" element
     */
    void unsetWrapNone();
    
    /**
     * Gets the "wrapSquare" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare getWrapSquare();
    
    /**
     * True if has "wrapSquare" element
     */
    boolean isSetWrapSquare();
    
    /**
     * Sets the "wrapSquare" element
     */
    void setWrapSquare(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare wrapSquare);
    
    /**
     * Appends and returns a new empty "wrapSquare" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare addNewWrapSquare();
    
    /**
     * Unsets the "wrapSquare" element
     */
    void unsetWrapSquare();
    
    /**
     * Gets the "wrapTight" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight getWrapTight();
    
    /**
     * True if has "wrapTight" element
     */
    boolean isSetWrapTight();
    
    /**
     * Sets the "wrapTight" element
     */
    void setWrapTight(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight wrapTight);
    
    /**
     * Appends and returns a new empty "wrapTight" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight addNewWrapTight();
    
    /**
     * Unsets the "wrapTight" element
     */
    void unsetWrapTight();
    
    /**
     * Gets the "wrapThrough" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough getWrapThrough();
    
    /**
     * True if has "wrapThrough" element
     */
    boolean isSetWrapThrough();
    
    /**
     * Sets the "wrapThrough" element
     */
    void setWrapThrough(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough wrapThrough);
    
    /**
     * Appends and returns a new empty "wrapThrough" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough addNewWrapThrough();
    
    /**
     * Unsets the "wrapThrough" element
     */
    void unsetWrapThrough();
    
    /**
     * Gets the "wrapTopAndBottom" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom getWrapTopAndBottom();
    
    /**
     * True if has "wrapTopAndBottom" element
     */
    boolean isSetWrapTopAndBottom();
    
    /**
     * Sets the "wrapTopAndBottom" element
     */
    void setWrapTopAndBottom(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom wrapTopAndBottom);
    
    /**
     * Appends and returns a new empty "wrapTopAndBottom" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom addNewWrapTopAndBottom();
    
    /**
     * Unsets the "wrapTopAndBottom" element
     */
    void unsetWrapTopAndBottom();
    
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
     * Gets the "simplePos" attribute
     */
    boolean getSimplePos2();
    
    /**
     * Gets (as xml) the "simplePos" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSimplePos2();
    
    /**
     * True if has "simplePos" attribute
     */
    boolean isSetSimplePos2();
    
    /**
     * Sets the "simplePos" attribute
     */
    void setSimplePos2(boolean simplePos2);
    
    /**
     * Sets (as xml) the "simplePos" attribute
     */
    void xsetSimplePos2(org.apache.xmlbeans.XmlBoolean simplePos2);
    
    /**
     * Unsets the "simplePos" attribute
     */
    void unsetSimplePos2();
    
    /**
     * Gets the "relativeHeight" attribute
     */
    long getRelativeHeight();
    
    /**
     * Gets (as xml) the "relativeHeight" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetRelativeHeight();
    
    /**
     * Sets the "relativeHeight" attribute
     */
    void setRelativeHeight(long relativeHeight);
    
    /**
     * Sets (as xml) the "relativeHeight" attribute
     */
    void xsetRelativeHeight(org.apache.xmlbeans.XmlUnsignedInt relativeHeight);
    
    /**
     * Gets the "behindDoc" attribute
     */
    boolean getBehindDoc();
    
    /**
     * Gets (as xml) the "behindDoc" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBehindDoc();
    
    /**
     * Sets the "behindDoc" attribute
     */
    void setBehindDoc(boolean behindDoc);
    
    /**
     * Sets (as xml) the "behindDoc" attribute
     */
    void xsetBehindDoc(org.apache.xmlbeans.XmlBoolean behindDoc);
    
    /**
     * Gets the "locked" attribute
     */
    boolean getLocked();
    
    /**
     * Gets (as xml) the "locked" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLocked();
    
    /**
     * Sets the "locked" attribute
     */
    void setLocked(boolean locked);
    
    /**
     * Sets (as xml) the "locked" attribute
     */
    void xsetLocked(org.apache.xmlbeans.XmlBoolean locked);
    
    /**
     * Gets the "layoutInCell" attribute
     */
    boolean getLayoutInCell();
    
    /**
     * Gets (as xml) the "layoutInCell" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLayoutInCell();
    
    /**
     * Sets the "layoutInCell" attribute
     */
    void setLayoutInCell(boolean layoutInCell);
    
    /**
     * Sets (as xml) the "layoutInCell" attribute
     */
    void xsetLayoutInCell(org.apache.xmlbeans.XmlBoolean layoutInCell);
    
    /**
     * Gets the "hidden" attribute
     */
    boolean getHidden();
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHidden();
    
    /**
     * True if has "hidden" attribute
     */
    boolean isSetHidden();
    
    /**
     * Sets the "hidden" attribute
     */
    void setHidden(boolean hidden);
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden);
    
    /**
     * Unsets the "hidden" attribute
     */
    void unsetHidden();
    
    /**
     * Gets the "allowOverlap" attribute
     */
    boolean getAllowOverlap();
    
    /**
     * Gets (as xml) the "allowOverlap" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowOverlap();
    
    /**
     * Sets the "allowOverlap" attribute
     */
    void setAllowOverlap(boolean allowOverlap);
    
    /**
     * Sets (as xml) the "allowOverlap" attribute
     */
    void xsetAllowOverlap(org.apache.xmlbeans.XmlBoolean allowOverlap);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

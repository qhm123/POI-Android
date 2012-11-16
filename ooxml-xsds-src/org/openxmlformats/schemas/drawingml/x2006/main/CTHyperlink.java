/*
 * XML Type:  CT_Hyperlink
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Hyperlink(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTHyperlink extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTHyperlink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cthyperlink4457type");
    
    /**
     * Gets the "snd" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile getSnd();
    
    /**
     * True if has "snd" element
     */
    boolean isSetSnd();
    
    /**
     * Sets the "snd" element
     */
    void setSnd(org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile snd);
    
    /**
     * Appends and returns a new empty "snd" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile addNewSnd();
    
    /**
     * Unsets the "snd" element
     */
    void unsetSnd();
    
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
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "invalidUrl" attribute
     */
    java.lang.String getInvalidUrl();
    
    /**
     * Gets (as xml) the "invalidUrl" attribute
     */
    org.apache.xmlbeans.XmlString xgetInvalidUrl();
    
    /**
     * True if has "invalidUrl" attribute
     */
    boolean isSetInvalidUrl();
    
    /**
     * Sets the "invalidUrl" attribute
     */
    void setInvalidUrl(java.lang.String invalidUrl);
    
    /**
     * Sets (as xml) the "invalidUrl" attribute
     */
    void xsetInvalidUrl(org.apache.xmlbeans.XmlString invalidUrl);
    
    /**
     * Unsets the "invalidUrl" attribute
     */
    void unsetInvalidUrl();
    
    /**
     * Gets the "action" attribute
     */
    java.lang.String getAction();
    
    /**
     * Gets (as xml) the "action" attribute
     */
    org.apache.xmlbeans.XmlString xgetAction();
    
    /**
     * True if has "action" attribute
     */
    boolean isSetAction();
    
    /**
     * Sets the "action" attribute
     */
    void setAction(java.lang.String action);
    
    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.apache.xmlbeans.XmlString action);
    
    /**
     * Unsets the "action" attribute
     */
    void unsetAction();
    
    /**
     * Gets the "tgtFrame" attribute
     */
    java.lang.String getTgtFrame();
    
    /**
     * Gets (as xml) the "tgtFrame" attribute
     */
    org.apache.xmlbeans.XmlString xgetTgtFrame();
    
    /**
     * True if has "tgtFrame" attribute
     */
    boolean isSetTgtFrame();
    
    /**
     * Sets the "tgtFrame" attribute
     */
    void setTgtFrame(java.lang.String tgtFrame);
    
    /**
     * Sets (as xml) the "tgtFrame" attribute
     */
    void xsetTgtFrame(org.apache.xmlbeans.XmlString tgtFrame);
    
    /**
     * Unsets the "tgtFrame" attribute
     */
    void unsetTgtFrame();
    
    /**
     * Gets the "tooltip" attribute
     */
    java.lang.String getTooltip();
    
    /**
     * Gets (as xml) the "tooltip" attribute
     */
    org.apache.xmlbeans.XmlString xgetTooltip();
    
    /**
     * True if has "tooltip" attribute
     */
    boolean isSetTooltip();
    
    /**
     * Sets the "tooltip" attribute
     */
    void setTooltip(java.lang.String tooltip);
    
    /**
     * Sets (as xml) the "tooltip" attribute
     */
    void xsetTooltip(org.apache.xmlbeans.XmlString tooltip);
    
    /**
     * Unsets the "tooltip" attribute
     */
    void unsetTooltip();
    
    /**
     * Gets the "history" attribute
     */
    boolean getHistory();
    
    /**
     * Gets (as xml) the "history" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHistory();
    
    /**
     * True if has "history" attribute
     */
    boolean isSetHistory();
    
    /**
     * Sets the "history" attribute
     */
    void setHistory(boolean history);
    
    /**
     * Sets (as xml) the "history" attribute
     */
    void xsetHistory(org.apache.xmlbeans.XmlBoolean history);
    
    /**
     * Unsets the "history" attribute
     */
    void unsetHistory();
    
    /**
     * Gets the "highlightClick" attribute
     */
    boolean getHighlightClick();
    
    /**
     * Gets (as xml) the "highlightClick" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHighlightClick();
    
    /**
     * True if has "highlightClick" attribute
     */
    boolean isSetHighlightClick();
    
    /**
     * Sets the "highlightClick" attribute
     */
    void setHighlightClick(boolean highlightClick);
    
    /**
     * Sets (as xml) the "highlightClick" attribute
     */
    void xsetHighlightClick(org.apache.xmlbeans.XmlBoolean highlightClick);
    
    /**
     * Unsets the "highlightClick" attribute
     */
    void unsetHighlightClick();
    
    /**
     * Gets the "endSnd" attribute
     */
    boolean getEndSnd();
    
    /**
     * Gets (as xml) the "endSnd" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEndSnd();
    
    /**
     * True if has "endSnd" attribute
     */
    boolean isSetEndSnd();
    
    /**
     * Sets the "endSnd" attribute
     */
    void setEndSnd(boolean endSnd);
    
    /**
     * Sets (as xml) the "endSnd" attribute
     */
    void xsetEndSnd(org.apache.xmlbeans.XmlBoolean endSnd);
    
    /**
     * Unsets the "endSnd" attribute
     */
    void unsetEndSnd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

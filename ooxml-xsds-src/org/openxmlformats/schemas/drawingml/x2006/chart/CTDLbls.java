/*
 * XML Type:  CT_DLbls
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_DLbls(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTDLbls extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDLbls.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdlblsb585type");
    
    /**
     * Gets a List of "dLbl" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl> getDLblList();
    
    /**
     * Gets array of all "dLbl" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl[] getDLblArray();
    
    /**
     * Gets ith "dLbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl getDLblArray(int i);
    
    /**
     * Returns number of "dLbl" element
     */
    int sizeOfDLblArray();
    
    /**
     * Sets array of all "dLbl" element
     */
    void setDLblArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl[] dLblArray);
    
    /**
     * Sets ith "dLbl" element
     */
    void setDLblArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl dLbl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dLbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl insertNewDLbl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dLbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl addNewDLbl();
    
    /**
     * Removes the ith "dLbl" element
     */
    void removeDLbl(int i);
    
    /**
     * Gets the "delete" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getDelete();
    
    /**
     * True if has "delete" element
     */
    boolean isSetDelete();
    
    /**
     * Sets the "delete" element
     */
    void setDelete(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean delete);
    
    /**
     * Appends and returns a new empty "delete" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewDelete();
    
    /**
     * Unsets the "delete" element
     */
    void unsetDelete();
    
    /**
     * Gets the "numFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt getNumFmt();
    
    /**
     * True if has "numFmt" element
     */
    boolean isSetNumFmt();
    
    /**
     * Sets the "numFmt" element
     */
    void setNumFmt(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt numFmt);
    
    /**
     * Appends and returns a new empty "numFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt addNewNumFmt();
    
    /**
     * Unsets the "numFmt" element
     */
    void unsetNumFmt();
    
    /**
     * Gets the "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr();
    
    /**
     * True if has "spPr" element
     */
    boolean isSetSpPr();
    
    /**
     * Sets the "spPr" element
     */
    void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr);
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr();
    
    /**
     * Unsets the "spPr" element
     */
    void unsetSpPr();
    
    /**
     * Gets the "txPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxPr();
    
    /**
     * True if has "txPr" element
     */
    boolean isSetTxPr();
    
    /**
     * Sets the "txPr" element
     */
    void setTxPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txPr);
    
    /**
     * Appends and returns a new empty "txPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxPr();
    
    /**
     * Unsets the "txPr" element
     */
    void unsetTxPr();
    
    /**
     * Gets the "dLblPos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos getDLblPos();
    
    /**
     * True if has "dLblPos" element
     */
    boolean isSetDLblPos();
    
    /**
     * Sets the "dLblPos" element
     */
    void setDLblPos(org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos dLblPos);
    
    /**
     * Appends and returns a new empty "dLblPos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos addNewDLblPos();
    
    /**
     * Unsets the "dLblPos" element
     */
    void unsetDLblPos();
    
    /**
     * Gets the "showLegendKey" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowLegendKey();
    
    /**
     * True if has "showLegendKey" element
     */
    boolean isSetShowLegendKey();
    
    /**
     * Sets the "showLegendKey" element
     */
    void setShowLegendKey(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showLegendKey);
    
    /**
     * Appends and returns a new empty "showLegendKey" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowLegendKey();
    
    /**
     * Unsets the "showLegendKey" element
     */
    void unsetShowLegendKey();
    
    /**
     * Gets the "showVal" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowVal();
    
    /**
     * True if has "showVal" element
     */
    boolean isSetShowVal();
    
    /**
     * Sets the "showVal" element
     */
    void setShowVal(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showVal);
    
    /**
     * Appends and returns a new empty "showVal" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowVal();
    
    /**
     * Unsets the "showVal" element
     */
    void unsetShowVal();
    
    /**
     * Gets the "showCatName" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowCatName();
    
    /**
     * True if has "showCatName" element
     */
    boolean isSetShowCatName();
    
    /**
     * Sets the "showCatName" element
     */
    void setShowCatName(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showCatName);
    
    /**
     * Appends and returns a new empty "showCatName" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowCatName();
    
    /**
     * Unsets the "showCatName" element
     */
    void unsetShowCatName();
    
    /**
     * Gets the "showSerName" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowSerName();
    
    /**
     * True if has "showSerName" element
     */
    boolean isSetShowSerName();
    
    /**
     * Sets the "showSerName" element
     */
    void setShowSerName(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showSerName);
    
    /**
     * Appends and returns a new empty "showSerName" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowSerName();
    
    /**
     * Unsets the "showSerName" element
     */
    void unsetShowSerName();
    
    /**
     * Gets the "showPercent" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowPercent();
    
    /**
     * True if has "showPercent" element
     */
    boolean isSetShowPercent();
    
    /**
     * Sets the "showPercent" element
     */
    void setShowPercent(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showPercent);
    
    /**
     * Appends and returns a new empty "showPercent" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowPercent();
    
    /**
     * Unsets the "showPercent" element
     */
    void unsetShowPercent();
    
    /**
     * Gets the "showBubbleSize" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowBubbleSize();
    
    /**
     * True if has "showBubbleSize" element
     */
    boolean isSetShowBubbleSize();
    
    /**
     * Sets the "showBubbleSize" element
     */
    void setShowBubbleSize(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showBubbleSize);
    
    /**
     * Appends and returns a new empty "showBubbleSize" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowBubbleSize();
    
    /**
     * Unsets the "showBubbleSize" element
     */
    void unsetShowBubbleSize();
    
    /**
     * Gets the "separator" element
     */
    java.lang.String getSeparator();
    
    /**
     * Gets (as xml) the "separator" element
     */
    org.apache.xmlbeans.XmlString xgetSeparator();
    
    /**
     * True if has "separator" element
     */
    boolean isSetSeparator();
    
    /**
     * Sets the "separator" element
     */
    void setSeparator(java.lang.String separator);
    
    /**
     * Sets (as xml) the "separator" element
     */
    void xsetSeparator(org.apache.xmlbeans.XmlString separator);
    
    /**
     * Unsets the "separator" element
     */
    void unsetSeparator();
    
    /**
     * Gets the "showLeaderLines" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowLeaderLines();
    
    /**
     * True if has "showLeaderLines" element
     */
    boolean isSetShowLeaderLines();
    
    /**
     * Sets the "showLeaderLines" element
     */
    void setShowLeaderLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showLeaderLines);
    
    /**
     * Appends and returns a new empty "showLeaderLines" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowLeaderLines();
    
    /**
     * Unsets the "showLeaderLines" element
     */
    void unsetShowLeaderLines();
    
    /**
     * Gets the "leaderLines" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getLeaderLines();
    
    /**
     * True if has "leaderLines" element
     */
    boolean isSetLeaderLines();
    
    /**
     * Sets the "leaderLines" element
     */
    void setLeaderLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines leaderLines);
    
    /**
     * Appends and returns a new empty "leaderLines" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewLeaderLines();
    
    /**
     * Unsets the "leaderLines" element
     */
    void unsetLeaderLines();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

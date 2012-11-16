/*
 * XML Type:  CT_SheetView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SheetView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetView extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSheetView.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsheetview0f43type");
    
    /**
     * Gets the "pane" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane getPane();
    
    /**
     * True if has "pane" element
     */
    boolean isSetPane();
    
    /**
     * Sets the "pane" element
     */
    void setPane(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane pane);
    
    /**
     * Appends and returns a new empty "pane" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane addNewPane();
    
    /**
     * Unsets the "pane" element
     */
    void unsetPane();
    
    /**
     * Gets a List of "selection" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection> getSelectionList();
    
    /**
     * Gets array of all "selection" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection[] getSelectionArray();
    
    /**
     * Gets ith "selection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection getSelectionArray(int i);
    
    /**
     * Returns number of "selection" element
     */
    int sizeOfSelectionArray();
    
    /**
     * Sets array of all "selection" element
     */
    void setSelectionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection[] selectionArray);
    
    /**
     * Sets ith "selection" element
     */
    void setSelectionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection selection);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "selection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection insertNewSelection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "selection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection addNewSelection();
    
    /**
     * Removes the ith "selection" element
     */
    void removeSelection(int i);
    
    /**
     * Gets a List of "pivotSelection" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection> getPivotSelectionList();
    
    /**
     * Gets array of all "pivotSelection" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection[] getPivotSelectionArray();
    
    /**
     * Gets ith "pivotSelection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection getPivotSelectionArray(int i);
    
    /**
     * Returns number of "pivotSelection" element
     */
    int sizeOfPivotSelectionArray();
    
    /**
     * Sets array of all "pivotSelection" element
     */
    void setPivotSelectionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection[] pivotSelectionArray);
    
    /**
     * Sets ith "pivotSelection" element
     */
    void setPivotSelectionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection pivotSelection);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotSelection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection insertNewPivotSelection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotSelection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection addNewPivotSelection();
    
    /**
     * Removes the ith "pivotSelection" element
     */
    void removePivotSelection(int i);
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "windowProtection" attribute
     */
    boolean getWindowProtection();
    
    /**
     * Gets (as xml) the "windowProtection" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetWindowProtection();
    
    /**
     * True if has "windowProtection" attribute
     */
    boolean isSetWindowProtection();
    
    /**
     * Sets the "windowProtection" attribute
     */
    void setWindowProtection(boolean windowProtection);
    
    /**
     * Sets (as xml) the "windowProtection" attribute
     */
    void xsetWindowProtection(org.apache.xmlbeans.XmlBoolean windowProtection);
    
    /**
     * Unsets the "windowProtection" attribute
     */
    void unsetWindowProtection();
    
    /**
     * Gets the "showFormulas" attribute
     */
    boolean getShowFormulas();
    
    /**
     * Gets (as xml) the "showFormulas" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowFormulas();
    
    /**
     * True if has "showFormulas" attribute
     */
    boolean isSetShowFormulas();
    
    /**
     * Sets the "showFormulas" attribute
     */
    void setShowFormulas(boolean showFormulas);
    
    /**
     * Sets (as xml) the "showFormulas" attribute
     */
    void xsetShowFormulas(org.apache.xmlbeans.XmlBoolean showFormulas);
    
    /**
     * Unsets the "showFormulas" attribute
     */
    void unsetShowFormulas();
    
    /**
     * Gets the "showGridLines" attribute
     */
    boolean getShowGridLines();
    
    /**
     * Gets (as xml) the "showGridLines" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowGridLines();
    
    /**
     * True if has "showGridLines" attribute
     */
    boolean isSetShowGridLines();
    
    /**
     * Sets the "showGridLines" attribute
     */
    void setShowGridLines(boolean showGridLines);
    
    /**
     * Sets (as xml) the "showGridLines" attribute
     */
    void xsetShowGridLines(org.apache.xmlbeans.XmlBoolean showGridLines);
    
    /**
     * Unsets the "showGridLines" attribute
     */
    void unsetShowGridLines();
    
    /**
     * Gets the "showRowColHeaders" attribute
     */
    boolean getShowRowColHeaders();
    
    /**
     * Gets (as xml) the "showRowColHeaders" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowRowColHeaders();
    
    /**
     * True if has "showRowColHeaders" attribute
     */
    boolean isSetShowRowColHeaders();
    
    /**
     * Sets the "showRowColHeaders" attribute
     */
    void setShowRowColHeaders(boolean showRowColHeaders);
    
    /**
     * Sets (as xml) the "showRowColHeaders" attribute
     */
    void xsetShowRowColHeaders(org.apache.xmlbeans.XmlBoolean showRowColHeaders);
    
    /**
     * Unsets the "showRowColHeaders" attribute
     */
    void unsetShowRowColHeaders();
    
    /**
     * Gets the "showZeros" attribute
     */
    boolean getShowZeros();
    
    /**
     * Gets (as xml) the "showZeros" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowZeros();
    
    /**
     * True if has "showZeros" attribute
     */
    boolean isSetShowZeros();
    
    /**
     * Sets the "showZeros" attribute
     */
    void setShowZeros(boolean showZeros);
    
    /**
     * Sets (as xml) the "showZeros" attribute
     */
    void xsetShowZeros(org.apache.xmlbeans.XmlBoolean showZeros);
    
    /**
     * Unsets the "showZeros" attribute
     */
    void unsetShowZeros();
    
    /**
     * Gets the "rightToLeft" attribute
     */
    boolean getRightToLeft();
    
    /**
     * Gets (as xml) the "rightToLeft" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRightToLeft();
    
    /**
     * True if has "rightToLeft" attribute
     */
    boolean isSetRightToLeft();
    
    /**
     * Sets the "rightToLeft" attribute
     */
    void setRightToLeft(boolean rightToLeft);
    
    /**
     * Sets (as xml) the "rightToLeft" attribute
     */
    void xsetRightToLeft(org.apache.xmlbeans.XmlBoolean rightToLeft);
    
    /**
     * Unsets the "rightToLeft" attribute
     */
    void unsetRightToLeft();
    
    /**
     * Gets the "tabSelected" attribute
     */
    boolean getTabSelected();
    
    /**
     * Gets (as xml) the "tabSelected" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTabSelected();
    
    /**
     * True if has "tabSelected" attribute
     */
    boolean isSetTabSelected();
    
    /**
     * Sets the "tabSelected" attribute
     */
    void setTabSelected(boolean tabSelected);
    
    /**
     * Sets (as xml) the "tabSelected" attribute
     */
    void xsetTabSelected(org.apache.xmlbeans.XmlBoolean tabSelected);
    
    /**
     * Unsets the "tabSelected" attribute
     */
    void unsetTabSelected();
    
    /**
     * Gets the "showRuler" attribute
     */
    boolean getShowRuler();
    
    /**
     * Gets (as xml) the "showRuler" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowRuler();
    
    /**
     * True if has "showRuler" attribute
     */
    boolean isSetShowRuler();
    
    /**
     * Sets the "showRuler" attribute
     */
    void setShowRuler(boolean showRuler);
    
    /**
     * Sets (as xml) the "showRuler" attribute
     */
    void xsetShowRuler(org.apache.xmlbeans.XmlBoolean showRuler);
    
    /**
     * Unsets the "showRuler" attribute
     */
    void unsetShowRuler();
    
    /**
     * Gets the "showOutlineSymbols" attribute
     */
    boolean getShowOutlineSymbols();
    
    /**
     * Gets (as xml) the "showOutlineSymbols" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowOutlineSymbols();
    
    /**
     * True if has "showOutlineSymbols" attribute
     */
    boolean isSetShowOutlineSymbols();
    
    /**
     * Sets the "showOutlineSymbols" attribute
     */
    void setShowOutlineSymbols(boolean showOutlineSymbols);
    
    /**
     * Sets (as xml) the "showOutlineSymbols" attribute
     */
    void xsetShowOutlineSymbols(org.apache.xmlbeans.XmlBoolean showOutlineSymbols);
    
    /**
     * Unsets the "showOutlineSymbols" attribute
     */
    void unsetShowOutlineSymbols();
    
    /**
     * Gets the "defaultGridColor" attribute
     */
    boolean getDefaultGridColor();
    
    /**
     * Gets (as xml) the "defaultGridColor" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDefaultGridColor();
    
    /**
     * True if has "defaultGridColor" attribute
     */
    boolean isSetDefaultGridColor();
    
    /**
     * Sets the "defaultGridColor" attribute
     */
    void setDefaultGridColor(boolean defaultGridColor);
    
    /**
     * Sets (as xml) the "defaultGridColor" attribute
     */
    void xsetDefaultGridColor(org.apache.xmlbeans.XmlBoolean defaultGridColor);
    
    /**
     * Unsets the "defaultGridColor" attribute
     */
    void unsetDefaultGridColor();
    
    /**
     * Gets the "showWhiteSpace" attribute
     */
    boolean getShowWhiteSpace();
    
    /**
     * Gets (as xml) the "showWhiteSpace" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowWhiteSpace();
    
    /**
     * True if has "showWhiteSpace" attribute
     */
    boolean isSetShowWhiteSpace();
    
    /**
     * Sets the "showWhiteSpace" attribute
     */
    void setShowWhiteSpace(boolean showWhiteSpace);
    
    /**
     * Sets (as xml) the "showWhiteSpace" attribute
     */
    void xsetShowWhiteSpace(org.apache.xmlbeans.XmlBoolean showWhiteSpace);
    
    /**
     * Unsets the "showWhiteSpace" attribute
     */
    void unsetShowWhiteSpace();
    
    /**
     * Gets the "view" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType.Enum getView();
    
    /**
     * Gets (as xml) the "view" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType xgetView();
    
    /**
     * True if has "view" attribute
     */
    boolean isSetView();
    
    /**
     * Sets the "view" attribute
     */
    void setView(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType.Enum view);
    
    /**
     * Sets (as xml) the "view" attribute
     */
    void xsetView(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType view);
    
    /**
     * Unsets the "view" attribute
     */
    void unsetView();
    
    /**
     * Gets the "topLeftCell" attribute
     */
    java.lang.String getTopLeftCell();
    
    /**
     * Gets (as xml) the "topLeftCell" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetTopLeftCell();
    
    /**
     * True if has "topLeftCell" attribute
     */
    boolean isSetTopLeftCell();
    
    /**
     * Sets the "topLeftCell" attribute
     */
    void setTopLeftCell(java.lang.String topLeftCell);
    
    /**
     * Sets (as xml) the "topLeftCell" attribute
     */
    void xsetTopLeftCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef topLeftCell);
    
    /**
     * Unsets the "topLeftCell" attribute
     */
    void unsetTopLeftCell();
    
    /**
     * Gets the "colorId" attribute
     */
    long getColorId();
    
    /**
     * Gets (as xml) the "colorId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetColorId();
    
    /**
     * True if has "colorId" attribute
     */
    boolean isSetColorId();
    
    /**
     * Sets the "colorId" attribute
     */
    void setColorId(long colorId);
    
    /**
     * Sets (as xml) the "colorId" attribute
     */
    void xsetColorId(org.apache.xmlbeans.XmlUnsignedInt colorId);
    
    /**
     * Unsets the "colorId" attribute
     */
    void unsetColorId();
    
    /**
     * Gets the "zoomScale" attribute
     */
    long getZoomScale();
    
    /**
     * Gets (as xml) the "zoomScale" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetZoomScale();
    
    /**
     * True if has "zoomScale" attribute
     */
    boolean isSetZoomScale();
    
    /**
     * Sets the "zoomScale" attribute
     */
    void setZoomScale(long zoomScale);
    
    /**
     * Sets (as xml) the "zoomScale" attribute
     */
    void xsetZoomScale(org.apache.xmlbeans.XmlUnsignedInt zoomScale);
    
    /**
     * Unsets the "zoomScale" attribute
     */
    void unsetZoomScale();
    
    /**
     * Gets the "zoomScaleNormal" attribute
     */
    long getZoomScaleNormal();
    
    /**
     * Gets (as xml) the "zoomScaleNormal" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetZoomScaleNormal();
    
    /**
     * True if has "zoomScaleNormal" attribute
     */
    boolean isSetZoomScaleNormal();
    
    /**
     * Sets the "zoomScaleNormal" attribute
     */
    void setZoomScaleNormal(long zoomScaleNormal);
    
    /**
     * Sets (as xml) the "zoomScaleNormal" attribute
     */
    void xsetZoomScaleNormal(org.apache.xmlbeans.XmlUnsignedInt zoomScaleNormal);
    
    /**
     * Unsets the "zoomScaleNormal" attribute
     */
    void unsetZoomScaleNormal();
    
    /**
     * Gets the "zoomScaleSheetLayoutView" attribute
     */
    long getZoomScaleSheetLayoutView();
    
    /**
     * Gets (as xml) the "zoomScaleSheetLayoutView" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetZoomScaleSheetLayoutView();
    
    /**
     * True if has "zoomScaleSheetLayoutView" attribute
     */
    boolean isSetZoomScaleSheetLayoutView();
    
    /**
     * Sets the "zoomScaleSheetLayoutView" attribute
     */
    void setZoomScaleSheetLayoutView(long zoomScaleSheetLayoutView);
    
    /**
     * Sets (as xml) the "zoomScaleSheetLayoutView" attribute
     */
    void xsetZoomScaleSheetLayoutView(org.apache.xmlbeans.XmlUnsignedInt zoomScaleSheetLayoutView);
    
    /**
     * Unsets the "zoomScaleSheetLayoutView" attribute
     */
    void unsetZoomScaleSheetLayoutView();
    
    /**
     * Gets the "zoomScalePageLayoutView" attribute
     */
    long getZoomScalePageLayoutView();
    
    /**
     * Gets (as xml) the "zoomScalePageLayoutView" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetZoomScalePageLayoutView();
    
    /**
     * True if has "zoomScalePageLayoutView" attribute
     */
    boolean isSetZoomScalePageLayoutView();
    
    /**
     * Sets the "zoomScalePageLayoutView" attribute
     */
    void setZoomScalePageLayoutView(long zoomScalePageLayoutView);
    
    /**
     * Sets (as xml) the "zoomScalePageLayoutView" attribute
     */
    void xsetZoomScalePageLayoutView(org.apache.xmlbeans.XmlUnsignedInt zoomScalePageLayoutView);
    
    /**
     * Unsets the "zoomScalePageLayoutView" attribute
     */
    void unsetZoomScalePageLayoutView();
    
    /**
     * Gets the "workbookViewId" attribute
     */
    long getWorkbookViewId();
    
    /**
     * Gets (as xml) the "workbookViewId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetWorkbookViewId();
    
    /**
     * Sets the "workbookViewId" attribute
     */
    void setWorkbookViewId(long workbookViewId);
    
    /**
     * Sets (as xml) the "workbookViewId" attribute
     */
    void xsetWorkbookViewId(org.apache.xmlbeans.XmlUnsignedInt workbookViewId);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

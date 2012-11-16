/*
 * XML Type:  CT_Macrosheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMacrosheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Macrosheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMacrosheet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMacrosheet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmacrosheet6cdctype");
    
    /**
     * Gets the "sheetPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr getSheetPr();
    
    /**
     * True if has "sheetPr" element
     */
    boolean isSetSheetPr();
    
    /**
     * Sets the "sheetPr" element
     */
    void setSheetPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr sheetPr);
    
    /**
     * Appends and returns a new empty "sheetPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr addNewSheetPr();
    
    /**
     * Unsets the "sheetPr" element
     */
    void unsetSheetPr();
    
    /**
     * Gets the "dimension" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension getDimension();
    
    /**
     * True if has "dimension" element
     */
    boolean isSetDimension();
    
    /**
     * Sets the "dimension" element
     */
    void setDimension(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension dimension);
    
    /**
     * Appends and returns a new empty "dimension" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension addNewDimension();
    
    /**
     * Unsets the "dimension" element
     */
    void unsetDimension();
    
    /**
     * Gets the "sheetViews" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews getSheetViews();
    
    /**
     * True if has "sheetViews" element
     */
    boolean isSetSheetViews();
    
    /**
     * Sets the "sheetViews" element
     */
    void setSheetViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews sheetViews);
    
    /**
     * Appends and returns a new empty "sheetViews" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews addNewSheetViews();
    
    /**
     * Unsets the "sheetViews" element
     */
    void unsetSheetViews();
    
    /**
     * Gets the "sheetFormatPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr getSheetFormatPr();
    
    /**
     * True if has "sheetFormatPr" element
     */
    boolean isSetSheetFormatPr();
    
    /**
     * Sets the "sheetFormatPr" element
     */
    void setSheetFormatPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr sheetFormatPr);
    
    /**
     * Appends and returns a new empty "sheetFormatPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr addNewSheetFormatPr();
    
    /**
     * Unsets the "sheetFormatPr" element
     */
    void unsetSheetFormatPr();
    
    /**
     * Gets a List of "cols" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols> getColsList();
    
    /**
     * Gets array of all "cols" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] getColsArray();
    
    /**
     * Gets ith "cols" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols getColsArray(int i);
    
    /**
     * Returns number of "cols" element
     */
    int sizeOfColsArray();
    
    /**
     * Sets array of all "cols" element
     */
    void setColsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] colsArray);
    
    /**
     * Sets ith "cols" element
     */
    void setColsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols cols);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cols" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols insertNewCols(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cols" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols addNewCols();
    
    /**
     * Removes the ith "cols" element
     */
    void removeCols(int i);
    
    /**
     * Gets the "sheetData" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData getSheetData();
    
    /**
     * Sets the "sheetData" element
     */
    void setSheetData(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData sheetData);
    
    /**
     * Appends and returns a new empty "sheetData" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData addNewSheetData();
    
    /**
     * Gets the "sheetProtection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection getSheetProtection();
    
    /**
     * True if has "sheetProtection" element
     */
    boolean isSetSheetProtection();
    
    /**
     * Sets the "sheetProtection" element
     */
    void setSheetProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection sheetProtection);
    
    /**
     * Appends and returns a new empty "sheetProtection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection addNewSheetProtection();
    
    /**
     * Unsets the "sheetProtection" element
     */
    void unsetSheetProtection();
    
    /**
     * Gets the "autoFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter getAutoFilter();
    
    /**
     * True if has "autoFilter" element
     */
    boolean isSetAutoFilter();
    
    /**
     * Sets the "autoFilter" element
     */
    void setAutoFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter autoFilter);
    
    /**
     * Appends and returns a new empty "autoFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter addNewAutoFilter();
    
    /**
     * Unsets the "autoFilter" element
     */
    void unsetAutoFilter();
    
    /**
     * Gets the "sortState" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState getSortState();
    
    /**
     * True if has "sortState" element
     */
    boolean isSetSortState();
    
    /**
     * Sets the "sortState" element
     */
    void setSortState(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState sortState);
    
    /**
     * Appends and returns a new empty "sortState" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState addNewSortState();
    
    /**
     * Unsets the "sortState" element
     */
    void unsetSortState();
    
    /**
     * Gets the "dataConsolidate" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate getDataConsolidate();
    
    /**
     * True if has "dataConsolidate" element
     */
    boolean isSetDataConsolidate();
    
    /**
     * Sets the "dataConsolidate" element
     */
    void setDataConsolidate(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate dataConsolidate);
    
    /**
     * Appends and returns a new empty "dataConsolidate" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate addNewDataConsolidate();
    
    /**
     * Unsets the "dataConsolidate" element
     */
    void unsetDataConsolidate();
    
    /**
     * Gets the "customSheetViews" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews getCustomSheetViews();
    
    /**
     * True if has "customSheetViews" element
     */
    boolean isSetCustomSheetViews();
    
    /**
     * Sets the "customSheetViews" element
     */
    void setCustomSheetViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews customSheetViews);
    
    /**
     * Appends and returns a new empty "customSheetViews" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews addNewCustomSheetViews();
    
    /**
     * Unsets the "customSheetViews" element
     */
    void unsetCustomSheetViews();
    
    /**
     * Gets the "phoneticPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr getPhoneticPr();
    
    /**
     * True if has "phoneticPr" element
     */
    boolean isSetPhoneticPr();
    
    /**
     * Sets the "phoneticPr" element
     */
    void setPhoneticPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr phoneticPr);
    
    /**
     * Appends and returns a new empty "phoneticPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr addNewPhoneticPr();
    
    /**
     * Unsets the "phoneticPr" element
     */
    void unsetPhoneticPr();
    
    /**
     * Gets a List of "conditionalFormatting" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting> getConditionalFormattingList();
    
    /**
     * Gets array of all "conditionalFormatting" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[] getConditionalFormattingArray();
    
    /**
     * Gets ith "conditionalFormatting" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting getConditionalFormattingArray(int i);
    
    /**
     * Returns number of "conditionalFormatting" element
     */
    int sizeOfConditionalFormattingArray();
    
    /**
     * Sets array of all "conditionalFormatting" element
     */
    void setConditionalFormattingArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[] conditionalFormattingArray);
    
    /**
     * Sets ith "conditionalFormatting" element
     */
    void setConditionalFormattingArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting conditionalFormatting);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conditionalFormatting" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting insertNewConditionalFormatting(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conditionalFormatting" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting addNewConditionalFormatting();
    
    /**
     * Removes the ith "conditionalFormatting" element
     */
    void removeConditionalFormatting(int i);
    
    /**
     * Gets the "printOptions" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions getPrintOptions();
    
    /**
     * True if has "printOptions" element
     */
    boolean isSetPrintOptions();
    
    /**
     * Sets the "printOptions" element
     */
    void setPrintOptions(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions printOptions);
    
    /**
     * Appends and returns a new empty "printOptions" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions addNewPrintOptions();
    
    /**
     * Unsets the "printOptions" element
     */
    void unsetPrintOptions();
    
    /**
     * Gets the "pageMargins" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins getPageMargins();
    
    /**
     * True if has "pageMargins" element
     */
    boolean isSetPageMargins();
    
    /**
     * Sets the "pageMargins" element
     */
    void setPageMargins(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins pageMargins);
    
    /**
     * Appends and returns a new empty "pageMargins" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins addNewPageMargins();
    
    /**
     * Unsets the "pageMargins" element
     */
    void unsetPageMargins();
    
    /**
     * Gets the "pageSetup" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup getPageSetup();
    
    /**
     * True if has "pageSetup" element
     */
    boolean isSetPageSetup();
    
    /**
     * Sets the "pageSetup" element
     */
    void setPageSetup(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup pageSetup);
    
    /**
     * Appends and returns a new empty "pageSetup" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup addNewPageSetup();
    
    /**
     * Unsets the "pageSetup" element
     */
    void unsetPageSetup();
    
    /**
     * Gets the "headerFooter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter getHeaderFooter();
    
    /**
     * True if has "headerFooter" element
     */
    boolean isSetHeaderFooter();
    
    /**
     * Sets the "headerFooter" element
     */
    void setHeaderFooter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter headerFooter);
    
    /**
     * Appends and returns a new empty "headerFooter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter addNewHeaderFooter();
    
    /**
     * Unsets the "headerFooter" element
     */
    void unsetHeaderFooter();
    
    /**
     * Gets the "rowBreaks" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak getRowBreaks();
    
    /**
     * True if has "rowBreaks" element
     */
    boolean isSetRowBreaks();
    
    /**
     * Sets the "rowBreaks" element
     */
    void setRowBreaks(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak rowBreaks);
    
    /**
     * Appends and returns a new empty "rowBreaks" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak addNewRowBreaks();
    
    /**
     * Unsets the "rowBreaks" element
     */
    void unsetRowBreaks();
    
    /**
     * Gets the "colBreaks" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak getColBreaks();
    
    /**
     * True if has "colBreaks" element
     */
    boolean isSetColBreaks();
    
    /**
     * Sets the "colBreaks" element
     */
    void setColBreaks(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak colBreaks);
    
    /**
     * Appends and returns a new empty "colBreaks" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak addNewColBreaks();
    
    /**
     * Unsets the "colBreaks" element
     */
    void unsetColBreaks();
    
    /**
     * Gets the "customProperties" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties getCustomProperties();
    
    /**
     * True if has "customProperties" element
     */
    boolean isSetCustomProperties();
    
    /**
     * Sets the "customProperties" element
     */
    void setCustomProperties(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties customProperties);
    
    /**
     * Appends and returns a new empty "customProperties" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties addNewCustomProperties();
    
    /**
     * Unsets the "customProperties" element
     */
    void unsetCustomProperties();
    
    /**
     * Gets the "drawing" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing getDrawing();
    
    /**
     * True if has "drawing" element
     */
    boolean isSetDrawing();
    
    /**
     * Sets the "drawing" element
     */
    void setDrawing(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing drawing);
    
    /**
     * Appends and returns a new empty "drawing" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing addNewDrawing();
    
    /**
     * Unsets the "drawing" element
     */
    void unsetDrawing();
    
    /**
     * Gets the "legacyDrawing" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing getLegacyDrawing();
    
    /**
     * True if has "legacyDrawing" element
     */
    boolean isSetLegacyDrawing();
    
    /**
     * Sets the "legacyDrawing" element
     */
    void setLegacyDrawing(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing legacyDrawing);
    
    /**
     * Appends and returns a new empty "legacyDrawing" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing addNewLegacyDrawing();
    
    /**
     * Unsets the "legacyDrawing" element
     */
    void unsetLegacyDrawing();
    
    /**
     * Gets the "legacyDrawingHF" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing getLegacyDrawingHF();
    
    /**
     * True if has "legacyDrawingHF" element
     */
    boolean isSetLegacyDrawingHF();
    
    /**
     * Sets the "legacyDrawingHF" element
     */
    void setLegacyDrawingHF(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing legacyDrawingHF);
    
    /**
     * Appends and returns a new empty "legacyDrawingHF" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing addNewLegacyDrawingHF();
    
    /**
     * Unsets the "legacyDrawingHF" element
     */
    void unsetLegacyDrawingHF();
    
    /**
     * Gets the "picture" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture getPicture();
    
    /**
     * True if has "picture" element
     */
    boolean isSetPicture();
    
    /**
     * Sets the "picture" element
     */
    void setPicture(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture picture);
    
    /**
     * Appends and returns a new empty "picture" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture addNewPicture();
    
    /**
     * Unsets the "picture" element
     */
    void unsetPicture();
    
    /**
     * Gets the "oleObjects" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects getOleObjects();
    
    /**
     * True if has "oleObjects" element
     */
    boolean isSetOleObjects();
    
    /**
     * Sets the "oleObjects" element
     */
    void setOleObjects(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects oleObjects);
    
    /**
     * Appends and returns a new empty "oleObjects" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects addNewOleObjects();
    
    /**
     * Unsets the "oleObjects" element
     */
    void unsetOleObjects();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

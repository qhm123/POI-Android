/*
 * XML Type:  CT_PivotField
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PivotField(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPivotField extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivotfieldf961type");
    
    /**
     * Gets the "items" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems getItems();
    
    /**
     * True if has "items" element
     */
    boolean isSetItems();
    
    /**
     * Sets the "items" element
     */
    void setItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems items);
    
    /**
     * Appends and returns a new empty "items" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems addNewItems();
    
    /**
     * Unsets the "items" element
     */
    void unsetItems();
    
    /**
     * Gets the "autoSortScope" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope getAutoSortScope();
    
    /**
     * True if has "autoSortScope" element
     */
    boolean isSetAutoSortScope();
    
    /**
     * Sets the "autoSortScope" element
     */
    void setAutoSortScope(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope autoSortScope);
    
    /**
     * Appends and returns a new empty "autoSortScope" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope addNewAutoSortScope();
    
    /**
     * Unsets the "autoSortScope" element
     */
    void unsetAutoSortScope();
    
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
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "axis" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis.Enum getAxis();
    
    /**
     * Gets (as xml) the "axis" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis xgetAxis();
    
    /**
     * True if has "axis" attribute
     */
    boolean isSetAxis();
    
    /**
     * Sets the "axis" attribute
     */
    void setAxis(org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis.Enum axis);
    
    /**
     * Sets (as xml) the "axis" attribute
     */
    void xsetAxis(org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis axis);
    
    /**
     * Unsets the "axis" attribute
     */
    void unsetAxis();
    
    /**
     * Gets the "dataField" attribute
     */
    boolean getDataField();
    
    /**
     * Gets (as xml) the "dataField" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDataField();
    
    /**
     * True if has "dataField" attribute
     */
    boolean isSetDataField();
    
    /**
     * Sets the "dataField" attribute
     */
    void setDataField(boolean dataField);
    
    /**
     * Sets (as xml) the "dataField" attribute
     */
    void xsetDataField(org.apache.xmlbeans.XmlBoolean dataField);
    
    /**
     * Unsets the "dataField" attribute
     */
    void unsetDataField();
    
    /**
     * Gets the "subtotalCaption" attribute
     */
    java.lang.String getSubtotalCaption();
    
    /**
     * Gets (as xml) the "subtotalCaption" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSubtotalCaption();
    
    /**
     * True if has "subtotalCaption" attribute
     */
    boolean isSetSubtotalCaption();
    
    /**
     * Sets the "subtotalCaption" attribute
     */
    void setSubtotalCaption(java.lang.String subtotalCaption);
    
    /**
     * Sets (as xml) the "subtotalCaption" attribute
     */
    void xsetSubtotalCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring subtotalCaption);
    
    /**
     * Unsets the "subtotalCaption" attribute
     */
    void unsetSubtotalCaption();
    
    /**
     * Gets the "showDropDowns" attribute
     */
    boolean getShowDropDowns();
    
    /**
     * Gets (as xml) the "showDropDowns" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowDropDowns();
    
    /**
     * True if has "showDropDowns" attribute
     */
    boolean isSetShowDropDowns();
    
    /**
     * Sets the "showDropDowns" attribute
     */
    void setShowDropDowns(boolean showDropDowns);
    
    /**
     * Sets (as xml) the "showDropDowns" attribute
     */
    void xsetShowDropDowns(org.apache.xmlbeans.XmlBoolean showDropDowns);
    
    /**
     * Unsets the "showDropDowns" attribute
     */
    void unsetShowDropDowns();
    
    /**
     * Gets the "hiddenLevel" attribute
     */
    boolean getHiddenLevel();
    
    /**
     * Gets (as xml) the "hiddenLevel" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHiddenLevel();
    
    /**
     * True if has "hiddenLevel" attribute
     */
    boolean isSetHiddenLevel();
    
    /**
     * Sets the "hiddenLevel" attribute
     */
    void setHiddenLevel(boolean hiddenLevel);
    
    /**
     * Sets (as xml) the "hiddenLevel" attribute
     */
    void xsetHiddenLevel(org.apache.xmlbeans.XmlBoolean hiddenLevel);
    
    /**
     * Unsets the "hiddenLevel" attribute
     */
    void unsetHiddenLevel();
    
    /**
     * Gets the "uniqueMemberProperty" attribute
     */
    java.lang.String getUniqueMemberProperty();
    
    /**
     * Gets (as xml) the "uniqueMemberProperty" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueMemberProperty();
    
    /**
     * True if has "uniqueMemberProperty" attribute
     */
    boolean isSetUniqueMemberProperty();
    
    /**
     * Sets the "uniqueMemberProperty" attribute
     */
    void setUniqueMemberProperty(java.lang.String uniqueMemberProperty);
    
    /**
     * Sets (as xml) the "uniqueMemberProperty" attribute
     */
    void xsetUniqueMemberProperty(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueMemberProperty);
    
    /**
     * Unsets the "uniqueMemberProperty" attribute
     */
    void unsetUniqueMemberProperty();
    
    /**
     * Gets the "compact" attribute
     */
    boolean getCompact();
    
    /**
     * Gets (as xml) the "compact" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCompact();
    
    /**
     * True if has "compact" attribute
     */
    boolean isSetCompact();
    
    /**
     * Sets the "compact" attribute
     */
    void setCompact(boolean compact);
    
    /**
     * Sets (as xml) the "compact" attribute
     */
    void xsetCompact(org.apache.xmlbeans.XmlBoolean compact);
    
    /**
     * Unsets the "compact" attribute
     */
    void unsetCompact();
    
    /**
     * Gets the "allDrilled" attribute
     */
    boolean getAllDrilled();
    
    /**
     * Gets (as xml) the "allDrilled" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAllDrilled();
    
    /**
     * True if has "allDrilled" attribute
     */
    boolean isSetAllDrilled();
    
    /**
     * Sets the "allDrilled" attribute
     */
    void setAllDrilled(boolean allDrilled);
    
    /**
     * Sets (as xml) the "allDrilled" attribute
     */
    void xsetAllDrilled(org.apache.xmlbeans.XmlBoolean allDrilled);
    
    /**
     * Unsets the "allDrilled" attribute
     */
    void unsetAllDrilled();
    
    /**
     * Gets the "numFmtId" attribute
     */
    long getNumFmtId();
    
    /**
     * Gets (as xml) the "numFmtId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId();
    
    /**
     * True if has "numFmtId" attribute
     */
    boolean isSetNumFmtId();
    
    /**
     * Sets the "numFmtId" attribute
     */
    void setNumFmtId(long numFmtId);
    
    /**
     * Sets (as xml) the "numFmtId" attribute
     */
    void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId);
    
    /**
     * Unsets the "numFmtId" attribute
     */
    void unsetNumFmtId();
    
    /**
     * Gets the "outline" attribute
     */
    boolean getOutline();
    
    /**
     * Gets (as xml) the "outline" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOutline();
    
    /**
     * True if has "outline" attribute
     */
    boolean isSetOutline();
    
    /**
     * Sets the "outline" attribute
     */
    void setOutline(boolean outline);
    
    /**
     * Sets (as xml) the "outline" attribute
     */
    void xsetOutline(org.apache.xmlbeans.XmlBoolean outline);
    
    /**
     * Unsets the "outline" attribute
     */
    void unsetOutline();
    
    /**
     * Gets the "subtotalTop" attribute
     */
    boolean getSubtotalTop();
    
    /**
     * Gets (as xml) the "subtotalTop" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSubtotalTop();
    
    /**
     * True if has "subtotalTop" attribute
     */
    boolean isSetSubtotalTop();
    
    /**
     * Sets the "subtotalTop" attribute
     */
    void setSubtotalTop(boolean subtotalTop);
    
    /**
     * Sets (as xml) the "subtotalTop" attribute
     */
    void xsetSubtotalTop(org.apache.xmlbeans.XmlBoolean subtotalTop);
    
    /**
     * Unsets the "subtotalTop" attribute
     */
    void unsetSubtotalTop();
    
    /**
     * Gets the "dragToRow" attribute
     */
    boolean getDragToRow();
    
    /**
     * Gets (as xml) the "dragToRow" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragToRow();
    
    /**
     * True if has "dragToRow" attribute
     */
    boolean isSetDragToRow();
    
    /**
     * Sets the "dragToRow" attribute
     */
    void setDragToRow(boolean dragToRow);
    
    /**
     * Sets (as xml) the "dragToRow" attribute
     */
    void xsetDragToRow(org.apache.xmlbeans.XmlBoolean dragToRow);
    
    /**
     * Unsets the "dragToRow" attribute
     */
    void unsetDragToRow();
    
    /**
     * Gets the "dragToCol" attribute
     */
    boolean getDragToCol();
    
    /**
     * Gets (as xml) the "dragToCol" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragToCol();
    
    /**
     * True if has "dragToCol" attribute
     */
    boolean isSetDragToCol();
    
    /**
     * Sets the "dragToCol" attribute
     */
    void setDragToCol(boolean dragToCol);
    
    /**
     * Sets (as xml) the "dragToCol" attribute
     */
    void xsetDragToCol(org.apache.xmlbeans.XmlBoolean dragToCol);
    
    /**
     * Unsets the "dragToCol" attribute
     */
    void unsetDragToCol();
    
    /**
     * Gets the "multipleItemSelectionAllowed" attribute
     */
    boolean getMultipleItemSelectionAllowed();
    
    /**
     * Gets (as xml) the "multipleItemSelectionAllowed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMultipleItemSelectionAllowed();
    
    /**
     * True if has "multipleItemSelectionAllowed" attribute
     */
    boolean isSetMultipleItemSelectionAllowed();
    
    /**
     * Sets the "multipleItemSelectionAllowed" attribute
     */
    void setMultipleItemSelectionAllowed(boolean multipleItemSelectionAllowed);
    
    /**
     * Sets (as xml) the "multipleItemSelectionAllowed" attribute
     */
    void xsetMultipleItemSelectionAllowed(org.apache.xmlbeans.XmlBoolean multipleItemSelectionAllowed);
    
    /**
     * Unsets the "multipleItemSelectionAllowed" attribute
     */
    void unsetMultipleItemSelectionAllowed();
    
    /**
     * Gets the "dragToPage" attribute
     */
    boolean getDragToPage();
    
    /**
     * Gets (as xml) the "dragToPage" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragToPage();
    
    /**
     * True if has "dragToPage" attribute
     */
    boolean isSetDragToPage();
    
    /**
     * Sets the "dragToPage" attribute
     */
    void setDragToPage(boolean dragToPage);
    
    /**
     * Sets (as xml) the "dragToPage" attribute
     */
    void xsetDragToPage(org.apache.xmlbeans.XmlBoolean dragToPage);
    
    /**
     * Unsets the "dragToPage" attribute
     */
    void unsetDragToPage();
    
    /**
     * Gets the "dragToData" attribute
     */
    boolean getDragToData();
    
    /**
     * Gets (as xml) the "dragToData" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragToData();
    
    /**
     * True if has "dragToData" attribute
     */
    boolean isSetDragToData();
    
    /**
     * Sets the "dragToData" attribute
     */
    void setDragToData(boolean dragToData);
    
    /**
     * Sets (as xml) the "dragToData" attribute
     */
    void xsetDragToData(org.apache.xmlbeans.XmlBoolean dragToData);
    
    /**
     * Unsets the "dragToData" attribute
     */
    void unsetDragToData();
    
    /**
     * Gets the "dragOff" attribute
     */
    boolean getDragOff();
    
    /**
     * Gets (as xml) the "dragOff" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragOff();
    
    /**
     * True if has "dragOff" attribute
     */
    boolean isSetDragOff();
    
    /**
     * Sets the "dragOff" attribute
     */
    void setDragOff(boolean dragOff);
    
    /**
     * Sets (as xml) the "dragOff" attribute
     */
    void xsetDragOff(org.apache.xmlbeans.XmlBoolean dragOff);
    
    /**
     * Unsets the "dragOff" attribute
     */
    void unsetDragOff();
    
    /**
     * Gets the "showAll" attribute
     */
    boolean getShowAll();
    
    /**
     * Gets (as xml) the "showAll" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowAll();
    
    /**
     * True if has "showAll" attribute
     */
    boolean isSetShowAll();
    
    /**
     * Sets the "showAll" attribute
     */
    void setShowAll(boolean showAll);
    
    /**
     * Sets (as xml) the "showAll" attribute
     */
    void xsetShowAll(org.apache.xmlbeans.XmlBoolean showAll);
    
    /**
     * Unsets the "showAll" attribute
     */
    void unsetShowAll();
    
    /**
     * Gets the "insertBlankRow" attribute
     */
    boolean getInsertBlankRow();
    
    /**
     * Gets (as xml) the "insertBlankRow" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetInsertBlankRow();
    
    /**
     * True if has "insertBlankRow" attribute
     */
    boolean isSetInsertBlankRow();
    
    /**
     * Sets the "insertBlankRow" attribute
     */
    void setInsertBlankRow(boolean insertBlankRow);
    
    /**
     * Sets (as xml) the "insertBlankRow" attribute
     */
    void xsetInsertBlankRow(org.apache.xmlbeans.XmlBoolean insertBlankRow);
    
    /**
     * Unsets the "insertBlankRow" attribute
     */
    void unsetInsertBlankRow();
    
    /**
     * Gets the "serverField" attribute
     */
    boolean getServerField();
    
    /**
     * Gets (as xml) the "serverField" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetServerField();
    
    /**
     * True if has "serverField" attribute
     */
    boolean isSetServerField();
    
    /**
     * Sets the "serverField" attribute
     */
    void setServerField(boolean serverField);
    
    /**
     * Sets (as xml) the "serverField" attribute
     */
    void xsetServerField(org.apache.xmlbeans.XmlBoolean serverField);
    
    /**
     * Unsets the "serverField" attribute
     */
    void unsetServerField();
    
    /**
     * Gets the "insertPageBreak" attribute
     */
    boolean getInsertPageBreak();
    
    /**
     * Gets (as xml) the "insertPageBreak" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetInsertPageBreak();
    
    /**
     * True if has "insertPageBreak" attribute
     */
    boolean isSetInsertPageBreak();
    
    /**
     * Sets the "insertPageBreak" attribute
     */
    void setInsertPageBreak(boolean insertPageBreak);
    
    /**
     * Sets (as xml) the "insertPageBreak" attribute
     */
    void xsetInsertPageBreak(org.apache.xmlbeans.XmlBoolean insertPageBreak);
    
    /**
     * Unsets the "insertPageBreak" attribute
     */
    void unsetInsertPageBreak();
    
    /**
     * Gets the "autoShow" attribute
     */
    boolean getAutoShow();
    
    /**
     * Gets (as xml) the "autoShow" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoShow();
    
    /**
     * True if has "autoShow" attribute
     */
    boolean isSetAutoShow();
    
    /**
     * Sets the "autoShow" attribute
     */
    void setAutoShow(boolean autoShow);
    
    /**
     * Sets (as xml) the "autoShow" attribute
     */
    void xsetAutoShow(org.apache.xmlbeans.XmlBoolean autoShow);
    
    /**
     * Unsets the "autoShow" attribute
     */
    void unsetAutoShow();
    
    /**
     * Gets the "topAutoShow" attribute
     */
    boolean getTopAutoShow();
    
    /**
     * Gets (as xml) the "topAutoShow" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTopAutoShow();
    
    /**
     * True if has "topAutoShow" attribute
     */
    boolean isSetTopAutoShow();
    
    /**
     * Sets the "topAutoShow" attribute
     */
    void setTopAutoShow(boolean topAutoShow);
    
    /**
     * Sets (as xml) the "topAutoShow" attribute
     */
    void xsetTopAutoShow(org.apache.xmlbeans.XmlBoolean topAutoShow);
    
    /**
     * Unsets the "topAutoShow" attribute
     */
    void unsetTopAutoShow();
    
    /**
     * Gets the "hideNewItems" attribute
     */
    boolean getHideNewItems();
    
    /**
     * Gets (as xml) the "hideNewItems" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHideNewItems();
    
    /**
     * True if has "hideNewItems" attribute
     */
    boolean isSetHideNewItems();
    
    /**
     * Sets the "hideNewItems" attribute
     */
    void setHideNewItems(boolean hideNewItems);
    
    /**
     * Sets (as xml) the "hideNewItems" attribute
     */
    void xsetHideNewItems(org.apache.xmlbeans.XmlBoolean hideNewItems);
    
    /**
     * Unsets the "hideNewItems" attribute
     */
    void unsetHideNewItems();
    
    /**
     * Gets the "measureFilter" attribute
     */
    boolean getMeasureFilter();
    
    /**
     * Gets (as xml) the "measureFilter" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMeasureFilter();
    
    /**
     * True if has "measureFilter" attribute
     */
    boolean isSetMeasureFilter();
    
    /**
     * Sets the "measureFilter" attribute
     */
    void setMeasureFilter(boolean measureFilter);
    
    /**
     * Sets (as xml) the "measureFilter" attribute
     */
    void xsetMeasureFilter(org.apache.xmlbeans.XmlBoolean measureFilter);
    
    /**
     * Unsets the "measureFilter" attribute
     */
    void unsetMeasureFilter();
    
    /**
     * Gets the "includeNewItemsInFilter" attribute
     */
    boolean getIncludeNewItemsInFilter();
    
    /**
     * Gets (as xml) the "includeNewItemsInFilter" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIncludeNewItemsInFilter();
    
    /**
     * True if has "includeNewItemsInFilter" attribute
     */
    boolean isSetIncludeNewItemsInFilter();
    
    /**
     * Sets the "includeNewItemsInFilter" attribute
     */
    void setIncludeNewItemsInFilter(boolean includeNewItemsInFilter);
    
    /**
     * Sets (as xml) the "includeNewItemsInFilter" attribute
     */
    void xsetIncludeNewItemsInFilter(org.apache.xmlbeans.XmlBoolean includeNewItemsInFilter);
    
    /**
     * Unsets the "includeNewItemsInFilter" attribute
     */
    void unsetIncludeNewItemsInFilter();
    
    /**
     * Gets the "itemPageCount" attribute
     */
    long getItemPageCount();
    
    /**
     * Gets (as xml) the "itemPageCount" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetItemPageCount();
    
    /**
     * True if has "itemPageCount" attribute
     */
    boolean isSetItemPageCount();
    
    /**
     * Sets the "itemPageCount" attribute
     */
    void setItemPageCount(long itemPageCount);
    
    /**
     * Sets (as xml) the "itemPageCount" attribute
     */
    void xsetItemPageCount(org.apache.xmlbeans.XmlUnsignedInt itemPageCount);
    
    /**
     * Unsets the "itemPageCount" attribute
     */
    void unsetItemPageCount();
    
    /**
     * Gets the "sortType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType.Enum getSortType();
    
    /**
     * Gets (as xml) the "sortType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType xgetSortType();
    
    /**
     * True if has "sortType" attribute
     */
    boolean isSetSortType();
    
    /**
     * Sets the "sortType" attribute
     */
    void setSortType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType.Enum sortType);
    
    /**
     * Sets (as xml) the "sortType" attribute
     */
    void xsetSortType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType sortType);
    
    /**
     * Unsets the "sortType" attribute
     */
    void unsetSortType();
    
    /**
     * Gets the "dataSourceSort" attribute
     */
    boolean getDataSourceSort();
    
    /**
     * Gets (as xml) the "dataSourceSort" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDataSourceSort();
    
    /**
     * True if has "dataSourceSort" attribute
     */
    boolean isSetDataSourceSort();
    
    /**
     * Sets the "dataSourceSort" attribute
     */
    void setDataSourceSort(boolean dataSourceSort);
    
    /**
     * Sets (as xml) the "dataSourceSort" attribute
     */
    void xsetDataSourceSort(org.apache.xmlbeans.XmlBoolean dataSourceSort);
    
    /**
     * Unsets the "dataSourceSort" attribute
     */
    void unsetDataSourceSort();
    
    /**
     * Gets the "nonAutoSortDefault" attribute
     */
    boolean getNonAutoSortDefault();
    
    /**
     * Gets (as xml) the "nonAutoSortDefault" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetNonAutoSortDefault();
    
    /**
     * True if has "nonAutoSortDefault" attribute
     */
    boolean isSetNonAutoSortDefault();
    
    /**
     * Sets the "nonAutoSortDefault" attribute
     */
    void setNonAutoSortDefault(boolean nonAutoSortDefault);
    
    /**
     * Sets (as xml) the "nonAutoSortDefault" attribute
     */
    void xsetNonAutoSortDefault(org.apache.xmlbeans.XmlBoolean nonAutoSortDefault);
    
    /**
     * Unsets the "nonAutoSortDefault" attribute
     */
    void unsetNonAutoSortDefault();
    
    /**
     * Gets the "rankBy" attribute
     */
    long getRankBy();
    
    /**
     * Gets (as xml) the "rankBy" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetRankBy();
    
    /**
     * True if has "rankBy" attribute
     */
    boolean isSetRankBy();
    
    /**
     * Sets the "rankBy" attribute
     */
    void setRankBy(long rankBy);
    
    /**
     * Sets (as xml) the "rankBy" attribute
     */
    void xsetRankBy(org.apache.xmlbeans.XmlUnsignedInt rankBy);
    
    /**
     * Unsets the "rankBy" attribute
     */
    void unsetRankBy();
    
    /**
     * Gets the "defaultSubtotal" attribute
     */
    boolean getDefaultSubtotal();
    
    /**
     * Gets (as xml) the "defaultSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDefaultSubtotal();
    
    /**
     * True if has "defaultSubtotal" attribute
     */
    boolean isSetDefaultSubtotal();
    
    /**
     * Sets the "defaultSubtotal" attribute
     */
    void setDefaultSubtotal(boolean defaultSubtotal);
    
    /**
     * Sets (as xml) the "defaultSubtotal" attribute
     */
    void xsetDefaultSubtotal(org.apache.xmlbeans.XmlBoolean defaultSubtotal);
    
    /**
     * Unsets the "defaultSubtotal" attribute
     */
    void unsetDefaultSubtotal();
    
    /**
     * Gets the "sumSubtotal" attribute
     */
    boolean getSumSubtotal();
    
    /**
     * Gets (as xml) the "sumSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSumSubtotal();
    
    /**
     * True if has "sumSubtotal" attribute
     */
    boolean isSetSumSubtotal();
    
    /**
     * Sets the "sumSubtotal" attribute
     */
    void setSumSubtotal(boolean sumSubtotal);
    
    /**
     * Sets (as xml) the "sumSubtotal" attribute
     */
    void xsetSumSubtotal(org.apache.xmlbeans.XmlBoolean sumSubtotal);
    
    /**
     * Unsets the "sumSubtotal" attribute
     */
    void unsetSumSubtotal();
    
    /**
     * Gets the "countASubtotal" attribute
     */
    boolean getCountASubtotal();
    
    /**
     * Gets (as xml) the "countASubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCountASubtotal();
    
    /**
     * True if has "countASubtotal" attribute
     */
    boolean isSetCountASubtotal();
    
    /**
     * Sets the "countASubtotal" attribute
     */
    void setCountASubtotal(boolean countASubtotal);
    
    /**
     * Sets (as xml) the "countASubtotal" attribute
     */
    void xsetCountASubtotal(org.apache.xmlbeans.XmlBoolean countASubtotal);
    
    /**
     * Unsets the "countASubtotal" attribute
     */
    void unsetCountASubtotal();
    
    /**
     * Gets the "avgSubtotal" attribute
     */
    boolean getAvgSubtotal();
    
    /**
     * Gets (as xml) the "avgSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAvgSubtotal();
    
    /**
     * True if has "avgSubtotal" attribute
     */
    boolean isSetAvgSubtotal();
    
    /**
     * Sets the "avgSubtotal" attribute
     */
    void setAvgSubtotal(boolean avgSubtotal);
    
    /**
     * Sets (as xml) the "avgSubtotal" attribute
     */
    void xsetAvgSubtotal(org.apache.xmlbeans.XmlBoolean avgSubtotal);
    
    /**
     * Unsets the "avgSubtotal" attribute
     */
    void unsetAvgSubtotal();
    
    /**
     * Gets the "maxSubtotal" attribute
     */
    boolean getMaxSubtotal();
    
    /**
     * Gets (as xml) the "maxSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMaxSubtotal();
    
    /**
     * True if has "maxSubtotal" attribute
     */
    boolean isSetMaxSubtotal();
    
    /**
     * Sets the "maxSubtotal" attribute
     */
    void setMaxSubtotal(boolean maxSubtotal);
    
    /**
     * Sets (as xml) the "maxSubtotal" attribute
     */
    void xsetMaxSubtotal(org.apache.xmlbeans.XmlBoolean maxSubtotal);
    
    /**
     * Unsets the "maxSubtotal" attribute
     */
    void unsetMaxSubtotal();
    
    /**
     * Gets the "minSubtotal" attribute
     */
    boolean getMinSubtotal();
    
    /**
     * Gets (as xml) the "minSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMinSubtotal();
    
    /**
     * True if has "minSubtotal" attribute
     */
    boolean isSetMinSubtotal();
    
    /**
     * Sets the "minSubtotal" attribute
     */
    void setMinSubtotal(boolean minSubtotal);
    
    /**
     * Sets (as xml) the "minSubtotal" attribute
     */
    void xsetMinSubtotal(org.apache.xmlbeans.XmlBoolean minSubtotal);
    
    /**
     * Unsets the "minSubtotal" attribute
     */
    void unsetMinSubtotal();
    
    /**
     * Gets the "productSubtotal" attribute
     */
    boolean getProductSubtotal();
    
    /**
     * Gets (as xml) the "productSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetProductSubtotal();
    
    /**
     * True if has "productSubtotal" attribute
     */
    boolean isSetProductSubtotal();
    
    /**
     * Sets the "productSubtotal" attribute
     */
    void setProductSubtotal(boolean productSubtotal);
    
    /**
     * Sets (as xml) the "productSubtotal" attribute
     */
    void xsetProductSubtotal(org.apache.xmlbeans.XmlBoolean productSubtotal);
    
    /**
     * Unsets the "productSubtotal" attribute
     */
    void unsetProductSubtotal();
    
    /**
     * Gets the "countSubtotal" attribute
     */
    boolean getCountSubtotal();
    
    /**
     * Gets (as xml) the "countSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCountSubtotal();
    
    /**
     * True if has "countSubtotal" attribute
     */
    boolean isSetCountSubtotal();
    
    /**
     * Sets the "countSubtotal" attribute
     */
    void setCountSubtotal(boolean countSubtotal);
    
    /**
     * Sets (as xml) the "countSubtotal" attribute
     */
    void xsetCountSubtotal(org.apache.xmlbeans.XmlBoolean countSubtotal);
    
    /**
     * Unsets the "countSubtotal" attribute
     */
    void unsetCountSubtotal();
    
    /**
     * Gets the "stdDevSubtotal" attribute
     */
    boolean getStdDevSubtotal();
    
    /**
     * Gets (as xml) the "stdDevSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetStdDevSubtotal();
    
    /**
     * True if has "stdDevSubtotal" attribute
     */
    boolean isSetStdDevSubtotal();
    
    /**
     * Sets the "stdDevSubtotal" attribute
     */
    void setStdDevSubtotal(boolean stdDevSubtotal);
    
    /**
     * Sets (as xml) the "stdDevSubtotal" attribute
     */
    void xsetStdDevSubtotal(org.apache.xmlbeans.XmlBoolean stdDevSubtotal);
    
    /**
     * Unsets the "stdDevSubtotal" attribute
     */
    void unsetStdDevSubtotal();
    
    /**
     * Gets the "stdDevPSubtotal" attribute
     */
    boolean getStdDevPSubtotal();
    
    /**
     * Gets (as xml) the "stdDevPSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetStdDevPSubtotal();
    
    /**
     * True if has "stdDevPSubtotal" attribute
     */
    boolean isSetStdDevPSubtotal();
    
    /**
     * Sets the "stdDevPSubtotal" attribute
     */
    void setStdDevPSubtotal(boolean stdDevPSubtotal);
    
    /**
     * Sets (as xml) the "stdDevPSubtotal" attribute
     */
    void xsetStdDevPSubtotal(org.apache.xmlbeans.XmlBoolean stdDevPSubtotal);
    
    /**
     * Unsets the "stdDevPSubtotal" attribute
     */
    void unsetStdDevPSubtotal();
    
    /**
     * Gets the "varSubtotal" attribute
     */
    boolean getVarSubtotal();
    
    /**
     * Gets (as xml) the "varSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetVarSubtotal();
    
    /**
     * True if has "varSubtotal" attribute
     */
    boolean isSetVarSubtotal();
    
    /**
     * Sets the "varSubtotal" attribute
     */
    void setVarSubtotal(boolean varSubtotal);
    
    /**
     * Sets (as xml) the "varSubtotal" attribute
     */
    void xsetVarSubtotal(org.apache.xmlbeans.XmlBoolean varSubtotal);
    
    /**
     * Unsets the "varSubtotal" attribute
     */
    void unsetVarSubtotal();
    
    /**
     * Gets the "varPSubtotal" attribute
     */
    boolean getVarPSubtotal();
    
    /**
     * Gets (as xml) the "varPSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetVarPSubtotal();
    
    /**
     * True if has "varPSubtotal" attribute
     */
    boolean isSetVarPSubtotal();
    
    /**
     * Sets the "varPSubtotal" attribute
     */
    void setVarPSubtotal(boolean varPSubtotal);
    
    /**
     * Sets (as xml) the "varPSubtotal" attribute
     */
    void xsetVarPSubtotal(org.apache.xmlbeans.XmlBoolean varPSubtotal);
    
    /**
     * Unsets the "varPSubtotal" attribute
     */
    void unsetVarPSubtotal();
    
    /**
     * Gets the "showPropCell" attribute
     */
    boolean getShowPropCell();
    
    /**
     * Gets (as xml) the "showPropCell" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowPropCell();
    
    /**
     * True if has "showPropCell" attribute
     */
    boolean isSetShowPropCell();
    
    /**
     * Sets the "showPropCell" attribute
     */
    void setShowPropCell(boolean showPropCell);
    
    /**
     * Sets (as xml) the "showPropCell" attribute
     */
    void xsetShowPropCell(org.apache.xmlbeans.XmlBoolean showPropCell);
    
    /**
     * Unsets the "showPropCell" attribute
     */
    void unsetShowPropCell();
    
    /**
     * Gets the "showPropTip" attribute
     */
    boolean getShowPropTip();
    
    /**
     * Gets (as xml) the "showPropTip" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowPropTip();
    
    /**
     * True if has "showPropTip" attribute
     */
    boolean isSetShowPropTip();
    
    /**
     * Sets the "showPropTip" attribute
     */
    void setShowPropTip(boolean showPropTip);
    
    /**
     * Sets (as xml) the "showPropTip" attribute
     */
    void xsetShowPropTip(org.apache.xmlbeans.XmlBoolean showPropTip);
    
    /**
     * Unsets the "showPropTip" attribute
     */
    void unsetShowPropTip();
    
    /**
     * Gets the "showPropAsCaption" attribute
     */
    boolean getShowPropAsCaption();
    
    /**
     * Gets (as xml) the "showPropAsCaption" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowPropAsCaption();
    
    /**
     * True if has "showPropAsCaption" attribute
     */
    boolean isSetShowPropAsCaption();
    
    /**
     * Sets the "showPropAsCaption" attribute
     */
    void setShowPropAsCaption(boolean showPropAsCaption);
    
    /**
     * Sets (as xml) the "showPropAsCaption" attribute
     */
    void xsetShowPropAsCaption(org.apache.xmlbeans.XmlBoolean showPropAsCaption);
    
    /**
     * Unsets the "showPropAsCaption" attribute
     */
    void unsetShowPropAsCaption();
    
    /**
     * Gets the "defaultAttributeDrillState" attribute
     */
    boolean getDefaultAttributeDrillState();
    
    /**
     * Gets (as xml) the "defaultAttributeDrillState" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDefaultAttributeDrillState();
    
    /**
     * True if has "defaultAttributeDrillState" attribute
     */
    boolean isSetDefaultAttributeDrillState();
    
    /**
     * Sets the "defaultAttributeDrillState" attribute
     */
    void setDefaultAttributeDrillState(boolean defaultAttributeDrillState);
    
    /**
     * Sets (as xml) the "defaultAttributeDrillState" attribute
     */
    void xsetDefaultAttributeDrillState(org.apache.xmlbeans.XmlBoolean defaultAttributeDrillState);
    
    /**
     * Unsets the "defaultAttributeDrillState" attribute
     */
    void unsetDefaultAttributeDrillState();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_CustomWorkbookView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CustomWorkbookView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomWorkbookView extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomWorkbookView.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomworkbookview31d9type");
    
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
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Gets the "guid" attribute
     */
    java.lang.String getGuid();
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid();
    
    /**
     * Sets the "guid" attribute
     */
    void setGuid(java.lang.String guid);
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid);
    
    /**
     * Gets the "autoUpdate" attribute
     */
    boolean getAutoUpdate();
    
    /**
     * Gets (as xml) the "autoUpdate" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoUpdate();
    
    /**
     * True if has "autoUpdate" attribute
     */
    boolean isSetAutoUpdate();
    
    /**
     * Sets the "autoUpdate" attribute
     */
    void setAutoUpdate(boolean autoUpdate);
    
    /**
     * Sets (as xml) the "autoUpdate" attribute
     */
    void xsetAutoUpdate(org.apache.xmlbeans.XmlBoolean autoUpdate);
    
    /**
     * Unsets the "autoUpdate" attribute
     */
    void unsetAutoUpdate();
    
    /**
     * Gets the "mergeInterval" attribute
     */
    long getMergeInterval();
    
    /**
     * Gets (as xml) the "mergeInterval" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMergeInterval();
    
    /**
     * True if has "mergeInterval" attribute
     */
    boolean isSetMergeInterval();
    
    /**
     * Sets the "mergeInterval" attribute
     */
    void setMergeInterval(long mergeInterval);
    
    /**
     * Sets (as xml) the "mergeInterval" attribute
     */
    void xsetMergeInterval(org.apache.xmlbeans.XmlUnsignedInt mergeInterval);
    
    /**
     * Unsets the "mergeInterval" attribute
     */
    void unsetMergeInterval();
    
    /**
     * Gets the "changesSavedWin" attribute
     */
    boolean getChangesSavedWin();
    
    /**
     * Gets (as xml) the "changesSavedWin" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetChangesSavedWin();
    
    /**
     * True if has "changesSavedWin" attribute
     */
    boolean isSetChangesSavedWin();
    
    /**
     * Sets the "changesSavedWin" attribute
     */
    void setChangesSavedWin(boolean changesSavedWin);
    
    /**
     * Sets (as xml) the "changesSavedWin" attribute
     */
    void xsetChangesSavedWin(org.apache.xmlbeans.XmlBoolean changesSavedWin);
    
    /**
     * Unsets the "changesSavedWin" attribute
     */
    void unsetChangesSavedWin();
    
    /**
     * Gets the "onlySync" attribute
     */
    boolean getOnlySync();
    
    /**
     * Gets (as xml) the "onlySync" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOnlySync();
    
    /**
     * True if has "onlySync" attribute
     */
    boolean isSetOnlySync();
    
    /**
     * Sets the "onlySync" attribute
     */
    void setOnlySync(boolean onlySync);
    
    /**
     * Sets (as xml) the "onlySync" attribute
     */
    void xsetOnlySync(org.apache.xmlbeans.XmlBoolean onlySync);
    
    /**
     * Unsets the "onlySync" attribute
     */
    void unsetOnlySync();
    
    /**
     * Gets the "personalView" attribute
     */
    boolean getPersonalView();
    
    /**
     * Gets (as xml) the "personalView" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPersonalView();
    
    /**
     * True if has "personalView" attribute
     */
    boolean isSetPersonalView();
    
    /**
     * Sets the "personalView" attribute
     */
    void setPersonalView(boolean personalView);
    
    /**
     * Sets (as xml) the "personalView" attribute
     */
    void xsetPersonalView(org.apache.xmlbeans.XmlBoolean personalView);
    
    /**
     * Unsets the "personalView" attribute
     */
    void unsetPersonalView();
    
    /**
     * Gets the "includePrintSettings" attribute
     */
    boolean getIncludePrintSettings();
    
    /**
     * Gets (as xml) the "includePrintSettings" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIncludePrintSettings();
    
    /**
     * True if has "includePrintSettings" attribute
     */
    boolean isSetIncludePrintSettings();
    
    /**
     * Sets the "includePrintSettings" attribute
     */
    void setIncludePrintSettings(boolean includePrintSettings);
    
    /**
     * Sets (as xml) the "includePrintSettings" attribute
     */
    void xsetIncludePrintSettings(org.apache.xmlbeans.XmlBoolean includePrintSettings);
    
    /**
     * Unsets the "includePrintSettings" attribute
     */
    void unsetIncludePrintSettings();
    
    /**
     * Gets the "includeHiddenRowCol" attribute
     */
    boolean getIncludeHiddenRowCol();
    
    /**
     * Gets (as xml) the "includeHiddenRowCol" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIncludeHiddenRowCol();
    
    /**
     * True if has "includeHiddenRowCol" attribute
     */
    boolean isSetIncludeHiddenRowCol();
    
    /**
     * Sets the "includeHiddenRowCol" attribute
     */
    void setIncludeHiddenRowCol(boolean includeHiddenRowCol);
    
    /**
     * Sets (as xml) the "includeHiddenRowCol" attribute
     */
    void xsetIncludeHiddenRowCol(org.apache.xmlbeans.XmlBoolean includeHiddenRowCol);
    
    /**
     * Unsets the "includeHiddenRowCol" attribute
     */
    void unsetIncludeHiddenRowCol();
    
    /**
     * Gets the "maximized" attribute
     */
    boolean getMaximized();
    
    /**
     * Gets (as xml) the "maximized" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMaximized();
    
    /**
     * True if has "maximized" attribute
     */
    boolean isSetMaximized();
    
    /**
     * Sets the "maximized" attribute
     */
    void setMaximized(boolean maximized);
    
    /**
     * Sets (as xml) the "maximized" attribute
     */
    void xsetMaximized(org.apache.xmlbeans.XmlBoolean maximized);
    
    /**
     * Unsets the "maximized" attribute
     */
    void unsetMaximized();
    
    /**
     * Gets the "minimized" attribute
     */
    boolean getMinimized();
    
    /**
     * Gets (as xml) the "minimized" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMinimized();
    
    /**
     * True if has "minimized" attribute
     */
    boolean isSetMinimized();
    
    /**
     * Sets the "minimized" attribute
     */
    void setMinimized(boolean minimized);
    
    /**
     * Sets (as xml) the "minimized" attribute
     */
    void xsetMinimized(org.apache.xmlbeans.XmlBoolean minimized);
    
    /**
     * Unsets the "minimized" attribute
     */
    void unsetMinimized();
    
    /**
     * Gets the "showHorizontalScroll" attribute
     */
    boolean getShowHorizontalScroll();
    
    /**
     * Gets (as xml) the "showHorizontalScroll" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowHorizontalScroll();
    
    /**
     * True if has "showHorizontalScroll" attribute
     */
    boolean isSetShowHorizontalScroll();
    
    /**
     * Sets the "showHorizontalScroll" attribute
     */
    void setShowHorizontalScroll(boolean showHorizontalScroll);
    
    /**
     * Sets (as xml) the "showHorizontalScroll" attribute
     */
    void xsetShowHorizontalScroll(org.apache.xmlbeans.XmlBoolean showHorizontalScroll);
    
    /**
     * Unsets the "showHorizontalScroll" attribute
     */
    void unsetShowHorizontalScroll();
    
    /**
     * Gets the "showVerticalScroll" attribute
     */
    boolean getShowVerticalScroll();
    
    /**
     * Gets (as xml) the "showVerticalScroll" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowVerticalScroll();
    
    /**
     * True if has "showVerticalScroll" attribute
     */
    boolean isSetShowVerticalScroll();
    
    /**
     * Sets the "showVerticalScroll" attribute
     */
    void setShowVerticalScroll(boolean showVerticalScroll);
    
    /**
     * Sets (as xml) the "showVerticalScroll" attribute
     */
    void xsetShowVerticalScroll(org.apache.xmlbeans.XmlBoolean showVerticalScroll);
    
    /**
     * Unsets the "showVerticalScroll" attribute
     */
    void unsetShowVerticalScroll();
    
    /**
     * Gets the "showSheetTabs" attribute
     */
    boolean getShowSheetTabs();
    
    /**
     * Gets (as xml) the "showSheetTabs" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowSheetTabs();
    
    /**
     * True if has "showSheetTabs" attribute
     */
    boolean isSetShowSheetTabs();
    
    /**
     * Sets the "showSheetTabs" attribute
     */
    void setShowSheetTabs(boolean showSheetTabs);
    
    /**
     * Sets (as xml) the "showSheetTabs" attribute
     */
    void xsetShowSheetTabs(org.apache.xmlbeans.XmlBoolean showSheetTabs);
    
    /**
     * Unsets the "showSheetTabs" attribute
     */
    void unsetShowSheetTabs();
    
    /**
     * Gets the "xWindow" attribute
     */
    int getXWindow();
    
    /**
     * Gets (as xml) the "xWindow" attribute
     */
    org.apache.xmlbeans.XmlInt xgetXWindow();
    
    /**
     * True if has "xWindow" attribute
     */
    boolean isSetXWindow();
    
    /**
     * Sets the "xWindow" attribute
     */
    void setXWindow(int xWindow);
    
    /**
     * Sets (as xml) the "xWindow" attribute
     */
    void xsetXWindow(org.apache.xmlbeans.XmlInt xWindow);
    
    /**
     * Unsets the "xWindow" attribute
     */
    void unsetXWindow();
    
    /**
     * Gets the "yWindow" attribute
     */
    int getYWindow();
    
    /**
     * Gets (as xml) the "yWindow" attribute
     */
    org.apache.xmlbeans.XmlInt xgetYWindow();
    
    /**
     * True if has "yWindow" attribute
     */
    boolean isSetYWindow();
    
    /**
     * Sets the "yWindow" attribute
     */
    void setYWindow(int yWindow);
    
    /**
     * Sets (as xml) the "yWindow" attribute
     */
    void xsetYWindow(org.apache.xmlbeans.XmlInt yWindow);
    
    /**
     * Unsets the "yWindow" attribute
     */
    void unsetYWindow();
    
    /**
     * Gets the "windowWidth" attribute
     */
    long getWindowWidth();
    
    /**
     * Gets (as xml) the "windowWidth" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetWindowWidth();
    
    /**
     * Sets the "windowWidth" attribute
     */
    void setWindowWidth(long windowWidth);
    
    /**
     * Sets (as xml) the "windowWidth" attribute
     */
    void xsetWindowWidth(org.apache.xmlbeans.XmlUnsignedInt windowWidth);
    
    /**
     * Gets the "windowHeight" attribute
     */
    long getWindowHeight();
    
    /**
     * Gets (as xml) the "windowHeight" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetWindowHeight();
    
    /**
     * Sets the "windowHeight" attribute
     */
    void setWindowHeight(long windowHeight);
    
    /**
     * Sets (as xml) the "windowHeight" attribute
     */
    void xsetWindowHeight(org.apache.xmlbeans.XmlUnsignedInt windowHeight);
    
    /**
     * Gets the "tabRatio" attribute
     */
    long getTabRatio();
    
    /**
     * Gets (as xml) the "tabRatio" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetTabRatio();
    
    /**
     * True if has "tabRatio" attribute
     */
    boolean isSetTabRatio();
    
    /**
     * Sets the "tabRatio" attribute
     */
    void setTabRatio(long tabRatio);
    
    /**
     * Sets (as xml) the "tabRatio" attribute
     */
    void xsetTabRatio(org.apache.xmlbeans.XmlUnsignedInt tabRatio);
    
    /**
     * Unsets the "tabRatio" attribute
     */
    void unsetTabRatio();
    
    /**
     * Gets the "activeSheetId" attribute
     */
    long getActiveSheetId();
    
    /**
     * Gets (as xml) the "activeSheetId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetActiveSheetId();
    
    /**
     * Sets the "activeSheetId" attribute
     */
    void setActiveSheetId(long activeSheetId);
    
    /**
     * Sets (as xml) the "activeSheetId" attribute
     */
    void xsetActiveSheetId(org.apache.xmlbeans.XmlUnsignedInt activeSheetId);
    
    /**
     * Gets the "showFormulaBar" attribute
     */
    boolean getShowFormulaBar();
    
    /**
     * Gets (as xml) the "showFormulaBar" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowFormulaBar();
    
    /**
     * True if has "showFormulaBar" attribute
     */
    boolean isSetShowFormulaBar();
    
    /**
     * Sets the "showFormulaBar" attribute
     */
    void setShowFormulaBar(boolean showFormulaBar);
    
    /**
     * Sets (as xml) the "showFormulaBar" attribute
     */
    void xsetShowFormulaBar(org.apache.xmlbeans.XmlBoolean showFormulaBar);
    
    /**
     * Unsets the "showFormulaBar" attribute
     */
    void unsetShowFormulaBar();
    
    /**
     * Gets the "showStatusbar" attribute
     */
    boolean getShowStatusbar();
    
    /**
     * Gets (as xml) the "showStatusbar" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowStatusbar();
    
    /**
     * True if has "showStatusbar" attribute
     */
    boolean isSetShowStatusbar();
    
    /**
     * Sets the "showStatusbar" attribute
     */
    void setShowStatusbar(boolean showStatusbar);
    
    /**
     * Sets (as xml) the "showStatusbar" attribute
     */
    void xsetShowStatusbar(org.apache.xmlbeans.XmlBoolean showStatusbar);
    
    /**
     * Unsets the "showStatusbar" attribute
     */
    void unsetShowStatusbar();
    
    /**
     * Gets the "showComments" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments.Enum getShowComments();
    
    /**
     * Gets (as xml) the "showComments" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments xgetShowComments();
    
    /**
     * True if has "showComments" attribute
     */
    boolean isSetShowComments();
    
    /**
     * Sets the "showComments" attribute
     */
    void setShowComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments.Enum showComments);
    
    /**
     * Sets (as xml) the "showComments" attribute
     */
    void xsetShowComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments showComments);
    
    /**
     * Unsets the "showComments" attribute
     */
    void unsetShowComments();
    
    /**
     * Gets the "showObjects" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects.Enum getShowObjects();
    
    /**
     * Gets (as xml) the "showObjects" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects xgetShowObjects();
    
    /**
     * True if has "showObjects" attribute
     */
    boolean isSetShowObjects();
    
    /**
     * Sets the "showObjects" attribute
     */
    void setShowObjects(org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects.Enum showObjects);
    
    /**
     * Sets (as xml) the "showObjects" attribute
     */
    void xsetShowObjects(org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects showObjects);
    
    /**
     * Unsets the "showObjects" attribute
     */
    void unsetShowObjects();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

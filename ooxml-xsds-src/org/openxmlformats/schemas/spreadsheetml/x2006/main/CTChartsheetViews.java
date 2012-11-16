/*
 * XML Type:  CT_ChartsheetViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ChartsheetViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTChartsheetViews extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTChartsheetViews.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctchartsheetviewsafcctype");
    
    /**
     * Gets a List of "sheetView" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView> getSheetViewList();
    
    /**
     * Gets array of all "sheetView" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView[] getSheetViewArray();
    
    /**
     * Gets ith "sheetView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView getSheetViewArray(int i);
    
    /**
     * Returns number of "sheetView" element
     */
    int sizeOfSheetViewArray();
    
    /**
     * Sets array of all "sheetView" element
     */
    void setSheetViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView[] sheetViewArray);
    
    /**
     * Sets ith "sheetView" element
     */
    void setSheetViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView sheetView);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView insertNewSheetView(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheetView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView addNewSheetView();
    
    /**
     * Removes the ith "sheetView" element
     */
    void removeSheetView(int i);
    
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

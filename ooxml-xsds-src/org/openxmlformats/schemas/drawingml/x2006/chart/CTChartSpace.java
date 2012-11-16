/*
 * XML Type:  CT_ChartSpace
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_ChartSpace(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTChartSpace extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTChartSpace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctchartspacef9b4type");
    
    /**
     * Gets the "date1904" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getDate1904();
    
    /**
     * True if has "date1904" element
     */
    boolean isSetDate1904();
    
    /**
     * Sets the "date1904" element
     */
    void setDate1904(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean date1904);
    
    /**
     * Appends and returns a new empty "date1904" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewDate1904();
    
    /**
     * Unsets the "date1904" element
     */
    void unsetDate1904();
    
    /**
     * Gets the "lang" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID getLang();
    
    /**
     * True if has "lang" element
     */
    boolean isSetLang();
    
    /**
     * Sets the "lang" element
     */
    void setLang(org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID lang);
    
    /**
     * Appends and returns a new empty "lang" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID addNewLang();
    
    /**
     * Unsets the "lang" element
     */
    void unsetLang();
    
    /**
     * Gets the "roundedCorners" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getRoundedCorners();
    
    /**
     * True if has "roundedCorners" element
     */
    boolean isSetRoundedCorners();
    
    /**
     * Sets the "roundedCorners" element
     */
    void setRoundedCorners(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean roundedCorners);
    
    /**
     * Appends and returns a new empty "roundedCorners" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewRoundedCorners();
    
    /**
     * Unsets the "roundedCorners" element
     */
    void unsetRoundedCorners();
    
    /**
     * Gets the "style" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle getStyle();
    
    /**
     * True if has "style" element
     */
    boolean isSetStyle();
    
    /**
     * Sets the "style" element
     */
    void setStyle(org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle style);
    
    /**
     * Appends and returns a new empty "style" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle addNewStyle();
    
    /**
     * Unsets the "style" element
     */
    void unsetStyle();
    
    /**
     * Gets the "clrMapOvr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping getClrMapOvr();
    
    /**
     * True if has "clrMapOvr" element
     */
    boolean isSetClrMapOvr();
    
    /**
     * Sets the "clrMapOvr" element
     */
    void setClrMapOvr(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping clrMapOvr);
    
    /**
     * Appends and returns a new empty "clrMapOvr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping addNewClrMapOvr();
    
    /**
     * Unsets the "clrMapOvr" element
     */
    void unsetClrMapOvr();
    
    /**
     * Gets the "pivotSource" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource getPivotSource();
    
    /**
     * True if has "pivotSource" element
     */
    boolean isSetPivotSource();
    
    /**
     * Sets the "pivotSource" element
     */
    void setPivotSource(org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource pivotSource);
    
    /**
     * Appends and returns a new empty "pivotSource" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource addNewPivotSource();
    
    /**
     * Unsets the "pivotSource" element
     */
    void unsetPivotSource();
    
    /**
     * Gets the "protection" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection getProtection();
    
    /**
     * True if has "protection" element
     */
    boolean isSetProtection();
    
    /**
     * Sets the "protection" element
     */
    void setProtection(org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection protection);
    
    /**
     * Appends and returns a new empty "protection" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection addNewProtection();
    
    /**
     * Unsets the "protection" element
     */
    void unsetProtection();
    
    /**
     * Gets the "chart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTChart getChart();
    
    /**
     * Sets the "chart" element
     */
    void setChart(org.openxmlformats.schemas.drawingml.x2006.chart.CTChart chart);
    
    /**
     * Appends and returns a new empty "chart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTChart addNewChart();
    
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
     * Gets the "externalData" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData getExternalData();
    
    /**
     * True if has "externalData" element
     */
    boolean isSetExternalData();
    
    /**
     * Sets the "externalData" element
     */
    void setExternalData(org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData externalData);
    
    /**
     * Appends and returns a new empty "externalData" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData addNewExternalData();
    
    /**
     * Unsets the "externalData" element
     */
    void unsetExternalData();
    
    /**
     * Gets the "printSettings" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings getPrintSettings();
    
    /**
     * True if has "printSettings" element
     */
    boolean isSetPrintSettings();
    
    /**
     * Sets the "printSettings" element
     */
    void setPrintSettings(org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings printSettings);
    
    /**
     * Appends and returns a new empty "printSettings" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings addNewPrintSettings();
    
    /**
     * Unsets the "printSettings" element
     */
    void unsetPrintSettings();
    
    /**
     * Gets the "userShapes" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId getUserShapes();
    
    /**
     * True if has "userShapes" element
     */
    boolean isSetUserShapes();
    
    /**
     * Sets the "userShapes" element
     */
    void setUserShapes(org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId userShapes);
    
    /**
     * Appends and returns a new empty "userShapes" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId addNewUserShapes();
    
    /**
     * Unsets the "userShapes" element
     */
    void unsetUserShapes();
    
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

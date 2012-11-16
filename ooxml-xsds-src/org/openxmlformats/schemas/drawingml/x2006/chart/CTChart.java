/*
 * XML Type:  CT_Chart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_Chart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTChart extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTChart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctchartc108type");
    
    /**
     * Gets the "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle getTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle title);
    
    /**
     * Appends and returns a new empty "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle addNewTitle();
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "autoTitleDeleted" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getAutoTitleDeleted();
    
    /**
     * True if has "autoTitleDeleted" element
     */
    boolean isSetAutoTitleDeleted();
    
    /**
     * Sets the "autoTitleDeleted" element
     */
    void setAutoTitleDeleted(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean autoTitleDeleted);
    
    /**
     * Appends and returns a new empty "autoTitleDeleted" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewAutoTitleDeleted();
    
    /**
     * Unsets the "autoTitleDeleted" element
     */
    void unsetAutoTitleDeleted();
    
    /**
     * Gets the "pivotFmts" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts getPivotFmts();
    
    /**
     * True if has "pivotFmts" element
     */
    boolean isSetPivotFmts();
    
    /**
     * Sets the "pivotFmts" element
     */
    void setPivotFmts(org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts pivotFmts);
    
    /**
     * Appends and returns a new empty "pivotFmts" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts addNewPivotFmts();
    
    /**
     * Unsets the "pivotFmts" element
     */
    void unsetPivotFmts();
    
    /**
     * Gets the "view3D" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D getView3D();
    
    /**
     * True if has "view3D" element
     */
    boolean isSetView3D();
    
    /**
     * Sets the "view3D" element
     */
    void setView3D(org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D view3D);
    
    /**
     * Appends and returns a new empty "view3D" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D addNewView3D();
    
    /**
     * Unsets the "view3D" element
     */
    void unsetView3D();
    
    /**
     * Gets the "floor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface getFloor();
    
    /**
     * True if has "floor" element
     */
    boolean isSetFloor();
    
    /**
     * Sets the "floor" element
     */
    void setFloor(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface floor);
    
    /**
     * Appends and returns a new empty "floor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface addNewFloor();
    
    /**
     * Unsets the "floor" element
     */
    void unsetFloor();
    
    /**
     * Gets the "sideWall" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface getSideWall();
    
    /**
     * True if has "sideWall" element
     */
    boolean isSetSideWall();
    
    /**
     * Sets the "sideWall" element
     */
    void setSideWall(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface sideWall);
    
    /**
     * Appends and returns a new empty "sideWall" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface addNewSideWall();
    
    /**
     * Unsets the "sideWall" element
     */
    void unsetSideWall();
    
    /**
     * Gets the "backWall" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface getBackWall();
    
    /**
     * True if has "backWall" element
     */
    boolean isSetBackWall();
    
    /**
     * Sets the "backWall" element
     */
    void setBackWall(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface backWall);
    
    /**
     * Appends and returns a new empty "backWall" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface addNewBackWall();
    
    /**
     * Unsets the "backWall" element
     */
    void unsetBackWall();
    
    /**
     * Gets the "plotArea" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea getPlotArea();
    
    /**
     * Sets the "plotArea" element
     */
    void setPlotArea(org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea plotArea);
    
    /**
     * Appends and returns a new empty "plotArea" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea addNewPlotArea();
    
    /**
     * Gets the "legend" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend getLegend();
    
    /**
     * True if has "legend" element
     */
    boolean isSetLegend();
    
    /**
     * Sets the "legend" element
     */
    void setLegend(org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend legend);
    
    /**
     * Appends and returns a new empty "legend" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend addNewLegend();
    
    /**
     * Unsets the "legend" element
     */
    void unsetLegend();
    
    /**
     * Gets the "plotVisOnly" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getPlotVisOnly();
    
    /**
     * True if has "plotVisOnly" element
     */
    boolean isSetPlotVisOnly();
    
    /**
     * Sets the "plotVisOnly" element
     */
    void setPlotVisOnly(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean plotVisOnly);
    
    /**
     * Appends and returns a new empty "plotVisOnly" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewPlotVisOnly();
    
    /**
     * Unsets the "plotVisOnly" element
     */
    void unsetPlotVisOnly();
    
    /**
     * Gets the "dispBlanksAs" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs getDispBlanksAs();
    
    /**
     * True if has "dispBlanksAs" element
     */
    boolean isSetDispBlanksAs();
    
    /**
     * Sets the "dispBlanksAs" element
     */
    void setDispBlanksAs(org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs dispBlanksAs);
    
    /**
     * Appends and returns a new empty "dispBlanksAs" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs addNewDispBlanksAs();
    
    /**
     * Unsets the "dispBlanksAs" element
     */
    void unsetDispBlanksAs();
    
    /**
     * Gets the "showDLblsOverMax" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowDLblsOverMax();
    
    /**
     * True if has "showDLblsOverMax" element
     */
    boolean isSetShowDLblsOverMax();
    
    /**
     * Sets the "showDLblsOverMax" element
     */
    void setShowDLblsOverMax(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showDLblsOverMax);
    
    /**
     * Appends and returns a new empty "showDLblsOverMax" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowDLblsOverMax();
    
    /**
     * Unsets the "showDLblsOverMax" element
     */
    void unsetShowDLblsOverMax();
    
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

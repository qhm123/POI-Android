/*
 * XML Type:  CT_PlotArea
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_PlotArea(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTPlotArea extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPlotArea.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctplotarea106etype");
    
    /**
     * Gets the "layout" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout getLayout();
    
    /**
     * True if has "layout" element
     */
    boolean isSetLayout();
    
    /**
     * Sets the "layout" element
     */
    void setLayout(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout layout);
    
    /**
     * Appends and returns a new empty "layout" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout addNewLayout();
    
    /**
     * Unsets the "layout" element
     */
    void unsetLayout();
    
    /**
     * Gets a List of "areaChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart> getAreaChartList();
    
    /**
     * Gets array of all "areaChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart[] getAreaChartArray();
    
    /**
     * Gets ith "areaChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart getAreaChartArray(int i);
    
    /**
     * Returns number of "areaChart" element
     */
    int sizeOfAreaChartArray();
    
    /**
     * Sets array of all "areaChart" element
     */
    void setAreaChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart[] areaChartArray);
    
    /**
     * Sets ith "areaChart" element
     */
    void setAreaChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart areaChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "areaChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart insertNewAreaChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "areaChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart addNewAreaChart();
    
    /**
     * Removes the ith "areaChart" element
     */
    void removeAreaChart(int i);
    
    /**
     * Gets a List of "area3DChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart> getArea3DChartList();
    
    /**
     * Gets array of all "area3DChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart[] getArea3DChartArray();
    
    /**
     * Gets ith "area3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart getArea3DChartArray(int i);
    
    /**
     * Returns number of "area3DChart" element
     */
    int sizeOfArea3DChartArray();
    
    /**
     * Sets array of all "area3DChart" element
     */
    void setArea3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart[] area3DChartArray);
    
    /**
     * Sets ith "area3DChart" element
     */
    void setArea3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart area3DChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "area3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart insertNewArea3DChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "area3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart addNewArea3DChart();
    
    /**
     * Removes the ith "area3DChart" element
     */
    void removeArea3DChart(int i);
    
    /**
     * Gets a List of "lineChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart> getLineChartList();
    
    /**
     * Gets array of all "lineChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart[] getLineChartArray();
    
    /**
     * Gets ith "lineChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart getLineChartArray(int i);
    
    /**
     * Returns number of "lineChart" element
     */
    int sizeOfLineChartArray();
    
    /**
     * Sets array of all "lineChart" element
     */
    void setLineChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart[] lineChartArray);
    
    /**
     * Sets ith "lineChart" element
     */
    void setLineChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart lineChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lineChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart insertNewLineChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lineChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart addNewLineChart();
    
    /**
     * Removes the ith "lineChart" element
     */
    void removeLineChart(int i);
    
    /**
     * Gets a List of "line3DChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart> getLine3DChartList();
    
    /**
     * Gets array of all "line3DChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart[] getLine3DChartArray();
    
    /**
     * Gets ith "line3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart getLine3DChartArray(int i);
    
    /**
     * Returns number of "line3DChart" element
     */
    int sizeOfLine3DChartArray();
    
    /**
     * Sets array of all "line3DChart" element
     */
    void setLine3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart[] line3DChartArray);
    
    /**
     * Sets ith "line3DChart" element
     */
    void setLine3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart line3DChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "line3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart insertNewLine3DChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "line3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart addNewLine3DChart();
    
    /**
     * Removes the ith "line3DChart" element
     */
    void removeLine3DChart(int i);
    
    /**
     * Gets a List of "stockChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart> getStockChartList();
    
    /**
     * Gets array of all "stockChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart[] getStockChartArray();
    
    /**
     * Gets ith "stockChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart getStockChartArray(int i);
    
    /**
     * Returns number of "stockChart" element
     */
    int sizeOfStockChartArray();
    
    /**
     * Sets array of all "stockChart" element
     */
    void setStockChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart[] stockChartArray);
    
    /**
     * Sets ith "stockChart" element
     */
    void setStockChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart stockChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stockChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart insertNewStockChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stockChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart addNewStockChart();
    
    /**
     * Removes the ith "stockChart" element
     */
    void removeStockChart(int i);
    
    /**
     * Gets a List of "radarChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart> getRadarChartList();
    
    /**
     * Gets array of all "radarChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart[] getRadarChartArray();
    
    /**
     * Gets ith "radarChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart getRadarChartArray(int i);
    
    /**
     * Returns number of "radarChart" element
     */
    int sizeOfRadarChartArray();
    
    /**
     * Sets array of all "radarChart" element
     */
    void setRadarChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart[] radarChartArray);
    
    /**
     * Sets ith "radarChart" element
     */
    void setRadarChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart radarChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "radarChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart insertNewRadarChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "radarChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart addNewRadarChart();
    
    /**
     * Removes the ith "radarChart" element
     */
    void removeRadarChart(int i);
    
    /**
     * Gets a List of "scatterChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart> getScatterChartList();
    
    /**
     * Gets array of all "scatterChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart[] getScatterChartArray();
    
    /**
     * Gets ith "scatterChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart getScatterChartArray(int i);
    
    /**
     * Returns number of "scatterChart" element
     */
    int sizeOfScatterChartArray();
    
    /**
     * Sets array of all "scatterChart" element
     */
    void setScatterChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart[] scatterChartArray);
    
    /**
     * Sets ith "scatterChart" element
     */
    void setScatterChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart scatterChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scatterChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart insertNewScatterChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scatterChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart addNewScatterChart();
    
    /**
     * Removes the ith "scatterChart" element
     */
    void removeScatterChart(int i);
    
    /**
     * Gets a List of "pieChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart> getPieChartList();
    
    /**
     * Gets array of all "pieChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart[] getPieChartArray();
    
    /**
     * Gets ith "pieChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart getPieChartArray(int i);
    
    /**
     * Returns number of "pieChart" element
     */
    int sizeOfPieChartArray();
    
    /**
     * Sets array of all "pieChart" element
     */
    void setPieChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart[] pieChartArray);
    
    /**
     * Sets ith "pieChart" element
     */
    void setPieChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart pieChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pieChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart insertNewPieChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pieChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart addNewPieChart();
    
    /**
     * Removes the ith "pieChart" element
     */
    void removePieChart(int i);
    
    /**
     * Gets a List of "pie3DChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart> getPie3DChartList();
    
    /**
     * Gets array of all "pie3DChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart[] getPie3DChartArray();
    
    /**
     * Gets ith "pie3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart getPie3DChartArray(int i);
    
    /**
     * Returns number of "pie3DChart" element
     */
    int sizeOfPie3DChartArray();
    
    /**
     * Sets array of all "pie3DChart" element
     */
    void setPie3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart[] pie3DChartArray);
    
    /**
     * Sets ith "pie3DChart" element
     */
    void setPie3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart pie3DChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pie3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart insertNewPie3DChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pie3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart addNewPie3DChart();
    
    /**
     * Removes the ith "pie3DChart" element
     */
    void removePie3DChart(int i);
    
    /**
     * Gets a List of "doughnutChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart> getDoughnutChartList();
    
    /**
     * Gets array of all "doughnutChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart[] getDoughnutChartArray();
    
    /**
     * Gets ith "doughnutChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart getDoughnutChartArray(int i);
    
    /**
     * Returns number of "doughnutChart" element
     */
    int sizeOfDoughnutChartArray();
    
    /**
     * Sets array of all "doughnutChart" element
     */
    void setDoughnutChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart[] doughnutChartArray);
    
    /**
     * Sets ith "doughnutChart" element
     */
    void setDoughnutChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart doughnutChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "doughnutChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart insertNewDoughnutChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "doughnutChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart addNewDoughnutChart();
    
    /**
     * Removes the ith "doughnutChart" element
     */
    void removeDoughnutChart(int i);
    
    /**
     * Gets a List of "barChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart> getBarChartList();
    
    /**
     * Gets array of all "barChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart[] getBarChartArray();
    
    /**
     * Gets ith "barChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart getBarChartArray(int i);
    
    /**
     * Returns number of "barChart" element
     */
    int sizeOfBarChartArray();
    
    /**
     * Sets array of all "barChart" element
     */
    void setBarChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart[] barChartArray);
    
    /**
     * Sets ith "barChart" element
     */
    void setBarChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart barChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "barChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart insertNewBarChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "barChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart addNewBarChart();
    
    /**
     * Removes the ith "barChart" element
     */
    void removeBarChart(int i);
    
    /**
     * Gets a List of "bar3DChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart> getBar3DChartList();
    
    /**
     * Gets array of all "bar3DChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart[] getBar3DChartArray();
    
    /**
     * Gets ith "bar3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart getBar3DChartArray(int i);
    
    /**
     * Returns number of "bar3DChart" element
     */
    int sizeOfBar3DChartArray();
    
    /**
     * Sets array of all "bar3DChart" element
     */
    void setBar3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart[] bar3DChartArray);
    
    /**
     * Sets ith "bar3DChart" element
     */
    void setBar3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart bar3DChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bar3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart insertNewBar3DChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bar3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart addNewBar3DChart();
    
    /**
     * Removes the ith "bar3DChart" element
     */
    void removeBar3DChart(int i);
    
    /**
     * Gets a List of "ofPieChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart> getOfPieChartList();
    
    /**
     * Gets array of all "ofPieChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart[] getOfPieChartArray();
    
    /**
     * Gets ith "ofPieChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart getOfPieChartArray(int i);
    
    /**
     * Returns number of "ofPieChart" element
     */
    int sizeOfOfPieChartArray();
    
    /**
     * Sets array of all "ofPieChart" element
     */
    void setOfPieChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart[] ofPieChartArray);
    
    /**
     * Sets ith "ofPieChart" element
     */
    void setOfPieChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart ofPieChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ofPieChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart insertNewOfPieChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ofPieChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart addNewOfPieChart();
    
    /**
     * Removes the ith "ofPieChart" element
     */
    void removeOfPieChart(int i);
    
    /**
     * Gets a List of "surfaceChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart> getSurfaceChartList();
    
    /**
     * Gets array of all "surfaceChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart[] getSurfaceChartArray();
    
    /**
     * Gets ith "surfaceChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart getSurfaceChartArray(int i);
    
    /**
     * Returns number of "surfaceChart" element
     */
    int sizeOfSurfaceChartArray();
    
    /**
     * Sets array of all "surfaceChart" element
     */
    void setSurfaceChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart[] surfaceChartArray);
    
    /**
     * Sets ith "surfaceChart" element
     */
    void setSurfaceChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart surfaceChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "surfaceChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart insertNewSurfaceChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "surfaceChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart addNewSurfaceChart();
    
    /**
     * Removes the ith "surfaceChart" element
     */
    void removeSurfaceChart(int i);
    
    /**
     * Gets a List of "surface3DChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart> getSurface3DChartList();
    
    /**
     * Gets array of all "surface3DChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart[] getSurface3DChartArray();
    
    /**
     * Gets ith "surface3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart getSurface3DChartArray(int i);
    
    /**
     * Returns number of "surface3DChart" element
     */
    int sizeOfSurface3DChartArray();
    
    /**
     * Sets array of all "surface3DChart" element
     */
    void setSurface3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart[] surface3DChartArray);
    
    /**
     * Sets ith "surface3DChart" element
     */
    void setSurface3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart surface3DChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "surface3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart insertNewSurface3DChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "surface3DChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart addNewSurface3DChart();
    
    /**
     * Removes the ith "surface3DChart" element
     */
    void removeSurface3DChart(int i);
    
    /**
     * Gets a List of "bubbleChart" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart> getBubbleChartList();
    
    /**
     * Gets array of all "bubbleChart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart[] getBubbleChartArray();
    
    /**
     * Gets ith "bubbleChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart getBubbleChartArray(int i);
    
    /**
     * Returns number of "bubbleChart" element
     */
    int sizeOfBubbleChartArray();
    
    /**
     * Sets array of all "bubbleChart" element
     */
    void setBubbleChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart[] bubbleChartArray);
    
    /**
     * Sets ith "bubbleChart" element
     */
    void setBubbleChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart bubbleChart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bubbleChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart insertNewBubbleChart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bubbleChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart addNewBubbleChart();
    
    /**
     * Removes the ith "bubbleChart" element
     */
    void removeBubbleChart(int i);
    
    /**
     * Gets a List of "valAx" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx> getValAxList();
    
    /**
     * Gets array of all "valAx" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx[] getValAxArray();
    
    /**
     * Gets ith "valAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx getValAxArray(int i);
    
    /**
     * Returns number of "valAx" element
     */
    int sizeOfValAxArray();
    
    /**
     * Sets array of all "valAx" element
     */
    void setValAxArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx[] valAxArray);
    
    /**
     * Sets ith "valAx" element
     */
    void setValAxArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx valAx);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "valAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx insertNewValAx(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "valAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx addNewValAx();
    
    /**
     * Removes the ith "valAx" element
     */
    void removeValAx(int i);
    
    /**
     * Gets a List of "catAx" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx> getCatAxList();
    
    /**
     * Gets array of all "catAx" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx[] getCatAxArray();
    
    /**
     * Gets ith "catAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx getCatAxArray(int i);
    
    /**
     * Returns number of "catAx" element
     */
    int sizeOfCatAxArray();
    
    /**
     * Sets array of all "catAx" element
     */
    void setCatAxArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx[] catAxArray);
    
    /**
     * Sets ith "catAx" element
     */
    void setCatAxArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx catAx);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx insertNewCatAx(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx addNewCatAx();
    
    /**
     * Removes the ith "catAx" element
     */
    void removeCatAx(int i);
    
    /**
     * Gets a List of "dateAx" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx> getDateAxList();
    
    /**
     * Gets array of all "dateAx" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx[] getDateAxArray();
    
    /**
     * Gets ith "dateAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx getDateAxArray(int i);
    
    /**
     * Returns number of "dateAx" element
     */
    int sizeOfDateAxArray();
    
    /**
     * Sets array of all "dateAx" element
     */
    void setDateAxArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx[] dateAxArray);
    
    /**
     * Sets ith "dateAx" element
     */
    void setDateAxArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx dateAx);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx insertNewDateAx(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx addNewDateAx();
    
    /**
     * Removes the ith "dateAx" element
     */
    void removeDateAx(int i);
    
    /**
     * Gets a List of "serAx" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx> getSerAxList();
    
    /**
     * Gets array of all "serAx" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx[] getSerAxArray();
    
    /**
     * Gets ith "serAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx getSerAxArray(int i);
    
    /**
     * Returns number of "serAx" element
     */
    int sizeOfSerAxArray();
    
    /**
     * Sets array of all "serAx" element
     */
    void setSerAxArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx[] serAxArray);
    
    /**
     * Sets ith "serAx" element
     */
    void setSerAxArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx serAx);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx insertNewSerAx(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serAx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx addNewSerAx();
    
    /**
     * Removes the ith "serAx" element
     */
    void removeSerAx(int i);
    
    /**
     * Gets the "dTable" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable getDTable();
    
    /**
     * True if has "dTable" element
     */
    boolean isSetDTable();
    
    /**
     * Sets the "dTable" element
     */
    void setDTable(org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable dTable);
    
    /**
     * Appends and returns a new empty "dTable" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable addNewDTable();
    
    /**
     * Unsets the "dTable" element
     */
    void unsetDTable();
    
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

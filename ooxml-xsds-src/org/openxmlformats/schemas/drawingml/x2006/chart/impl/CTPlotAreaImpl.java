/*
 * XML Type:  CT_PlotArea
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_PlotArea(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTPlotAreaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea
{
    
    public CTPlotAreaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYOUT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "layout");
    private static final javax.xml.namespace.QName AREACHART$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "areaChart");
    private static final javax.xml.namespace.QName AREA3DCHART$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "area3DChart");
    private static final javax.xml.namespace.QName LINECHART$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "lineChart");
    private static final javax.xml.namespace.QName LINE3DCHART$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "line3DChart");
    private static final javax.xml.namespace.QName STOCKCHART$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "stockChart");
    private static final javax.xml.namespace.QName RADARCHART$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "radarChart");
    private static final javax.xml.namespace.QName SCATTERCHART$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "scatterChart");
    private static final javax.xml.namespace.QName PIECHART$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pieChart");
    private static final javax.xml.namespace.QName PIE3DCHART$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pie3DChart");
    private static final javax.xml.namespace.QName DOUGHNUTCHART$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "doughnutChart");
    private static final javax.xml.namespace.QName BARCHART$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "barChart");
    private static final javax.xml.namespace.QName BAR3DCHART$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "bar3DChart");
    private static final javax.xml.namespace.QName OFPIECHART$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ofPieChart");
    private static final javax.xml.namespace.QName SURFACECHART$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "surfaceChart");
    private static final javax.xml.namespace.QName SURFACE3DCHART$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "surface3DChart");
    private static final javax.xml.namespace.QName BUBBLECHART$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "bubbleChart");
    private static final javax.xml.namespace.QName VALAX$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "valAx");
    private static final javax.xml.namespace.QName CATAX$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "catAx");
    private static final javax.xml.namespace.QName DATEAX$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dateAx");
    private static final javax.xml.namespace.QName SERAX$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "serAx");
    private static final javax.xml.namespace.QName DTABLE$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dTable");
    private static final javax.xml.namespace.QName SPPR$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName EXTLST$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "layout" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout getLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().find_element_user(LAYOUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "layout" element
     */
    public boolean isSetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUT$0) != 0;
        }
    }
    
    /**
     * Sets the "layout" element
     */
    public void setLayout(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout layout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().find_element_user(LAYOUT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().add_element_user(LAYOUT$0);
            }
            target.set(layout);
        }
    }
    
    /**
     * Appends and returns a new empty "layout" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout addNewLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().add_element_user(LAYOUT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "layout" element
     */
    public void unsetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUT$0, 0);
        }
    }
    
    /**
     * Gets a List of "areaChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart> getAreaChartList()
    {
        final class AreaChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart get(int i)
                { return CTPlotAreaImpl.this.getAreaChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart old = CTPlotAreaImpl.this.getAreaChartArray(i);
                CTPlotAreaImpl.this.setAreaChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart o)
                { CTPlotAreaImpl.this.insertNewAreaChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart old = CTPlotAreaImpl.this.getAreaChartArray(i);
                CTPlotAreaImpl.this.removeAreaChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfAreaChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AreaChartList();
        }
    }
    
    /**
     * Gets array of all "areaChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart[] getAreaChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AREACHART$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "areaChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart getAreaChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart)get_store().find_element_user(AREACHART$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "areaChart" element
     */
    public int sizeOfAreaChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AREACHART$2);
        }
    }
    
    /**
     * Sets array of all "areaChart" element
     */
    public void setAreaChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart[] areaChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(areaChartArray, AREACHART$2);
        }
    }
    
    /**
     * Sets ith "areaChart" element
     */
    public void setAreaChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart areaChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart)get_store().find_element_user(AREACHART$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(areaChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "areaChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart insertNewAreaChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart)get_store().insert_element_user(AREACHART$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "areaChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart addNewAreaChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart)get_store().add_element_user(AREACHART$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "areaChart" element
     */
    public void removeAreaChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AREACHART$2, i);
        }
    }
    
    /**
     * Gets a List of "area3DChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart> getArea3DChartList()
    {
        final class Area3DChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart get(int i)
                { return CTPlotAreaImpl.this.getArea3DChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart old = CTPlotAreaImpl.this.getArea3DChartArray(i);
                CTPlotAreaImpl.this.setArea3DChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart o)
                { CTPlotAreaImpl.this.insertNewArea3DChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart old = CTPlotAreaImpl.this.getArea3DChartArray(i);
                CTPlotAreaImpl.this.removeArea3DChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfArea3DChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Area3DChartList();
        }
    }
    
    /**
     * Gets array of all "area3DChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart[] getArea3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AREA3DCHART$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "area3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart getArea3DChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart)get_store().find_element_user(AREA3DCHART$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "area3DChart" element
     */
    public int sizeOfArea3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AREA3DCHART$4);
        }
    }
    
    /**
     * Sets array of all "area3DChart" element
     */
    public void setArea3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart[] area3DChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(area3DChartArray, AREA3DCHART$4);
        }
    }
    
    /**
     * Sets ith "area3DChart" element
     */
    public void setArea3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart area3DChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart)get_store().find_element_user(AREA3DCHART$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(area3DChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "area3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart insertNewArea3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart)get_store().insert_element_user(AREA3DCHART$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "area3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart addNewArea3DChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart)get_store().add_element_user(AREA3DCHART$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "area3DChart" element
     */
    public void removeArea3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AREA3DCHART$4, i);
        }
    }
    
    /**
     * Gets a List of "lineChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart> getLineChartList()
    {
        final class LineChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart get(int i)
                { return CTPlotAreaImpl.this.getLineChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart old = CTPlotAreaImpl.this.getLineChartArray(i);
                CTPlotAreaImpl.this.setLineChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart o)
                { CTPlotAreaImpl.this.insertNewLineChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart old = CTPlotAreaImpl.this.getLineChartArray(i);
                CTPlotAreaImpl.this.removeLineChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfLineChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LineChartList();
        }
    }
    
    /**
     * Gets array of all "lineChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart[] getLineChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINECHART$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lineChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart getLineChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart)get_store().find_element_user(LINECHART$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lineChart" element
     */
    public int sizeOfLineChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINECHART$6);
        }
    }
    
    /**
     * Sets array of all "lineChart" element
     */
    public void setLineChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart[] lineChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lineChartArray, LINECHART$6);
        }
    }
    
    /**
     * Sets ith "lineChart" element
     */
    public void setLineChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart lineChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart)get_store().find_element_user(LINECHART$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lineChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lineChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart insertNewLineChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart)get_store().insert_element_user(LINECHART$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lineChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart addNewLineChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart)get_store().add_element_user(LINECHART$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "lineChart" element
     */
    public void removeLineChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINECHART$6, i);
        }
    }
    
    /**
     * Gets a List of "line3DChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart> getLine3DChartList()
    {
        final class Line3DChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart get(int i)
                { return CTPlotAreaImpl.this.getLine3DChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart old = CTPlotAreaImpl.this.getLine3DChartArray(i);
                CTPlotAreaImpl.this.setLine3DChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart o)
                { CTPlotAreaImpl.this.insertNewLine3DChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart old = CTPlotAreaImpl.this.getLine3DChartArray(i);
                CTPlotAreaImpl.this.removeLine3DChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfLine3DChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Line3DChartList();
        }
    }
    
    /**
     * Gets array of all "line3DChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart[] getLine3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINE3DCHART$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "line3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart getLine3DChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart)get_store().find_element_user(LINE3DCHART$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "line3DChart" element
     */
    public int sizeOfLine3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINE3DCHART$8);
        }
    }
    
    /**
     * Sets array of all "line3DChart" element
     */
    public void setLine3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart[] line3DChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(line3DChartArray, LINE3DCHART$8);
        }
    }
    
    /**
     * Sets ith "line3DChart" element
     */
    public void setLine3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart line3DChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart)get_store().find_element_user(LINE3DCHART$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(line3DChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "line3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart insertNewLine3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart)get_store().insert_element_user(LINE3DCHART$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "line3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart addNewLine3DChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart)get_store().add_element_user(LINE3DCHART$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "line3DChart" element
     */
    public void removeLine3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINE3DCHART$8, i);
        }
    }
    
    /**
     * Gets a List of "stockChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart> getStockChartList()
    {
        final class StockChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart get(int i)
                { return CTPlotAreaImpl.this.getStockChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart old = CTPlotAreaImpl.this.getStockChartArray(i);
                CTPlotAreaImpl.this.setStockChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart o)
                { CTPlotAreaImpl.this.insertNewStockChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart old = CTPlotAreaImpl.this.getStockChartArray(i);
                CTPlotAreaImpl.this.removeStockChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfStockChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StockChartList();
        }
    }
    
    /**
     * Gets array of all "stockChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart[] getStockChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STOCKCHART$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stockChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart getStockChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart)get_store().find_element_user(STOCKCHART$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stockChart" element
     */
    public int sizeOfStockChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOCKCHART$10);
        }
    }
    
    /**
     * Sets array of all "stockChart" element
     */
    public void setStockChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart[] stockChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stockChartArray, STOCKCHART$10);
        }
    }
    
    /**
     * Sets ith "stockChart" element
     */
    public void setStockChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart stockChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart)get_store().find_element_user(STOCKCHART$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stockChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stockChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart insertNewStockChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart)get_store().insert_element_user(STOCKCHART$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stockChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart addNewStockChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart)get_store().add_element_user(STOCKCHART$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "stockChart" element
     */
    public void removeStockChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOCKCHART$10, i);
        }
    }
    
    /**
     * Gets a List of "radarChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart> getRadarChartList()
    {
        final class RadarChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart get(int i)
                { return CTPlotAreaImpl.this.getRadarChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart old = CTPlotAreaImpl.this.getRadarChartArray(i);
                CTPlotAreaImpl.this.setRadarChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart o)
                { CTPlotAreaImpl.this.insertNewRadarChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart old = CTPlotAreaImpl.this.getRadarChartArray(i);
                CTPlotAreaImpl.this.removeRadarChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfRadarChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RadarChartList();
        }
    }
    
    /**
     * Gets array of all "radarChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart[] getRadarChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RADARCHART$12, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "radarChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart getRadarChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart)get_store().find_element_user(RADARCHART$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "radarChart" element
     */
    public int sizeOfRadarChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADARCHART$12);
        }
    }
    
    /**
     * Sets array of all "radarChart" element
     */
    public void setRadarChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart[] radarChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(radarChartArray, RADARCHART$12);
        }
    }
    
    /**
     * Sets ith "radarChart" element
     */
    public void setRadarChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart radarChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart)get_store().find_element_user(RADARCHART$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(radarChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "radarChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart insertNewRadarChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart)get_store().insert_element_user(RADARCHART$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "radarChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart addNewRadarChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart)get_store().add_element_user(RADARCHART$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "radarChart" element
     */
    public void removeRadarChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADARCHART$12, i);
        }
    }
    
    /**
     * Gets a List of "scatterChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart> getScatterChartList()
    {
        final class ScatterChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart get(int i)
                { return CTPlotAreaImpl.this.getScatterChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart old = CTPlotAreaImpl.this.getScatterChartArray(i);
                CTPlotAreaImpl.this.setScatterChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart o)
                { CTPlotAreaImpl.this.insertNewScatterChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart old = CTPlotAreaImpl.this.getScatterChartArray(i);
                CTPlotAreaImpl.this.removeScatterChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfScatterChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ScatterChartList();
        }
    }
    
    /**
     * Gets array of all "scatterChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart[] getScatterChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCATTERCHART$14, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "scatterChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart getScatterChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart)get_store().find_element_user(SCATTERCHART$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scatterChart" element
     */
    public int sizeOfScatterChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCATTERCHART$14);
        }
    }
    
    /**
     * Sets array of all "scatterChart" element
     */
    public void setScatterChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart[] scatterChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scatterChartArray, SCATTERCHART$14);
        }
    }
    
    /**
     * Sets ith "scatterChart" element
     */
    public void setScatterChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart scatterChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart)get_store().find_element_user(SCATTERCHART$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scatterChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scatterChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart insertNewScatterChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart)get_store().insert_element_user(SCATTERCHART$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scatterChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart addNewScatterChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart)get_store().add_element_user(SCATTERCHART$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "scatterChart" element
     */
    public void removeScatterChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCATTERCHART$14, i);
        }
    }
    
    /**
     * Gets a List of "pieChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart> getPieChartList()
    {
        final class PieChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart get(int i)
                { return CTPlotAreaImpl.this.getPieChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart old = CTPlotAreaImpl.this.getPieChartArray(i);
                CTPlotAreaImpl.this.setPieChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart o)
                { CTPlotAreaImpl.this.insertNewPieChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart old = CTPlotAreaImpl.this.getPieChartArray(i);
                CTPlotAreaImpl.this.removePieChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfPieChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PieChartList();
        }
    }
    
    /**
     * Gets array of all "pieChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart[] getPieChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIECHART$16, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pieChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart getPieChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart)get_store().find_element_user(PIECHART$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pieChart" element
     */
    public int sizeOfPieChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIECHART$16);
        }
    }
    
    /**
     * Sets array of all "pieChart" element
     */
    public void setPieChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart[] pieChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pieChartArray, PIECHART$16);
        }
    }
    
    /**
     * Sets ith "pieChart" element
     */
    public void setPieChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart pieChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart)get_store().find_element_user(PIECHART$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pieChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pieChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart insertNewPieChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart)get_store().insert_element_user(PIECHART$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pieChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart addNewPieChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart)get_store().add_element_user(PIECHART$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "pieChart" element
     */
    public void removePieChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIECHART$16, i);
        }
    }
    
    /**
     * Gets a List of "pie3DChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart> getPie3DChartList()
    {
        final class Pie3DChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart get(int i)
                { return CTPlotAreaImpl.this.getPie3DChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart old = CTPlotAreaImpl.this.getPie3DChartArray(i);
                CTPlotAreaImpl.this.setPie3DChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart o)
                { CTPlotAreaImpl.this.insertNewPie3DChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart old = CTPlotAreaImpl.this.getPie3DChartArray(i);
                CTPlotAreaImpl.this.removePie3DChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfPie3DChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Pie3DChartList();
        }
    }
    
    /**
     * Gets array of all "pie3DChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart[] getPie3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIE3DCHART$18, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pie3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart getPie3DChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart)get_store().find_element_user(PIE3DCHART$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pie3DChart" element
     */
    public int sizeOfPie3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIE3DCHART$18);
        }
    }
    
    /**
     * Sets array of all "pie3DChart" element
     */
    public void setPie3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart[] pie3DChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pie3DChartArray, PIE3DCHART$18);
        }
    }
    
    /**
     * Sets ith "pie3DChart" element
     */
    public void setPie3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart pie3DChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart)get_store().find_element_user(PIE3DCHART$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pie3DChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pie3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart insertNewPie3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart)get_store().insert_element_user(PIE3DCHART$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pie3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart addNewPie3DChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart)get_store().add_element_user(PIE3DCHART$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "pie3DChart" element
     */
    public void removePie3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIE3DCHART$18, i);
        }
    }
    
    /**
     * Gets a List of "doughnutChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart> getDoughnutChartList()
    {
        final class DoughnutChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart get(int i)
                { return CTPlotAreaImpl.this.getDoughnutChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart old = CTPlotAreaImpl.this.getDoughnutChartArray(i);
                CTPlotAreaImpl.this.setDoughnutChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart o)
                { CTPlotAreaImpl.this.insertNewDoughnutChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart old = CTPlotAreaImpl.this.getDoughnutChartArray(i);
                CTPlotAreaImpl.this.removeDoughnutChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfDoughnutChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DoughnutChartList();
        }
    }
    
    /**
     * Gets array of all "doughnutChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart[] getDoughnutChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOUGHNUTCHART$20, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "doughnutChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart getDoughnutChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart)get_store().find_element_user(DOUGHNUTCHART$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "doughnutChart" element
     */
    public int sizeOfDoughnutChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOUGHNUTCHART$20);
        }
    }
    
    /**
     * Sets array of all "doughnutChart" element
     */
    public void setDoughnutChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart[] doughnutChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(doughnutChartArray, DOUGHNUTCHART$20);
        }
    }
    
    /**
     * Sets ith "doughnutChart" element
     */
    public void setDoughnutChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart doughnutChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart)get_store().find_element_user(DOUGHNUTCHART$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(doughnutChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "doughnutChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart insertNewDoughnutChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart)get_store().insert_element_user(DOUGHNUTCHART$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "doughnutChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart addNewDoughnutChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart)get_store().add_element_user(DOUGHNUTCHART$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "doughnutChart" element
     */
    public void removeDoughnutChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOUGHNUTCHART$20, i);
        }
    }
    
    /**
     * Gets a List of "barChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart> getBarChartList()
    {
        final class BarChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart get(int i)
                { return CTPlotAreaImpl.this.getBarChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart old = CTPlotAreaImpl.this.getBarChartArray(i);
                CTPlotAreaImpl.this.setBarChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart o)
                { CTPlotAreaImpl.this.insertNewBarChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart old = CTPlotAreaImpl.this.getBarChartArray(i);
                CTPlotAreaImpl.this.removeBarChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfBarChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BarChartList();
        }
    }
    
    /**
     * Gets array of all "barChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart[] getBarChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BARCHART$22, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "barChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart getBarChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart)get_store().find_element_user(BARCHART$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "barChart" element
     */
    public int sizeOfBarChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BARCHART$22);
        }
    }
    
    /**
     * Sets array of all "barChart" element
     */
    public void setBarChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart[] barChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(barChartArray, BARCHART$22);
        }
    }
    
    /**
     * Sets ith "barChart" element
     */
    public void setBarChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart barChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart)get_store().find_element_user(BARCHART$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(barChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "barChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart insertNewBarChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart)get_store().insert_element_user(BARCHART$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "barChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart addNewBarChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart)get_store().add_element_user(BARCHART$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "barChart" element
     */
    public void removeBarChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BARCHART$22, i);
        }
    }
    
    /**
     * Gets a List of "bar3DChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart> getBar3DChartList()
    {
        final class Bar3DChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart get(int i)
                { return CTPlotAreaImpl.this.getBar3DChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart old = CTPlotAreaImpl.this.getBar3DChartArray(i);
                CTPlotAreaImpl.this.setBar3DChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart o)
                { CTPlotAreaImpl.this.insertNewBar3DChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart old = CTPlotAreaImpl.this.getBar3DChartArray(i);
                CTPlotAreaImpl.this.removeBar3DChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfBar3DChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Bar3DChartList();
        }
    }
    
    /**
     * Gets array of all "bar3DChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart[] getBar3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BAR3DCHART$24, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bar3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart getBar3DChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart)get_store().find_element_user(BAR3DCHART$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bar3DChart" element
     */
    public int sizeOfBar3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BAR3DCHART$24);
        }
    }
    
    /**
     * Sets array of all "bar3DChart" element
     */
    public void setBar3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart[] bar3DChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bar3DChartArray, BAR3DCHART$24);
        }
    }
    
    /**
     * Sets ith "bar3DChart" element
     */
    public void setBar3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart bar3DChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart)get_store().find_element_user(BAR3DCHART$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bar3DChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bar3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart insertNewBar3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart)get_store().insert_element_user(BAR3DCHART$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bar3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart addNewBar3DChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart)get_store().add_element_user(BAR3DCHART$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "bar3DChart" element
     */
    public void removeBar3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BAR3DCHART$24, i);
        }
    }
    
    /**
     * Gets a List of "ofPieChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart> getOfPieChartList()
    {
        final class OfPieChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart get(int i)
                { return CTPlotAreaImpl.this.getOfPieChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart old = CTPlotAreaImpl.this.getOfPieChartArray(i);
                CTPlotAreaImpl.this.setOfPieChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart o)
                { CTPlotAreaImpl.this.insertNewOfPieChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart old = CTPlotAreaImpl.this.getOfPieChartArray(i);
                CTPlotAreaImpl.this.removeOfPieChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfOfPieChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OfPieChartList();
        }
    }
    
    /**
     * Gets array of all "ofPieChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart[] getOfPieChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFPIECHART$26, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ofPieChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart getOfPieChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart)get_store().find_element_user(OFPIECHART$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ofPieChart" element
     */
    public int sizeOfOfPieChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFPIECHART$26);
        }
    }
    
    /**
     * Sets array of all "ofPieChart" element
     */
    public void setOfPieChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart[] ofPieChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ofPieChartArray, OFPIECHART$26);
        }
    }
    
    /**
     * Sets ith "ofPieChart" element
     */
    public void setOfPieChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart ofPieChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart)get_store().find_element_user(OFPIECHART$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ofPieChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ofPieChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart insertNewOfPieChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart)get_store().insert_element_user(OFPIECHART$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ofPieChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart addNewOfPieChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart)get_store().add_element_user(OFPIECHART$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "ofPieChart" element
     */
    public void removeOfPieChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFPIECHART$26, i);
        }
    }
    
    /**
     * Gets a List of "surfaceChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart> getSurfaceChartList()
    {
        final class SurfaceChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart get(int i)
                { return CTPlotAreaImpl.this.getSurfaceChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart old = CTPlotAreaImpl.this.getSurfaceChartArray(i);
                CTPlotAreaImpl.this.setSurfaceChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart o)
                { CTPlotAreaImpl.this.insertNewSurfaceChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart old = CTPlotAreaImpl.this.getSurfaceChartArray(i);
                CTPlotAreaImpl.this.removeSurfaceChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfSurfaceChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SurfaceChartList();
        }
    }
    
    /**
     * Gets array of all "surfaceChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart[] getSurfaceChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SURFACECHART$28, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "surfaceChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart getSurfaceChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart)get_store().find_element_user(SURFACECHART$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "surfaceChart" element
     */
    public int sizeOfSurfaceChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACECHART$28);
        }
    }
    
    /**
     * Sets array of all "surfaceChart" element
     */
    public void setSurfaceChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart[] surfaceChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(surfaceChartArray, SURFACECHART$28);
        }
    }
    
    /**
     * Sets ith "surfaceChart" element
     */
    public void setSurfaceChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart surfaceChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart)get_store().find_element_user(SURFACECHART$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(surfaceChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "surfaceChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart insertNewSurfaceChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart)get_store().insert_element_user(SURFACECHART$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "surfaceChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart addNewSurfaceChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart)get_store().add_element_user(SURFACECHART$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "surfaceChart" element
     */
    public void removeSurfaceChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACECHART$28, i);
        }
    }
    
    /**
     * Gets a List of "surface3DChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart> getSurface3DChartList()
    {
        final class Surface3DChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart get(int i)
                { return CTPlotAreaImpl.this.getSurface3DChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart old = CTPlotAreaImpl.this.getSurface3DChartArray(i);
                CTPlotAreaImpl.this.setSurface3DChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart o)
                { CTPlotAreaImpl.this.insertNewSurface3DChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart old = CTPlotAreaImpl.this.getSurface3DChartArray(i);
                CTPlotAreaImpl.this.removeSurface3DChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfSurface3DChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Surface3DChartList();
        }
    }
    
    /**
     * Gets array of all "surface3DChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart[] getSurface3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SURFACE3DCHART$30, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "surface3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart getSurface3DChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart)get_store().find_element_user(SURFACE3DCHART$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "surface3DChart" element
     */
    public int sizeOfSurface3DChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACE3DCHART$30);
        }
    }
    
    /**
     * Sets array of all "surface3DChart" element
     */
    public void setSurface3DChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart[] surface3DChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(surface3DChartArray, SURFACE3DCHART$30);
        }
    }
    
    /**
     * Sets ith "surface3DChart" element
     */
    public void setSurface3DChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart surface3DChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart)get_store().find_element_user(SURFACE3DCHART$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(surface3DChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "surface3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart insertNewSurface3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart)get_store().insert_element_user(SURFACE3DCHART$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "surface3DChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart addNewSurface3DChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart)get_store().add_element_user(SURFACE3DCHART$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "surface3DChart" element
     */
    public void removeSurface3DChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACE3DCHART$30, i);
        }
    }
    
    /**
     * Gets a List of "bubbleChart" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart> getBubbleChartList()
    {
        final class BubbleChartList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart get(int i)
                { return CTPlotAreaImpl.this.getBubbleChartArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart old = CTPlotAreaImpl.this.getBubbleChartArray(i);
                CTPlotAreaImpl.this.setBubbleChartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart o)
                { CTPlotAreaImpl.this.insertNewBubbleChart(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart old = CTPlotAreaImpl.this.getBubbleChartArray(i);
                CTPlotAreaImpl.this.removeBubbleChart(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfBubbleChartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BubbleChartList();
        }
    }
    
    /**
     * Gets array of all "bubbleChart" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart[] getBubbleChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUBBLECHART$32, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bubbleChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart getBubbleChartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart)get_store().find_element_user(BUBBLECHART$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bubbleChart" element
     */
    public int sizeOfBubbleChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUBBLECHART$32);
        }
    }
    
    /**
     * Sets array of all "bubbleChart" element
     */
    public void setBubbleChartArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart[] bubbleChartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bubbleChartArray, BUBBLECHART$32);
        }
    }
    
    /**
     * Sets ith "bubbleChart" element
     */
    public void setBubbleChartArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart bubbleChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart)get_store().find_element_user(BUBBLECHART$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bubbleChart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bubbleChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart insertNewBubbleChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart)get_store().insert_element_user(BUBBLECHART$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bubbleChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart addNewBubbleChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart)get_store().add_element_user(BUBBLECHART$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "bubbleChart" element
     */
    public void removeBubbleChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUBBLECHART$32, i);
        }
    }
    
    /**
     * Gets a List of "valAx" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx> getValAxList()
    {
        final class ValAxList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx get(int i)
                { return CTPlotAreaImpl.this.getValAxArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx old = CTPlotAreaImpl.this.getValAxArray(i);
                CTPlotAreaImpl.this.setValAxArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx o)
                { CTPlotAreaImpl.this.insertNewValAx(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx old = CTPlotAreaImpl.this.getValAxArray(i);
                CTPlotAreaImpl.this.removeValAx(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfValAxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ValAxList();
        }
    }
    
    /**
     * Gets array of all "valAx" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx[] getValAxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALAX$34, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "valAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx getValAxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx)get_store().find_element_user(VALAX$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "valAx" element
     */
    public int sizeOfValAxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALAX$34);
        }
    }
    
    /**
     * Sets array of all "valAx" element
     */
    public void setValAxArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx[] valAxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valAxArray, VALAX$34);
        }
    }
    
    /**
     * Sets ith "valAx" element
     */
    public void setValAxArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx valAx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx)get_store().find_element_user(VALAX$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(valAx);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "valAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx insertNewValAx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx)get_store().insert_element_user(VALAX$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "valAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx addNewValAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx)get_store().add_element_user(VALAX$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "valAx" element
     */
    public void removeValAx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALAX$34, i);
        }
    }
    
    /**
     * Gets a List of "catAx" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx> getCatAxList()
    {
        final class CatAxList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx get(int i)
                { return CTPlotAreaImpl.this.getCatAxArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx old = CTPlotAreaImpl.this.getCatAxArray(i);
                CTPlotAreaImpl.this.setCatAxArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx o)
                { CTPlotAreaImpl.this.insertNewCatAx(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx old = CTPlotAreaImpl.this.getCatAxArray(i);
                CTPlotAreaImpl.this.removeCatAx(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfCatAxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CatAxList();
        }
    }
    
    /**
     * Gets array of all "catAx" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx[] getCatAxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATAX$36, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "catAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx getCatAxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx)get_store().find_element_user(CATAX$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "catAx" element
     */
    public int sizeOfCatAxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATAX$36);
        }
    }
    
    /**
     * Sets array of all "catAx" element
     */
    public void setCatAxArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx[] catAxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(catAxArray, CATAX$36);
        }
    }
    
    /**
     * Sets ith "catAx" element
     */
    public void setCatAxArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx catAx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx)get_store().find_element_user(CATAX$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(catAx);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx insertNewCatAx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx)get_store().insert_element_user(CATAX$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx addNewCatAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx)get_store().add_element_user(CATAX$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "catAx" element
     */
    public void removeCatAx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATAX$36, i);
        }
    }
    
    /**
     * Gets a List of "dateAx" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx> getDateAxList()
    {
        final class DateAxList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx get(int i)
                { return CTPlotAreaImpl.this.getDateAxArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx old = CTPlotAreaImpl.this.getDateAxArray(i);
                CTPlotAreaImpl.this.setDateAxArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx o)
                { CTPlotAreaImpl.this.insertNewDateAx(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx old = CTPlotAreaImpl.this.getDateAxArray(i);
                CTPlotAreaImpl.this.removeDateAx(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfDateAxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DateAxList();
        }
    }
    
    /**
     * Gets array of all "dateAx" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx[] getDateAxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATEAX$38, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dateAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx getDateAxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx)get_store().find_element_user(DATEAX$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dateAx" element
     */
    public int sizeOfDateAxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEAX$38);
        }
    }
    
    /**
     * Sets array of all "dateAx" element
     */
    public void setDateAxArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx[] dateAxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateAxArray, DATEAX$38);
        }
    }
    
    /**
     * Sets ith "dateAx" element
     */
    public void setDateAxArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx dateAx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx)get_store().find_element_user(DATEAX$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateAx);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx insertNewDateAx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx)get_store().insert_element_user(DATEAX$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx addNewDateAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx)get_store().add_element_user(DATEAX$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "dateAx" element
     */
    public void removeDateAx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEAX$38, i);
        }
    }
    
    /**
     * Gets a List of "serAx" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx> getSerAxList()
    {
        final class SerAxList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx get(int i)
                { return CTPlotAreaImpl.this.getSerAxArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx old = CTPlotAreaImpl.this.getSerAxArray(i);
                CTPlotAreaImpl.this.setSerAxArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx o)
                { CTPlotAreaImpl.this.insertNewSerAx(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx old = CTPlotAreaImpl.this.getSerAxArray(i);
                CTPlotAreaImpl.this.removeSerAx(i);
                return old;
            }
            
            public int size()
                { return CTPlotAreaImpl.this.sizeOfSerAxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SerAxList();
        }
    }
    
    /**
     * Gets array of all "serAx" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx[] getSerAxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERAX$40, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx getSerAxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx)get_store().find_element_user(SERAX$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serAx" element
     */
    public int sizeOfSerAxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERAX$40);
        }
    }
    
    /**
     * Sets array of all "serAx" element
     */
    public void setSerAxArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx[] serAxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serAxArray, SERAX$40);
        }
    }
    
    /**
     * Sets ith "serAx" element
     */
    public void setSerAxArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx serAx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx)get_store().find_element_user(SERAX$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serAx);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx insertNewSerAx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx)get_store().insert_element_user(SERAX$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx addNewSerAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx)get_store().add_element_user(SERAX$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "serAx" element
     */
    public void removeSerAx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERAX$40, i);
        }
    }
    
    /**
     * Gets the "dTable" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable getDTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable)get_store().find_element_user(DTABLE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dTable" element
     */
    public boolean isSetDTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTABLE$42) != 0;
        }
    }
    
    /**
     * Sets the "dTable" element
     */
    public void setDTable(org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable dTable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable)get_store().find_element_user(DTABLE$42, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable)get_store().add_element_user(DTABLE$42);
            }
            target.set(dTable);
        }
    }
    
    /**
     * Appends and returns a new empty "dTable" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable addNewDTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable)get_store().add_element_user(DTABLE$42);
            return target;
        }
    }
    
    /**
     * Unsets the "dTable" element
     */
    public void unsetDTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTABLE$42, 0);
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spPr" element
     */
    public boolean isSetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPPR$44) != 0;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$44, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$44);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$44);
            return target;
        }
    }
    
    /**
     * Unsets the "spPr" element
     */
    public void unsetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPPR$44, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$46) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$46, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$46);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$46);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$46, 0);
        }
    }
}

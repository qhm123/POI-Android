/*
 * XML Type:  CT_ScatterSer
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_ScatterSer(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTScatterSer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTScatterSer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctscatterser2f7atype");
    
    /**
     * Gets the "idx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getIdx();
    
    /**
     * Sets the "idx" element
     */
    void setIdx(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt idx);
    
    /**
     * Appends and returns a new empty "idx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewIdx();
    
    /**
     * Gets the "order" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getOrder();
    
    /**
     * Sets the "order" element
     */
    void setOrder(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt order);
    
    /**
     * Appends and returns a new empty "order" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewOrder();
    
    /**
     * Gets the "tx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx getTx();
    
    /**
     * True if has "tx" element
     */
    boolean isSetTx();
    
    /**
     * Sets the "tx" element
     */
    void setTx(org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx tx);
    
    /**
     * Appends and returns a new empty "tx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx addNewTx();
    
    /**
     * Unsets the "tx" element
     */
    void unsetTx();
    
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
     * Gets the "marker" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker getMarker();
    
    /**
     * True if has "marker" element
     */
    boolean isSetMarker();
    
    /**
     * Sets the "marker" element
     */
    void setMarker(org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker marker);
    
    /**
     * Appends and returns a new empty "marker" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker addNewMarker();
    
    /**
     * Unsets the "marker" element
     */
    void unsetMarker();
    
    /**
     * Gets a List of "dPt" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt> getDPtList();
    
    /**
     * Gets array of all "dPt" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[] getDPtArray();
    
    /**
     * Gets ith "dPt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt getDPtArray(int i);
    
    /**
     * Returns number of "dPt" element
     */
    int sizeOfDPtArray();
    
    /**
     * Sets array of all "dPt" element
     */
    void setDPtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[] dPtArray);
    
    /**
     * Sets ith "dPt" element
     */
    void setDPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt dPt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dPt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt insertNewDPt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dPt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt addNewDPt();
    
    /**
     * Removes the ith "dPt" element
     */
    void removeDPt(int i);
    
    /**
     * Gets the "dLbls" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls getDLbls();
    
    /**
     * True if has "dLbls" element
     */
    boolean isSetDLbls();
    
    /**
     * Sets the "dLbls" element
     */
    void setDLbls(org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls dLbls);
    
    /**
     * Appends and returns a new empty "dLbls" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls addNewDLbls();
    
    /**
     * Unsets the "dLbls" element
     */
    void unsetDLbls();
    
    /**
     * Gets a List of "trendline" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline> getTrendlineList();
    
    /**
     * Gets array of all "trendline" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[] getTrendlineArray();
    
    /**
     * Gets ith "trendline" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline getTrendlineArray(int i);
    
    /**
     * Returns number of "trendline" element
     */
    int sizeOfTrendlineArray();
    
    /**
     * Sets array of all "trendline" element
     */
    void setTrendlineArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[] trendlineArray);
    
    /**
     * Sets ith "trendline" element
     */
    void setTrendlineArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline trendline);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "trendline" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline insertNewTrendline(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "trendline" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline addNewTrendline();
    
    /**
     * Removes the ith "trendline" element
     */
    void removeTrendline(int i);
    
    /**
     * Gets a List of "errBars" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars> getErrBarsList();
    
    /**
     * Gets array of all "errBars" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars[] getErrBarsArray();
    
    /**
     * Gets ith "errBars" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars getErrBarsArray(int i);
    
    /**
     * Returns number of "errBars" element
     */
    int sizeOfErrBarsArray();
    
    /**
     * Sets array of all "errBars" element
     */
    void setErrBarsArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars[] errBarsArray);
    
    /**
     * Sets ith "errBars" element
     */
    void setErrBarsArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars errBars);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "errBars" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars insertNewErrBars(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "errBars" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars addNewErrBars();
    
    /**
     * Removes the ith "errBars" element
     */
    void removeErrBars(int i);
    
    /**
     * Gets the "xVal" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource getXVal();
    
    /**
     * True if has "xVal" element
     */
    boolean isSetXVal();
    
    /**
     * Sets the "xVal" element
     */
    void setXVal(org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource xVal);
    
    /**
     * Appends and returns a new empty "xVal" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource addNewXVal();
    
    /**
     * Unsets the "xVal" element
     */
    void unsetXVal();
    
    /**
     * Gets the "yVal" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource getYVal();
    
    /**
     * True if has "yVal" element
     */
    boolean isSetYVal();
    
    /**
     * Sets the "yVal" element
     */
    void setYVal(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource yVal);
    
    /**
     * Appends and returns a new empty "yVal" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource addNewYVal();
    
    /**
     * Unsets the "yVal" element
     */
    void unsetYVal();
    
    /**
     * Gets the "smooth" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getSmooth();
    
    /**
     * True if has "smooth" element
     */
    boolean isSetSmooth();
    
    /**
     * Sets the "smooth" element
     */
    void setSmooth(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean smooth);
    
    /**
     * Appends and returns a new empty "smooth" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewSmooth();
    
    /**
     * Unsets the "smooth" element
     */
    void unsetSmooth();
    
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

/*
 * XML Type:  CT_LineSer
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_LineSer(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTLineSer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTLineSer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctlineserd01atype");
    
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
     * Gets the "errBars" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars getErrBars();
    
    /**
     * True if has "errBars" element
     */
    boolean isSetErrBars();
    
    /**
     * Sets the "errBars" element
     */
    void setErrBars(org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars errBars);
    
    /**
     * Appends and returns a new empty "errBars" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars addNewErrBars();
    
    /**
     * Unsets the "errBars" element
     */
    void unsetErrBars();
    
    /**
     * Gets the "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource getCat();
    
    /**
     * True if has "cat" element
     */
    boolean isSetCat();
    
    /**
     * Sets the "cat" element
     */
    void setCat(org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource cat);
    
    /**
     * Appends and returns a new empty "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource addNewCat();
    
    /**
     * Unsets the "cat" element
     */
    void unsetCat();
    
    /**
     * Gets the "val" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource getVal();
    
    /**
     * True if has "val" element
     */
    boolean isSetVal();
    
    /**
     * Sets the "val" element
     */
    void setVal(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource val);
    
    /**
     * Appends and returns a new empty "val" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource addNewVal();
    
    /**
     * Unsets the "val" element
     */
    void unsetVal();
    
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

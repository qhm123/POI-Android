/*
 * XML Type:  CT_Trendline
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_Trendline(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTTrendline extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTrendline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttrendlinec5f5type");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
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
     * Gets the "trendlineType" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType getTrendlineType();
    
    /**
     * Sets the "trendlineType" element
     */
    void setTrendlineType(org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType trendlineType);
    
    /**
     * Appends and returns a new empty "trendlineType" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType addNewTrendlineType();
    
    /**
     * Gets the "order" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder getOrder();
    
    /**
     * True if has "order" element
     */
    boolean isSetOrder();
    
    /**
     * Sets the "order" element
     */
    void setOrder(org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder order);
    
    /**
     * Appends and returns a new empty "order" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder addNewOrder();
    
    /**
     * Unsets the "order" element
     */
    void unsetOrder();
    
    /**
     * Gets the "period" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod getPeriod();
    
    /**
     * True if has "period" element
     */
    boolean isSetPeriod();
    
    /**
     * Sets the "period" element
     */
    void setPeriod(org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod period);
    
    /**
     * Appends and returns a new empty "period" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod addNewPeriod();
    
    /**
     * Unsets the "period" element
     */
    void unsetPeriod();
    
    /**
     * Gets the "forward" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getForward();
    
    /**
     * True if has "forward" element
     */
    boolean isSetForward();
    
    /**
     * Sets the "forward" element
     */
    void setForward(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble forward);
    
    /**
     * Appends and returns a new empty "forward" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewForward();
    
    /**
     * Unsets the "forward" element
     */
    void unsetForward();
    
    /**
     * Gets the "backward" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getBackward();
    
    /**
     * True if has "backward" element
     */
    boolean isSetBackward();
    
    /**
     * Sets the "backward" element
     */
    void setBackward(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble backward);
    
    /**
     * Appends and returns a new empty "backward" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewBackward();
    
    /**
     * Unsets the "backward" element
     */
    void unsetBackward();
    
    /**
     * Gets the "intercept" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getIntercept();
    
    /**
     * True if has "intercept" element
     */
    boolean isSetIntercept();
    
    /**
     * Sets the "intercept" element
     */
    void setIntercept(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble intercept);
    
    /**
     * Appends and returns a new empty "intercept" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewIntercept();
    
    /**
     * Unsets the "intercept" element
     */
    void unsetIntercept();
    
    /**
     * Gets the "dispRSqr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getDispRSqr();
    
    /**
     * True if has "dispRSqr" element
     */
    boolean isSetDispRSqr();
    
    /**
     * Sets the "dispRSqr" element
     */
    void setDispRSqr(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean dispRSqr);
    
    /**
     * Appends and returns a new empty "dispRSqr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewDispRSqr();
    
    /**
     * Unsets the "dispRSqr" element
     */
    void unsetDispRSqr();
    
    /**
     * Gets the "dispEq" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getDispEq();
    
    /**
     * True if has "dispEq" element
     */
    boolean isSetDispEq();
    
    /**
     * Sets the "dispEq" element
     */
    void setDispEq(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean dispEq);
    
    /**
     * Appends and returns a new empty "dispEq" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewDispEq();
    
    /**
     * Unsets the "dispEq" element
     */
    void unsetDispEq();
    
    /**
     * Gets the "trendlineLbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl getTrendlineLbl();
    
    /**
     * True if has "trendlineLbl" element
     */
    boolean isSetTrendlineLbl();
    
    /**
     * Sets the "trendlineLbl" element
     */
    void setTrendlineLbl(org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl trendlineLbl);
    
    /**
     * Appends and returns a new empty "trendlineLbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl addNewTrendlineLbl();
    
    /**
     * Unsets the "trendlineLbl" element
     */
    void unsetTrendlineLbl();
    
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

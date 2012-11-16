/*
 * XML Type:  CT_BubbleChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_BubbleChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTBubbleChart extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBubbleChart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctbubblechart3ff4type");
    
    /**
     * Gets the "varyColors" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getVaryColors();
    
    /**
     * True if has "varyColors" element
     */
    boolean isSetVaryColors();
    
    /**
     * Sets the "varyColors" element
     */
    void setVaryColors(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean varyColors);
    
    /**
     * Appends and returns a new empty "varyColors" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewVaryColors();
    
    /**
     * Unsets the "varyColors" element
     */
    void unsetVaryColors();
    
    /**
     * Gets a List of "ser" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer> getSerList();
    
    /**
     * Gets array of all "ser" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer[] getSerArray();
    
    /**
     * Gets ith "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer getSerArray(int i);
    
    /**
     * Returns number of "ser" element
     */
    int sizeOfSerArray();
    
    /**
     * Sets array of all "ser" element
     */
    void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer[] serArray);
    
    /**
     * Sets ith "ser" element
     */
    void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer ser);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer insertNewSer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer addNewSer();
    
    /**
     * Removes the ith "ser" element
     */
    void removeSer(int i);
    
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
     * Gets the "bubble3D" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getBubble3D();
    
    /**
     * True if has "bubble3D" element
     */
    boolean isSetBubble3D();
    
    /**
     * Sets the "bubble3D" element
     */
    void setBubble3D(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean bubble3D);
    
    /**
     * Appends and returns a new empty "bubble3D" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewBubble3D();
    
    /**
     * Unsets the "bubble3D" element
     */
    void unsetBubble3D();
    
    /**
     * Gets the "bubbleScale" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleScale getBubbleScale();
    
    /**
     * True if has "bubbleScale" element
     */
    boolean isSetBubbleScale();
    
    /**
     * Sets the "bubbleScale" element
     */
    void setBubbleScale(org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleScale bubbleScale);
    
    /**
     * Appends and returns a new empty "bubbleScale" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleScale addNewBubbleScale();
    
    /**
     * Unsets the "bubbleScale" element
     */
    void unsetBubbleScale();
    
    /**
     * Gets the "showNegBubbles" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowNegBubbles();
    
    /**
     * True if has "showNegBubbles" element
     */
    boolean isSetShowNegBubbles();
    
    /**
     * Sets the "showNegBubbles" element
     */
    void setShowNegBubbles(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showNegBubbles);
    
    /**
     * Appends and returns a new empty "showNegBubbles" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowNegBubbles();
    
    /**
     * Unsets the "showNegBubbles" element
     */
    void unsetShowNegBubbles();
    
    /**
     * Gets the "sizeRepresents" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSizeRepresents getSizeRepresents();
    
    /**
     * True if has "sizeRepresents" element
     */
    boolean isSetSizeRepresents();
    
    /**
     * Sets the "sizeRepresents" element
     */
    void setSizeRepresents(org.openxmlformats.schemas.drawingml.x2006.chart.CTSizeRepresents sizeRepresents);
    
    /**
     * Appends and returns a new empty "sizeRepresents" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSizeRepresents addNewSizeRepresents();
    
    /**
     * Unsets the "sizeRepresents" element
     */
    void unsetSizeRepresents();
    
    /**
     * Gets a List of "axId" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt> getAxIdList();
    
    /**
     * Gets array of all "axId" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] getAxIdArray();
    
    /**
     * Gets ith "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getAxIdArray(int i);
    
    /**
     * Returns number of "axId" element
     */
    int sizeOfAxIdArray();
    
    /**
     * Sets array of all "axId" element
     */
    void setAxIdArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] axIdArray);
    
    /**
     * Sets ith "axId" element
     */
    void setAxIdArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt axId);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt insertNewAxId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewAxId();
    
    /**
     * Removes the ith "axId" element
     */
    void removeAxId(int i);
    
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

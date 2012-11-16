/*
 * XML Type:  CT_Legend
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_Legend(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTLegend extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTLegend.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctlegenda54ftype");
    
    /**
     * Gets the "legendPos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos getLegendPos();
    
    /**
     * True if has "legendPos" element
     */
    boolean isSetLegendPos();
    
    /**
     * Sets the "legendPos" element
     */
    void setLegendPos(org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos legendPos);
    
    /**
     * Appends and returns a new empty "legendPos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos addNewLegendPos();
    
    /**
     * Unsets the "legendPos" element
     */
    void unsetLegendPos();
    
    /**
     * Gets a List of "legendEntry" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry> getLegendEntryList();
    
    /**
     * Gets array of all "legendEntry" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry[] getLegendEntryArray();
    
    /**
     * Gets ith "legendEntry" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry getLegendEntryArray(int i);
    
    /**
     * Returns number of "legendEntry" element
     */
    int sizeOfLegendEntryArray();
    
    /**
     * Sets array of all "legendEntry" element
     */
    void setLegendEntryArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry[] legendEntryArray);
    
    /**
     * Sets ith "legendEntry" element
     */
    void setLegendEntryArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry legendEntry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legendEntry" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry insertNewLegendEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legendEntry" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry addNewLegendEntry();
    
    /**
     * Removes the ith "legendEntry" element
     */
    void removeLegendEntry(int i);
    
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
     * Gets the "overlay" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getOverlay();
    
    /**
     * True if has "overlay" element
     */
    boolean isSetOverlay();
    
    /**
     * Sets the "overlay" element
     */
    void setOverlay(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean overlay);
    
    /**
     * Appends and returns a new empty "overlay" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewOverlay();
    
    /**
     * Unsets the "overlay" element
     */
    void unsetOverlay();
    
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

/*
 * XML Type:  CT_PivotFmts
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_PivotFmts(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTPivotFmts extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotFmts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivotfmts863etype");
    
    /**
     * Gets a List of "pivotFmt" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt> getPivotFmtList();
    
    /**
     * Gets array of all "pivotFmt" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt[] getPivotFmtArray();
    
    /**
     * Gets ith "pivotFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt getPivotFmtArray(int i);
    
    /**
     * Returns number of "pivotFmt" element
     */
    int sizeOfPivotFmtArray();
    
    /**
     * Sets array of all "pivotFmt" element
     */
    void setPivotFmtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt[] pivotFmtArray);
    
    /**
     * Sets ith "pivotFmt" element
     */
    void setPivotFmtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt pivotFmt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt insertNewPivotFmt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt addNewPivotFmt();
    
    /**
     * Removes the ith "pivotFmt" element
     */
    void removePivotFmt(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

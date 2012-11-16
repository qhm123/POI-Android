/*
 * XML Type:  CT_BandFmts
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_BandFmts(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTBandFmts extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBandFmts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctbandfmts9981type");
    
    /**
     * Gets a List of "bandFmt" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt> getBandFmtList();
    
    /**
     * Gets array of all "bandFmt" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt[] getBandFmtArray();
    
    /**
     * Gets ith "bandFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt getBandFmtArray(int i);
    
    /**
     * Returns number of "bandFmt" element
     */
    int sizeOfBandFmtArray();
    
    /**
     * Sets array of all "bandFmt" element
     */
    void setBandFmtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt[] bandFmtArray);
    
    /**
     * Sets ith "bandFmt" element
     */
    void setBandFmtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt bandFmt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bandFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt insertNewBandFmt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bandFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt addNewBandFmt();
    
    /**
     * Removes the ith "bandFmt" element
     */
    void removeBandFmt(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_StrData
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_StrData(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTStrData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTStrData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctstrdatad58btype");
    
    /**
     * Gets the "ptCount" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getPtCount();
    
    /**
     * True if has "ptCount" element
     */
    boolean isSetPtCount();
    
    /**
     * Sets the "ptCount" element
     */
    void setPtCount(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt ptCount);
    
    /**
     * Appends and returns a new empty "ptCount" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewPtCount();
    
    /**
     * Unsets the "ptCount" element
     */
    void unsetPtCount();
    
    /**
     * Gets a List of "pt" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal> getPtList();
    
    /**
     * Gets array of all "pt" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[] getPtArray();
    
    /**
     * Gets ith "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal getPtArray(int i);
    
    /**
     * Returns number of "pt" element
     */
    int sizeOfPtArray();
    
    /**
     * Sets array of all "pt" element
     */
    void setPtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[] ptArray);
    
    /**
     * Sets ith "pt" element
     */
    void setPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal pt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal insertNewPt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal addNewPt();
    
    /**
     * Removes the ith "pt" element
     */
    void removePt(int i);
    
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

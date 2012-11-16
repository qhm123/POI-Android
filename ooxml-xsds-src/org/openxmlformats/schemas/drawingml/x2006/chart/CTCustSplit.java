/*
 * XML Type:  CT_CustSplit
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTCustSplit
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_CustSplit(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTCustSplit extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustSplit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustsplit93bftype");
    
    /**
     * Gets a List of "secondPiePt" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt> getSecondPiePtList();
    
    /**
     * Gets array of all "secondPiePt" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] getSecondPiePtArray();
    
    /**
     * Gets ith "secondPiePt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getSecondPiePtArray(int i);
    
    /**
     * Returns number of "secondPiePt" element
     */
    int sizeOfSecondPiePtArray();
    
    /**
     * Sets array of all "secondPiePt" element
     */
    void setSecondPiePtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] secondPiePtArray);
    
    /**
     * Sets ith "secondPiePt" element
     */
    void setSecondPiePtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt secondPiePt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "secondPiePt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt insertNewSecondPiePt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "secondPiePt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewSecondPiePt();
    
    /**
     * Removes the ith "secondPiePt" element
     */
    void removeSecondPiePt(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

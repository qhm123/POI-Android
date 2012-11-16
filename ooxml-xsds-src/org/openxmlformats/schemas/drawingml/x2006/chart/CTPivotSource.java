/*
 * XML Type:  CT_PivotSource
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_PivotSource(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTPivotSource extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivotsourcecb49type");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.STXstring xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.openxmlformats.schemas.drawingml.x2006.chart.STXstring name);
    
    /**
     * Gets the "fmtId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getFmtId();
    
    /**
     * Sets the "fmtId" element
     */
    void setFmtId(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt fmtId);
    
    /**
     * Appends and returns a new empty "fmtId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewFmtId();
    
    /**
     * Gets a List of "extLst" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList> getExtLstList();
    
    /**
     * Gets array of all "extLst" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList[] getExtLstArray();
    
    /**
     * Gets ith "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLstArray(int i);
    
    /**
     * Returns number of "extLst" element
     */
    int sizeOfExtLstArray();
    
    /**
     * Sets array of all "extLst" element
     */
    void setExtLstArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList[] extLstArray);
    
    /**
     * Sets ith "extLst" element
     */
    void setExtLstArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList insertNewExtLst(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst();
    
    /**
     * Removes the ith "extLst" element
     */
    void removeExtLst(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

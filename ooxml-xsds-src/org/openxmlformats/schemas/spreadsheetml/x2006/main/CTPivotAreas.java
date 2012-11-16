/*
 * XML Type:  CT_PivotAreas
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreas
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PivotAreas(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPivotAreas extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotAreas.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivotareas92edtype");
    
    /**
     * Gets a List of "pivotArea" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea> getPivotAreaList();
    
    /**
     * Gets array of all "pivotArea" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea[] getPivotAreaArray();
    
    /**
     * Gets ith "pivotArea" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea getPivotAreaArray(int i);
    
    /**
     * Returns number of "pivotArea" element
     */
    int sizeOfPivotAreaArray();
    
    /**
     * Sets array of all "pivotArea" element
     */
    void setPivotAreaArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea[] pivotAreaArray);
    
    /**
     * Sets ith "pivotArea" element
     */
    void setPivotAreaArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea pivotArea);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotArea" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea insertNewPivotArea(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotArea" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea addNewPivotArea();
    
    /**
     * Removes the ith "pivotArea" element
     */
    void removePivotArea(int i);
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

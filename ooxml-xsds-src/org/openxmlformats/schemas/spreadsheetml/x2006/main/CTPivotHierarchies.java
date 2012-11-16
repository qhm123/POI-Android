/*
 * XML Type:  CT_PivotHierarchies
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PivotHierarchies(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPivotHierarchies extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotHierarchies.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivothierarchies127atype");
    
    /**
     * Gets a List of "pivotHierarchy" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy> getPivotHierarchyList();
    
    /**
     * Gets array of all "pivotHierarchy" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy[] getPivotHierarchyArray();
    
    /**
     * Gets ith "pivotHierarchy" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy getPivotHierarchyArray(int i);
    
    /**
     * Returns number of "pivotHierarchy" element
     */
    int sizeOfPivotHierarchyArray();
    
    /**
     * Sets array of all "pivotHierarchy" element
     */
    void setPivotHierarchyArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy[] pivotHierarchyArray);
    
    /**
     * Sets ith "pivotHierarchy" element
     */
    void setPivotHierarchyArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy pivotHierarchy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotHierarchy" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy insertNewPivotHierarchy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotHierarchy" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy addNewPivotHierarchy();
    
    /**
     * Removes the ith "pivotHierarchy" element
     */
    void removePivotHierarchy(int i);
    
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

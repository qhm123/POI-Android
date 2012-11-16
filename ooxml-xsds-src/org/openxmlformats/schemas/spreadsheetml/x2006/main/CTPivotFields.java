/*
 * XML Type:  CT_PivotFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PivotFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPivotFields extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivotfields12batype");
    
    /**
     * Gets a List of "pivotField" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField> getPivotFieldList();
    
    /**
     * Gets array of all "pivotField" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField[] getPivotFieldArray();
    
    /**
     * Gets ith "pivotField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField getPivotFieldArray(int i);
    
    /**
     * Returns number of "pivotField" element
     */
    int sizeOfPivotFieldArray();
    
    /**
     * Sets array of all "pivotField" element
     */
    void setPivotFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField[] pivotFieldArray);
    
    /**
     * Sets ith "pivotField" element
     */
    void setPivotFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField pivotField);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField insertNewPivotField(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField addNewPivotField();
    
    /**
     * Removes the ith "pivotField" element
     */
    void removePivotField(int i);
    
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

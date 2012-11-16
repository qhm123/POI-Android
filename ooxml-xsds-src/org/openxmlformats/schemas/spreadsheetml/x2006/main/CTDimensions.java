/*
 * XML Type:  CT_Dimensions
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Dimensions(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDimensions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDimensions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdimensionsaf16type");
    
    /**
     * Gets a List of "dimension" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension> getDimensionList();
    
    /**
     * Gets array of all "dimension" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension[] getDimensionArray();
    
    /**
     * Gets ith "dimension" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension getDimensionArray(int i);
    
    /**
     * Returns number of "dimension" element
     */
    int sizeOfDimensionArray();
    
    /**
     * Sets array of all "dimension" element
     */
    void setDimensionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension[] dimensionArray);
    
    /**
     * Sets ith "dimension" element
     */
    void setDimensionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension dimension);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dimension" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension insertNewDimension(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dimension" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension addNewDimension();
    
    /**
     * Removes the ith "dimension" element
     */
    void removeDimension(int i);
    
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

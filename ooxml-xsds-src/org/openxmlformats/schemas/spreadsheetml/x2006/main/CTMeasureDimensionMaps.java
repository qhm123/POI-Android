/*
 * XML Type:  CT_MeasureDimensionMaps
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MeasureDimensionMaps(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMeasureDimensionMaps extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMeasureDimensionMaps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmeasuredimensionmapse2e8type");
    
    /**
     * Gets a List of "map" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap> getMapList();
    
    /**
     * Gets array of all "map" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap[] getMapArray();
    
    /**
     * Gets ith "map" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap getMapArray(int i);
    
    /**
     * Returns number of "map" element
     */
    int sizeOfMapArray();
    
    /**
     * Sets array of all "map" element
     */
    void setMapArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap[] mapArray);
    
    /**
     * Sets ith "map" element
     */
    void setMapArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap map);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap insertNewMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap addNewMap();
    
    /**
     * Removes the ith "map" element
     */
    void removeMap(int i);
    
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

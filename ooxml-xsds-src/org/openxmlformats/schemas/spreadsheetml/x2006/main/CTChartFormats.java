/*
 * XML Type:  CT_ChartFormats
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ChartFormats(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTChartFormats extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTChartFormats.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctchartformats9467type");
    
    /**
     * Gets a List of "chartFormat" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat> getChartFormatList();
    
    /**
     * Gets array of all "chartFormat" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat[] getChartFormatArray();
    
    /**
     * Gets ith "chartFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat getChartFormatArray(int i);
    
    /**
     * Returns number of "chartFormat" element
     */
    int sizeOfChartFormatArray();
    
    /**
     * Sets array of all "chartFormat" element
     */
    void setChartFormatArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat[] chartFormatArray);
    
    /**
     * Sets ith "chartFormat" element
     */
    void setChartFormatArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat chartFormat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "chartFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat insertNewChartFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "chartFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat addNewChartFormat();
    
    /**
     * Removes the ith "chartFormat" element
     */
    void removeChartFormat(int i);
    
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

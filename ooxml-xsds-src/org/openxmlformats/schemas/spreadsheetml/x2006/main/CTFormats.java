/*
 * XML Type:  CT_Formats
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Formats(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFormats extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFormats.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctformatseebbtype");
    
    /**
     * Gets a List of "format" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat> getFormatList();
    
    /**
     * Gets array of all "format" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat[] getFormatArray();
    
    /**
     * Gets ith "format" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat getFormatArray(int i);
    
    /**
     * Returns number of "format" element
     */
    int sizeOfFormatArray();
    
    /**
     * Sets array of all "format" element
     */
    void setFormatArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat[] formatArray);
    
    /**
     * Sets ith "format" element
     */
    void setFormatArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat format);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "format" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat insertNewFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "format" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat addNewFormat();
    
    /**
     * Removes the ith "format" element
     */
    void removeFormat(int i);
    
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

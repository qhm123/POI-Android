/*
 * XML Type:  CT_ConditionalFormats
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ConditionalFormats(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTConditionalFormats extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTConditionalFormats.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctconditionalformats02fftype");
    
    /**
     * Gets a List of "conditionalFormat" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat> getConditionalFormatList();
    
    /**
     * Gets array of all "conditionalFormat" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat[] getConditionalFormatArray();
    
    /**
     * Gets ith "conditionalFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat getConditionalFormatArray(int i);
    
    /**
     * Returns number of "conditionalFormat" element
     */
    int sizeOfConditionalFormatArray();
    
    /**
     * Sets array of all "conditionalFormat" element
     */
    void setConditionalFormatArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat[] conditionalFormatArray);
    
    /**
     * Sets ith "conditionalFormat" element
     */
    void setConditionalFormatArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat conditionalFormat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conditionalFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat insertNewConditionalFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conditionalFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat addNewConditionalFormat();
    
    /**
     * Removes the ith "conditionalFormat" element
     */
    void removeConditionalFormat(int i);
    
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

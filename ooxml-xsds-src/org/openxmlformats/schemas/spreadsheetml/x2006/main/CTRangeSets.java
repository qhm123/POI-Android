/*
 * XML Type:  CT_RangeSets
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSets
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RangeSets(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRangeSets extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRangeSets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrangesets414dtype");
    
    /**
     * Gets a List of "rangeSet" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet> getRangeSetList();
    
    /**
     * Gets array of all "rangeSet" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet[] getRangeSetArray();
    
    /**
     * Gets ith "rangeSet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet getRangeSetArray(int i);
    
    /**
     * Returns number of "rangeSet" element
     */
    int sizeOfRangeSetArray();
    
    /**
     * Sets array of all "rangeSet" element
     */
    void setRangeSetArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet[] rangeSetArray);
    
    /**
     * Sets ith "rangeSet" element
     */
    void setRangeSetArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet rangeSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rangeSet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet insertNewRangeSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rangeSet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangeSet addNewRangeSet();
    
    /**
     * Removes the ith "rangeSet" element
     */
    void removeRangeSet(int i);
    
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

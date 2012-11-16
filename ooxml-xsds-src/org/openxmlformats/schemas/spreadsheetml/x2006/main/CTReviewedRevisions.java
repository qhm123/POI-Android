/*
 * XML Type:  CT_ReviewedRevisions
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ReviewedRevisions(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTReviewedRevisions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTReviewedRevisions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctreviewedrevisionsed20type");
    
    /**
     * Gets a List of "reviewed" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed> getReviewedList();
    
    /**
     * Gets array of all "reviewed" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed[] getReviewedArray();
    
    /**
     * Gets ith "reviewed" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed getReviewedArray(int i);
    
    /**
     * Returns number of "reviewed" element
     */
    int sizeOfReviewedArray();
    
    /**
     * Sets array of all "reviewed" element
     */
    void setReviewedArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed[] reviewedArray);
    
    /**
     * Sets ith "reviewed" element
     */
    void setReviewedArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed reviewed);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reviewed" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed insertNewReviewed(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reviewed" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed addNewReviewed();
    
    /**
     * Removes the ith "reviewed" element
     */
    void removeReviewed(int i);
    
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

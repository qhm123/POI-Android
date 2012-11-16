/*
 * XML Type:  CT_MergeCells
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MergeCells(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMergeCells extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMergeCells.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmergecells1242type");
    
    /**
     * Gets a List of "mergeCell" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell> getMergeCellList();
    
    /**
     * Gets array of all "mergeCell" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell[] getMergeCellArray();
    
    /**
     * Gets ith "mergeCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell getMergeCellArray(int i);
    
    /**
     * Returns number of "mergeCell" element
     */
    int sizeOfMergeCellArray();
    
    /**
     * Sets array of all "mergeCell" element
     */
    void setMergeCellArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell[] mergeCellArray);
    
    /**
     * Sets ith "mergeCell" element
     */
    void setMergeCellArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell mergeCell);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mergeCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell insertNewMergeCell(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mergeCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell addNewMergeCell();
    
    /**
     * Removes the ith "mergeCell" element
     */
    void removeMergeCell(int i);
    
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

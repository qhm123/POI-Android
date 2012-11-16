/*
 * XML Type:  CT_CellStyles
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CellStyles(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCellStyles extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCellStyles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcellstyles916dtype");
    
    /**
     * Gets a List of "cellStyle" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle> getCellStyleList();
    
    /**
     * Gets array of all "cellStyle" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle[] getCellStyleArray();
    
    /**
     * Gets ith "cellStyle" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle getCellStyleArray(int i);
    
    /**
     * Returns number of "cellStyle" element
     */
    int sizeOfCellStyleArray();
    
    /**
     * Sets array of all "cellStyle" element
     */
    void setCellStyleArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle[] cellStyleArray);
    
    /**
     * Sets ith "cellStyle" element
     */
    void setCellStyleArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle cellStyle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cellStyle" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle insertNewCellStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cellStyle" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle addNewCellStyle();
    
    /**
     * Removes the ith "cellStyle" element
     */
    void removeCellStyle(int i);
    
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

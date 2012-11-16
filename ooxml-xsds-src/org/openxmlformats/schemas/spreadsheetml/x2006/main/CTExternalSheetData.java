/*
 * XML Type:  CT_ExternalSheetData
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ExternalSheetData(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalSheetData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTExternalSheetData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctexternalsheetdatafd3dtype");
    
    /**
     * Gets a List of "row" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow> getRowList();
    
    /**
     * Gets array of all "row" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow[] getRowArray();
    
    /**
     * Gets ith "row" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow getRowArray(int i);
    
    /**
     * Returns number of "row" element
     */
    int sizeOfRowArray();
    
    /**
     * Sets array of all "row" element
     */
    void setRowArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow[] rowArray);
    
    /**
     * Sets ith "row" element
     */
    void setRowArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow row);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow insertNewRow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow addNewRow();
    
    /**
     * Removes the ith "row" element
     */
    void removeRow(int i);
    
    /**
     * Gets the "sheetId" attribute
     */
    long getSheetId();
    
    /**
     * Gets (as xml) the "sheetId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSheetId();
    
    /**
     * Sets the "sheetId" attribute
     */
    void setSheetId(long sheetId);
    
    /**
     * Sets (as xml) the "sheetId" attribute
     */
    void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId);
    
    /**
     * Gets the "refreshError" attribute
     */
    boolean getRefreshError();
    
    /**
     * Gets (as xml) the "refreshError" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRefreshError();
    
    /**
     * True if has "refreshError" attribute
     */
    boolean isSetRefreshError();
    
    /**
     * Sets the "refreshError" attribute
     */
    void setRefreshError(boolean refreshError);
    
    /**
     * Sets (as xml) the "refreshError" attribute
     */
    void xsetRefreshError(org.apache.xmlbeans.XmlBoolean refreshError);
    
    /**
     * Unsets the "refreshError" attribute
     */
    void unsetRefreshError();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

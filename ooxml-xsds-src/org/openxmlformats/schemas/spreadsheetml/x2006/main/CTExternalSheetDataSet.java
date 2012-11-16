/*
 * XML Type:  CT_ExternalSheetDataSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ExternalSheetDataSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalSheetDataSet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTExternalSheetDataSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctexternalsheetdataset07adtype");
    
    /**
     * Gets a List of "sheetData" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData> getSheetDataList();
    
    /**
     * Gets array of all "sheetData" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[] getSheetDataArray();
    
    /**
     * Gets ith "sheetData" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData getSheetDataArray(int i);
    
    /**
     * Returns number of "sheetData" element
     */
    int sizeOfSheetDataArray();
    
    /**
     * Sets array of all "sheetData" element
     */
    void setSheetDataArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[] sheetDataArray);
    
    /**
     * Sets ith "sheetData" element
     */
    void setSheetDataArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData sheetData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetData" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData insertNewSheetData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheetData" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData addNewSheetData();
    
    /**
     * Removes the ith "sheetData" element
     */
    void removeSheetData(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

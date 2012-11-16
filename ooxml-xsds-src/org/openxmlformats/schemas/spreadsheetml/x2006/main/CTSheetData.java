/*
 * XML Type:  CT_SheetData
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SheetData(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSheetData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsheetdata8408type");
    
    /**
     * Gets a List of "row" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow> getRowList();
    
    /**
     * Gets array of all "row" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow[] getRowArray();
    
    /**
     * Gets ith "row" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow getRowArray(int i);
    
    /**
     * Returns number of "row" element
     */
    int sizeOfRowArray();
    
    /**
     * Sets array of all "row" element
     */
    void setRowArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow[] rowArray);
    
    /**
     * Sets ith "row" element
     */
    void setRowArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow row);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow insertNewRow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow addNewRow();
    
    /**
     * Removes the ith "row" element
     */
    void removeRow(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

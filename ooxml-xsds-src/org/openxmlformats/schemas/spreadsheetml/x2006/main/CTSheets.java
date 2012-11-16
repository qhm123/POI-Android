/*
 * XML Type:  CT_Sheets
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Sheets(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheets extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSheets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsheets49fdtype");
    
    /**
     * Gets a List of "sheet" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet> getSheetList();
    
    /**
     * Gets array of all "sheet" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet[] getSheetArray();
    
    /**
     * Gets ith "sheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet getSheetArray(int i);
    
    /**
     * Returns number of "sheet" element
     */
    int sizeOfSheetArray();
    
    /**
     * Sets array of all "sheet" element
     */
    void setSheetArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet[] sheetArray);
    
    /**
     * Sets ith "sheet" element
     */
    void setSheetArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet sheet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet insertNewSheet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet addNewSheet();
    
    /**
     * Removes the ith "sheet" element
     */
    void removeSheet(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

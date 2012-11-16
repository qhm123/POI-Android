/*
 * XML Type:  CT_ExternalSheetNames
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ExternalSheetNames(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalSheetNames extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTExternalSheetNames.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctexternalsheetnames7eddtype");
    
    /**
     * Gets a List of "sheetName" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName> getSheetNameList();
    
    /**
     * Gets array of all "sheetName" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName[] getSheetNameArray();
    
    /**
     * Gets ith "sheetName" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName getSheetNameArray(int i);
    
    /**
     * Returns number of "sheetName" element
     */
    int sizeOfSheetNameArray();
    
    /**
     * Sets array of all "sheetName" element
     */
    void setSheetNameArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName[] sheetNameArray);
    
    /**
     * Sets ith "sheetName" element
     */
    void setSheetNameArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName sheetName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetName" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName insertNewSheetName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheetName" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName addNewSheetName();
    
    /**
     * Removes the ith "sheetName" element
     */
    void removeSheetName(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

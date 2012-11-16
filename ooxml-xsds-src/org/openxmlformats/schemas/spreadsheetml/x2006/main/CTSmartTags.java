/*
 * XML Type:  CT_SmartTags
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SmartTags(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSmartTags extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSmartTags.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsmarttags8aa1type");
    
    /**
     * Gets a List of "cellSmartTags" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags> getCellSmartTagsList();
    
    /**
     * Gets array of all "cellSmartTags" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags[] getCellSmartTagsArray();
    
    /**
     * Gets ith "cellSmartTags" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags getCellSmartTagsArray(int i);
    
    /**
     * Returns number of "cellSmartTags" element
     */
    int sizeOfCellSmartTagsArray();
    
    /**
     * Sets array of all "cellSmartTags" element
     */
    void setCellSmartTagsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags[] cellSmartTagsArray);
    
    /**
     * Sets ith "cellSmartTags" element
     */
    void setCellSmartTagsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags cellSmartTags);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cellSmartTags" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags insertNewCellSmartTags(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cellSmartTags" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags addNewCellSmartTags();
    
    /**
     * Removes the ith "cellSmartTags" element
     */
    void removeCellSmartTags(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

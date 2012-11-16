/*
 * XML Type:  CT_CellSmartTags
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CellSmartTags(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCellSmartTags extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCellSmartTags.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcellsmarttagsb05ftype");
    
    /**
     * Gets a List of "cellSmartTag" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag> getCellSmartTagList();
    
    /**
     * Gets array of all "cellSmartTag" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag[] getCellSmartTagArray();
    
    /**
     * Gets ith "cellSmartTag" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag getCellSmartTagArray(int i);
    
    /**
     * Returns number of "cellSmartTag" element
     */
    int sizeOfCellSmartTagArray();
    
    /**
     * Sets array of all "cellSmartTag" element
     */
    void setCellSmartTagArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag[] cellSmartTagArray);
    
    /**
     * Sets ith "cellSmartTag" element
     */
    void setCellSmartTagArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag cellSmartTag);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cellSmartTag" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag insertNewCellSmartTag(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cellSmartTag" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag addNewCellSmartTag();
    
    /**
     * Removes the ith "cellSmartTag" element
     */
    void removeCellSmartTag(int i);
    
    /**
     * Gets the "r" attribute
     */
    java.lang.String getR();
    
    /**
     * Gets (as xml) the "r" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR();
    
    /**
     * Sets the "r" attribute
     */
    void setR(java.lang.String r);
    
    /**
     * Sets (as xml) the "r" attribute
     */
    void xsetR(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_CustomSheetViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CustomSheetViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomSheetViews extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomSheetViews.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomsheetviewsc069type");
    
    /**
     * Gets a List of "customSheetView" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView> getCustomSheetViewList();
    
    /**
     * Gets array of all "customSheetView" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView[] getCustomSheetViewArray();
    
    /**
     * Gets ith "customSheetView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView getCustomSheetViewArray(int i);
    
    /**
     * Returns number of "customSheetView" element
     */
    int sizeOfCustomSheetViewArray();
    
    /**
     * Sets array of all "customSheetView" element
     */
    void setCustomSheetViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView[] customSheetViewArray);
    
    /**
     * Sets ith "customSheetView" element
     */
    void setCustomSheetViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView customSheetView);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customSheetView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView insertNewCustomSheetView(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customSheetView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView addNewCustomSheetView();
    
    /**
     * Removes the ith "customSheetView" element
     */
    void removeCustomSheetView(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

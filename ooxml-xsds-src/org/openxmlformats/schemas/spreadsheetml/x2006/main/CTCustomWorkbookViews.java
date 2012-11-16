/*
 * XML Type:  CT_CustomWorkbookViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CustomWorkbookViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomWorkbookViews extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomWorkbookViews.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomworkbookviewse942type");
    
    /**
     * Gets a List of "customWorkbookView" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView> getCustomWorkbookViewList();
    
    /**
     * Gets array of all "customWorkbookView" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[] getCustomWorkbookViewArray();
    
    /**
     * Gets ith "customWorkbookView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView getCustomWorkbookViewArray(int i);
    
    /**
     * Returns number of "customWorkbookView" element
     */
    int sizeOfCustomWorkbookViewArray();
    
    /**
     * Sets array of all "customWorkbookView" element
     */
    void setCustomWorkbookViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[] customWorkbookViewArray);
    
    /**
     * Sets ith "customWorkbookView" element
     */
    void setCustomWorkbookViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView customWorkbookView);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customWorkbookView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView insertNewCustomWorkbookView(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customWorkbookView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView addNewCustomWorkbookView();
    
    /**
     * Removes the ith "customWorkbookView" element
     */
    void removeCustomWorkbookView(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

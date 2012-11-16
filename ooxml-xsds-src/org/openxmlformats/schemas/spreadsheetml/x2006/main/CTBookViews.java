/*
 * XML Type:  CT_BookViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_BookViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBookViews extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBookViews.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctbookviewsb864type");
    
    /**
     * Gets a List of "workbookView" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView> getWorkbookViewList();
    
    /**
     * Gets array of all "workbookView" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView[] getWorkbookViewArray();
    
    /**
     * Gets ith "workbookView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView getWorkbookViewArray(int i);
    
    /**
     * Returns number of "workbookView" element
     */
    int sizeOfWorkbookViewArray();
    
    /**
     * Sets array of all "workbookView" element
     */
    void setWorkbookViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView[] workbookViewArray);
    
    /**
     * Sets ith "workbookView" element
     */
    void setWorkbookViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView workbookView);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "workbookView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView insertNewWorkbookView(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "workbookView" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView addNewWorkbookView();
    
    /**
     * Removes the ith "workbookView" element
     */
    void removeWorkbookView(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_DdeItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DdeItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDdeItems extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDdeItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctddeitemse1e4type");
    
    /**
     * Gets a List of "ddeItem" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem> getDdeItemList();
    
    /**
     * Gets array of all "ddeItem" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem[] getDdeItemArray();
    
    /**
     * Gets ith "ddeItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem getDdeItemArray(int i);
    
    /**
     * Returns number of "ddeItem" element
     */
    int sizeOfDdeItemArray();
    
    /**
     * Sets array of all "ddeItem" element
     */
    void setDdeItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem[] ddeItemArray);
    
    /**
     * Sets ith "ddeItem" element
     */
    void setDdeItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem ddeItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ddeItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem insertNewDdeItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ddeItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem addNewDdeItem();
    
    /**
     * Removes the ith "ddeItem" element
     */
    void removeDdeItem(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

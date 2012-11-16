/*
 * XML Type:  CT_OleItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_OleItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTOleItems extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTOleItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctoleitems7b41type");
    
    /**
     * Gets a List of "oleItem" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem> getOleItemList();
    
    /**
     * Gets array of all "oleItem" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem[] getOleItemArray();
    
    /**
     * Gets ith "oleItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem getOleItemArray(int i);
    
    /**
     * Returns number of "oleItem" element
     */
    int sizeOfOleItemArray();
    
    /**
     * Sets array of all "oleItem" element
     */
    void setOleItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem[] oleItemArray);
    
    /**
     * Sets ith "oleItem" element
     */
    void setOleItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem oleItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oleItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem insertNewOleItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oleItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem addNewOleItem();
    
    /**
     * Removes the ith "oleItem" element
     */
    void removeOleItem(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

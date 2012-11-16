/*
 * XML Type:  CT_CalculatedItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CalculatedItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCalculatedItems extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCalculatedItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcalculateditemsed81type");
    
    /**
     * Gets a List of "calculatedItem" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem> getCalculatedItemList();
    
    /**
     * Gets array of all "calculatedItem" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem[] getCalculatedItemArray();
    
    /**
     * Gets ith "calculatedItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem getCalculatedItemArray(int i);
    
    /**
     * Returns number of "calculatedItem" element
     */
    int sizeOfCalculatedItemArray();
    
    /**
     * Sets array of all "calculatedItem" element
     */
    void setCalculatedItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem[] calculatedItemArray);
    
    /**
     * Sets ith "calculatedItem" element
     */
    void setCalculatedItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem calculatedItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "calculatedItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem insertNewCalculatedItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "calculatedItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem addNewCalculatedItem();
    
    /**
     * Removes the ith "calculatedItem" element
     */
    void removeCalculatedItem(int i);
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

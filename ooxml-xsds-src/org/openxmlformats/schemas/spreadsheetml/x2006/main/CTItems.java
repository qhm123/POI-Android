/*
 * XML Type:  CT_Items
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Items(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTItems extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctitemsecdftype");
    
    /**
     * Gets a List of "item" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem> getItemList();
    
    /**
     * Gets array of all "item" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem[] getItemArray();
    
    /**
     * Gets ith "item" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem getItemArray(int i);
    
    /**
     * Returns number of "item" element
     */
    int sizeOfItemArray();
    
    /**
     * Sets array of all "item" element
     */
    void setItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem[] itemArray);
    
    /**
     * Sets ith "item" element
     */
    void setItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem item);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "item" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem insertNewItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "item" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem addNewItem();
    
    /**
     * Removes the ith "item" element
     */
    void removeItem(int i);
    
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

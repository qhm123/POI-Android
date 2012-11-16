/*
 * XML Type:  CT_SdtDropDownList
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_SdtDropDownList(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSdtDropDownList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSdtDropDownList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsdtdropdownlist5880type");
    
    /**
     * Gets a List of "listItem" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem> getListItemList();
    
    /**
     * Gets array of all "listItem" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem[] getListItemArray();
    
    /**
     * Gets ith "listItem" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem getListItemArray(int i);
    
    /**
     * Returns number of "listItem" element
     */
    int sizeOfListItemArray();
    
    /**
     * Sets array of all "listItem" element
     */
    void setListItemArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem[] listItemArray);
    
    /**
     * Sets ith "listItem" element
     */
    void setListItemArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem listItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listItem" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem insertNewListItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listItem" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtListItem addNewListItem();
    
    /**
     * Removes the ith "listItem" element
     */
    void removeListItem(int i);
    
    /**
     * Gets the "lastValue" attribute
     */
    java.lang.String getLastValue();
    
    /**
     * Gets (as xml) the "lastValue" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetLastValue();
    
    /**
     * True if has "lastValue" attribute
     */
    boolean isSetLastValue();
    
    /**
     * Sets the "lastValue" attribute
     */
    void setLastValue(java.lang.String lastValue);
    
    /**
     * Sets (as xml) the "lastValue" attribute
     */
    void xsetLastValue(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString lastValue);
    
    /**
     * Unsets the "lastValue" attribute
     */
    void unsetLastValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

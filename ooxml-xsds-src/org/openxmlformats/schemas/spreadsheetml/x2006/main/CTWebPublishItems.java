/*
 * XML Type:  CT_WebPublishItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_WebPublishItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTWebPublishItems extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTWebPublishItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctwebpublishitemsdc84type");
    
    /**
     * Gets a List of "webPublishItem" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem> getWebPublishItemList();
    
    /**
     * Gets array of all "webPublishItem" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem[] getWebPublishItemArray();
    
    /**
     * Gets ith "webPublishItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem getWebPublishItemArray(int i);
    
    /**
     * Returns number of "webPublishItem" element
     */
    int sizeOfWebPublishItemArray();
    
    /**
     * Sets array of all "webPublishItem" element
     */
    void setWebPublishItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem[] webPublishItemArray);
    
    /**
     * Sets ith "webPublishItem" element
     */
    void setWebPublishItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem webPublishItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "webPublishItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem insertNewWebPublishItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "webPublishItem" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem addNewWebPublishItem();
    
    /**
     * Removes the ith "webPublishItem" element
     */
    void removeWebPublishItem(int i);
    
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

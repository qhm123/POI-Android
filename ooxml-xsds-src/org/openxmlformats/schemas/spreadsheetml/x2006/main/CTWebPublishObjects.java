/*
 * XML Type:  CT_WebPublishObjects
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_WebPublishObjects(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTWebPublishObjects extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTWebPublishObjects.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctwebpublishobjects30d8type");
    
    /**
     * Gets a List of "webPublishObject" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject> getWebPublishObjectList();
    
    /**
     * Gets array of all "webPublishObject" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject[] getWebPublishObjectArray();
    
    /**
     * Gets ith "webPublishObject" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject getWebPublishObjectArray(int i);
    
    /**
     * Returns number of "webPublishObject" element
     */
    int sizeOfWebPublishObjectArray();
    
    /**
     * Sets array of all "webPublishObject" element
     */
    void setWebPublishObjectArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject[] webPublishObjectArray);
    
    /**
     * Sets ith "webPublishObject" element
     */
    void setWebPublishObjectArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject webPublishObject);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "webPublishObject" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject insertNewWebPublishObject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "webPublishObject" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject addNewWebPublishObject();
    
    /**
     * Removes the ith "webPublishObject" element
     */
    void removeWebPublishObject(int i);
    
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

/*
 * XML Type:  CT_QueryCache
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_QueryCache(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTQueryCache extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTQueryCache.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctquerycache88a3type");
    
    /**
     * Gets a List of "query" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery> getQueryList();
    
    /**
     * Gets array of all "query" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery[] getQueryArray();
    
    /**
     * Gets ith "query" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery getQueryArray(int i);
    
    /**
     * Returns number of "query" element
     */
    int sizeOfQueryArray();
    
    /**
     * Sets array of all "query" element
     */
    void setQueryArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery[] queryArray);
    
    /**
     * Sets ith "query" element
     */
    void setQueryArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery query);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "query" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery insertNewQuery(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "query" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery addNewQuery();
    
    /**
     * Removes the ith "query" element
     */
    void removeQuery(int i);
    
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

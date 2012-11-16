/*
 * XML Type:  CT_PivotCaches
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PivotCaches(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPivotCaches extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotCaches.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivotcaches4f32type");
    
    /**
     * Gets a List of "pivotCache" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache> getPivotCacheList();
    
    /**
     * Gets array of all "pivotCache" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache[] getPivotCacheArray();
    
    /**
     * Gets ith "pivotCache" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache getPivotCacheArray(int i);
    
    /**
     * Returns number of "pivotCache" element
     */
    int sizeOfPivotCacheArray();
    
    /**
     * Sets array of all "pivotCache" element
     */
    void setPivotCacheArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache[] pivotCacheArray);
    
    /**
     * Sets ith "pivotCache" element
     */
    void setPivotCacheArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache pivotCache);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotCache" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache insertNewPivotCache(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotCache" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache addNewPivotCache();
    
    /**
     * Removes the ith "pivotCache" element
     */
    void removePivotCache(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

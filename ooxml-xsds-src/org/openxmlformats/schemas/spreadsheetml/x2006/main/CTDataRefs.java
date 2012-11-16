/*
 * XML Type:  CT_DataRefs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DataRefs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDataRefs extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDataRefs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdatarefsb753type");
    
    /**
     * Gets a List of "dataRef" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef> getDataRefList();
    
    /**
     * Gets array of all "dataRef" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef[] getDataRefArray();
    
    /**
     * Gets ith "dataRef" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef getDataRefArray(int i);
    
    /**
     * Returns number of "dataRef" element
     */
    int sizeOfDataRefArray();
    
    /**
     * Sets array of all "dataRef" element
     */
    void setDataRefArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef[] dataRefArray);
    
    /**
     * Sets ith "dataRef" element
     */
    void setDataRefArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef dataRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataRef" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef insertNewDataRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataRef" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRef addNewDataRef();
    
    /**
     * Removes the ith "dataRef" element
     */
    void removeDataRef(int i);
    
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

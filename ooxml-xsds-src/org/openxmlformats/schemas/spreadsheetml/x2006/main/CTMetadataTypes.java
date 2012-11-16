/*
 * XML Type:  CT_MetadataTypes
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MetadataTypes(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMetadataTypes extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMetadataTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmetadatatypes3c29type");
    
    /**
     * Gets a List of "metadataType" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType> getMetadataTypeList();
    
    /**
     * Gets array of all "metadataType" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType[] getMetadataTypeArray();
    
    /**
     * Gets ith "metadataType" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType getMetadataTypeArray(int i);
    
    /**
     * Returns number of "metadataType" element
     */
    int sizeOfMetadataTypeArray();
    
    /**
     * Sets array of all "metadataType" element
     */
    void setMetadataTypeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType[] metadataTypeArray);
    
    /**
     * Sets ith "metadataType" element
     */
    void setMetadataTypeArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType metadataType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metadataType" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType insertNewMetadataType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metadataType" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType addNewMetadataType();
    
    /**
     * Removes the ith "metadataType" element
     */
    void removeMetadataType(int i);
    
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

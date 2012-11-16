/*
 * XML Type:  CT_FieldsUsage
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_FieldsUsage(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFieldsUsage extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFieldsUsage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfieldsusagee547type");
    
    /**
     * Gets a List of "fieldUsage" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage> getFieldUsageList();
    
    /**
     * Gets array of all "fieldUsage" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage[] getFieldUsageArray();
    
    /**
     * Gets ith "fieldUsage" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage getFieldUsageArray(int i);
    
    /**
     * Returns number of "fieldUsage" element
     */
    int sizeOfFieldUsageArray();
    
    /**
     * Sets array of all "fieldUsage" element
     */
    void setFieldUsageArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage[] fieldUsageArray);
    
    /**
     * Sets ith "fieldUsage" element
     */
    void setFieldUsageArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage fieldUsage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fieldUsage" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage insertNewFieldUsage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fieldUsage" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage addNewFieldUsage();
    
    /**
     * Removes the ith "fieldUsage" element
     */
    void removeFieldUsage(int i);
    
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

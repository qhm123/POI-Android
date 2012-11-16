/*
 * XML Type:  CT_QueryTableFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_QueryTableFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTQueryTableFields extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTQueryTableFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctquerytablefields2348type");
    
    /**
     * Gets a List of "queryTableField" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField> getQueryTableFieldList();
    
    /**
     * Gets array of all "queryTableField" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField[] getQueryTableFieldArray();
    
    /**
     * Gets ith "queryTableField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField getQueryTableFieldArray(int i);
    
    /**
     * Returns number of "queryTableField" element
     */
    int sizeOfQueryTableFieldArray();
    
    /**
     * Sets array of all "queryTableField" element
     */
    void setQueryTableFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField[] queryTableFieldArray);
    
    /**
     * Sets ith "queryTableField" element
     */
    void setQueryTableFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField queryTableField);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "queryTableField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField insertNewQueryTableField(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "queryTableField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField addNewQueryTableField();
    
    /**
     * Removes the ith "queryTableField" element
     */
    void removeQueryTableField(int i);
    
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

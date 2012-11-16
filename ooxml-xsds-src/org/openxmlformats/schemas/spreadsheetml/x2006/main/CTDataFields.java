/*
 * XML Type:  CT_DataFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DataFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDataFields extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDataFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdatafields52cctype");
    
    /**
     * Gets a List of "dataField" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField> getDataFieldList();
    
    /**
     * Gets array of all "dataField" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField[] getDataFieldArray();
    
    /**
     * Gets ith "dataField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField getDataFieldArray(int i);
    
    /**
     * Returns number of "dataField" element
     */
    int sizeOfDataFieldArray();
    
    /**
     * Sets array of all "dataField" element
     */
    void setDataFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField[] dataFieldArray);
    
    /**
     * Sets ith "dataField" element
     */
    void setDataFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField dataField);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField insertNewDataField(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataField" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField addNewDataField();
    
    /**
     * Removes the ith "dataField" element
     */
    void removeDataField(int i);
    
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

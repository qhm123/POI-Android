/*
 * XML Type:  CT_ColFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ColFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColFields extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolfields9ab8type");
    
    /**
     * Gets a List of "field" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField> getFieldList();
    
    /**
     * Gets array of all "field" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField[] getFieldArray();
    
    /**
     * Gets ith "field" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField getFieldArray(int i);
    
    /**
     * Returns number of "field" element
     */
    int sizeOfFieldArray();
    
    /**
     * Sets array of all "field" element
     */
    void setFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField[] fieldArray);
    
    /**
     * Sets ith "field" element
     */
    void setFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField field);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "field" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField insertNewField(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "field" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField addNewField();
    
    /**
     * Removes the ith "field" element
     */
    void removeField(int i);
    
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

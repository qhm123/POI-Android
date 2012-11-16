/*
 * XML Type:  CT_SchemaLibrary
 * Namespace: http://schemas.openxmlformats.org/schemaLibrary/2006/main
 * Java type: org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.schemaLibrary.x2006.main;


/**
 * An XML CT_SchemaLibrary(@http://schemas.openxmlformats.org/schemaLibrary/2006/main).
 *
 * This is a complex type.
 */
public interface CTSchemaLibrary extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSchemaLibrary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctschemalibrary4028type");
    
    /**
     * Gets a List of "schema" elements
     */
    java.util.List<org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema> getSchemaList();
    
    /**
     * Gets array of all "schema" elements
     * @deprecated
     */
    org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema[] getSchemaArray();
    
    /**
     * Gets ith "schema" element
     */
    org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema getSchemaArray(int i);
    
    /**
     * Returns number of "schema" element
     */
    int sizeOfSchemaArray();
    
    /**
     * Sets array of all "schema" element
     */
    void setSchemaArray(org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema[] schemaArray);
    
    /**
     * Sets ith "schema" element
     */
    void setSchemaArray(int i, org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema schema);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schema" element
     */
    org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema insertNewSchema(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schema" element
     */
    org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema addNewSchema();
    
    /**
     * Removes the ith "schema" element
     */
    void removeSchema(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

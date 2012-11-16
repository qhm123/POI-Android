/*
 * XML Type:  CT_DatastoreSchemaRefs
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/customXml
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customXml;


/**
 * An XML CT_DatastoreSchemaRefs(@http://schemas.openxmlformats.org/officeDocument/2006/customXml).
 *
 * This is a complex type.
 */
public interface CTDatastoreSchemaRefs extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDatastoreSchemaRefs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdatastoreschemarefsefeatype");
    
    /**
     * Gets a List of "schemaRef" elements
     */
    java.util.List<org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef> getSchemaRefList();
    
    /**
     * Gets array of all "schemaRef" elements
     * @deprecated
     */
    org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef[] getSchemaRefArray();
    
    /**
     * Gets ith "schemaRef" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef getSchemaRefArray(int i);
    
    /**
     * Returns number of "schemaRef" element
     */
    int sizeOfSchemaRefArray();
    
    /**
     * Sets array of all "schemaRef" element
     */
    void setSchemaRefArray(org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef[] schemaRefArray);
    
    /**
     * Sets ith "schemaRef" element
     */
    void setSchemaRefArray(int i, org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef schemaRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schemaRef" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef insertNewSchemaRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schemaRef" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef addNewSchemaRef();
    
    /**
     * Removes the ith "schemaRef" element
     */
    void removeSchemaRef(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_DatastoreItem
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/customXml
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customXml;


/**
 * An XML CT_DatastoreItem(@http://schemas.openxmlformats.org/officeDocument/2006/customXml).
 *
 * This is a complex type.
 */
public interface CTDatastoreItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDatastoreItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdatastoreitem24fctype");
    
    /**
     * Gets the "schemaRefs" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs getSchemaRefs();
    
    /**
     * True if has "schemaRefs" element
     */
    boolean isSetSchemaRefs();
    
    /**
     * Sets the "schemaRefs" element
     */
    void setSchemaRefs(org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs schemaRefs);
    
    /**
     * Appends and returns a new empty "schemaRefs" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs addNewSchemaRefs();
    
    /**
     * Unsets the "schemaRefs" element
     */
    void unsetSchemaRefs();
    
    /**
     * Gets the "itemID" attribute
     */
    java.lang.String getItemID();
    
    /**
     * Gets (as xml) the "itemID" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid xgetItemID();
    
    /**
     * Sets the "itemID" attribute
     */
    void setItemID(java.lang.String itemID);
    
    /**
     * Sets (as xml) the "itemID" attribute
     */
    void xsetItemID(org.openxmlformats.schemas.officeDocument.x2006.customXml.STGuid itemID);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

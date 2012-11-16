/*
 * XML Type:  CT_ExternalBook
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ExternalBook(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalBook extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTExternalBook.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctexternalbookc89dtype");
    
    /**
     * Gets the "sheetNames" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames getSheetNames();
    
    /**
     * True if has "sheetNames" element
     */
    boolean isSetSheetNames();
    
    /**
     * Sets the "sheetNames" element
     */
    void setSheetNames(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames sheetNames);
    
    /**
     * Appends and returns a new empty "sheetNames" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames addNewSheetNames();
    
    /**
     * Unsets the "sheetNames" element
     */
    void unsetSheetNames();
    
    /**
     * Gets the "definedNames" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames getDefinedNames();
    
    /**
     * True if has "definedNames" element
     */
    boolean isSetDefinedNames();
    
    /**
     * Sets the "definedNames" element
     */
    void setDefinedNames(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames definedNames);
    
    /**
     * Appends and returns a new empty "definedNames" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames addNewDefinedNames();
    
    /**
     * Unsets the "definedNames" element
     */
    void unsetDefinedNames();
    
    /**
     * Gets the "sheetDataSet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet getSheetDataSet();
    
    /**
     * True if has "sheetDataSet" element
     */
    boolean isSetSheetDataSet();
    
    /**
     * Sets the "sheetDataSet" element
     */
    void setSheetDataSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet sheetDataSet);
    
    /**
     * Appends and returns a new empty "sheetDataSet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet addNewSheetDataSet();
    
    /**
     * Unsets the "sheetDataSet" element
     */
    void unsetSheetDataSet();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

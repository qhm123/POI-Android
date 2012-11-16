/*
 * XML Type:  CT_Metadata
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Metadata(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMetadata extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmetadata7138type");
    
    /**
     * Gets the "metadataTypes" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes getMetadataTypes();
    
    /**
     * True if has "metadataTypes" element
     */
    boolean isSetMetadataTypes();
    
    /**
     * Sets the "metadataTypes" element
     */
    void setMetadataTypes(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes metadataTypes);
    
    /**
     * Appends and returns a new empty "metadataTypes" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes addNewMetadataTypes();
    
    /**
     * Unsets the "metadataTypes" element
     */
    void unsetMetadataTypes();
    
    /**
     * Gets the "metadataStrings" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings getMetadataStrings();
    
    /**
     * True if has "metadataStrings" element
     */
    boolean isSetMetadataStrings();
    
    /**
     * Sets the "metadataStrings" element
     */
    void setMetadataStrings(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings metadataStrings);
    
    /**
     * Appends and returns a new empty "metadataStrings" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings addNewMetadataStrings();
    
    /**
     * Unsets the "metadataStrings" element
     */
    void unsetMetadataStrings();
    
    /**
     * Gets the "mdxMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata getMdxMetadata();
    
    /**
     * True if has "mdxMetadata" element
     */
    boolean isSetMdxMetadata();
    
    /**
     * Sets the "mdxMetadata" element
     */
    void setMdxMetadata(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata mdxMetadata);
    
    /**
     * Appends and returns a new empty "mdxMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata addNewMdxMetadata();
    
    /**
     * Unsets the "mdxMetadata" element
     */
    void unsetMdxMetadata();
    
    /**
     * Gets a List of "futureMetadata" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata> getFutureMetadataList();
    
    /**
     * Gets array of all "futureMetadata" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata[] getFutureMetadataArray();
    
    /**
     * Gets ith "futureMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata getFutureMetadataArray(int i);
    
    /**
     * Returns number of "futureMetadata" element
     */
    int sizeOfFutureMetadataArray();
    
    /**
     * Sets array of all "futureMetadata" element
     */
    void setFutureMetadataArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata[] futureMetadataArray);
    
    /**
     * Sets ith "futureMetadata" element
     */
    void setFutureMetadataArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata futureMetadata);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "futureMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata insertNewFutureMetadata(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "futureMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata addNewFutureMetadata();
    
    /**
     * Removes the ith "futureMetadata" element
     */
    void removeFutureMetadata(int i);
    
    /**
     * Gets the "cellMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks getCellMetadata();
    
    /**
     * True if has "cellMetadata" element
     */
    boolean isSetCellMetadata();
    
    /**
     * Sets the "cellMetadata" element
     */
    void setCellMetadata(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks cellMetadata);
    
    /**
     * Appends and returns a new empty "cellMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks addNewCellMetadata();
    
    /**
     * Unsets the "cellMetadata" element
     */
    void unsetCellMetadata();
    
    /**
     * Gets the "valueMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks getValueMetadata();
    
    /**
     * True if has "valueMetadata" element
     */
    boolean isSetValueMetadata();
    
    /**
     * Sets the "valueMetadata" element
     */
    void setValueMetadata(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks valueMetadata);
    
    /**
     * Appends and returns a new empty "valueMetadata" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks addNewValueMetadata();
    
    /**
     * Unsets the "valueMetadata" element
     */
    void unsetValueMetadata();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

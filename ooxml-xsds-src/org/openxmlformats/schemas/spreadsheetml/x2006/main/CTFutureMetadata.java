/*
 * XML Type:  CT_FutureMetadata
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_FutureMetadata(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFutureMetadata extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFutureMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfuturemetadata3e9btype");
    
    /**
     * Gets a List of "bk" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock> getBkList();
    
    /**
     * Gets array of all "bk" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock[] getBkArray();
    
    /**
     * Gets ith "bk" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock getBkArray(int i);
    
    /**
     * Returns number of "bk" element
     */
    int sizeOfBkArray();
    
    /**
     * Sets array of all "bk" element
     */
    void setBkArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock[] bkArray);
    
    /**
     * Sets ith "bk" element
     */
    void setBkArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock bk);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bk" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock insertNewBk(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bk" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock addNewBk();
    
    /**
     * Removes the ith "bk" element
     */
    void removeBk(int i);
    
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
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
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

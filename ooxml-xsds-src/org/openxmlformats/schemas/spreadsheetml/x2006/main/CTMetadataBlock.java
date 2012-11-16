/*
 * XML Type:  CT_MetadataBlock
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MetadataBlock(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMetadataBlock extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMetadataBlock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmetadatablocka73dtype");
    
    /**
     * Gets a List of "rc" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord> getRcList();
    
    /**
     * Gets array of all "rc" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord[] getRcArray();
    
    /**
     * Gets ith "rc" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord getRcArray(int i);
    
    /**
     * Returns number of "rc" element
     */
    int sizeOfRcArray();
    
    /**
     * Sets array of all "rc" element
     */
    void setRcArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord[] rcArray);
    
    /**
     * Sets ith "rc" element
     */
    void setRcArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord rc);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rc" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord insertNewRc(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rc" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord addNewRc();
    
    /**
     * Removes the ith "rc" element
     */
    void removeRc(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

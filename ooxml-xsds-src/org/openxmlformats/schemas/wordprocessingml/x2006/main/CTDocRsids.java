/*
 * XML Type:  CT_DocRsids
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocRsids(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocRsids extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocRsids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocrsids0dc9type");
    
    /**
     * Gets the "rsidRoot" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber getRsidRoot();
    
    /**
     * True if has "rsidRoot" element
     */
    boolean isSetRsidRoot();
    
    /**
     * Sets the "rsidRoot" element
     */
    void setRsidRoot(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber rsidRoot);
    
    /**
     * Appends and returns a new empty "rsidRoot" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber addNewRsidRoot();
    
    /**
     * Unsets the "rsidRoot" element
     */
    void unsetRsidRoot();
    
    /**
     * Gets a List of "rsid" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber> getRsidList();
    
    /**
     * Gets array of all "rsid" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber[] getRsidArray();
    
    /**
     * Gets ith "rsid" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber getRsidArray(int i);
    
    /**
     * Returns number of "rsid" element
     */
    int sizeOfRsidArray();
    
    /**
     * Sets array of all "rsid" element
     */
    void setRsidArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber[] rsidArray);
    
    /**
     * Sets ith "rsid" element
     */
    void setRsidArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber rsid);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rsid" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber insertNewRsid(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rsid" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber addNewRsid();
    
    /**
     * Removes the ith "rsid" element
     */
    void removeRsid(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

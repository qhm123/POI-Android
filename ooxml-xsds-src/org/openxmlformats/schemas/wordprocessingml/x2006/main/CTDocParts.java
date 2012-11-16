/*
 * XML Type:  CT_DocParts
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocParts(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocParts extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocParts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocpartsf460type");
    
    /**
     * Gets a List of "docPart" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart> getDocPartList();
    
    /**
     * Gets array of all "docPart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart[] getDocPartArray();
    
    /**
     * Gets ith "docPart" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart getDocPartArray(int i);
    
    /**
     * Returns number of "docPart" element
     */
    int sizeOfDocPartArray();
    
    /**
     * Sets array of all "docPart" element
     */
    void setDocPartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart[] docPartArray);
    
    /**
     * Sets ith "docPart" element
     */
    void setDocPartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart docPart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "docPart" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart insertNewDocPart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "docPart" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart addNewDocPart();
    
    /**
     * Removes the ith "docPart" element
     */
    void removeDocPart(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_MetadataStrings
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MetadataStrings(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMetadataStrings extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMetadataStrings.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmetadatastrings65f2type");
    
    /**
     * Gets a List of "s" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement> getSList();
    
    /**
     * Gets array of all "s" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] getSArray();
    
    /**
     * Gets ith "s" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement getSArray(int i);
    
    /**
     * Returns number of "s" element
     */
    int sizeOfSArray();
    
    /**
     * Sets array of all "s" element
     */
    void setSArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] sArray);
    
    /**
     * Sets ith "s" element
     */
    void setSArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement s);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "s" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement insertNewS(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "s" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement addNewS();
    
    /**
     * Removes the ith "s" element
     */
    void removeS(int i);
    
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

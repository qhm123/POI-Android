/*
 * XML Type:  CT_ServerFormats
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ServerFormats(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTServerFormats extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTServerFormats.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctserverformatsf778type");
    
    /**
     * Gets a List of "serverFormat" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat> getServerFormatList();
    
    /**
     * Gets array of all "serverFormat" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat[] getServerFormatArray();
    
    /**
     * Gets ith "serverFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat getServerFormatArray(int i);
    
    /**
     * Returns number of "serverFormat" element
     */
    int sizeOfServerFormatArray();
    
    /**
     * Sets array of all "serverFormat" element
     */
    void setServerFormatArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat[] serverFormatArray);
    
    /**
     * Sets ith "serverFormat" element
     */
    void setServerFormatArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat serverFormat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serverFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat insertNewServerFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serverFormat" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat addNewServerFormat();
    
    /**
     * Removes the ith "serverFormat" element
     */
    void removeServerFormat(int i);
    
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

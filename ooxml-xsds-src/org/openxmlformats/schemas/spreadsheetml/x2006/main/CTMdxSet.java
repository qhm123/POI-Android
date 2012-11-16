/*
 * XML Type:  CT_MdxSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MdxSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMdxSet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMdxSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmdxset03aatype");
    
    /**
     * Gets a List of "n" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex> getNList();
    
    /**
     * Gets array of all "n" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] getNArray();
    
    /**
     * Gets ith "n" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex getNArray(int i);
    
    /**
     * Returns number of "n" element
     */
    int sizeOfNArray();
    
    /**
     * Sets array of all "n" element
     */
    void setNArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] nArray);
    
    /**
     * Sets ith "n" element
     */
    void setNArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex n);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "n" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex insertNewN(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "n" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex addNewN();
    
    /**
     * Removes the ith "n" element
     */
    void removeN(int i);
    
    /**
     * Gets the "ns" attribute
     */
    long getNs();
    
    /**
     * Gets (as xml) the "ns" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetNs();
    
    /**
     * Sets the "ns" attribute
     */
    void setNs(long ns);
    
    /**
     * Sets (as xml) the "ns" attribute
     */
    void xsetNs(org.apache.xmlbeans.XmlUnsignedInt ns);
    
    /**
     * Gets the "c" attribute
     */
    long getC();
    
    /**
     * Gets (as xml) the "c" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetC();
    
    /**
     * True if has "c" attribute
     */
    boolean isSetC();
    
    /**
     * Sets the "c" attribute
     */
    void setC(long c);
    
    /**
     * Sets (as xml) the "c" attribute
     */
    void xsetC(org.apache.xmlbeans.XmlUnsignedInt c);
    
    /**
     * Unsets the "c" attribute
     */
    void unsetC();
    
    /**
     * Gets the "o" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder.Enum getO();
    
    /**
     * Gets (as xml) the "o" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder xgetO();
    
    /**
     * True if has "o" attribute
     */
    boolean isSetO();
    
    /**
     * Sets the "o" attribute
     */
    void setO(org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder.Enum o);
    
    /**
     * Sets (as xml) the "o" attribute
     */
    void xsetO(org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder o);
    
    /**
     * Unsets the "o" attribute
     */
    void unsetO();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

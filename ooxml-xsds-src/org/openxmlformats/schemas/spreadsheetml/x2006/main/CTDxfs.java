/*
 * XML Type:  CT_Dxfs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Dxfs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDxfs extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDxfs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdxfsb26atype");
    
    /**
     * Gets a List of "dxf" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf> getDxfList();
    
    /**
     * Gets array of all "dxf" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf[] getDxfArray();
    
    /**
     * Gets ith "dxf" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf getDxfArray(int i);
    
    /**
     * Returns number of "dxf" element
     */
    int sizeOfDxfArray();
    
    /**
     * Sets array of all "dxf" element
     */
    void setDxfArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf[] dxfArray);
    
    /**
     * Sets ith "dxf" element
     */
    void setDxfArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf dxf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dxf" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf insertNewDxf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dxf" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf addNewDxf();
    
    /**
     * Removes the ith "dxf" element
     */
    void removeDxf(int i);
    
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

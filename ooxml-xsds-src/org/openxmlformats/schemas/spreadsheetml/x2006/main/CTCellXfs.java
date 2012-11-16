/*
 * XML Type:  CT_CellXfs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CellXfs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCellXfs extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCellXfs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcellxfs1322type");
    
    /**
     * Gets a List of "xf" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf> getXfList();
    
    /**
     * Gets array of all "xf" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf[] getXfArray();
    
    /**
     * Gets ith "xf" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf getXfArray(int i);
    
    /**
     * Returns number of "xf" element
     */
    int sizeOfXfArray();
    
    /**
     * Sets array of all "xf" element
     */
    void setXfArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf[] xfArray);
    
    /**
     * Sets ith "xf" element
     */
    void setXfArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf xf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xf" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf insertNewXf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xf" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf addNewXf();
    
    /**
     * Removes the ith "xf" element
     */
    void removeXf(int i);
    
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

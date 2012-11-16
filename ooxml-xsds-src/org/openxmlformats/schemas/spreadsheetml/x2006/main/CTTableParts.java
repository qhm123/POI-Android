/*
 * XML Type:  CT_TableParts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_TableParts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableParts extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableParts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablepartsf6bbtype");
    
    /**
     * Gets a List of "tablePart" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart> getTablePartList();
    
    /**
     * Gets array of all "tablePart" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart[] getTablePartArray();
    
    /**
     * Gets ith "tablePart" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart getTablePartArray(int i);
    
    /**
     * Returns number of "tablePart" element
     */
    int sizeOfTablePartArray();
    
    /**
     * Sets array of all "tablePart" element
     */
    void setTablePartArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart[] tablePartArray);
    
    /**
     * Sets ith "tablePart" element
     */
    void setTablePartArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart tablePart);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tablePart" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart insertNewTablePart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tablePart" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart addNewTablePart();
    
    /**
     * Removes the ith "tablePart" element
     */
    void removeTablePart(int i);
    
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

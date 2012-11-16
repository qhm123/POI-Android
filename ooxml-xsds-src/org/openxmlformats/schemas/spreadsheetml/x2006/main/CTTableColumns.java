/*
 * XML Type:  CT_TableColumns
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_TableColumns(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableColumns extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableColumns.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablecolumnsebb8type");
    
    /**
     * Gets a List of "tableColumn" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn> getTableColumnList();
    
    /**
     * Gets array of all "tableColumn" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn[] getTableColumnArray();
    
    /**
     * Gets ith "tableColumn" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn getTableColumnArray(int i);
    
    /**
     * Returns number of "tableColumn" element
     */
    int sizeOfTableColumnArray();
    
    /**
     * Sets array of all "tableColumn" element
     */
    void setTableColumnArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn[] tableColumnArray);
    
    /**
     * Sets ith "tableColumn" element
     */
    void setTableColumnArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn tableColumn);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tableColumn" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn insertNewTableColumn(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tableColumn" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn addNewTableColumn();
    
    /**
     * Removes the ith "tableColumn" element
     */
    void removeTableColumn(int i);
    
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

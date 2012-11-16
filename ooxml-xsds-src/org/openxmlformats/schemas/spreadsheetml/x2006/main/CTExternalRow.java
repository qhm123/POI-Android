/*
 * XML Type:  CT_ExternalRow
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ExternalRow(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalRow extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTExternalRow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctexternalrowa22etype");
    
    /**
     * Gets a List of "cell" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell> getCellList();
    
    /**
     * Gets array of all "cell" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell[] getCellArray();
    
    /**
     * Gets ith "cell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell getCellArray(int i);
    
    /**
     * Returns number of "cell" element
     */
    int sizeOfCellArray();
    
    /**
     * Sets array of all "cell" element
     */
    void setCellArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell[] cellArray);
    
    /**
     * Sets ith "cell" element
     */
    void setCellArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell cell);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell insertNewCell(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell addNewCell();
    
    /**
     * Removes the ith "cell" element
     */
    void removeCell(int i);
    
    /**
     * Gets the "r" attribute
     */
    long getR();
    
    /**
     * Gets (as xml) the "r" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetR();
    
    /**
     * Sets the "r" attribute
     */
    void setR(long r);
    
    /**
     * Sets (as xml) the "r" attribute
     */
    void xsetR(org.apache.xmlbeans.XmlUnsignedInt r);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

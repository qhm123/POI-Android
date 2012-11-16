/*
 * XML Type:  CT_Table
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Table(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTable extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttable5f3ftype");
    
    /**
     * Gets the "tblPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties getTblPr();
    
    /**
     * True if has "tblPr" element
     */
    boolean isSetTblPr();
    
    /**
     * Sets the "tblPr" element
     */
    void setTblPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties tblPr);
    
    /**
     * Appends and returns a new empty "tblPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties addNewTblPr();
    
    /**
     * Unsets the "tblPr" element
     */
    void unsetTblPr();
    
    /**
     * Gets the "tblGrid" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid getTblGrid();
    
    /**
     * Sets the "tblGrid" element
     */
    void setTblGrid(org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid tblGrid);
    
    /**
     * Appends and returns a new empty "tblGrid" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid addNewTblGrid();
    
    /**
     * Gets a List of "tr" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow> getTrList();
    
    /**
     * Gets array of all "tr" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow[] getTrArray();
    
    /**
     * Gets ith "tr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow getTrArray(int i);
    
    /**
     * Returns number of "tr" element
     */
    int sizeOfTrArray();
    
    /**
     * Sets array of all "tr" element
     */
    void setTrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow[] trArray);
    
    /**
     * Sets ith "tr" element
     */
    void setTrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow tr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow insertNewTr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow addNewTr();
    
    /**
     * Removes the ith "tr" element
     */
    void removeTr(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

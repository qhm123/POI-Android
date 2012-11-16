/*
 * XML Type:  CT_TableRow
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TableRow(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableRow extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableRow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablerow4ac7type");
    
    /**
     * Gets a List of "tc" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell> getTcList();
    
    /**
     * Gets array of all "tc" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell[] getTcArray();
    
    /**
     * Gets ith "tc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell getTcArray(int i);
    
    /**
     * Returns number of "tc" element
     */
    int sizeOfTcArray();
    
    /**
     * Sets array of all "tc" element
     */
    void setTcArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell[] tcArray);
    
    /**
     * Sets ith "tc" element
     */
    void setTcArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell tc);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell insertNewTc(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell addNewTc();
    
    /**
     * Removes the ith "tc" element
     */
    void removeTc(int i);
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "h" attribute
     */
    long getH();
    
    /**
     * Gets (as xml) the "h" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetH();
    
    /**
     * Sets the "h" attribute
     */
    void setH(long h);
    
    /**
     * Sets (as xml) the "h" attribute
     */
    void xsetH(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate h);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

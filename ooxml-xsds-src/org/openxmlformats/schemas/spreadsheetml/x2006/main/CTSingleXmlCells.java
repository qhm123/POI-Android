/*
 * XML Type:  CT_SingleXmlCells
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SingleXmlCells(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSingleXmlCells extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSingleXmlCells.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsinglexmlcells5a6btype");
    
    /**
     * Gets a List of "singleXmlCell" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell> getSingleXmlCellList();
    
    /**
     * Gets array of all "singleXmlCell" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell[] getSingleXmlCellArray();
    
    /**
     * Gets ith "singleXmlCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell getSingleXmlCellArray(int i);
    
    /**
     * Returns number of "singleXmlCell" element
     */
    int sizeOfSingleXmlCellArray();
    
    /**
     * Sets array of all "singleXmlCell" element
     */
    void setSingleXmlCellArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell[] singleXmlCellArray);
    
    /**
     * Sets ith "singleXmlCell" element
     */
    void setSingleXmlCellArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell singleXmlCell);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "singleXmlCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell insertNewSingleXmlCell(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "singleXmlCell" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell addNewSingleXmlCell();
    
    /**
     * Removes the ith "singleXmlCell" element
     */
    void removeSingleXmlCell(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

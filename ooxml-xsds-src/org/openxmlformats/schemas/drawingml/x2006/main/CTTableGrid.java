/*
 * XML Type:  CT_TableGrid
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TableGrid(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableGrid extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableGrid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablegrid69a5type");
    
    /**
     * Gets a List of "gridCol" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol> getGridColList();
    
    /**
     * Gets array of all "gridCol" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol[] getGridColArray();
    
    /**
     * Gets ith "gridCol" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol getGridColArray(int i);
    
    /**
     * Returns number of "gridCol" element
     */
    int sizeOfGridColArray();
    
    /**
     * Sets array of all "gridCol" element
     */
    void setGridColArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol[] gridColArray);
    
    /**
     * Sets ith "gridCol" element
     */
    void setGridColArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol gridCol);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gridCol" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol insertNewGridCol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gridCol" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol addNewGridCol();
    
    /**
     * Removes the ith "gridCol" element
     */
    void removeGridCol(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

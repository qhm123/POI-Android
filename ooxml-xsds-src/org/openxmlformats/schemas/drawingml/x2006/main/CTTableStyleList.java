/*
 * XML Type:  CT_TableStyleList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TableStyleList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableStyleList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableStyleList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablestylelist4bdctype");
    
    /**
     * Gets a List of "tblStyle" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle> getTblStyleList();
    
    /**
     * Gets array of all "tblStyle" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle[] getTblStyleArray();
    
    /**
     * Gets ith "tblStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle getTblStyleArray(int i);
    
    /**
     * Returns number of "tblStyle" element
     */
    int sizeOfTblStyleArray();
    
    /**
     * Sets array of all "tblStyle" element
     */
    void setTblStyleArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle[] tblStyleArray);
    
    /**
     * Sets ith "tblStyle" element
     */
    void setTblStyleArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle tblStyle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tblStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle insertNewTblStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tblStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle addNewTblStyle();
    
    /**
     * Removes the ith "tblStyle" element
     */
    void removeTblStyle(int i);
    
    /**
     * Gets the "def" attribute
     */
    java.lang.String getDef();
    
    /**
     * Gets (as xml) the "def" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STGuid xgetDef();
    
    /**
     * Sets the "def" attribute
     */
    void setDef(java.lang.String def);
    
    /**
     * Sets (as xml) the "def" attribute
     */
    void xsetDef(org.openxmlformats.schemas.drawingml.x2006.main.STGuid def);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

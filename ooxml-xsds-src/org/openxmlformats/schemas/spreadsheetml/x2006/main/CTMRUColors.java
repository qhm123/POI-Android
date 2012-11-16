/*
 * XML Type:  CT_MRUColors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MRUColors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMRUColors extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMRUColors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmrucolors589ftype");
    
    /**
     * Gets a List of "color" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor> getColorList();
    
    /**
     * Gets array of all "color" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] getColorArray();
    
    /**
     * Gets ith "color" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getColorArray(int i);
    
    /**
     * Returns number of "color" element
     */
    int sizeOfColorArray();
    
    /**
     * Sets array of all "color" element
     */
    void setColorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] colorArray);
    
    /**
     * Sets ith "color" element
     */
    void setColorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor color);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "color" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor insertNewColor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewColor();
    
    /**
     * Removes the ith "color" element
     */
    void removeColor(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

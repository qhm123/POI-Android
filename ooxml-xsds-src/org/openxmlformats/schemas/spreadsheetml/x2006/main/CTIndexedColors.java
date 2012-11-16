/*
 * XML Type:  CT_IndexedColors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_IndexedColors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTIndexedColors extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTIndexedColors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctindexedcolorsa0a0type");
    
    /**
     * Gets a List of "rgbColor" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor> getRgbColorList();
    
    /**
     * Gets array of all "rgbColor" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor[] getRgbColorArray();
    
    /**
     * Gets ith "rgbColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor getRgbColorArray(int i);
    
    /**
     * Returns number of "rgbColor" element
     */
    int sizeOfRgbColorArray();
    
    /**
     * Sets array of all "rgbColor" element
     */
    void setRgbColorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor[] rgbColorArray);
    
    /**
     * Sets ith "rgbColor" element
     */
    void setRgbColorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor rgbColor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rgbColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor insertNewRgbColor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rgbColor" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor addNewRgbColor();
    
    /**
     * Removes the ith "rgbColor" element
     */
    void removeRgbColor(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_ColorScale
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ColorScale(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColorScale extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColorScale.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolorscale1a70type");
    
    /**
     * Gets a List of "cfvo" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo> getCfvoList();
    
    /**
     * Gets array of all "cfvo" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] getCfvoArray();
    
    /**
     * Gets ith "cfvo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo getCfvoArray(int i);
    
    /**
     * Returns number of "cfvo" element
     */
    int sizeOfCfvoArray();
    
    /**
     * Sets array of all "cfvo" element
     */
    void setCfvoArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] cfvoArray);
    
    /**
     * Sets ith "cfvo" element
     */
    void setCfvoArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo cfvo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cfvo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo insertNewCfvo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cfvo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo addNewCfvo();
    
    /**
     * Removes the ith "cfvo" element
     */
    void removeCfvo(int i);
    
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

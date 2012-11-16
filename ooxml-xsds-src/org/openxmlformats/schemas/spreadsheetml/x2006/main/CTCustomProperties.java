/*
 * XML Type:  CT_CustomProperties
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CustomProperties(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomproperties584dtype");
    
    /**
     * Gets a List of "customPr" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty> getCustomPrList();
    
    /**
     * Gets array of all "customPr" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty[] getCustomPrArray();
    
    /**
     * Gets ith "customPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty getCustomPrArray(int i);
    
    /**
     * Returns number of "customPr" element
     */
    int sizeOfCustomPrArray();
    
    /**
     * Sets array of all "customPr" element
     */
    void setCustomPrArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty[] customPrArray);
    
    /**
     * Sets ith "customPr" element
     */
    void setCustomPrArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty customPr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty insertNewCustomPr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty addNewCustomPr();
    
    /**
     * Removes the ith "customPr" element
     */
    void removeCustomPr(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

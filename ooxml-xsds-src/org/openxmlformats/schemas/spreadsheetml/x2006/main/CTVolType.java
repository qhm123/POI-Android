/*
 * XML Type:  CT_VolType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_VolType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTVolType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTVolType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctvoltype1acctype");
    
    /**
     * Gets a List of "main" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain> getMainList();
    
    /**
     * Gets array of all "main" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain[] getMainArray();
    
    /**
     * Gets ith "main" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain getMainArray(int i);
    
    /**
     * Returns number of "main" element
     */
    int sizeOfMainArray();
    
    /**
     * Sets array of all "main" element
     */
    void setMainArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain[] mainArray);
    
    /**
     * Sets ith "main" element
     */
    void setMainArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain main);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "main" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain insertNewMain(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "main" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain addNewMain();
    
    /**
     * Removes the ith "main" element
     */
    void removeMain(int i);
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType type);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_VolMain
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_VolMain(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTVolMain extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTVolMain.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctvolmaina48btype");
    
    /**
     * Gets a List of "tp" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic> getTpList();
    
    /**
     * Gets array of all "tp" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic[] getTpArray();
    
    /**
     * Gets ith "tp" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic getTpArray(int i);
    
    /**
     * Returns number of "tp" element
     */
    int sizeOfTpArray();
    
    /**
     * Sets array of all "tp" element
     */
    void setTpArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic[] tpArray);
    
    /**
     * Sets ith "tp" element
     */
    void setTpArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic tp);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tp" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic insertNewTp(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tp" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic addNewTp();
    
    /**
     * Removes the ith "tp" element
     */
    void removeTp(int i);
    
    /**
     * Gets the "first" attribute
     */
    java.lang.String getFirst();
    
    /**
     * Gets (as xml) the "first" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetFirst();
    
    /**
     * Sets the "first" attribute
     */
    void setFirst(java.lang.String first);
    
    /**
     * Sets (as xml) the "first" attribute
     */
    void xsetFirst(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring first);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

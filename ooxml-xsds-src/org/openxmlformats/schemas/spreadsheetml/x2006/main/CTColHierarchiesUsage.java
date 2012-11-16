/*
 * XML Type:  CT_ColHierarchiesUsage
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ColHierarchiesUsage(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColHierarchiesUsage extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColHierarchiesUsage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolhierarchiesusage19cdtype");
    
    /**
     * Gets a List of "colHierarchyUsage" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage> getColHierarchyUsageList();
    
    /**
     * Gets array of all "colHierarchyUsage" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[] getColHierarchyUsageArray();
    
    /**
     * Gets ith "colHierarchyUsage" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage getColHierarchyUsageArray(int i);
    
    /**
     * Returns number of "colHierarchyUsage" element
     */
    int sizeOfColHierarchyUsageArray();
    
    /**
     * Sets array of all "colHierarchyUsage" element
     */
    void setColHierarchyUsageArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage[] colHierarchyUsageArray);
    
    /**
     * Sets ith "colHierarchyUsage" element
     */
    void setColHierarchyUsageArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage colHierarchyUsage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "colHierarchyUsage" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage insertNewColHierarchyUsage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "colHierarchyUsage" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage addNewColHierarchyUsage();
    
    /**
     * Removes the ith "colHierarchyUsage" element
     */
    void removeColHierarchyUsage(int i);
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_GroupLevels
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_GroupLevels(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGroupLevels extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGroupLevels.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgrouplevels3c2dtype");
    
    /**
     * Gets a List of "groupLevel" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel> getGroupLevelList();
    
    /**
     * Gets array of all "groupLevel" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel[] getGroupLevelArray();
    
    /**
     * Gets ith "groupLevel" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel getGroupLevelArray(int i);
    
    /**
     * Returns number of "groupLevel" element
     */
    int sizeOfGroupLevelArray();
    
    /**
     * Sets array of all "groupLevel" element
     */
    void setGroupLevelArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel[] groupLevelArray);
    
    /**
     * Sets ith "groupLevel" element
     */
    void setGroupLevelArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel groupLevel);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "groupLevel" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel insertNewGroupLevel(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "groupLevel" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel addNewGroupLevel();
    
    /**
     * Removes the ith "groupLevel" element
     */
    void removeGroupLevel(int i);
    
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

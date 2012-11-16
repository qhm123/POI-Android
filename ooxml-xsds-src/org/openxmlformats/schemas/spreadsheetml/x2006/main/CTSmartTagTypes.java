/*
 * XML Type:  CT_SmartTagTypes
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SmartTagTypes(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSmartTagTypes extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSmartTagTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsmarttagtypes9207type");
    
    /**
     * Gets a List of "smartTagType" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType> getSmartTagTypeList();
    
    /**
     * Gets array of all "smartTagType" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType[] getSmartTagTypeArray();
    
    /**
     * Gets ith "smartTagType" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType getSmartTagTypeArray(int i);
    
    /**
     * Returns number of "smartTagType" element
     */
    int sizeOfSmartTagTypeArray();
    
    /**
     * Sets array of all "smartTagType" element
     */
    void setSmartTagTypeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType[] smartTagTypeArray);
    
    /**
     * Sets ith "smartTagType" element
     */
    void setSmartTagTypeArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType smartTagType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "smartTagType" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType insertNewSmartTagType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "smartTagType" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType addNewSmartTagType();
    
    /**
     * Removes the ith "smartTagType" element
     */
    void removeSmartTagType(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

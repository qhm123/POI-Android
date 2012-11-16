/*
 * XML Type:  CT_ExternalDefinedNames
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ExternalDefinedNames(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalDefinedNames extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTExternalDefinedNames.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctexternaldefinednamesccf3type");
    
    /**
     * Gets a List of "definedName" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName> getDefinedNameList();
    
    /**
     * Gets array of all "definedName" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName[] getDefinedNameArray();
    
    /**
     * Gets ith "definedName" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName getDefinedNameArray(int i);
    
    /**
     * Returns number of "definedName" element
     */
    int sizeOfDefinedNameArray();
    
    /**
     * Sets array of all "definedName" element
     */
    void setDefinedNameArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName[] definedNameArray);
    
    /**
     * Sets ith "definedName" element
     */
    void setDefinedNameArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName definedName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "definedName" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName insertNewDefinedName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "definedName" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName addNewDefinedName();
    
    /**
     * Removes the ith "definedName" element
     */
    void removeDefinedName(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

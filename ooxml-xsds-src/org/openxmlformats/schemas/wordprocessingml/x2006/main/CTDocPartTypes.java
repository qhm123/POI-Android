/*
 * XML Type:  CT_DocPartTypes
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocPartTypes(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocPartTypes extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocPartTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocparttypesc33atype");
    
    /**
     * Gets a List of "type" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType> getTypeList();
    
    /**
     * Gets array of all "type" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType[] getTypeArray();
    
    /**
     * Gets ith "type" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType getTypeArray(int i);
    
    /**
     * Returns number of "type" element
     */
    int sizeOfTypeArray();
    
    /**
     * Sets array of all "type" element
     */
    void setTypeArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType[] typeArray);
    
    /**
     * Sets ith "type" element
     */
    void setTypeArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType type);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType insertNewType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType addNewType();
    
    /**
     * Removes the ith "type" element
     */
    void removeType(int i);
    
    /**
     * Gets the "all" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getAll();
    
    /**
     * Gets (as xml) the "all" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetAll();
    
    /**
     * True if has "all" attribute
     */
    boolean isSetAll();
    
    /**
     * Sets the "all" attribute
     */
    void setAll(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum all);
    
    /**
     * Sets (as xml) the "all" attribute
     */
    void xsetAll(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff all);
    
    /**
     * Unsets the "all" attribute
     */
    void unsetAll();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

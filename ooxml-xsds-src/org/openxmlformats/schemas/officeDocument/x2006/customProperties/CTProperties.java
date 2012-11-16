/*
 * XML Type:  CT_Properties
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/custom-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customProperties;


/**
 * An XML CT_Properties(@http://schemas.openxmlformats.org/officeDocument/2006/custom-properties).
 *
 * This is a complex type.
 */
public interface CTProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctproperties2c18type");
    
    /**
     * Gets a List of "property" elements
     */
    java.util.List<org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty> getPropertyList();
    
    /**
     * Gets array of all "property" elements
     * @deprecated
     */
    org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty[] getPropertyArray();
    
    /**
     * Gets ith "property" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty getPropertyArray(int i);
    
    /**
     * Returns number of "property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "property" element
     */
    void setPropertyArray(org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty[] propertyArray);
    
    /**
     * Sets ith "property" element
     */
    void setPropertyArray(int i, org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty addNewProperty();
    
    /**
     * Removes the ith "property" element
     */
    void removeProperty(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

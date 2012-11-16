/*
 * XML Type:  CT_AdditionalCharacteristics
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/characteristics
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.characteristics;


/**
 * An XML CT_AdditionalCharacteristics(@http://schemas.openxmlformats.org/officeDocument/2006/characteristics).
 *
 * This is a complex type.
 */
public interface CTAdditionalCharacteristics extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAdditionalCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctadditionalcharacteristics01f5type");
    
    /**
     * Gets a List of "characteristic" elements
     */
    java.util.List<org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic> getCharacteristicList();
    
    /**
     * Gets array of all "characteristic" elements
     * @deprecated
     */
    org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic[] getCharacteristicArray();
    
    /**
     * Gets ith "characteristic" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic getCharacteristicArray(int i);
    
    /**
     * Returns number of "characteristic" element
     */
    int sizeOfCharacteristicArray();
    
    /**
     * Sets array of all "characteristic" element
     */
    void setCharacteristicArray(org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic[] characteristicArray);
    
    /**
     * Sets ith "characteristic" element
     */
    void setCharacteristicArray(int i, org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic characteristic);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "characteristic" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic insertNewCharacteristic(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "characteristic" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic addNewCharacteristic();
    
    /**
     * Removes the ith "characteristic" element
     */
    void removeCharacteristic(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

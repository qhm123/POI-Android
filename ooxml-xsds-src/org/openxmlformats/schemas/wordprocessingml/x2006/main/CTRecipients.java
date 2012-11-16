/*
 * XML Type:  CT_Recipients
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipients
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Recipients(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRecipients extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRecipients.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrecipientsbdeetype");
    
    /**
     * Gets a List of "recipientData" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData> getRecipientDataList();
    
    /**
     * Gets array of all "recipientData" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData[] getRecipientDataArray();
    
    /**
     * Gets ith "recipientData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData getRecipientDataArray(int i);
    
    /**
     * Returns number of "recipientData" element
     */
    int sizeOfRecipientDataArray();
    
    /**
     * Sets array of all "recipientData" element
     */
    void setRecipientDataArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData[] recipientDataArray);
    
    /**
     * Sets ith "recipientData" element
     */
    void setRecipientDataArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData recipientData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recipientData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData insertNewRecipientData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recipientData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData addNewRecipientData();
    
    /**
     * Removes the ith "recipientData" element
     */
    void removeRecipientData(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

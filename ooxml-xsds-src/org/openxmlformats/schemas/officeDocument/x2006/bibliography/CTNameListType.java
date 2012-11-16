/*
 * XML Type:  CT_NameListType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography;


/**
 * An XML CT_NameListType(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public interface CTNameListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNameListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnamelisttype0e89type");
    
    /**
     * Gets a List of "Person" elements
     */
    java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType> getPersonList();
    
    /**
     * Gets array of all "Person" elements
     * @deprecated
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType[] getPersonArray();
    
    /**
     * Gets ith "Person" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType getPersonArray(int i);
    
    /**
     * Returns number of "Person" element
     */
    int sizeOfPersonArray();
    
    /**
     * Sets array of all "Person" element
     */
    void setPersonArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType[] personArray);
    
    /**
     * Sets ith "Person" element
     */
    void setPersonArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType person);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Person" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType insertNewPerson(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Person" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType addNewPerson();
    
    /**
     * Removes the ith "Person" element
     */
    void removePerson(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

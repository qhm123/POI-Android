/*
 * XML Type:  CT_NameType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography;


/**
 * An XML CT_NameType(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public interface CTNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnametype5d07type");
    
    /**
     * Gets the "NameList" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType getNameList();
    
    /**
     * Sets the "NameList" element
     */
    void setNameList(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType nameList);
    
    /**
     * Appends and returns a new empty "NameList" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType addNewNameList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

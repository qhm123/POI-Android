/*
 * XML Type:  CT_NameOrCorporateType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography;


/**
 * An XML CT_NameOrCorporateType(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public interface CTNameOrCorporateType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNameOrCorporateType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnameorcorporatetype4185type");
    
    /**
     * Gets the "NameList" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType getNameList();
    
    /**
     * True if has "NameList" element
     */
    boolean isSetNameList();
    
    /**
     * Sets the "NameList" element
     */
    void setNameList(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType nameList);
    
    /**
     * Appends and returns a new empty "NameList" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType addNewNameList();
    
    /**
     * Unsets the "NameList" element
     */
    void unsetNameList();
    
    /**
     * Gets the "Corporate" element
     */
    java.lang.String getCorporate();
    
    /**
     * Gets (as xml) the "Corporate" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 xgetCorporate();
    
    /**
     * True if has "Corporate" element
     */
    boolean isSetCorporate();
    
    /**
     * Sets the "Corporate" element
     */
    void setCorporate(java.lang.String corporate);
    
    /**
     * Sets (as xml) the "Corporate" element
     */
    void xsetCorporate(org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 corporate);
    
    /**
     * Unsets the "Corporate" element
     */
    void unsetCorporate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

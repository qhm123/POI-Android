/*
 * XML Type:  CT_RecipientData
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_RecipientData(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRecipientData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRecipientData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrecipientdata064ftype");
    
    /**
     * Gets the "active" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getActive();
    
    /**
     * True if has "active" element
     */
    boolean isSetActive();
    
    /**
     * Sets the "active" element
     */
    void setActive(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff active);
    
    /**
     * Appends and returns a new empty "active" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewActive();
    
    /**
     * Unsets the "active" element
     */
    void unsetActive();
    
    /**
     * Gets the "column" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getColumn();
    
    /**
     * Sets the "column" element
     */
    void setColumn(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber column);
    
    /**
     * Appends and returns a new empty "column" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewColumn();
    
    /**
     * Gets the "uniqueTag" element
     */
    byte[] getUniqueTag();
    
    /**
     * Gets (as xml) the "uniqueTag" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetUniqueTag();
    
    /**
     * Sets the "uniqueTag" element
     */
    void setUniqueTag(byte[] uniqueTag);
    
    /**
     * Sets (as xml) the "uniqueTag" element
     */
    void xsetUniqueTag(org.apache.xmlbeans.XmlBase64Binary uniqueTag);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

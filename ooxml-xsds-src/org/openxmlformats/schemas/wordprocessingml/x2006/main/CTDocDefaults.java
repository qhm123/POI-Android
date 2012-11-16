/*
 * XML Type:  CT_DocDefaults
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocDefaults(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocDefaults extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocDefaults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocdefaults2ea8type");
    
    /**
     * Gets the "rPrDefault" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault getRPrDefault();
    
    /**
     * True if has "rPrDefault" element
     */
    boolean isSetRPrDefault();
    
    /**
     * Sets the "rPrDefault" element
     */
    void setRPrDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault rPrDefault);
    
    /**
     * Appends and returns a new empty "rPrDefault" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault addNewRPrDefault();
    
    /**
     * Unsets the "rPrDefault" element
     */
    void unsetRPrDefault();
    
    /**
     * Gets the "pPrDefault" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault getPPrDefault();
    
    /**
     * True if has "pPrDefault" element
     */
    boolean isSetPPrDefault();
    
    /**
     * Sets the "pPrDefault" element
     */
    void setPPrDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault pPrDefault);
    
    /**
     * Appends and returns a new empty "pPrDefault" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault addNewPPrDefault();
    
    /**
     * Unsets the "pPrDefault" element
     */
    void unsetPPrDefault();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

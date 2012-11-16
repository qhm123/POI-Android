/*
 * XML Type:  CT_SmartTagPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SmartTagPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSmartTagPr extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSmartTagPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsmarttagpr0ebctype");
    
    /**
     * Gets the "embed" attribute
     */
    boolean getEmbed();
    
    /**
     * Gets (as xml) the "embed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEmbed();
    
    /**
     * True if has "embed" attribute
     */
    boolean isSetEmbed();
    
    /**
     * Sets the "embed" attribute
     */
    void setEmbed(boolean embed);
    
    /**
     * Sets (as xml) the "embed" attribute
     */
    void xsetEmbed(org.apache.xmlbeans.XmlBoolean embed);
    
    /**
     * Unsets the "embed" attribute
     */
    void unsetEmbed();
    
    /**
     * Gets the "show" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow.Enum getShow();
    
    /**
     * Gets (as xml) the "show" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow xgetShow();
    
    /**
     * True if has "show" attribute
     */
    boolean isSetShow();
    
    /**
     * Sets the "show" attribute
     */
    void setShow(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow.Enum show);
    
    /**
     * Sets (as xml) the "show" attribute
     */
    void xsetShow(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSmartTagShow show);
    
    /**
     * Unsets the "show" attribute
     */
    void unsetShow();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

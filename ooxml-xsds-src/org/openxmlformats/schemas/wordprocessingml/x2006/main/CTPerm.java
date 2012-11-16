/*
 * XML Type:  CT_Perm
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Perm(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPerm extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPerm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctperm7878type");
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString id);
    
    /**
     * Gets the "displacedByCustomXml" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml.Enum getDisplacedByCustomXml();
    
    /**
     * Gets (as xml) the "displacedByCustomXml" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml xgetDisplacedByCustomXml();
    
    /**
     * True if has "displacedByCustomXml" attribute
     */
    boolean isSetDisplacedByCustomXml();
    
    /**
     * Sets the "displacedByCustomXml" attribute
     */
    void setDisplacedByCustomXml(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml.Enum displacedByCustomXml);
    
    /**
     * Sets (as xml) the "displacedByCustomXml" attribute
     */
    void xsetDisplacedByCustomXml(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml displacedByCustomXml);
    
    /**
     * Unsets the "displacedByCustomXml" attribute
     */
    void unsetDisplacedByCustomXml();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_Zoom
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Zoom(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTZoom extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTZoom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctzoomc275type");
    
    /**
     * Gets the "val" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STZoom.Enum getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STZoom xgetVal();
    
    /**
     * True if has "val" attribute
     */
    boolean isSetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STZoom.Enum val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STZoom val);
    
    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
    
    /**
     * Gets the "percent" attribute
     */
    java.math.BigInteger getPercent();
    
    /**
     * Gets (as xml) the "percent" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetPercent();
    
    /**
     * Sets the "percent" attribute
     */
    void setPercent(java.math.BigInteger percent);
    
    /**
     * Sets (as xml) the "percent" attribute
     */
    void xsetPercent(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber percent);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

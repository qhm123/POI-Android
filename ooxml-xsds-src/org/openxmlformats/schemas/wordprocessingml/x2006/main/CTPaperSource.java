/*
 * XML Type:  CT_PaperSource
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_PaperSource(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPaperSource extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPaperSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpapersource8aabtype");
    
    /**
     * Gets the "first" attribute
     */
    java.math.BigInteger getFirst();
    
    /**
     * Gets (as xml) the "first" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetFirst();
    
    /**
     * True if has "first" attribute
     */
    boolean isSetFirst();
    
    /**
     * Sets the "first" attribute
     */
    void setFirst(java.math.BigInteger first);
    
    /**
     * Sets (as xml) the "first" attribute
     */
    void xsetFirst(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber first);
    
    /**
     * Unsets the "first" attribute
     */
    void unsetFirst();
    
    /**
     * Gets the "other" attribute
     */
    java.math.BigInteger getOther();
    
    /**
     * Gets (as xml) the "other" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetOther();
    
    /**
     * True if has "other" attribute
     */
    boolean isSetOther();
    
    /**
     * Sets the "other" attribute
     */
    void setOther(java.math.BigInteger other);
    
    /**
     * Sets (as xml) the "other" attribute
     */
    void xsetOther(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber other);
    
    /**
     * Unsets the "other" attribute
     */
    void unsetOther();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

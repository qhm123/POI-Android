/*
 * XML Type:  CT_Height
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Height(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTHeight extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTHeight.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctheighta2e1type");
    
    /**
     * Gets the "val" attribute
     */
    java.math.BigInteger getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetVal();
    
    /**
     * True if has "val" attribute
     */
    boolean isSetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(java.math.BigInteger val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure val);
    
    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
    
    /**
     * Gets the "hRule" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule.Enum getHRule();
    
    /**
     * Gets (as xml) the "hRule" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule xgetHRule();
    
    /**
     * True if has "hRule" attribute
     */
    boolean isSetHRule();
    
    /**
     * Sets the "hRule" attribute
     */
    void setHRule(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule.Enum hRule);
    
    /**
     * Sets (as xml) the "hRule" attribute
     */
    void xsetHRule(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule hRule);
    
    /**
     * Unsets the "hRule" attribute
     */
    void unsetHRule();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

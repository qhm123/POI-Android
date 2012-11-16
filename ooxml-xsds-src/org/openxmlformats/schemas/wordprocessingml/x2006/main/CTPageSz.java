/*
 * XML Type:  CT_PageSz
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_PageSz(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPageSz extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPageSz.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpagesz2d12type");
    
    /**
     * Gets the "w" attribute
     */
    java.math.BigInteger getW();
    
    /**
     * Gets (as xml) the "w" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetW();
    
    /**
     * True if has "w" attribute
     */
    boolean isSetW();
    
    /**
     * Sets the "w" attribute
     */
    void setW(java.math.BigInteger w);
    
    /**
     * Sets (as xml) the "w" attribute
     */
    void xsetW(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure w);
    
    /**
     * Unsets the "w" attribute
     */
    void unsetW();
    
    /**
     * Gets the "h" attribute
     */
    java.math.BigInteger getH();
    
    /**
     * Gets (as xml) the "h" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetH();
    
    /**
     * True if has "h" attribute
     */
    boolean isSetH();
    
    /**
     * Sets the "h" attribute
     */
    void setH(java.math.BigInteger h);
    
    /**
     * Sets (as xml) the "h" attribute
     */
    void xsetH(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure h);
    
    /**
     * Unsets the "h" attribute
     */
    void unsetH();
    
    /**
     * Gets the "orient" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageOrientation.Enum getOrient();
    
    /**
     * Gets (as xml) the "orient" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageOrientation xgetOrient();
    
    /**
     * True if has "orient" attribute
     */
    boolean isSetOrient();
    
    /**
     * Sets the "orient" attribute
     */
    void setOrient(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageOrientation.Enum orient);
    
    /**
     * Sets (as xml) the "orient" attribute
     */
    void xsetOrient(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageOrientation orient);
    
    /**
     * Unsets the "orient" attribute
     */
    void unsetOrient();
    
    /**
     * Gets the "code" attribute
     */
    java.math.BigInteger getCode();
    
    /**
     * Gets (as xml) the "code" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCode();
    
    /**
     * True if has "code" attribute
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" attribute
     */
    void setCode(java.math.BigInteger code);
    
    /**
     * Sets (as xml) the "code" attribute
     */
    void xsetCode(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber code);
    
    /**
     * Unsets the "code" attribute
     */
    void unsetCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

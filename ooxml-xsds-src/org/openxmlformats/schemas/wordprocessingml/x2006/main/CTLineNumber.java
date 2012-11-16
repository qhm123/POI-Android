/*
 * XML Type:  CT_LineNumber
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_LineNumber(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTLineNumber extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTLineNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctlinenumber99ebtype");
    
    /**
     * Gets the "countBy" attribute
     */
    java.math.BigInteger getCountBy();
    
    /**
     * Gets (as xml) the "countBy" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCountBy();
    
    /**
     * True if has "countBy" attribute
     */
    boolean isSetCountBy();
    
    /**
     * Sets the "countBy" attribute
     */
    void setCountBy(java.math.BigInteger countBy);
    
    /**
     * Sets (as xml) the "countBy" attribute
     */
    void xsetCountBy(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber countBy);
    
    /**
     * Unsets the "countBy" attribute
     */
    void unsetCountBy();
    
    /**
     * Gets the "start" attribute
     */
    java.math.BigInteger getStart();
    
    /**
     * Gets (as xml) the "start" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetStart();
    
    /**
     * True if has "start" attribute
     */
    boolean isSetStart();
    
    /**
     * Sets the "start" attribute
     */
    void setStart(java.math.BigInteger start);
    
    /**
     * Sets (as xml) the "start" attribute
     */
    void xsetStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber start);
    
    /**
     * Unsets the "start" attribute
     */
    void unsetStart();
    
    /**
     * Gets the "distance" attribute
     */
    java.math.BigInteger getDistance();
    
    /**
     * Gets (as xml) the "distance" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetDistance();
    
    /**
     * True if has "distance" attribute
     */
    boolean isSetDistance();
    
    /**
     * Sets the "distance" attribute
     */
    void setDistance(java.math.BigInteger distance);
    
    /**
     * Sets (as xml) the "distance" attribute
     */
    void xsetDistance(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure distance);
    
    /**
     * Unsets the "distance" attribute
     */
    void unsetDistance();
    
    /**
     * Gets the "restart" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart.Enum getRestart();
    
    /**
     * Gets (as xml) the "restart" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart xgetRestart();
    
    /**
     * True if has "restart" attribute
     */
    boolean isSetRestart();
    
    /**
     * Sets the "restart" attribute
     */
    void setRestart(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart.Enum restart);
    
    /**
     * Sets (as xml) the "restart" attribute
     */
    void xsetRestart(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart restart);
    
    /**
     * Unsets the "restart" attribute
     */
    void unsetRestart();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

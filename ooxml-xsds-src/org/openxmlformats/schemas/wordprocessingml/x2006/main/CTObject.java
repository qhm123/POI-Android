/*
 * XML Type:  CT_Object
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Object(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTObject extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPictureBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctobject47c9type");
    
    /**
     * Gets the "control" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl getControl();
    
    /**
     * True if has "control" element
     */
    boolean isSetControl();
    
    /**
     * Sets the "control" element
     */
    void setControl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl control);
    
    /**
     * Appends and returns a new empty "control" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl addNewControl();
    
    /**
     * Unsets the "control" element
     */
    void unsetControl();
    
    /**
     * Gets the "dxaOrig" attribute
     */
    java.math.BigInteger getDxaOrig();
    
    /**
     * Gets (as xml) the "dxaOrig" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetDxaOrig();
    
    /**
     * True if has "dxaOrig" attribute
     */
    boolean isSetDxaOrig();
    
    /**
     * Sets the "dxaOrig" attribute
     */
    void setDxaOrig(java.math.BigInteger dxaOrig);
    
    /**
     * Sets (as xml) the "dxaOrig" attribute
     */
    void xsetDxaOrig(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure dxaOrig);
    
    /**
     * Unsets the "dxaOrig" attribute
     */
    void unsetDxaOrig();
    
    /**
     * Gets the "dyaOrig" attribute
     */
    java.math.BigInteger getDyaOrig();
    
    /**
     * Gets (as xml) the "dyaOrig" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetDyaOrig();
    
    /**
     * True if has "dyaOrig" attribute
     */
    boolean isSetDyaOrig();
    
    /**
     * Sets the "dyaOrig" attribute
     */
    void setDyaOrig(java.math.BigInteger dyaOrig);
    
    /**
     * Sets (as xml) the "dyaOrig" attribute
     */
    void xsetDyaOrig(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure dyaOrig);
    
    /**
     * Unsets the "dyaOrig" attribute
     */
    void unsetDyaOrig();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

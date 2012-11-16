/*
 * XML Type:  CT_DocPartName
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocPartName(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocPartName extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocPartName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocpartnameb35ctype");
    
    /**
     * Gets the "val" attribute
     */
    java.lang.String getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(java.lang.String val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString val);
    
    /**
     * Gets the "decorated" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDecorated();
    
    /**
     * Gets (as xml) the "decorated" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDecorated();
    
    /**
     * True if has "decorated" attribute
     */
    boolean isSetDecorated();
    
    /**
     * Sets the "decorated" attribute
     */
    void setDecorated(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum decorated);
    
    /**
     * Sets (as xml) the "decorated" attribute
     */
    void xsetDecorated(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff decorated);
    
    /**
     * Unsets the "decorated" attribute
     */
    void unsetDecorated();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_FtnEdnRef
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_FtnEdnRef(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFtnEdnRef extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFtnEdnRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctftnednref89eetype");
    
    /**
     * Gets the "customMarkFollows" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getCustomMarkFollows();
    
    /**
     * Gets (as xml) the "customMarkFollows" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetCustomMarkFollows();
    
    /**
     * True if has "customMarkFollows" attribute
     */
    boolean isSetCustomMarkFollows();
    
    /**
     * Sets the "customMarkFollows" attribute
     */
    void setCustomMarkFollows(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum customMarkFollows);
    
    /**
     * Sets (as xml) the "customMarkFollows" attribute
     */
    void xsetCustomMarkFollows(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff customMarkFollows);
    
    /**
     * Unsets the "customMarkFollows" attribute
     */
    void unsetCustomMarkFollows();
    
    /**
     * Gets the "id" attribute
     */
    java.math.BigInteger getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.math.BigInteger id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

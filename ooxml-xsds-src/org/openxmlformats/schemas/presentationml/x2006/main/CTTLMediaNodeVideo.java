/*
 * XML Type:  CT_TLMediaNodeVideo
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLMediaNodeVideo(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLMediaNodeVideo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLMediaNodeVideo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlmedianodevideoe3f8type");
    
    /**
     * Gets the "cMediaNode" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData getCMediaNode();
    
    /**
     * Sets the "cMediaNode" element
     */
    void setCMediaNode(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData cMediaNode);
    
    /**
     * Appends and returns a new empty "cMediaNode" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData addNewCMediaNode();
    
    /**
     * Gets the "fullScrn" attribute
     */
    boolean getFullScrn();
    
    /**
     * Gets (as xml) the "fullScrn" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFullScrn();
    
    /**
     * True if has "fullScrn" attribute
     */
    boolean isSetFullScrn();
    
    /**
     * Sets the "fullScrn" attribute
     */
    void setFullScrn(boolean fullScrn);
    
    /**
     * Sets (as xml) the "fullScrn" attribute
     */
    void xsetFullScrn(org.apache.xmlbeans.XmlBoolean fullScrn);
    
    /**
     * Unsets the "fullScrn" attribute
     */
    void unsetFullScrn();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

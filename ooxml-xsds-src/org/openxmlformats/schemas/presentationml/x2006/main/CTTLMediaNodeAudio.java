/*
 * XML Type:  CT_TLMediaNodeAudio
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLMediaNodeAudio(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLMediaNodeAudio extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLMediaNodeAudio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlmedianodeaudio47bdtype");
    
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
     * Gets the "isNarration" attribute
     */
    boolean getIsNarration();
    
    /**
     * Gets (as xml) the "isNarration" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsNarration();
    
    /**
     * True if has "isNarration" attribute
     */
    boolean isSetIsNarration();
    
    /**
     * Sets the "isNarration" attribute
     */
    void setIsNarration(boolean isNarration);
    
    /**
     * Sets (as xml) the "isNarration" attribute
     */
    void xsetIsNarration(org.apache.xmlbeans.XmlBoolean isNarration);
    
    /**
     * Unsets the "isNarration" attribute
     */
    void unsetIsNarration();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

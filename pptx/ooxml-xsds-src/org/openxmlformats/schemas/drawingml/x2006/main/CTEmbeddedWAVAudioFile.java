/*
 * XML Type:  CT_EmbeddedWAVAudioFile
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_EmbeddedWAVAudioFile(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTEmbeddedWAVAudioFile extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTEmbeddedWAVAudioFile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctembeddedwavaudiofile19abtype");
    
    /**
     * Gets the "embed" attribute
     */
    java.lang.String getEmbed();
    
    /**
     * Gets (as xml) the "embed" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetEmbed();
    
    /**
     * Sets the "embed" attribute
     */
    void setEmbed(java.lang.String embed);
    
    /**
     * Sets (as xml) the "embed" attribute
     */
    void xsetEmbed(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId embed);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "builtIn" attribute
     */
    boolean getBuiltIn();
    
    /**
     * Gets (as xml) the "builtIn" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBuiltIn();
    
    /**
     * True if has "builtIn" attribute
     */
    boolean isSetBuiltIn();
    
    /**
     * Sets the "builtIn" attribute
     */
    void setBuiltIn(boolean builtIn);
    
    /**
     * Sets (as xml) the "builtIn" attribute
     */
    void xsetBuiltIn(org.apache.xmlbeans.XmlBoolean builtIn);
    
    /**
     * Unsets the "builtIn" attribute
     */
    void unsetBuiltIn();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

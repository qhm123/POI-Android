/*
 * XML Type:  CT_AltChunk
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAltChunk
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_AltChunk(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTAltChunk extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAltChunk.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctaltchunk5c24type");
    
    /**
     * Gets the "altChunkPr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAltChunkPr getAltChunkPr();
    
    /**
     * True if has "altChunkPr" element
     */
    boolean isSetAltChunkPr();
    
    /**
     * Sets the "altChunkPr" element
     */
    void setAltChunkPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAltChunkPr altChunkPr);
    
    /**
     * Appends and returns a new empty "altChunkPr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAltChunkPr addNewAltChunkPr();
    
    /**
     * Unsets the "altChunkPr" element
     */
    void unsetAltChunkPr();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

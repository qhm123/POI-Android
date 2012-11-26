/*
 * XML Type:  CT_EmbeddedFontList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_EmbeddedFontList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTEmbeddedFontList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTEmbeddedFontList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctembeddedfontlist240etype");
    
    /**
     * Gets a List of "embeddedFont" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry> getEmbeddedFontList();
    
    /**
     * Gets array of all "embeddedFont" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry[] getEmbeddedFontArray();
    
    /**
     * Gets ith "embeddedFont" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry getEmbeddedFontArray(int i);
    
    /**
     * Returns number of "embeddedFont" element
     */
    int sizeOfEmbeddedFontArray();
    
    /**
     * Sets array of all "embeddedFont" element
     */
    void setEmbeddedFontArray(org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry[] embeddedFontArray);
    
    /**
     * Sets ith "embeddedFont" element
     */
    void setEmbeddedFontArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry embeddedFont);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "embeddedFont" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry insertNewEmbeddedFont(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "embeddedFont" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry addNewEmbeddedFont();
    
    /**
     * Removes the ith "embeddedFont" element
     */
    void removeEmbeddedFont(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

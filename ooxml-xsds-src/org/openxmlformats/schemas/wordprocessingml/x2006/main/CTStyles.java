/*
 * XML Type:  CT_Styles
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Styles(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTStyles extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTStyles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctstyles8506type");
    
    /**
     * Gets the "docDefaults" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults getDocDefaults();
    
    /**
     * True if has "docDefaults" element
     */
    boolean isSetDocDefaults();
    
    /**
     * Sets the "docDefaults" element
     */
    void setDocDefaults(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults docDefaults);
    
    /**
     * Appends and returns a new empty "docDefaults" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults addNewDocDefaults();
    
    /**
     * Unsets the "docDefaults" element
     */
    void unsetDocDefaults();
    
    /**
     * Gets the "latentStyles" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles getLatentStyles();
    
    /**
     * True if has "latentStyles" element
     */
    boolean isSetLatentStyles();
    
    /**
     * Sets the "latentStyles" element
     */
    void setLatentStyles(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles latentStyles);
    
    /**
     * Appends and returns a new empty "latentStyles" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles addNewLatentStyles();
    
    /**
     * Unsets the "latentStyles" element
     */
    void unsetLatentStyles();
    
    /**
     * Gets a List of "style" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle> getStyleList();
    
    /**
     * Gets array of all "style" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle[] getStyleArray();
    
    /**
     * Gets ith "style" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle getStyleArray(int i);
    
    /**
     * Returns number of "style" element
     */
    int sizeOfStyleArray();
    
    /**
     * Sets array of all "style" element
     */
    void setStyleArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle[] styleArray);
    
    /**
     * Sets ith "style" element
     */
    void setStyleArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle style);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "style" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle insertNewStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "style" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle addNewStyle();
    
    /**
     * Removes the ith "style" element
     */
    void removeStyle(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

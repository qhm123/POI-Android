/*
 * XML Type:  CT_Captions
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Captions(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCaptions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCaptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcaptions9fbbtype");
    
    /**
     * Gets a List of "caption" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption> getCaptionList();
    
    /**
     * Gets array of all "caption" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption[] getCaptionArray();
    
    /**
     * Gets ith "caption" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption getCaptionArray(int i);
    
    /**
     * Returns number of "caption" element
     */
    int sizeOfCaptionArray();
    
    /**
     * Sets array of all "caption" element
     */
    void setCaptionArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption[] captionArray);
    
    /**
     * Sets ith "caption" element
     */
    void setCaptionArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption caption);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "caption" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption insertNewCaption(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "caption" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption addNewCaption();
    
    /**
     * Removes the ith "caption" element
     */
    void removeCaption(int i);
    
    /**
     * Gets the "autoCaptions" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions getAutoCaptions();
    
    /**
     * True if has "autoCaptions" element
     */
    boolean isSetAutoCaptions();
    
    /**
     * Sets the "autoCaptions" element
     */
    void setAutoCaptions(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions autoCaptions);
    
    /**
     * Appends and returns a new empty "autoCaptions" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions addNewAutoCaptions();
    
    /**
     * Unsets the "autoCaptions" element
     */
    void unsetAutoCaptions();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

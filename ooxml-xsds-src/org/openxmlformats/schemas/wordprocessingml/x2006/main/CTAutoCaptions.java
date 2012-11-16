/*
 * XML Type:  CT_AutoCaptions
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_AutoCaptions(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTAutoCaptions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAutoCaptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctautocaptions89cctype");
    
    /**
     * Gets a List of "autoCaption" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption> getAutoCaptionList();
    
    /**
     * Gets array of all "autoCaption" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption[] getAutoCaptionArray();
    
    /**
     * Gets ith "autoCaption" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption getAutoCaptionArray(int i);
    
    /**
     * Returns number of "autoCaption" element
     */
    int sizeOfAutoCaptionArray();
    
    /**
     * Sets array of all "autoCaption" element
     */
    void setAutoCaptionArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption[] autoCaptionArray);
    
    /**
     * Sets ith "autoCaption" element
     */
    void setAutoCaptionArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption autoCaption);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "autoCaption" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption insertNewAutoCaption(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "autoCaption" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaption addNewAutoCaption();
    
    /**
     * Removes the ith "autoCaption" element
     */
    void removeAutoCaption(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_FFTextInput
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_FFTextInput(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFFTextInput extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFFTextInput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfftextinput3155type");
    
    /**
     * Gets the "type" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType getType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType addNewType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "default" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getDefault();
    
    /**
     * True if has "default" element
     */
    boolean isSetDefault();
    
    /**
     * Sets the "default" element
     */
    void setDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString xdefault);
    
    /**
     * Appends and returns a new empty "default" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewDefault();
    
    /**
     * Unsets the "default" element
     */
    void unsetDefault();
    
    /**
     * Gets the "maxLength" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getMaxLength();
    
    /**
     * True if has "maxLength" element
     */
    boolean isSetMaxLength();
    
    /**
     * Sets the "maxLength" element
     */
    void setMaxLength(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber maxLength);
    
    /**
     * Appends and returns a new empty "maxLength" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewMaxLength();
    
    /**
     * Unsets the "maxLength" element
     */
    void unsetMaxLength();
    
    /**
     * Gets the "format" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getFormat();
    
    /**
     * True if has "format" element
     */
    boolean isSetFormat();
    
    /**
     * Sets the "format" element
     */
    void setFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString format);
    
    /**
     * Appends and returns a new empty "format" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewFormat();
    
    /**
     * Unsets the "format" element
     */
    void unsetFormat();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

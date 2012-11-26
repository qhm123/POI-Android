/*
 * XML Type:  CT_StretchInfoProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_StretchInfoProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTStretchInfoProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTStretchInfoProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctstretchinfopropertiesde57type");
    
    /**
     * Gets the "fillRect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect getFillRect();
    
    /**
     * True if has "fillRect" element
     */
    boolean isSetFillRect();
    
    /**
     * Sets the "fillRect" element
     */
    void setFillRect(org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect fillRect);
    
    /**
     * Appends and returns a new empty "fillRect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect addNewFillRect();
    
    /**
     * Unsets the "fillRect" element
     */
    void unsetFillRect();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

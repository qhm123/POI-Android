/*
 * XML Type:  CT_CommonViewProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_CommonViewProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCommonViewProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCommonViewProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcommonviewproperties9cc2type");
    
    /**
     * Gets the "scale" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D getScale();
    
    /**
     * Sets the "scale" element
     */
    void setScale(org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D scale);
    
    /**
     * Appends and returns a new empty "scale" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D addNewScale();
    
    /**
     * Gets the "origin" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getOrigin();
    
    /**
     * Sets the "origin" element
     */
    void setOrigin(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D origin);
    
    /**
     * Appends and returns a new empty "origin" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewOrigin();
    
    /**
     * Gets the "varScale" attribute
     */
    boolean getVarScale();
    
    /**
     * Gets (as xml) the "varScale" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetVarScale();
    
    /**
     * True if has "varScale" attribute
     */
    boolean isSetVarScale();
    
    /**
     * Sets the "varScale" attribute
     */
    void setVarScale(boolean varScale);
    
    /**
     * Sets (as xml) the "varScale" attribute
     */
    void xsetVarScale(org.apache.xmlbeans.XmlBoolean varScale);
    
    /**
     * Unsets the "varScale" attribute
     */
    void unsetVarScale();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

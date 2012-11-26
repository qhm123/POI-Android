/*
 * XML Type:  CT_LinearShadeProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_LinearShadeProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTLinearShadeProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTLinearShadeProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctlinearshadeproperties7f0ctype");
    
    /**
     * Gets the "ang" attribute
     */
    int getAng();
    
    /**
     * Gets (as xml) the "ang" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetAng();
    
    /**
     * True if has "ang" attribute
     */
    boolean isSetAng();
    
    /**
     * Sets the "ang" attribute
     */
    void setAng(int ang);
    
    /**
     * Sets (as xml) the "ang" attribute
     */
    void xsetAng(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle ang);
    
    /**
     * Unsets the "ang" attribute
     */
    void unsetAng();
    
    /**
     * Gets the "scaled" attribute
     */
    boolean getScaled();
    
    /**
     * Gets (as xml) the "scaled" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetScaled();
    
    /**
     * True if has "scaled" attribute
     */
    boolean isSetScaled();
    
    /**
     * Sets the "scaled" attribute
     */
    void setScaled(boolean scaled);
    
    /**
     * Sets (as xml) the "scaled" attribute
     */
    void xsetScaled(org.apache.xmlbeans.XmlBoolean scaled);
    
    /**
     * Unsets the "scaled" attribute
     */
    void unsetScaled();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

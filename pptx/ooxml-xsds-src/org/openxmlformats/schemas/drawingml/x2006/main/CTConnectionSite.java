/*
 * XML Type:  CT_ConnectionSite
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_ConnectionSite(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTConnectionSite extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTConnectionSite.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctconnectionsite6660type");
    
    /**
     * Gets the "pos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D getPos();
    
    /**
     * Sets the "pos" element
     */
    void setPos(org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D pos);
    
    /**
     * Appends and returns a new empty "pos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D addNewPos();
    
    /**
     * Gets the "ang" attribute
     */
    java.lang.Object getAng();
    
    /**
     * Gets (as xml) the "ang" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle xgetAng();
    
    /**
     * Sets the "ang" attribute
     */
    void setAng(java.lang.Object ang);
    
    /**
     * Sets (as xml) the "ang" attribute
     */
    void xsetAng(org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle ang);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

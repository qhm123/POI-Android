/*
 * XML Type:  CT_Path2DMoveTo
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Path2DMoveTo(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPath2DMoveTo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPath2DMoveTo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpath2dmovetoa01etype");
    
    /**
     * Gets the "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D getPt();
    
    /**
     * Sets the "pt" element
     */
    void setPt(org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D pt);
    
    /**
     * Appends and returns a new empty "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D addNewPt();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

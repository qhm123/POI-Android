/*
 * An XML document type.
 * Localname: userShapes
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.UserShapesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * A document containing one userShapes(@http://schemas.openxmlformats.org/drawingml/2006/chart) element.
 *
 * This is a complex type.
 */
public interface UserShapesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserShapesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("usershapesd66bdoctype");
    
    /**
     * Gets the "userShapes" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing getUserShapes();
    
    /**
     * Sets the "userShapes" element
     */
    void setUserShapes(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing userShapes);
    
    /**
     * Appends and returns a new empty "userShapes" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing addNewUserShapes();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

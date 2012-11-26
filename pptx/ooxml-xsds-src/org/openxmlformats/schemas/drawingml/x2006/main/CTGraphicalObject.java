/*
 * XML Type:  CT_GraphicalObject
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_GraphicalObject(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGraphicalObject extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGraphicalObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgraphicalobject1ce3type");
    
    /**
     * Gets the "graphicData" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData getGraphicData();
    
    /**
     * Sets the "graphicData" element
     */
    void setGraphicData(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData graphicData);
    
    /**
     * Appends and returns a new empty "graphicData" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData addNewGraphicData();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

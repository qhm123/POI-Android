/*
 * An XML document type.
 * Localname: dataModel
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.DataModelDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * A document containing one dataModel(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public interface DataModelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataModelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("datamodelf6b0doctype");
    
    /**
     * Gets the "dataModel" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel getDataModel();
    
    /**
     * Sets the "dataModel" element
     */
    void setDataModel(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel dataModel);
    
    /**
     * Appends and returns a new empty "dataModel" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel addNewDataModel();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML document type.
 * Localname: dataModel
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.DataModelDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one dataModel(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class DataModelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.DataModelDocument
{
    
    public DataModelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAMODEL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "dataModel");
    
    
    /**
     * Gets the "dataModel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel getDataModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel)get_store().find_element_user(DATAMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataModel" element
     */
    public void setDataModel(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel dataModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel)get_store().find_element_user(DATAMODEL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel)get_store().add_element_user(DATAMODEL$0);
            }
            target.set(dataModel);
        }
    }
    
    /**
     * Appends and returns a new empty "dataModel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel addNewDataModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel)get_store().add_element_user(DATAMODEL$0);
            return target;
        }
    }
}

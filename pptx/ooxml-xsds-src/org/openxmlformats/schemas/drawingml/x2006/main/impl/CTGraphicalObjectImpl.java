/*
 * XML Type:  CT_GraphicalObject
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GraphicalObject(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGraphicalObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject
{
    
    public CTGraphicalObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRAPHICDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphicData");
    
    
    /**
     * Gets the "graphicData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData getGraphicData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData)get_store().find_element_user(GRAPHICDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "graphicData" element
     */
    public void setGraphicData(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData graphicData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData)get_store().find_element_user(GRAPHICDATA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData)get_store().add_element_user(GRAPHICDATA$0);
            }
            target.set(graphicData);
        }
    }
    
    /**
     * Appends and returns a new empty "graphicData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData addNewGraphicData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData)get_store().add_element_user(GRAPHICDATA$0);
            return target;
        }
    }
}

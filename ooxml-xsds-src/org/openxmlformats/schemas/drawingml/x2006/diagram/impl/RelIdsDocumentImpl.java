/*
 * An XML document type.
 * Localname: relIds
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.RelIdsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one relIds(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class RelIdsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.RelIdsDocument
{
    
    public RelIdsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELIDS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "relIds");
    
    
    /**
     * Gets the "relIds" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds getRelIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds)get_store().find_element_user(RELIDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relIds" element
     */
    public void setRelIds(org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds relIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds)get_store().find_element_user(RELIDS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds)get_store().add_element_user(RELIDS$0);
            }
            target.set(relIds);
        }
    }
    
    /**
     * Appends and returns a new empty "relIds" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds addNewRelIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTRelIds)get_store().add_element_user(RELIDS$0);
            return target;
        }
    }
}

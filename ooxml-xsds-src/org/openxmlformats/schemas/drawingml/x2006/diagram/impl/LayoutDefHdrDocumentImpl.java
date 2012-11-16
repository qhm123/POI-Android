/*
 * An XML document type.
 * Localname: layoutDefHdr
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.LayoutDefHdrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one layoutDefHdr(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class LayoutDefHdrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.LayoutDefHdrDocument
{
    
    public LayoutDefHdrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYOUTDEFHDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "layoutDefHdr");
    
    
    /**
     * Gets the "layoutDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader getLayoutDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader)get_store().find_element_user(LAYOUTDEFHDR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "layoutDefHdr" element
     */
    public void setLayoutDefHdr(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader layoutDefHdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader)get_store().find_element_user(LAYOUTDEFHDR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader)get_store().add_element_user(LAYOUTDEFHDR$0);
            }
            target.set(layoutDefHdr);
        }
    }
    
    /**
     * Appends and returns a new empty "layoutDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader addNewLayoutDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader)get_store().add_element_user(LAYOUTDEFHDR$0);
            return target;
        }
    }
}

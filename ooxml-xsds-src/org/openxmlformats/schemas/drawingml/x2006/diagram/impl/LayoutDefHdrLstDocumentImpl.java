/*
 * An XML document type.
 * Localname: layoutDefHdrLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.LayoutDefHdrLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one layoutDefHdrLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class LayoutDefHdrLstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.LayoutDefHdrLstDocument
{
    
    public LayoutDefHdrLstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYOUTDEFHDRLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "layoutDefHdrLst");
    
    
    /**
     * Gets the "layoutDefHdrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst getLayoutDefHdrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst)get_store().find_element_user(LAYOUTDEFHDRLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "layoutDefHdrLst" element
     */
    public void setLayoutDefHdrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst layoutDefHdrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst)get_store().find_element_user(LAYOUTDEFHDRLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst)get_store().add_element_user(LAYOUTDEFHDRLST$0);
            }
            target.set(layoutDefHdrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "layoutDefHdrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst addNewLayoutDefHdrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst)get_store().add_element_user(LAYOUTDEFHDRLST$0);
            return target;
        }
    }
}

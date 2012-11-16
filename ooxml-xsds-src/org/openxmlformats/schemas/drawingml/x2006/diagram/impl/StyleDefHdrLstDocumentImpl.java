/*
 * An XML document type.
 * Localname: styleDefHdrLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.StyleDefHdrLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one styleDefHdrLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class StyleDefHdrLstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.StyleDefHdrLstDocument
{
    
    public StyleDefHdrLstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLEDEFHDRLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "styleDefHdrLst");
    
    
    /**
     * Gets the "styleDefHdrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst getStyleDefHdrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst)get_store().find_element_user(STYLEDEFHDRLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styleDefHdrLst" element
     */
    public void setStyleDefHdrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst styleDefHdrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst)get_store().find_element_user(STYLEDEFHDRLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst)get_store().add_element_user(STYLEDEFHDRLST$0);
            }
            target.set(styleDefHdrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "styleDefHdrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst addNewStyleDefHdrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst)get_store().add_element_user(STYLEDEFHDRLST$0);
            return target;
        }
    }
}

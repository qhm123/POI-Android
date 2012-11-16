/*
 * An XML document type.
 * Localname: colorsDefHdrLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefHdrLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one colorsDefHdrLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class ColorsDefHdrLstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefHdrLstDocument
{
    
    public ColorsDefHdrLstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLORSDEFHDRLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "colorsDefHdrLst");
    
    
    /**
     * Gets the "colorsDefHdrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst getColorsDefHdrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst)get_store().find_element_user(COLORSDEFHDRLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "colorsDefHdrLst" element
     */
    public void setColorsDefHdrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst colorsDefHdrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst)get_store().find_element_user(COLORSDEFHDRLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst)get_store().add_element_user(COLORSDEFHDRLST$0);
            }
            target.set(colorsDefHdrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "colorsDefHdrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst addNewColorsDefHdrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst)get_store().add_element_user(COLORSDEFHDRLST$0);
            return target;
        }
    }
}

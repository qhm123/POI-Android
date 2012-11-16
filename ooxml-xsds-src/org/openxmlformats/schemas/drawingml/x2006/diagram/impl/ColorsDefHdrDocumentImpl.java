/*
 * An XML document type.
 * Localname: colorsDefHdr
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefHdrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one colorsDefHdr(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class ColorsDefHdrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefHdrDocument
{
    
    public ColorsDefHdrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLORSDEFHDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "colorsDefHdr");
    
    
    /**
     * Gets the "colorsDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader getColorsDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader)get_store().find_element_user(COLORSDEFHDR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "colorsDefHdr" element
     */
    public void setColorsDefHdr(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader colorsDefHdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader)get_store().find_element_user(COLORSDEFHDR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader)get_store().add_element_user(COLORSDEFHDR$0);
            }
            target.set(colorsDefHdr);
        }
    }
    
    /**
     * Appends and returns a new empty "colorsDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader addNewColorsDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader)get_store().add_element_user(COLORSDEFHDR$0);
            return target;
        }
    }
}

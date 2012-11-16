/*
 * An XML document type.
 * Localname: styleDefHdr
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.StyleDefHdrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * A document containing one styleDefHdr(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class StyleDefHdrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.StyleDefHdrDocument
{
    
    public StyleDefHdrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLEDEFHDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "styleDefHdr");
    
    
    /**
     * Gets the "styleDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader getStyleDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader)get_store().find_element_user(STYLEDEFHDR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styleDefHdr" element
     */
    public void setStyleDefHdr(org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader styleDefHdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader)get_store().find_element_user(STYLEDEFHDR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader)get_store().add_element_user(STYLEDEFHDR$0);
            }
            target.set(styleDefHdr);
        }
    }
    
    /**
     * Appends and returns a new empty "styleDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader addNewStyleDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader)get_store().add_element_user(STYLEDEFHDR$0);
            return target;
        }
    }
}

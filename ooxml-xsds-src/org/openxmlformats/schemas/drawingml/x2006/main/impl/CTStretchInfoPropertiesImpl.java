/*
 * XML Type:  CT_StretchInfoProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_StretchInfoProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTStretchInfoPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties
{
    
    public CTStretchInfoPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILLRECT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillRect");
    
    
    /**
     * Gets the "fillRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect getFillRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().find_element_user(FILLRECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fillRect" element
     */
    public boolean isSetFillRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILLRECT$0) != 0;
        }
    }
    
    /**
     * Sets the "fillRect" element
     */
    public void setFillRect(org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect fillRect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().find_element_user(FILLRECT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().add_element_user(FILLRECT$0);
            }
            target.set(fillRect);
        }
    }
    
    /**
     * Appends and returns a new empty "fillRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect addNewFillRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().add_element_user(FILLRECT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fillRect" element
     */
    public void unsetFillRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILLRECT$0, 0);
        }
    }
}

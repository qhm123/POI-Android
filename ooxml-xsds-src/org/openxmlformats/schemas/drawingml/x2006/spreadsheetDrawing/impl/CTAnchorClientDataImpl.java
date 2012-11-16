/*
 * XML Type:  CT_AnchorClientData
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;
/**
 * An XML CT_AnchorClientData(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public class CTAnchorClientDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData
{
    
    public CTAnchorClientDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOCKSWITHSHEET$0 = 
        new javax.xml.namespace.QName("", "fLocksWithSheet");
    private static final javax.xml.namespace.QName FPRINTSWITHSHEET$2 = 
        new javax.xml.namespace.QName("", "fPrintsWithSheet");
    
    
    /**
     * Gets the "fLocksWithSheet" attribute
     */
    public boolean getFLocksWithSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOCKSWITHSHEET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FLOCKSWITHSHEET$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fLocksWithSheet" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFLocksWithSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLOCKSWITHSHEET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FLOCKSWITHSHEET$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "fLocksWithSheet" attribute
     */
    public boolean isSetFLocksWithSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLOCKSWITHSHEET$0) != null;
        }
    }
    
    /**
     * Sets the "fLocksWithSheet" attribute
     */
    public void setFLocksWithSheet(boolean fLocksWithSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOCKSWITHSHEET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOCKSWITHSHEET$0);
            }
            target.setBooleanValue(fLocksWithSheet);
        }
    }
    
    /**
     * Sets (as xml) the "fLocksWithSheet" attribute
     */
    public void xsetFLocksWithSheet(org.apache.xmlbeans.XmlBoolean fLocksWithSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLOCKSWITHSHEET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FLOCKSWITHSHEET$0);
            }
            target.set(fLocksWithSheet);
        }
    }
    
    /**
     * Unsets the "fLocksWithSheet" attribute
     */
    public void unsetFLocksWithSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLOCKSWITHSHEET$0);
        }
    }
    
    /**
     * Gets the "fPrintsWithSheet" attribute
     */
    public boolean getFPrintsWithSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPRINTSWITHSHEET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FPRINTSWITHSHEET$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fPrintsWithSheet" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFPrintsWithSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FPRINTSWITHSHEET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FPRINTSWITHSHEET$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "fPrintsWithSheet" attribute
     */
    public boolean isSetFPrintsWithSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FPRINTSWITHSHEET$2) != null;
        }
    }
    
    /**
     * Sets the "fPrintsWithSheet" attribute
     */
    public void setFPrintsWithSheet(boolean fPrintsWithSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPRINTSWITHSHEET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FPRINTSWITHSHEET$2);
            }
            target.setBooleanValue(fPrintsWithSheet);
        }
    }
    
    /**
     * Sets (as xml) the "fPrintsWithSheet" attribute
     */
    public void xsetFPrintsWithSheet(org.apache.xmlbeans.XmlBoolean fPrintsWithSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FPRINTSWITHSHEET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FPRINTSWITHSHEET$2);
            }
            target.set(fPrintsWithSheet);
        }
    }
    
    /**
     * Unsets the "fPrintsWithSheet" attribute
     */
    public void unsetFPrintsWithSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FPRINTSWITHSHEET$2);
        }
    }
}

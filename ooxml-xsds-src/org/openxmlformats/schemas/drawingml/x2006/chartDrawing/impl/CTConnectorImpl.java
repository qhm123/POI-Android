/*
 * XML Type:  CT_Connector
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chartDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chartDrawing.impl;
/**
 * An XML CT_Connector(@http://schemas.openxmlformats.org/drawingml/2006/chartDrawing).
 *
 * This is a complex type.
 */
public class CTConnectorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector
{
    
    public CTConnectorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVCXNSPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "nvCxnSpPr");
    private static final javax.xml.namespace.QName SPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "spPr");
    private static final javax.xml.namespace.QName STYLE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "style");
    private static final javax.xml.namespace.QName MACRO$6 = 
        new javax.xml.namespace.QName("", "macro");
    private static final javax.xml.namespace.QName FPUBLISHED$8 = 
        new javax.xml.namespace.QName("", "fPublished");
    
    
    /**
     * Gets the "nvCxnSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual getNvCxnSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual)get_store().find_element_user(NVCXNSPPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nvCxnSpPr" element
     */
    public void setNvCxnSpPr(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual nvCxnSpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual)get_store().find_element_user(NVCXNSPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual)get_store().add_element_user(NVCXNSPPR$0);
            }
            target.set(nvCxnSpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvCxnSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual addNewNvCxnSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnectorNonVisual)get_store().add_element_user(NVCXNSPPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$2);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$2);
            return target;
        }
    }
    
    /**
     * Gets the "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(STYLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "style" element
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$4) != 0;
        }
    }
    
    /**
     * Sets the "style" element
     */
    public void setStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(STYLE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(STYLE$4);
            }
            target.set(style);
        }
    }
    
    /**
     * Appends and returns a new empty "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(STYLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "style" element
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$4, 0);
        }
    }
    
    /**
     * Gets the "macro" attribute
     */
    public java.lang.String getMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MACRO$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "macro" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MACRO$6);
            return target;
        }
    }
    
    /**
     * True if has "macro" attribute
     */
    public boolean isSetMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MACRO$6) != null;
        }
    }
    
    /**
     * Sets the "macro" attribute
     */
    public void setMacro(java.lang.String macro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MACRO$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MACRO$6);
            }
            target.setStringValue(macro);
        }
    }
    
    /**
     * Sets (as xml) the "macro" attribute
     */
    public void xsetMacro(org.apache.xmlbeans.XmlString macro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MACRO$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MACRO$6);
            }
            target.set(macro);
        }
    }
    
    /**
     * Unsets the "macro" attribute
     */
    public void unsetMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MACRO$6);
        }
    }
    
    /**
     * Gets the "fPublished" attribute
     */
    public boolean getFPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPUBLISHED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FPUBLISHED$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fPublished" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FPUBLISHED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FPUBLISHED$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "fPublished" attribute
     */
    public boolean isSetFPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FPUBLISHED$8) != null;
        }
    }
    
    /**
     * Sets the "fPublished" attribute
     */
    public void setFPublished(boolean fPublished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPUBLISHED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FPUBLISHED$8);
            }
            target.setBooleanValue(fPublished);
        }
    }
    
    /**
     * Sets (as xml) the "fPublished" attribute
     */
    public void xsetFPublished(org.apache.xmlbeans.XmlBoolean fPublished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FPUBLISHED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FPUBLISHED$8);
            }
            target.set(fPublished);
        }
    }
    
    /**
     * Unsets the "fPublished" attribute
     */
    public void unsetFPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FPUBLISHED$8);
        }
    }
}

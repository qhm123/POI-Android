/*
 * XML Type:  CT_GraphicFrame
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chartDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chartDrawing.impl;
/**
 * An XML CT_GraphicFrame(@http://schemas.openxmlformats.org/drawingml/2006/chartDrawing).
 *
 * This is a complex type.
 */
public class CTGraphicFrameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame
{
    
    public CTGraphicFrameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVGRAPHICFRAMEPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "nvGraphicFramePr");
    private static final javax.xml.namespace.QName XFRM$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "xfrm");
    private static final javax.xml.namespace.QName GRAPHIC$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphic");
    private static final javax.xml.namespace.QName MACRO$6 = 
        new javax.xml.namespace.QName("", "macro");
    private static final javax.xml.namespace.QName FPUBLISHED$8 = 
        new javax.xml.namespace.QName("", "fPublished");
    
    
    /**
     * Gets the "nvGraphicFramePr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual getNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual)get_store().find_element_user(NVGRAPHICFRAMEPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nvGraphicFramePr" element
     */
    public void setNvGraphicFramePr(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual nvGraphicFramePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual)get_store().find_element_user(NVGRAPHICFRAMEPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual)get_store().add_element_user(NVGRAPHICFRAMEPR$0);
            }
            target.set(nvGraphicFramePr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvGraphicFramePr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual addNewNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrameNonVisual)get_store().add_element_user(NVGRAPHICFRAMEPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "xfrm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D getXfrm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().find_element_user(XFRM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "xfrm" element
     */
    public void setXfrm(org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D xfrm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().find_element_user(XFRM$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().add_element_user(XFRM$2);
            }
            target.set(xfrm);
        }
    }
    
    /**
     * Appends and returns a new empty "xfrm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D addNewXfrm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().add_element_user(XFRM$2);
            return target;
        }
    }
    
    /**
     * Gets the "graphic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject getGraphic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().find_element_user(GRAPHIC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "graphic" element
     */
    public void setGraphic(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject graphic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().find_element_user(GRAPHIC$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().add_element_user(GRAPHIC$4);
            }
            target.set(graphic);
        }
    }
    
    /**
     * Appends and returns a new empty "graphic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject addNewGraphic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().add_element_user(GRAPHIC$4);
            return target;
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

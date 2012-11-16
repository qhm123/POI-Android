/*
 * XML Type:  CT_Inline
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * An XML CT_Inline(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public class CTInlineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline
{
    
    public CTInlineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "extent");
    private static final javax.xml.namespace.QName EFFECTEXTENT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "effectExtent");
    private static final javax.xml.namespace.QName DOCPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "docPr");
    private static final javax.xml.namespace.QName CNVGRAPHICFRAMEPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "cNvGraphicFramePr");
    private static final javax.xml.namespace.QName GRAPHIC$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphic");
    private static final javax.xml.namespace.QName DISTT$10 = 
        new javax.xml.namespace.QName("", "distT");
    private static final javax.xml.namespace.QName DISTB$12 = 
        new javax.xml.namespace.QName("", "distB");
    private static final javax.xml.namespace.QName DISTL$14 = 
        new javax.xml.namespace.QName("", "distL");
    private static final javax.xml.namespace.QName DISTR$16 = 
        new javax.xml.namespace.QName("", "distR");
    
    
    /**
     * Gets the "extent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(EXTENT$0);
            }
            target.set(extent);
        }
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(EXTENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "effectExtent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent getEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().find_element_user(EFFECTEXTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectExtent" element
     */
    public boolean isSetEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTEXTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "effectExtent" element
     */
    public void setEffectExtent(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent effectExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().find_element_user(EFFECTEXTENT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().add_element_user(EFFECTEXTENT$2);
            }
            target.set(effectExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "effectExtent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent addNewEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().add_element_user(EFFECTEXTENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "effectExtent" element
     */
    public void unsetEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTEXTENT$2, 0);
        }
    }
    
    /**
     * Gets the "docPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps getDocPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().find_element_user(DOCPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "docPr" element
     */
    public void setDocPr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps docPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().find_element_user(DOCPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().add_element_user(DOCPR$4);
            }
            target.set(docPr);
        }
    }
    
    /**
     * Appends and returns a new empty "docPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps addNewDocPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().add_element_user(DOCPR$4);
            return target;
        }
    }
    
    /**
     * Gets the "cNvGraphicFramePr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties getCNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties)get_store().find_element_user(CNVGRAPHICFRAMEPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cNvGraphicFramePr" element
     */
    public boolean isSetCNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CNVGRAPHICFRAMEPR$6) != 0;
        }
    }
    
    /**
     * Sets the "cNvGraphicFramePr" element
     */
    public void setCNvGraphicFramePr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties cNvGraphicFramePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties)get_store().find_element_user(CNVGRAPHICFRAMEPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties)get_store().add_element_user(CNVGRAPHICFRAMEPR$6);
            }
            target.set(cNvGraphicFramePr);
        }
    }
    
    /**
     * Appends and returns a new empty "cNvGraphicFramePr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties)get_store().add_element_user(CNVGRAPHICFRAMEPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "cNvGraphicFramePr" element
     */
    public void unsetCNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CNVGRAPHICFRAMEPR$6, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().find_element_user(GRAPHIC$8, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().find_element_user(GRAPHIC$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().add_element_user(GRAPHIC$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().add_element_user(GRAPHIC$8);
            return target;
        }
    }
    
    /**
     * Gets the "distT" attribute
     */
    public long getDistT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTT$10);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distT" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTT$10);
            return target;
        }
    }
    
    /**
     * True if has "distT" attribute
     */
    public boolean isSetDistT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTT$10) != null;
        }
    }
    
    /**
     * Sets the "distT" attribute
     */
    public void setDistT(long distT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTT$10);
            }
            target.setLongValue(distT);
        }
    }
    
    /**
     * Sets (as xml) the "distT" attribute
     */
    public void xsetDistT(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTT$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTT$10);
            }
            target.set(distT);
        }
    }
    
    /**
     * Unsets the "distT" attribute
     */
    public void unsetDistT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTT$10);
        }
    }
    
    /**
     * Gets the "distB" attribute
     */
    public long getDistB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTB$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distB" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTB$12);
            return target;
        }
    }
    
    /**
     * True if has "distB" attribute
     */
    public boolean isSetDistB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTB$12) != null;
        }
    }
    
    /**
     * Sets the "distB" attribute
     */
    public void setDistB(long distB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTB$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTB$12);
            }
            target.setLongValue(distB);
        }
    }
    
    /**
     * Sets (as xml) the "distB" attribute
     */
    public void xsetDistB(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTB$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTB$12);
            }
            target.set(distB);
        }
    }
    
    /**
     * Unsets the "distB" attribute
     */
    public void unsetDistB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTB$12);
        }
    }
    
    /**
     * Gets the "distL" attribute
     */
    public long getDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTL$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distL" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTL$14);
            return target;
        }
    }
    
    /**
     * True if has "distL" attribute
     */
    public boolean isSetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTL$14) != null;
        }
    }
    
    /**
     * Sets the "distL" attribute
     */
    public void setDistL(long distL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTL$14);
            }
            target.setLongValue(distL);
        }
    }
    
    /**
     * Sets (as xml) the "distL" attribute
     */
    public void xsetDistL(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTL$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTL$14);
            }
            target.set(distL);
        }
    }
    
    /**
     * Unsets the "distL" attribute
     */
    public void unsetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTL$14);
        }
    }
    
    /**
     * Gets the "distR" attribute
     */
    public long getDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTR$16);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distR" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTR$16);
            return target;
        }
    }
    
    /**
     * True if has "distR" attribute
     */
    public boolean isSetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTR$16) != null;
        }
    }
    
    /**
     * Sets the "distR" attribute
     */
    public void setDistR(long distR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTR$16);
            }
            target.setLongValue(distR);
        }
    }
    
    /**
     * Sets (as xml) the "distR" attribute
     */
    public void xsetDistR(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTR$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTR$16);
            }
            target.set(distR);
        }
    }
    
    /**
     * Unsets the "distR" attribute
     */
    public void unsetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTR$16);
        }
    }
}

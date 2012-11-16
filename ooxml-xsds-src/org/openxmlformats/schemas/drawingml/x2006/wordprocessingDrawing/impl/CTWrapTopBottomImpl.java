/*
 * XML Type:  CT_WrapTopBottom
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * An XML CT_WrapTopBottom(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public class CTWrapTopBottomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom
{
    
    public CTWrapTopBottomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EFFECTEXTENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "effectExtent");
    private static final javax.xml.namespace.QName DISTT$2 = 
        new javax.xml.namespace.QName("", "distT");
    private static final javax.xml.namespace.QName DISTB$4 = 
        new javax.xml.namespace.QName("", "distB");
    
    
    /**
     * Gets the "effectExtent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent getEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().find_element_user(EFFECTEXTENT$0, 0);
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
            return get_store().count_elements(EFFECTEXTENT$0) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().find_element_user(EFFECTEXTENT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().add_element_user(EFFECTEXTENT$0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().add_element_user(EFFECTEXTENT$0);
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
            get_store().remove_element(EFFECTEXTENT$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTT$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTT$2);
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
            return get_store().find_attribute_user(DISTT$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTT$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTT$2);
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
            get_store().remove_attribute(DISTT$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTB$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTB$4);
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
            return get_store().find_attribute_user(DISTB$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTB$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTB$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTB$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTB$4);
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
            get_store().remove_attribute(DISTB$4);
        }
    }
}

/*
 * XML Type:  CT_WrapSquare
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * An XML CT_WrapSquare(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public class CTWrapSquareImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare
{
    
    public CTWrapSquareImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EFFECTEXTENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "effectExtent");
    private static final javax.xml.namespace.QName WRAPTEXT$2 = 
        new javax.xml.namespace.QName("", "wrapText");
    private static final javax.xml.namespace.QName DISTT$4 = 
        new javax.xml.namespace.QName("", "distT");
    private static final javax.xml.namespace.QName DISTB$6 = 
        new javax.xml.namespace.QName("", "distB");
    private static final javax.xml.namespace.QName DISTL$8 = 
        new javax.xml.namespace.QName("", "distL");
    private static final javax.xml.namespace.QName DISTR$10 = 
        new javax.xml.namespace.QName("", "distR");
    
    
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
     * Gets the "wrapText" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText.Enum getWrapText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPTEXT$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "wrapText" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText xgetWrapText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText)get_store().find_attribute_user(WRAPTEXT$2);
            return target;
        }
    }
    
    /**
     * Sets the "wrapText" attribute
     */
    public void setWrapText(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText.Enum wrapText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPTEXT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAPTEXT$2);
            }
            target.setEnumValue(wrapText);
        }
    }
    
    /**
     * Sets (as xml) the "wrapText" attribute
     */
    public void xsetWrapText(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText wrapText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText)get_store().find_attribute_user(WRAPTEXT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText)get_store().add_attribute_user(WRAPTEXT$2);
            }
            target.set(wrapText);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTT$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTT$4);
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
            return get_store().find_attribute_user(DISTT$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTT$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTT$4);
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
            get_store().remove_attribute(DISTT$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTB$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTB$6);
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
            return get_store().find_attribute_user(DISTB$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTB$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTB$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTB$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTB$6);
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
            get_store().remove_attribute(DISTB$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTL$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTL$8);
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
            return get_store().find_attribute_user(DISTL$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTL$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTL$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTL$8);
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
            get_store().remove_attribute(DISTL$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTR$10);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTR$10);
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
            return get_store().find_attribute_user(DISTR$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTR$10);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTR$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTR$10);
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
            get_store().remove_attribute(DISTR$10);
        }
    }
}

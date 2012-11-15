/*
 * XML Type:  CT_GradientFillProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GradientFillProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGradientFillPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties
{
    
    public CTGradientFillPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GSLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gsLst");
    private static final javax.xml.namespace.QName LIN$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lin");
    private static final javax.xml.namespace.QName PATH$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "path");
    private static final javax.xml.namespace.QName TILERECT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tileRect");
    private static final javax.xml.namespace.QName FLIP$8 = 
        new javax.xml.namespace.QName("", "flip");
    private static final javax.xml.namespace.QName ROTWITHSHAPE$10 = 
        new javax.xml.namespace.QName("", "rotWithShape");
    
    
    /**
     * Gets the "gsLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList getGsLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList)get_store().find_element_user(GSLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gsLst" element
     */
    public boolean isSetGsLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GSLST$0) != 0;
        }
    }
    
    /**
     * Sets the "gsLst" element
     */
    public void setGsLst(org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList gsLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList)get_store().find_element_user(GSLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList)get_store().add_element_user(GSLST$0);
            }
            target.set(gsLst);
        }
    }
    
    /**
     * Appends and returns a new empty "gsLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList addNewGsLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList)get_store().add_element_user(GSLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "gsLst" element
     */
    public void unsetGsLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GSLST$0, 0);
        }
    }
    
    /**
     * Gets the "lin" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties getLin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties)get_store().find_element_user(LIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lin" element
     */
    public boolean isSetLin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIN$2) != 0;
        }
    }
    
    /**
     * Sets the "lin" element
     */
    public void setLin(org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties lin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties)get_store().find_element_user(LIN$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties)get_store().add_element_user(LIN$2);
            }
            target.set(lin);
        }
    }
    
    /**
     * Appends and returns a new empty "lin" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties addNewLin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties)get_store().add_element_user(LIN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lin" element
     */
    public void unsetLin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIN$2, 0);
        }
    }
    
    /**
     * Gets the "path" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "path" element
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATH$4) != 0;
        }
    }
    
    /**
     * Sets the "path" element
     */
    public void setPath(org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties)get_store().add_element_user(PATH$4);
            }
            target.set(path);
        }
    }
    
    /**
     * Appends and returns a new empty "path" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties addNewPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties)get_store().add_element_user(PATH$4);
            return target;
        }
    }
    
    /**
     * Unsets the "path" element
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATH$4, 0);
        }
    }
    
    /**
     * Gets the "tileRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect getTileRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().find_element_user(TILERECT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tileRect" element
     */
    public boolean isSetTileRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TILERECT$6) != 0;
        }
    }
    
    /**
     * Sets the "tileRect" element
     */
    public void setTileRect(org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect tileRect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().find_element_user(TILERECT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().add_element_user(TILERECT$6);
            }
            target.set(tileRect);
        }
    }
    
    /**
     * Appends and returns a new empty "tileRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect addNewTileRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().add_element_user(TILERECT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "tileRect" element
     */
    public void unsetTileRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TILERECT$6, 0);
        }
    }
    
    /**
     * Gets the "flip" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode.Enum getFlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIP$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "flip" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode xgetFlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode)get_store().find_attribute_user(FLIP$8);
            return target;
        }
    }
    
    /**
     * True if has "flip" attribute
     */
    public boolean isSetFlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLIP$8) != null;
        }
    }
    
    /**
     * Sets the "flip" attribute
     */
    public void setFlip(org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode.Enum flip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIP$8);
            }
            target.setEnumValue(flip);
        }
    }
    
    /**
     * Sets (as xml) the "flip" attribute
     */
    public void xsetFlip(org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode flip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode)get_store().find_attribute_user(FLIP$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode)get_store().add_attribute_user(FLIP$8);
            }
            target.set(flip);
        }
    }
    
    /**
     * Unsets the "flip" attribute
     */
    public void unsetFlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLIP$8);
        }
    }
    
    /**
     * Gets the "rotWithShape" attribute
     */
    public boolean getRotWithShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTWITHSHAPE$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rotWithShape" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRotWithShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROTWITHSHAPE$10);
            return target;
        }
    }
    
    /**
     * True if has "rotWithShape" attribute
     */
    public boolean isSetRotWithShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROTWITHSHAPE$10) != null;
        }
    }
    
    /**
     * Sets the "rotWithShape" attribute
     */
    public void setRotWithShape(boolean rotWithShape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTWITHSHAPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTWITHSHAPE$10);
            }
            target.setBooleanValue(rotWithShape);
        }
    }
    
    /**
     * Sets (as xml) the "rotWithShape" attribute
     */
    public void xsetRotWithShape(org.apache.xmlbeans.XmlBoolean rotWithShape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROTWITHSHAPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ROTWITHSHAPE$10);
            }
            target.set(rotWithShape);
        }
    }
    
    /**
     * Unsets the "rotWithShape" attribute
     */
    public void unsetRotWithShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROTWITHSHAPE$10);
        }
    }
}

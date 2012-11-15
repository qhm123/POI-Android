/*
 * XML Type:  CT_BlipFillProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_BlipFillProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBlipFillPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties
{
    
    public CTBlipFillPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLIP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blip");
    private static final javax.xml.namespace.QName SRCRECT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srcRect");
    private static final javax.xml.namespace.QName TILE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tile");
    private static final javax.xml.namespace.QName STRETCH$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "stretch");
    private static final javax.xml.namespace.QName DPI$8 = 
        new javax.xml.namespace.QName("", "dpi");
    private static final javax.xml.namespace.QName ROTWITHSHAPE$10 = 
        new javax.xml.namespace.QName("", "rotWithShape");
    
    
    /**
     * Gets the "blip" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlip getBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlip target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlip)get_store().find_element_user(BLIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "blip" element
     */
    public boolean isSetBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLIP$0) != 0;
        }
    }
    
    /**
     * Sets the "blip" element
     */
    public void setBlip(org.openxmlformats.schemas.drawingml.x2006.main.CTBlip blip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlip target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlip)get_store().find_element_user(BLIP$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlip)get_store().add_element_user(BLIP$0);
            }
            target.set(blip);
        }
    }
    
    /**
     * Appends and returns a new empty "blip" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlip addNewBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlip target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlip)get_store().add_element_user(BLIP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "blip" element
     */
    public void unsetBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLIP$0, 0);
        }
    }
    
    /**
     * Gets the "srcRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect getSrcRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().find_element_user(SRCRECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "srcRect" element
     */
    public boolean isSetSrcRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRCRECT$2) != 0;
        }
    }
    
    /**
     * Sets the "srcRect" element
     */
    public void setSrcRect(org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect srcRect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().find_element_user(SRCRECT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().add_element_user(SRCRECT$2);
            }
            target.set(srcRect);
        }
    }
    
    /**
     * Appends and returns a new empty "srcRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect addNewSrcRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().add_element_user(SRCRECT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "srcRect" element
     */
    public void unsetSrcRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRCRECT$2, 0);
        }
    }
    
    /**
     * Gets the "tile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties getTile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties)get_store().find_element_user(TILE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tile" element
     */
    public boolean isSetTile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TILE$4) != 0;
        }
    }
    
    /**
     * Sets the "tile" element
     */
    public void setTile(org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties tile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties)get_store().find_element_user(TILE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties)get_store().add_element_user(TILE$4);
            }
            target.set(tile);
        }
    }
    
    /**
     * Appends and returns a new empty "tile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties addNewTile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties)get_store().add_element_user(TILE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "tile" element
     */
    public void unsetTile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TILE$4, 0);
        }
    }
    
    /**
     * Gets the "stretch" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties getStretch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties)get_store().find_element_user(STRETCH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stretch" element
     */
    public boolean isSetStretch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRETCH$6) != 0;
        }
    }
    
    /**
     * Sets the "stretch" element
     */
    public void setStretch(org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties stretch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties)get_store().find_element_user(STRETCH$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties)get_store().add_element_user(STRETCH$6);
            }
            target.set(stretch);
        }
    }
    
    /**
     * Appends and returns a new empty "stretch" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties addNewStretch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties)get_store().add_element_user(STRETCH$6);
            return target;
        }
    }
    
    /**
     * Unsets the "stretch" element
     */
    public void unsetStretch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRETCH$6, 0);
        }
    }
    
    /**
     * Gets the "dpi" attribute
     */
    public long getDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DPI$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dpi" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DPI$8);
            return target;
        }
    }
    
    /**
     * True if has "dpi" attribute
     */
    public boolean isSetDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DPI$8) != null;
        }
    }
    
    /**
     * Sets the "dpi" attribute
     */
    public void setDpi(long dpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DPI$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DPI$8);
            }
            target.setLongValue(dpi);
        }
    }
    
    /**
     * Sets (as xml) the "dpi" attribute
     */
    public void xsetDpi(org.apache.xmlbeans.XmlUnsignedInt dpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DPI$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(DPI$8);
            }
            target.set(dpi);
        }
    }
    
    /**
     * Unsets the "dpi" attribute
     */
    public void unsetDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DPI$8);
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

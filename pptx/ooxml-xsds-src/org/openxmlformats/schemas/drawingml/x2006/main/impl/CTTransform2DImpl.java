/*
 * XML Type:  CT_Transform2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Transform2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTransform2DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D
{
    
    public CTTransform2DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "off");
    private static final javax.xml.namespace.QName EXT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ext");
    private static final javax.xml.namespace.QName ROT$4 = 
        new javax.xml.namespace.QName("", "rot");
    private static final javax.xml.namespace.QName FLIPH$6 = 
        new javax.xml.namespace.QName("", "flipH");
    private static final javax.xml.namespace.QName FLIPV$8 = 
        new javax.xml.namespace.QName("", "flipV");
    
    
    /**
     * Gets the "off" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(OFF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "off" element
     */
    public boolean isSetOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFF$0) != 0;
        }
    }
    
    /**
     * Sets the "off" element
     */
    public void setOff(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D off)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(OFF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(OFF$0);
            }
            target.set(off);
        }
    }
    
    /**
     * Appends and returns a new empty "off" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(OFF$0);
            return target;
        }
    }
    
    /**
     * Unsets the "off" element
     */
    public void unsetOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFF$0, 0);
        }
    }
    
    /**
     * Gets the "ext" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(EXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ext" element
     */
    public boolean isSetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXT$2) != 0;
        }
    }
    
    /**
     * Sets the "ext" element
     */
    public void setExt(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(EXT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(EXT$2);
            }
            target.set(ext);
        }
    }
    
    /**
     * Appends and returns a new empty "ext" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D addNewExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(EXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ext" element
     */
    public void unsetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXT$2, 0);
        }
    }
    
    /**
     * Gets the "rot" attribute
     */
    public int getRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROT$4);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "rot" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAngle xgetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().find_attribute_user(ROT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_default_attribute_value(ROT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "rot" attribute
     */
    public boolean isSetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROT$4) != null;
        }
    }
    
    /**
     * Sets the "rot" attribute
     */
    public void setRot(int rot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROT$4);
            }
            target.setIntValue(rot);
        }
    }
    
    /**
     * Sets (as xml) the "rot" attribute
     */
    public void xsetRot(org.openxmlformats.schemas.drawingml.x2006.main.STAngle rot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().find_attribute_user(ROT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().add_attribute_user(ROT$4);
            }
            target.set(rot);
        }
    }
    
    /**
     * Unsets the "rot" attribute
     */
    public void unsetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROT$4);
        }
    }
    
    /**
     * Gets the "flipH" attribute
     */
    public boolean getFlipH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIPH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FLIPH$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "flipH" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFlipH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLIPH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FLIPH$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "flipH" attribute
     */
    public boolean isSetFlipH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLIPH$6) != null;
        }
    }
    
    /**
     * Sets the "flipH" attribute
     */
    public void setFlipH(boolean flipH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIPH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIPH$6);
            }
            target.setBooleanValue(flipH);
        }
    }
    
    /**
     * Sets (as xml) the "flipH" attribute
     */
    public void xsetFlipH(org.apache.xmlbeans.XmlBoolean flipH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLIPH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FLIPH$6);
            }
            target.set(flipH);
        }
    }
    
    /**
     * Unsets the "flipH" attribute
     */
    public void unsetFlipH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLIPH$6);
        }
    }
    
    /**
     * Gets the "flipV" attribute
     */
    public boolean getFlipV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIPV$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FLIPV$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "flipV" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFlipV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLIPV$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FLIPV$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "flipV" attribute
     */
    public boolean isSetFlipV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLIPV$8) != null;
        }
    }
    
    /**
     * Sets the "flipV" attribute
     */
    public void setFlipV(boolean flipV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIPV$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIPV$8);
            }
            target.setBooleanValue(flipV);
        }
    }
    
    /**
     * Sets (as xml) the "flipV" attribute
     */
    public void xsetFlipV(org.apache.xmlbeans.XmlBoolean flipV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLIPV$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FLIPV$8);
            }
            target.set(flipV);
        }
    }
    
    /**
     * Unsets the "flipV" attribute
     */
    public void unsetFlipV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLIPV$8);
        }
    }
}

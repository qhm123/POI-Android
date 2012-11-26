/*
 * XML Type:  CT_Camera
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTCamera
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Camera(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTCameraImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTCamera
{
    
    public CTCameraImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "rot");
    private static final javax.xml.namespace.QName PRST$2 = 
        new javax.xml.namespace.QName("", "prst");
    private static final javax.xml.namespace.QName FOV$4 = 
        new javax.xml.namespace.QName("", "fov");
    private static final javax.xml.namespace.QName ZOOM$6 = 
        new javax.xml.namespace.QName("", "zoom");
    
    
    /**
     * Gets the "rot" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords getRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords)get_store().find_element_user(ROT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rot" element
     */
    public boolean isSetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROT$0) != 0;
        }
    }
    
    /**
     * Sets the "rot" element
     */
    public void setRot(org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords rot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords)get_store().find_element_user(ROT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords)get_store().add_element_user(ROT$0);
            }
            target.set(rot);
        }
    }
    
    /**
     * Appends and returns a new empty "rot" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords addNewRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords)get_store().add_element_user(ROT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rot" element
     */
    public void unsetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROT$0, 0);
        }
    }
    
    /**
     * Gets the "prst" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType.Enum getPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRST$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "prst" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType xgetPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType)get_store().find_attribute_user(PRST$2);
            return target;
        }
    }
    
    /**
     * Sets the "prst" attribute
     */
    public void setPrst(org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType.Enum prst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRST$2);
            }
            target.setEnumValue(prst);
        }
    }
    
    /**
     * Sets (as xml) the "prst" attribute
     */
    public void xsetPrst(org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType prst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType)get_store().find_attribute_user(PRST$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType)get_store().add_attribute_user(PRST$2);
            }
            target.set(prst);
        }
    }
    
    /**
     * Gets the "fov" attribute
     */
    public int getFov()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOV$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "fov" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle xgetFov()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle)get_store().find_attribute_user(FOV$4);
            return target;
        }
    }
    
    /**
     * True if has "fov" attribute
     */
    public boolean isSetFov()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOV$4) != null;
        }
    }
    
    /**
     * Sets the "fov" attribute
     */
    public void setFov(int fov)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOV$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOV$4);
            }
            target.setIntValue(fov);
        }
    }
    
    /**
     * Sets (as xml) the "fov" attribute
     */
    public void xsetFov(org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle fov)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle)get_store().find_attribute_user(FOV$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle)get_store().add_attribute_user(FOV$4);
            }
            target.set(fov);
        }
    }
    
    /**
     * Unsets the "fov" attribute
     */
    public void unsetFov()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOV$4);
        }
    }
    
    /**
     * Gets the "zoom" attribute
     */
    public int getZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZOOM$6);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoom" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage xgetZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().find_attribute_user(ZOOM$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_default_attribute_value(ZOOM$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "zoom" attribute
     */
    public boolean isSetZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZOOM$6) != null;
        }
    }
    
    /**
     * Sets the "zoom" attribute
     */
    public void setZoom(int zoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOM$6);
            }
            target.setIntValue(zoom);
        }
    }
    
    /**
     * Sets (as xml) the "zoom" attribute
     */
    public void xsetZoom(org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage zoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().find_attribute_user(ZOOM$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().add_attribute_user(ZOOM$6);
            }
            target.set(zoom);
        }
    }
    
    /**
     * Unsets the "zoom" attribute
     */
    public void unsetZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZOOM$6);
        }
    }
}

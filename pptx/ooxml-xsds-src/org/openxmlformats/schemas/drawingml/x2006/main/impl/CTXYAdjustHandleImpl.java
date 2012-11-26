/*
 * XML Type:  CT_XYAdjustHandle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_XYAdjustHandle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTXYAdjustHandleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle
{
    
    public CTXYAdjustHandleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pos");
    private static final javax.xml.namespace.QName GDREFX$2 = 
        new javax.xml.namespace.QName("", "gdRefX");
    private static final javax.xml.namespace.QName MINX$4 = 
        new javax.xml.namespace.QName("", "minX");
    private static final javax.xml.namespace.QName MAXX$6 = 
        new javax.xml.namespace.QName("", "maxX");
    private static final javax.xml.namespace.QName GDREFY$8 = 
        new javax.xml.namespace.QName("", "gdRefY");
    private static final javax.xml.namespace.QName MINY$10 = 
        new javax.xml.namespace.QName("", "minY");
    private static final javax.xml.namespace.QName MAXY$12 = 
        new javax.xml.namespace.QName("", "maxY");
    
    
    /**
     * Gets the "pos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().add_element_user(POS$0);
            }
            target.set(pos);
        }
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().add_element_user(POS$0);
            return target;
        }
    }
    
    /**
     * Gets the "gdRefX" attribute
     */
    public java.lang.String getGdRefX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GDREFX$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gdRefX" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName xgetGdRefX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(GDREFX$2);
            return target;
        }
    }
    
    /**
     * True if has "gdRefX" attribute
     */
    public boolean isSetGdRefX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GDREFX$2) != null;
        }
    }
    
    /**
     * Sets the "gdRefX" attribute
     */
    public void setGdRefX(java.lang.String gdRefX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GDREFX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GDREFX$2);
            }
            target.setStringValue(gdRefX);
        }
    }
    
    /**
     * Sets (as xml) the "gdRefX" attribute
     */
    public void xsetGdRefX(org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName gdRefX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(GDREFX$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().add_attribute_user(GDREFX$2);
            }
            target.set(gdRefX);
        }
    }
    
    /**
     * Unsets the "gdRefX" attribute
     */
    public void unsetGdRefX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GDREFX$2);
        }
    }
    
    /**
     * Gets the "minX" attribute
     */
    public java.lang.Object getMinX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINX$4);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "minX" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate xgetMinX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MINX$4);
            return target;
        }
    }
    
    /**
     * True if has "minX" attribute
     */
    public boolean isSetMinX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINX$4) != null;
        }
    }
    
    /**
     * Sets the "minX" attribute
     */
    public void setMinX(java.lang.Object minX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINX$4);
            }
            target.setObjectValue(minX);
        }
    }
    
    /**
     * Sets (as xml) the "minX" attribute
     */
    public void xsetMinX(org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate minX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MINX$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().add_attribute_user(MINX$4);
            }
            target.set(minX);
        }
    }
    
    /**
     * Unsets the "minX" attribute
     */
    public void unsetMinX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINX$4);
        }
    }
    
    /**
     * Gets the "maxX" attribute
     */
    public java.lang.Object getMaxX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXX$6);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxX" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate xgetMaxX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MAXX$6);
            return target;
        }
    }
    
    /**
     * True if has "maxX" attribute
     */
    public boolean isSetMaxX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXX$6) != null;
        }
    }
    
    /**
     * Sets the "maxX" attribute
     */
    public void setMaxX(java.lang.Object maxX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXX$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXX$6);
            }
            target.setObjectValue(maxX);
        }
    }
    
    /**
     * Sets (as xml) the "maxX" attribute
     */
    public void xsetMaxX(org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate maxX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MAXX$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().add_attribute_user(MAXX$6);
            }
            target.set(maxX);
        }
    }
    
    /**
     * Unsets the "maxX" attribute
     */
    public void unsetMaxX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXX$6);
        }
    }
    
    /**
     * Gets the "gdRefY" attribute
     */
    public java.lang.String getGdRefY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GDREFY$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gdRefY" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName xgetGdRefY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(GDREFY$8);
            return target;
        }
    }
    
    /**
     * True if has "gdRefY" attribute
     */
    public boolean isSetGdRefY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GDREFY$8) != null;
        }
    }
    
    /**
     * Sets the "gdRefY" attribute
     */
    public void setGdRefY(java.lang.String gdRefY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GDREFY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GDREFY$8);
            }
            target.setStringValue(gdRefY);
        }
    }
    
    /**
     * Sets (as xml) the "gdRefY" attribute
     */
    public void xsetGdRefY(org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName gdRefY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(GDREFY$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().add_attribute_user(GDREFY$8);
            }
            target.set(gdRefY);
        }
    }
    
    /**
     * Unsets the "gdRefY" attribute
     */
    public void unsetGdRefY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GDREFY$8);
        }
    }
    
    /**
     * Gets the "minY" attribute
     */
    public java.lang.Object getMinY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINY$10);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "minY" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate xgetMinY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MINY$10);
            return target;
        }
    }
    
    /**
     * True if has "minY" attribute
     */
    public boolean isSetMinY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINY$10) != null;
        }
    }
    
    /**
     * Sets the "minY" attribute
     */
    public void setMinY(java.lang.Object minY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINY$10);
            }
            target.setObjectValue(minY);
        }
    }
    
    /**
     * Sets (as xml) the "minY" attribute
     */
    public void xsetMinY(org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate minY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MINY$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().add_attribute_user(MINY$10);
            }
            target.set(minY);
        }
    }
    
    /**
     * Unsets the "minY" attribute
     */
    public void unsetMinY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINY$10);
        }
    }
    
    /**
     * Gets the "maxY" attribute
     */
    public java.lang.Object getMaxY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXY$12);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxY" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate xgetMaxY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MAXY$12);
            return target;
        }
    }
    
    /**
     * True if has "maxY" attribute
     */
    public boolean isSetMaxY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXY$12) != null;
        }
    }
    
    /**
     * Sets the "maxY" attribute
     */
    public void setMaxY(java.lang.Object maxY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXY$12);
            }
            target.setObjectValue(maxY);
        }
    }
    
    /**
     * Sets (as xml) the "maxY" attribute
     */
    public void xsetMaxY(org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate maxY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MAXY$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().add_attribute_user(MAXY$12);
            }
            target.set(maxY);
        }
    }
    
    /**
     * Unsets the "maxY" attribute
     */
    public void unsetMaxY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXY$12);
        }
    }
}

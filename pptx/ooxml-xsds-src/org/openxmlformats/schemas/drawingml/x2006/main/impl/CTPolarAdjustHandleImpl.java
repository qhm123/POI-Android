/*
 * XML Type:  CT_PolarAdjustHandle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_PolarAdjustHandle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPolarAdjustHandleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle
{
    
    public CTPolarAdjustHandleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pos");
    private static final javax.xml.namespace.QName GDREFR$2 = 
        new javax.xml.namespace.QName("", "gdRefR");
    private static final javax.xml.namespace.QName MINR$4 = 
        new javax.xml.namespace.QName("", "minR");
    private static final javax.xml.namespace.QName MAXR$6 = 
        new javax.xml.namespace.QName("", "maxR");
    private static final javax.xml.namespace.QName GDREFANG$8 = 
        new javax.xml.namespace.QName("", "gdRefAng");
    private static final javax.xml.namespace.QName MINANG$10 = 
        new javax.xml.namespace.QName("", "minAng");
    private static final javax.xml.namespace.QName MAXANG$12 = 
        new javax.xml.namespace.QName("", "maxAng");
    
    
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
     * Gets the "gdRefR" attribute
     */
    public java.lang.String getGdRefR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GDREFR$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gdRefR" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName xgetGdRefR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(GDREFR$2);
            return target;
        }
    }
    
    /**
     * True if has "gdRefR" attribute
     */
    public boolean isSetGdRefR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GDREFR$2) != null;
        }
    }
    
    /**
     * Sets the "gdRefR" attribute
     */
    public void setGdRefR(java.lang.String gdRefR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GDREFR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GDREFR$2);
            }
            target.setStringValue(gdRefR);
        }
    }
    
    /**
     * Sets (as xml) the "gdRefR" attribute
     */
    public void xsetGdRefR(org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName gdRefR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(GDREFR$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().add_attribute_user(GDREFR$2);
            }
            target.set(gdRefR);
        }
    }
    
    /**
     * Unsets the "gdRefR" attribute
     */
    public void unsetGdRefR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GDREFR$2);
        }
    }
    
    /**
     * Gets the "minR" attribute
     */
    public java.lang.Object getMinR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINR$4);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "minR" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate xgetMinR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MINR$4);
            return target;
        }
    }
    
    /**
     * True if has "minR" attribute
     */
    public boolean isSetMinR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINR$4) != null;
        }
    }
    
    /**
     * Sets the "minR" attribute
     */
    public void setMinR(java.lang.Object minR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINR$4);
            }
            target.setObjectValue(minR);
        }
    }
    
    /**
     * Sets (as xml) the "minR" attribute
     */
    public void xsetMinR(org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate minR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MINR$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().add_attribute_user(MINR$4);
            }
            target.set(minR);
        }
    }
    
    /**
     * Unsets the "minR" attribute
     */
    public void unsetMinR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINR$4);
        }
    }
    
    /**
     * Gets the "maxR" attribute
     */
    public java.lang.Object getMaxR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXR$6);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxR" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate xgetMaxR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MAXR$6);
            return target;
        }
    }
    
    /**
     * True if has "maxR" attribute
     */
    public boolean isSetMaxR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXR$6) != null;
        }
    }
    
    /**
     * Sets the "maxR" attribute
     */
    public void setMaxR(java.lang.Object maxR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXR$6);
            }
            target.setObjectValue(maxR);
        }
    }
    
    /**
     * Sets (as xml) the "maxR" attribute
     */
    public void xsetMaxR(org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate maxR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().find_attribute_user(MAXR$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate)get_store().add_attribute_user(MAXR$6);
            }
            target.set(maxR);
        }
    }
    
    /**
     * Unsets the "maxR" attribute
     */
    public void unsetMaxR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXR$6);
        }
    }
    
    /**
     * Gets the "gdRefAng" attribute
     */
    public java.lang.String getGdRefAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GDREFANG$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gdRefAng" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName xgetGdRefAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(GDREFANG$8);
            return target;
        }
    }
    
    /**
     * True if has "gdRefAng" attribute
     */
    public boolean isSetGdRefAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GDREFANG$8) != null;
        }
    }
    
    /**
     * Sets the "gdRefAng" attribute
     */
    public void setGdRefAng(java.lang.String gdRefAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GDREFANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GDREFANG$8);
            }
            target.setStringValue(gdRefAng);
        }
    }
    
    /**
     * Sets (as xml) the "gdRefAng" attribute
     */
    public void xsetGdRefAng(org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName gdRefAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(GDREFANG$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().add_attribute_user(GDREFANG$8);
            }
            target.set(gdRefAng);
        }
    }
    
    /**
     * Unsets the "gdRefAng" attribute
     */
    public void unsetGdRefAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GDREFANG$8);
        }
    }
    
    /**
     * Gets the "minAng" attribute
     */
    public java.lang.Object getMinAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINANG$10);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "minAng" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle xgetMinAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().find_attribute_user(MINANG$10);
            return target;
        }
    }
    
    /**
     * True if has "minAng" attribute
     */
    public boolean isSetMinAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINANG$10) != null;
        }
    }
    
    /**
     * Sets the "minAng" attribute
     */
    public void setMinAng(java.lang.Object minAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINANG$10);
            }
            target.setObjectValue(minAng);
        }
    }
    
    /**
     * Sets (as xml) the "minAng" attribute
     */
    public void xsetMinAng(org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle minAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().find_attribute_user(MINANG$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().add_attribute_user(MINANG$10);
            }
            target.set(minAng);
        }
    }
    
    /**
     * Unsets the "minAng" attribute
     */
    public void unsetMinAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINANG$10);
        }
    }
    
    /**
     * Gets the "maxAng" attribute
     */
    public java.lang.Object getMaxAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXANG$12);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxAng" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle xgetMaxAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().find_attribute_user(MAXANG$12);
            return target;
        }
    }
    
    /**
     * True if has "maxAng" attribute
     */
    public boolean isSetMaxAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXANG$12) != null;
        }
    }
    
    /**
     * Sets the "maxAng" attribute
     */
    public void setMaxAng(java.lang.Object maxAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXANG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXANG$12);
            }
            target.setObjectValue(maxAng);
        }
    }
    
    /**
     * Sets (as xml) the "maxAng" attribute
     */
    public void xsetMaxAng(org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle maxAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().find_attribute_user(MAXANG$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAdjAngle)get_store().add_attribute_user(MAXANG$12);
            }
            target.set(maxAng);
        }
    }
    
    /**
     * Unsets the "maxAng" attribute
     */
    public void unsetMaxAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXANG$12);
        }
    }
}

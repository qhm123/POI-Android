/*
 * XML Type:  CT_SphereCoords
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_SphereCoords(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSphereCoordsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords
{
    
    public CTSphereCoordsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAT$0 = 
        new javax.xml.namespace.QName("", "lat");
    private static final javax.xml.namespace.QName LON$2 = 
        new javax.xml.namespace.QName("", "lon");
    private static final javax.xml.namespace.QName REV$4 = 
        new javax.xml.namespace.QName("", "rev");
    
    
    /**
     * Gets the "lat" attribute
     */
    public int getLat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAT$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lat" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetLat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(LAT$0);
            return target;
        }
    }
    
    /**
     * Sets the "lat" attribute
     */
    public void setLat(int lat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAT$0);
            }
            target.setIntValue(lat);
        }
    }
    
    /**
     * Sets (as xml) the "lat" attribute
     */
    public void xsetLat(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle lat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(LAT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(LAT$0);
            }
            target.set(lat);
        }
    }
    
    /**
     * Gets the "lon" attribute
     */
    public int getLon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LON$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lon" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetLon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(LON$2);
            return target;
        }
    }
    
    /**
     * Sets the "lon" attribute
     */
    public void setLon(int lon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LON$2);
            }
            target.setIntValue(lon);
        }
    }
    
    /**
     * Sets (as xml) the "lon" attribute
     */
    public void xsetLon(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle lon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(LON$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(LON$2);
            }
            target.set(lon);
        }
    }
    
    /**
     * Gets the "rev" attribute
     */
    public int getRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "rev" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(REV$4);
            return target;
        }
    }
    
    /**
     * Sets the "rev" attribute
     */
    public void setRev(int rev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REV$4);
            }
            target.setIntValue(rev);
        }
    }
    
    /**
     * Sets (as xml) the "rev" attribute
     */
    public void xsetRev(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle rev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(REV$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(REV$4);
            }
            target.set(rev);
        }
    }
}

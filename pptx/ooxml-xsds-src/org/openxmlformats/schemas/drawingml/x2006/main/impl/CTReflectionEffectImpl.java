/*
 * XML Type:  CT_ReflectionEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ReflectionEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTReflectionEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect
{
    
    public CTReflectionEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLURRAD$0 = 
        new javax.xml.namespace.QName("", "blurRad");
    private static final javax.xml.namespace.QName STA$2 = 
        new javax.xml.namespace.QName("", "stA");
    private static final javax.xml.namespace.QName STPOS$4 = 
        new javax.xml.namespace.QName("", "stPos");
    private static final javax.xml.namespace.QName ENDA$6 = 
        new javax.xml.namespace.QName("", "endA");
    private static final javax.xml.namespace.QName ENDPOS$8 = 
        new javax.xml.namespace.QName("", "endPos");
    private static final javax.xml.namespace.QName DIST$10 = 
        new javax.xml.namespace.QName("", "dist");
    private static final javax.xml.namespace.QName DIR$12 = 
        new javax.xml.namespace.QName("", "dir");
    private static final javax.xml.namespace.QName FADEDIR$14 = 
        new javax.xml.namespace.QName("", "fadeDir");
    private static final javax.xml.namespace.QName SX$16 = 
        new javax.xml.namespace.QName("", "sx");
    private static final javax.xml.namespace.QName SY$18 = 
        new javax.xml.namespace.QName("", "sy");
    private static final javax.xml.namespace.QName KX$20 = 
        new javax.xml.namespace.QName("", "kx");
    private static final javax.xml.namespace.QName KY$22 = 
        new javax.xml.namespace.QName("", "ky");
    private static final javax.xml.namespace.QName ALGN$24 = 
        new javax.xml.namespace.QName("", "algn");
    private static final javax.xml.namespace.QName ROTWITHSHAPE$26 = 
        new javax.xml.namespace.QName("", "rotWithShape");
    
    
    /**
     * Gets the "blurRad" attribute
     */
    public long getBlurRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLURRAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLURRAD$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "blurRad" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetBlurRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(BLURRAD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(BLURRAD$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "blurRad" attribute
     */
    public boolean isSetBlurRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLURRAD$0) != null;
        }
    }
    
    /**
     * Sets the "blurRad" attribute
     */
    public void setBlurRad(long blurRad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLURRAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLURRAD$0);
            }
            target.setLongValue(blurRad);
        }
    }
    
    /**
     * Sets (as xml) the "blurRad" attribute
     */
    public void xsetBlurRad(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate blurRad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(BLURRAD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(BLURRAD$0);
            }
            target.set(blurRad);
        }
    }
    
    /**
     * Unsets the "blurRad" attribute
     */
    public void unsetBlurRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLURRAD$0);
        }
    }
    
    /**
     * Gets the "stA" attribute
     */
    public int getStA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STA$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "stA" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetStA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(STA$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_default_attribute_value(STA$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "stA" attribute
     */
    public boolean isSetStA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STA$2) != null;
        }
    }
    
    /**
     * Sets the "stA" attribute
     */
    public void setStA(int stA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STA$2);
            }
            target.setIntValue(stA);
        }
    }
    
    /**
     * Sets (as xml) the "stA" attribute
     */
    public void xsetStA(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage stA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(STA$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(STA$2);
            }
            target.set(stA);
        }
    }
    
    /**
     * Unsets the "stA" attribute
     */
    public void unsetStA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STA$2);
        }
    }
    
    /**
     * Gets the "stPos" attribute
     */
    public int getStPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STPOS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STPOS$4);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "stPos" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetStPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(STPOS$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_default_attribute_value(STPOS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "stPos" attribute
     */
    public boolean isSetStPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STPOS$4) != null;
        }
    }
    
    /**
     * Sets the "stPos" attribute
     */
    public void setStPos(int stPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STPOS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STPOS$4);
            }
            target.setIntValue(stPos);
        }
    }
    
    /**
     * Sets (as xml) the "stPos" attribute
     */
    public void xsetStPos(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage stPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(STPOS$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(STPOS$4);
            }
            target.set(stPos);
        }
    }
    
    /**
     * Unsets the "stPos" attribute
     */
    public void unsetStPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STPOS$4);
        }
    }
    
    /**
     * Gets the "endA" attribute
     */
    public int getEndA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENDA$6);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "endA" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetEndA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(ENDA$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_default_attribute_value(ENDA$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "endA" attribute
     */
    public boolean isSetEndA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDA$6) != null;
        }
    }
    
    /**
     * Sets the "endA" attribute
     */
    public void setEndA(int endA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDA$6);
            }
            target.setIntValue(endA);
        }
    }
    
    /**
     * Sets (as xml) the "endA" attribute
     */
    public void xsetEndA(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage endA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(ENDA$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(ENDA$6);
            }
            target.set(endA);
        }
    }
    
    /**
     * Unsets the "endA" attribute
     */
    public void unsetEndA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDA$6);
        }
    }
    
    /**
     * Gets the "endPos" attribute
     */
    public int getEndPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENDPOS$8);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "endPos" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetEndPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(ENDPOS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_default_attribute_value(ENDPOS$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "endPos" attribute
     */
    public boolean isSetEndPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDPOS$8) != null;
        }
    }
    
    /**
     * Sets the "endPos" attribute
     */
    public void setEndPos(int endPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDPOS$8);
            }
            target.setIntValue(endPos);
        }
    }
    
    /**
     * Sets (as xml) the "endPos" attribute
     */
    public void xsetEndPos(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage endPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(ENDPOS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(ENDPOS$8);
            }
            target.set(endPos);
        }
    }
    
    /**
     * Unsets the "endPos" attribute
     */
    public void unsetEndPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDPOS$8);
        }
    }
    
    /**
     * Gets the "dist" attribute
     */
    public long getDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIST$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIST$10);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dist" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(DIST$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(DIST$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "dist" attribute
     */
    public boolean isSetDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIST$10) != null;
        }
    }
    
    /**
     * Sets the "dist" attribute
     */
    public void setDist(long dist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIST$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIST$10);
            }
            target.setLongValue(dist);
        }
    }
    
    /**
     * Sets (as xml) the "dist" attribute
     */
    public void xsetDist(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate dist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(DIST$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(DIST$10);
            }
            target.set(dist);
        }
    }
    
    /**
     * Unsets the "dist" attribute
     */
    public void unsetDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIST$10);
        }
    }
    
    /**
     * Gets the "dir" attribute
     */
    public int getDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIR$12);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "dir" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(DIR$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_default_attribute_value(DIR$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "dir" attribute
     */
    public boolean isSetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIR$12) != null;
        }
    }
    
    /**
     * Sets the "dir" attribute
     */
    public void setDir(int dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$12);
            }
            target.setIntValue(dir);
        }
    }
    
    /**
     * Sets (as xml) the "dir" attribute
     */
    public void xsetDir(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(DIR$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(DIR$12);
            }
            target.set(dir);
        }
    }
    
    /**
     * Unsets the "dir" attribute
     */
    public void unsetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIR$12);
        }
    }
    
    /**
     * Gets the "fadeDir" attribute
     */
    public int getFadeDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FADEDIR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FADEDIR$14);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "fadeDir" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetFadeDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(FADEDIR$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_default_attribute_value(FADEDIR$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "fadeDir" attribute
     */
    public boolean isSetFadeDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FADEDIR$14) != null;
        }
    }
    
    /**
     * Sets the "fadeDir" attribute
     */
    public void setFadeDir(int fadeDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FADEDIR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FADEDIR$14);
            }
            target.setIntValue(fadeDir);
        }
    }
    
    /**
     * Sets (as xml) the "fadeDir" attribute
     */
    public void xsetFadeDir(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle fadeDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(FADEDIR$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(FADEDIR$14);
            }
            target.set(fadeDir);
        }
    }
    
    /**
     * Unsets the "fadeDir" attribute
     */
    public void unsetFadeDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FADEDIR$14);
        }
    }
    
    /**
     * Gets the "sx" attribute
     */
    public int getSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SX$16);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sx" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SX$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(SX$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "sx" attribute
     */
    public boolean isSetSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SX$16) != null;
        }
    }
    
    /**
     * Sets the "sx" attribute
     */
    public void setSx(int sx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SX$16);
            }
            target.setIntValue(sx);
        }
    }
    
    /**
     * Sets (as xml) the "sx" attribute
     */
    public void xsetSx(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage sx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SX$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SX$16);
            }
            target.set(sx);
        }
    }
    
    /**
     * Unsets the "sx" attribute
     */
    public void unsetSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SX$16);
        }
    }
    
    /**
     * Gets the "sy" attribute
     */
    public int getSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SY$18);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sy" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SY$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(SY$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "sy" attribute
     */
    public boolean isSetSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SY$18) != null;
        }
    }
    
    /**
     * Sets the "sy" attribute
     */
    public void setSy(int sy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SY$18);
            }
            target.setIntValue(sy);
        }
    }
    
    /**
     * Sets (as xml) the "sy" attribute
     */
    public void xsetSy(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage sy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SY$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SY$18);
            }
            target.set(sy);
        }
    }
    
    /**
     * Unsets the "sy" attribute
     */
    public void unsetSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SY$18);
        }
    }
    
    /**
     * Gets the "kx" attribute
     */
    public int getKx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KX$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KX$20);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "kx" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle xgetKx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KX$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_default_attribute_value(KX$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "kx" attribute
     */
    public boolean isSetKx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KX$20) != null;
        }
    }
    
    /**
     * Sets the "kx" attribute
     */
    public void setKx(int kx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KX$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KX$20);
            }
            target.setIntValue(kx);
        }
    }
    
    /**
     * Sets (as xml) the "kx" attribute
     */
    public void xsetKx(org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle kx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KX$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().add_attribute_user(KX$20);
            }
            target.set(kx);
        }
    }
    
    /**
     * Unsets the "kx" attribute
     */
    public void unsetKx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KX$20);
        }
    }
    
    /**
     * Gets the "ky" attribute
     */
    public int getKy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KY$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KY$22);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ky" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle xgetKy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KY$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_default_attribute_value(KY$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "ky" attribute
     */
    public boolean isSetKy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KY$22) != null;
        }
    }
    
    /**
     * Sets the "ky" attribute
     */
    public void setKy(int ky)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KY$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KY$22);
            }
            target.setIntValue(ky);
        }
    }
    
    /**
     * Sets (as xml) the "ky" attribute
     */
    public void xsetKy(org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle ky)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KY$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().add_attribute_user(KY$22);
            }
            target.set(ky);
        }
    }
    
    /**
     * Unsets the "ky" attribute
     */
    public void unsetKy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KY$22);
        }
    }
    
    /**
     * Gets the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment.Enum getAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALGN$24);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment xgetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().find_attribute_user(ALGN$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_default_attribute_value(ALGN$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "algn" attribute
     */
    public boolean isSetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALGN$24) != null;
        }
    }
    
    /**
     * Sets the "algn" attribute
     */
    public void setAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment.Enum algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGN$24);
            }
            target.setEnumValue(algn);
        }
    }
    
    /**
     * Sets (as xml) the "algn" attribute
     */
    public void xsetAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().find_attribute_user(ALGN$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().add_attribute_user(ALGN$24);
            }
            target.set(algn);
        }
    }
    
    /**
     * Unsets the "algn" attribute
     */
    public void unsetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALGN$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTWITHSHAPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROTWITHSHAPE$26);
            }
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROTWITHSHAPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ROTWITHSHAPE$26);
            }
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
            return get_store().find_attribute_user(ROTWITHSHAPE$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTWITHSHAPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTWITHSHAPE$26);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROTWITHSHAPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ROTWITHSHAPE$26);
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
            get_store().remove_attribute(ROTWITHSHAPE$26);
        }
    }
}

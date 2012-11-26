/*
 * XML Type:  CT_OuterShadowEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_OuterShadowEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTOuterShadowEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect
{
    
    public CTOuterShadowEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRGBCLR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scrgbClr");
    private static final javax.xml.namespace.QName SRGBCLR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srgbClr");
    private static final javax.xml.namespace.QName HSLCLR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hslClr");
    private static final javax.xml.namespace.QName SYSCLR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sysClr");
    private static final javax.xml.namespace.QName SCHEMECLR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "schemeClr");
    private static final javax.xml.namespace.QName PRSTCLR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstClr");
    private static final javax.xml.namespace.QName BLURRAD$12 = 
        new javax.xml.namespace.QName("", "blurRad");
    private static final javax.xml.namespace.QName DIST$14 = 
        new javax.xml.namespace.QName("", "dist");
    private static final javax.xml.namespace.QName DIR$16 = 
        new javax.xml.namespace.QName("", "dir");
    private static final javax.xml.namespace.QName SX$18 = 
        new javax.xml.namespace.QName("", "sx");
    private static final javax.xml.namespace.QName SY$20 = 
        new javax.xml.namespace.QName("", "sy");
    private static final javax.xml.namespace.QName KX$22 = 
        new javax.xml.namespace.QName("", "kx");
    private static final javax.xml.namespace.QName KY$24 = 
        new javax.xml.namespace.QName("", "ky");
    private static final javax.xml.namespace.QName ALGN$26 = 
        new javax.xml.namespace.QName("", "algn");
    private static final javax.xml.namespace.QName ROTWITHSHAPE$28 = 
        new javax.xml.namespace.QName("", "rotWithShape");
    
    
    /**
     * Gets the "scrgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor getScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().find_element_user(SCRGBCLR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scrgbClr" element
     */
    public boolean isSetScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRGBCLR$0) != 0;
        }
    }
    
    /**
     * Sets the "scrgbClr" element
     */
    public void setScrgbClr(org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor scrgbClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().find_element_user(SCRGBCLR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().add_element_user(SCRGBCLR$0);
            }
            target.set(scrgbClr);
        }
    }
    
    /**
     * Appends and returns a new empty "scrgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor addNewScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().add_element_user(SCRGBCLR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "scrgbClr" element
     */
    public void unsetScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRGBCLR$0, 0);
        }
    }
    
    /**
     * Gets the "srgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor getSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().find_element_user(SRGBCLR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "srgbClr" element
     */
    public boolean isSetSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRGBCLR$2) != 0;
        }
    }
    
    /**
     * Sets the "srgbClr" element
     */
    public void setSrgbClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor srgbClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().find_element_user(SRGBCLR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().add_element_user(SRGBCLR$2);
            }
            target.set(srgbClr);
        }
    }
    
    /**
     * Appends and returns a new empty "srgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor addNewSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().add_element_user(SRGBCLR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "srgbClr" element
     */
    public void unsetSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRGBCLR$2, 0);
        }
    }
    
    /**
     * Gets the "hslClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor getHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().find_element_user(HSLCLR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hslClr" element
     */
    public boolean isSetHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HSLCLR$4) != 0;
        }
    }
    
    /**
     * Sets the "hslClr" element
     */
    public void setHslClr(org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor hslClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().find_element_user(HSLCLR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().add_element_user(HSLCLR$4);
            }
            target.set(hslClr);
        }
    }
    
    /**
     * Appends and returns a new empty "hslClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor addNewHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().add_element_user(HSLCLR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "hslClr" element
     */
    public void unsetHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HSLCLR$4, 0);
        }
    }
    
    /**
     * Gets the "sysClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor getSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().find_element_user(SYSCLR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sysClr" element
     */
    public boolean isSetSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSCLR$6) != 0;
        }
    }
    
    /**
     * Sets the "sysClr" element
     */
    public void setSysClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor sysClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().find_element_user(SYSCLR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().add_element_user(SYSCLR$6);
            }
            target.set(sysClr);
        }
    }
    
    /**
     * Appends and returns a new empty "sysClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor addNewSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().add_element_user(SYSCLR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "sysClr" element
     */
    public void unsetSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSCLR$6, 0);
        }
    }
    
    /**
     * Gets the "schemeClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor getSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().find_element_user(SCHEMECLR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schemeClr" element
     */
    public boolean isSetSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMECLR$8) != 0;
        }
    }
    
    /**
     * Sets the "schemeClr" element
     */
    public void setSchemeClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor schemeClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().find_element_user(SCHEMECLR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().add_element_user(SCHEMECLR$8);
            }
            target.set(schemeClr);
        }
    }
    
    /**
     * Appends and returns a new empty "schemeClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor addNewSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().add_element_user(SCHEMECLR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "schemeClr" element
     */
    public void unsetSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMECLR$8, 0);
        }
    }
    
    /**
     * Gets the "prstClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor getPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().find_element_user(PRSTCLR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prstClr" element
     */
    public boolean isSetPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSTCLR$10) != 0;
        }
    }
    
    /**
     * Sets the "prstClr" element
     */
    public void setPrstClr(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor prstClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().find_element_user(PRSTCLR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().add_element_user(PRSTCLR$10);
            }
            target.set(prstClr);
        }
    }
    
    /**
     * Appends and returns a new empty "prstClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor addNewPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().add_element_user(PRSTCLR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "prstClr" element
     */
    public void unsetPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSTCLR$10, 0);
        }
    }
    
    /**
     * Gets the "blurRad" attribute
     */
    public long getBlurRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLURRAD$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLURRAD$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(BLURRAD$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(BLURRAD$12);
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
            return get_store().find_attribute_user(BLURRAD$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLURRAD$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLURRAD$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(BLURRAD$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(BLURRAD$12);
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
            get_store().remove_attribute(BLURRAD$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIST$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIST$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(DIST$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(DIST$14);
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
            return get_store().find_attribute_user(DIST$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIST$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIST$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(DIST$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(DIST$14);
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
            get_store().remove_attribute(DIST$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIR$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(DIR$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_default_attribute_value(DIR$16);
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
            return get_store().find_attribute_user(DIR$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(DIR$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(DIR$16);
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
            get_store().remove_attribute(DIR$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SX$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SX$18);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SX$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(SX$18);
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
            return get_store().find_attribute_user(SX$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SX$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SX$18);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SX$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SX$18);
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
            get_store().remove_attribute(SX$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SY$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SY$20);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SY$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(SY$20);
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
            return get_store().find_attribute_user(SY$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SY$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SY$20);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SY$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SY$20);
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
            get_store().remove_attribute(SY$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KX$22);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KX$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_default_attribute_value(KX$22);
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
            return get_store().find_attribute_user(KX$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KX$22);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KX$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().add_attribute_user(KX$22);
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
            get_store().remove_attribute(KX$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KY$24);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KY$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_default_attribute_value(KY$24);
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
            return get_store().find_attribute_user(KY$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KY$24);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KY$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().add_attribute_user(KY$24);
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
            get_store().remove_attribute(KY$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALGN$26);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().find_attribute_user(ALGN$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_default_attribute_value(ALGN$26);
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
            return get_store().find_attribute_user(ALGN$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGN$26);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().find_attribute_user(ALGN$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().add_attribute_user(ALGN$26);
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
            get_store().remove_attribute(ALGN$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTWITHSHAPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROTWITHSHAPE$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROTWITHSHAPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ROTWITHSHAPE$28);
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
            return get_store().find_attribute_user(ROTWITHSHAPE$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTWITHSHAPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTWITHSHAPE$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROTWITHSHAPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ROTWITHSHAPE$28);
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
            get_store().remove_attribute(ROTWITHSHAPE$28);
        }
    }
}

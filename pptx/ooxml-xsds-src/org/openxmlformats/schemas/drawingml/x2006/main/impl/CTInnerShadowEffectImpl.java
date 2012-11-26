/*
 * XML Type:  CT_InnerShadowEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_InnerShadowEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTInnerShadowEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect
{
    
    public CTInnerShadowEffectImpl(org.apache.xmlbeans.SchemaType sType)
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
}

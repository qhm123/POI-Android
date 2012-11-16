/*
 * XML Type:  CT_Border
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Border(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBorderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder
{
    
    public CTBorderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
    private static final javax.xml.namespace.QName COLOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "color");
    private static final javax.xml.namespace.QName THEMECOLOR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeColor");
    private static final javax.xml.namespace.QName THEMETINT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeTint");
    private static final javax.xml.namespace.QName THEMESHADE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeShade");
    private static final javax.xml.namespace.QName SZ$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sz");
    private static final javax.xml.namespace.QName SPACE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "space");
    private static final javax.xml.namespace.QName SHADOW$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shadow");
    private static final javax.xml.namespace.QName FRAME$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "frame");
    
    
    /**
     * Gets the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder.Enum getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder.Enum val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$0);
            }
            target.setEnumValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
    
    /**
     * Gets the "color" attribute
     */
    public java.lang.Object getColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "color" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor xgetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().find_attribute_user(COLOR$2);
            return target;
        }
    }
    
    /**
     * True if has "color" attribute
     */
    public boolean isSetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLOR$2) != null;
        }
    }
    
    /**
     * Sets the "color" attribute
     */
    public void setColor(java.lang.Object color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR$2);
            }
            target.setObjectValue(color);
        }
    }
    
    /**
     * Sets (as xml) the "color" attribute
     */
    public void xsetColor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().find_attribute_user(COLOR$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().add_attribute_user(COLOR$2);
            }
            target.set(color);
        }
    }
    
    /**
     * Unsets the "color" attribute
     */
    public void unsetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLOR$2);
        }
    }
    
    /**
     * Gets the "themeColor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor.Enum getThemeColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMECOLOR$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "themeColor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor xgetThemeColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().find_attribute_user(THEMECOLOR$4);
            return target;
        }
    }
    
    /**
     * True if has "themeColor" attribute
     */
    public boolean isSetThemeColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THEMECOLOR$4) != null;
        }
    }
    
    /**
     * Sets the "themeColor" attribute
     */
    public void setThemeColor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor.Enum themeColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMECOLOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMECOLOR$4);
            }
            target.setEnumValue(themeColor);
        }
    }
    
    /**
     * Sets (as xml) the "themeColor" attribute
     */
    public void xsetThemeColor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor themeColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().find_attribute_user(THEMECOLOR$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().add_attribute_user(THEMECOLOR$4);
            }
            target.set(themeColor);
        }
    }
    
    /**
     * Unsets the "themeColor" attribute
     */
    public void unsetThemeColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THEMECOLOR$4);
        }
    }
    
    /**
     * Gets the "themeTint" attribute
     */
    public byte[] getThemeTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMETINT$6);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "themeTint" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber xgetThemeTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMETINT$6);
            return target;
        }
    }
    
    /**
     * True if has "themeTint" attribute
     */
    public boolean isSetThemeTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THEMETINT$6) != null;
        }
    }
    
    /**
     * Sets the "themeTint" attribute
     */
    public void setThemeTint(byte[] themeTint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMETINT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMETINT$6);
            }
            target.setByteArrayValue(themeTint);
        }
    }
    
    /**
     * Sets (as xml) the "themeTint" attribute
     */
    public void xsetThemeTint(org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber themeTint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMETINT$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().add_attribute_user(THEMETINT$6);
            }
            target.set(themeTint);
        }
    }
    
    /**
     * Unsets the "themeTint" attribute
     */
    public void unsetThemeTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THEMETINT$6);
        }
    }
    
    /**
     * Gets the "themeShade" attribute
     */
    public byte[] getThemeShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMESHADE$8);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "themeShade" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber xgetThemeShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMESHADE$8);
            return target;
        }
    }
    
    /**
     * True if has "themeShade" attribute
     */
    public boolean isSetThemeShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THEMESHADE$8) != null;
        }
    }
    
    /**
     * Sets the "themeShade" attribute
     */
    public void setThemeShade(byte[] themeShade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMESHADE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMESHADE$8);
            }
            target.setByteArrayValue(themeShade);
        }
    }
    
    /**
     * Sets (as xml) the "themeShade" attribute
     */
    public void xsetThemeShade(org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber themeShade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMESHADE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().add_attribute_user(THEMESHADE$8);
            }
            target.set(themeShade);
        }
    }
    
    /**
     * Unsets the "themeShade" attribute
     */
    public void unsetThemeShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THEMESHADE$8);
        }
    }
    
    /**
     * Gets the "sz" attribute
     */
    public java.math.BigInteger getSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SZ$10);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sz" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure xgetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure)get_store().find_attribute_user(SZ$10);
            return target;
        }
    }
    
    /**
     * True if has "sz" attribute
     */
    public boolean isSetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SZ$10) != null;
        }
    }
    
    /**
     * Sets the "sz" attribute
     */
    public void setSz(java.math.BigInteger sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SZ$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SZ$10);
            }
            target.setBigIntegerValue(sz);
        }
    }
    
    /**
     * Sets (as xml) the "sz" attribute
     */
    public void xsetSz(org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure)get_store().find_attribute_user(SZ$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure)get_store().add_attribute_user(SZ$10);
            }
            target.set(sz);
        }
    }
    
    /**
     * Unsets the "sz" attribute
     */
    public void unsetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SZ$10);
        }
    }
    
    /**
     * Gets the "space" attribute
     */
    public java.math.BigInteger getSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "space" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure xgetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure)get_store().find_attribute_user(SPACE$12);
            return target;
        }
    }
    
    /**
     * True if has "space" attribute
     */
    public boolean isSetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPACE$12) != null;
        }
    }
    
    /**
     * Sets the "space" attribute
     */
    public void setSpace(java.math.BigInteger space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$12);
            }
            target.setBigIntegerValue(space);
        }
    }
    
    /**
     * Sets (as xml) the "space" attribute
     */
    public void xsetSpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure)get_store().find_attribute_user(SPACE$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure)get_store().add_attribute_user(SPACE$12);
            }
            target.set(space);
        }
    }
    
    /**
     * Unsets the "space" attribute
     */
    public void unsetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPACE$12);
        }
    }
    
    /**
     * Gets the "shadow" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHADOW$14);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "shadow" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(SHADOW$14);
            return target;
        }
    }
    
    /**
     * True if has "shadow" attribute
     */
    public boolean isSetShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHADOW$14) != null;
        }
    }
    
    /**
     * Sets the "shadow" attribute
     */
    public void setShadow(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHADOW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHADOW$14);
            }
            target.setEnumValue(shadow);
        }
    }
    
    /**
     * Sets (as xml) the "shadow" attribute
     */
    public void xsetShadow(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(SHADOW$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(SHADOW$14);
            }
            target.set(shadow);
        }
    }
    
    /**
     * Unsets the "shadow" attribute
     */
    public void unsetShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHADOW$14);
        }
    }
    
    /**
     * Gets the "frame" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$16);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(FRAME$16);
            return target;
        }
    }
    
    /**
     * True if has "frame" attribute
     */
    public boolean isSetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAME$16) != null;
        }
    }
    
    /**
     * Sets the "frame" attribute
     */
    public void setFrame(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$16);
            }
            target.setEnumValue(frame);
        }
    }
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    public void xsetFrame(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(FRAME$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(FRAME$16);
            }
            target.set(frame);
        }
    }
    
    /**
     * Unsets the "frame" attribute
     */
    public void unsetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAME$16);
        }
    }
}

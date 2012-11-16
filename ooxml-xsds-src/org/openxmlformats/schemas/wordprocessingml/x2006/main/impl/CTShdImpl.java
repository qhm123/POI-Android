/*
 * XML Type:  CT_Shd
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Shd(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTShdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd
{
    
    public CTShdImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName FILL$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fill");
    private static final javax.xml.namespace.QName THEMEFILL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeFill");
    private static final javax.xml.namespace.QName THEMEFILLTINT$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeFillTint");
    private static final javax.xml.namespace.QName THEMEFILLSHADE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeFillShade");
    
    
    /**
     * Gets the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd.Enum getVal()
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
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd.Enum val)
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
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd)get_store().add_attribute_user(VAL$0);
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
     * Gets the "fill" attribute
     */
    public java.lang.Object getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL$10);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "fill" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor xgetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().find_attribute_user(FILL$10);
            return target;
        }
    }
    
    /**
     * True if has "fill" attribute
     */
    public boolean isSetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILL$10) != null;
        }
    }
    
    /**
     * Sets the "fill" attribute
     */
    public void setFill(java.lang.Object fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILL$10);
            }
            target.setObjectValue(fill);
        }
    }
    
    /**
     * Sets (as xml) the "fill" attribute
     */
    public void xsetFill(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().find_attribute_user(FILL$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().add_attribute_user(FILL$10);
            }
            target.set(fill);
        }
    }
    
    /**
     * Unsets the "fill" attribute
     */
    public void unsetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILL$10);
        }
    }
    
    /**
     * Gets the "themeFill" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor.Enum getThemeFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEFILL$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "themeFill" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor xgetThemeFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().find_attribute_user(THEMEFILL$12);
            return target;
        }
    }
    
    /**
     * True if has "themeFill" attribute
     */
    public boolean isSetThemeFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THEMEFILL$12) != null;
        }
    }
    
    /**
     * Sets the "themeFill" attribute
     */
    public void setThemeFill(org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor.Enum themeFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEFILL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMEFILL$12);
            }
            target.setEnumValue(themeFill);
        }
    }
    
    /**
     * Sets (as xml) the "themeFill" attribute
     */
    public void xsetThemeFill(org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor themeFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().find_attribute_user(THEMEFILL$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().add_attribute_user(THEMEFILL$12);
            }
            target.set(themeFill);
        }
    }
    
    /**
     * Unsets the "themeFill" attribute
     */
    public void unsetThemeFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THEMEFILL$12);
        }
    }
    
    /**
     * Gets the "themeFillTint" attribute
     */
    public byte[] getThemeFillTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEFILLTINT$14);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "themeFillTint" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber xgetThemeFillTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMEFILLTINT$14);
            return target;
        }
    }
    
    /**
     * True if has "themeFillTint" attribute
     */
    public boolean isSetThemeFillTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THEMEFILLTINT$14) != null;
        }
    }
    
    /**
     * Sets the "themeFillTint" attribute
     */
    public void setThemeFillTint(byte[] themeFillTint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEFILLTINT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMEFILLTINT$14);
            }
            target.setByteArrayValue(themeFillTint);
        }
    }
    
    /**
     * Sets (as xml) the "themeFillTint" attribute
     */
    public void xsetThemeFillTint(org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber themeFillTint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMEFILLTINT$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().add_attribute_user(THEMEFILLTINT$14);
            }
            target.set(themeFillTint);
        }
    }
    
    /**
     * Unsets the "themeFillTint" attribute
     */
    public void unsetThemeFillTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THEMEFILLTINT$14);
        }
    }
    
    /**
     * Gets the "themeFillShade" attribute
     */
    public byte[] getThemeFillShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEFILLSHADE$16);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "themeFillShade" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber xgetThemeFillShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMEFILLSHADE$16);
            return target;
        }
    }
    
    /**
     * True if has "themeFillShade" attribute
     */
    public boolean isSetThemeFillShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THEMEFILLSHADE$16) != null;
        }
    }
    
    /**
     * Sets the "themeFillShade" attribute
     */
    public void setThemeFillShade(byte[] themeFillShade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMEFILLSHADE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMEFILLSHADE$16);
            }
            target.setByteArrayValue(themeFillShade);
        }
    }
    
    /**
     * Sets (as xml) the "themeFillShade" attribute
     */
    public void xsetThemeFillShade(org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber themeFillShade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMEFILLSHADE$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().add_attribute_user(THEMEFILLSHADE$16);
            }
            target.set(themeFillShade);
        }
    }
    
    /**
     * Unsets the "themeFillShade" attribute
     */
    public void unsetThemeFillShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THEMEFILLSHADE$16);
        }
    }
}

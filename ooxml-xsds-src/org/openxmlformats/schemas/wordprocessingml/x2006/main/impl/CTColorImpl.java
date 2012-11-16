/*
 * XML Type:  CT_Color
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Color(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor
{
    
    public CTColorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
    private static final javax.xml.namespace.QName THEMECOLOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeColor");
    private static final javax.xml.namespace.QName THEMETINT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeTint");
    private static final javax.xml.namespace.QName THEMESHADE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeShade");
    
    
    /**
     * Gets the "val" attribute
     */
    public java.lang.Object getVal()
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
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(java.lang.Object val)
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
            target.setObjectValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMECOLOR$2);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().find_attribute_user(THEMECOLOR$2);
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
            return get_store().find_attribute_user(THEMECOLOR$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMECOLOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMECOLOR$2);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().find_attribute_user(THEMECOLOR$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor)get_store().add_attribute_user(THEMECOLOR$2);
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
            get_store().remove_attribute(THEMECOLOR$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMETINT$4);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMETINT$4);
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
            return get_store().find_attribute_user(THEMETINT$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMETINT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMETINT$4);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMETINT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().add_attribute_user(THEMETINT$4);
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
            get_store().remove_attribute(THEMETINT$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMESHADE$6);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMESHADE$6);
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
            return get_store().find_attribute_user(THEMESHADE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEMESHADE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEMESHADE$6);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().find_attribute_user(THEMESHADE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber)get_store().add_attribute_user(THEMESHADE$6);
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
            get_store().remove_attribute(THEMESHADE$6);
        }
    }
}

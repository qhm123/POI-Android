/*
 * XML Type:  CT_Fonts
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Fonts(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts
{
    
    public CTFontsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HINT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hint");
    private static final javax.xml.namespace.QName ASCII$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ascii");
    private static final javax.xml.namespace.QName HANSI$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hAnsi");
    private static final javax.xml.namespace.QName EASTASIA$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "eastAsia");
    private static final javax.xml.namespace.QName CS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cs");
    private static final javax.xml.namespace.QName ASCIITHEME$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "asciiTheme");
    private static final javax.xml.namespace.QName HANSITHEME$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hAnsiTheme");
    private static final javax.xml.namespace.QName EASTASIATHEME$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "eastAsiaTheme");
    private static final javax.xml.namespace.QName CSTHEME$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cstheme");
    
    
    /**
     * Gets the "hint" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint.Enum getHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HINT$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hint" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint xgetHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint)get_store().find_attribute_user(HINT$0);
            return target;
        }
    }
    
    /**
     * True if has "hint" attribute
     */
    public boolean isSetHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HINT$0) != null;
        }
    }
    
    /**
     * Sets the "hint" attribute
     */
    public void setHint(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint.Enum hint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HINT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HINT$0);
            }
            target.setEnumValue(hint);
        }
    }
    
    /**
     * Sets (as xml) the "hint" attribute
     */
    public void xsetHint(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint hint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint)get_store().find_attribute_user(HINT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint)get_store().add_attribute_user(HINT$0);
            }
            target.set(hint);
        }
    }
    
    /**
     * Unsets the "hint" attribute
     */
    public void unsetHint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HINT$0);
        }
    }
    
    /**
     * Gets the "ascii" attribute
     */
    public java.lang.String getAscii()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASCII$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ascii" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetAscii()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ASCII$2);
            return target;
        }
    }
    
    /**
     * True if has "ascii" attribute
     */
    public boolean isSetAscii()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASCII$2) != null;
        }
    }
    
    /**
     * Sets the "ascii" attribute
     */
    public void setAscii(java.lang.String ascii)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASCII$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASCII$2);
            }
            target.setStringValue(ascii);
        }
    }
    
    /**
     * Sets (as xml) the "ascii" attribute
     */
    public void xsetAscii(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString ascii)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ASCII$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(ASCII$2);
            }
            target.set(ascii);
        }
    }
    
    /**
     * Unsets the "ascii" attribute
     */
    public void unsetAscii()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASCII$2);
        }
    }
    
    /**
     * Gets the "hAnsi" attribute
     */
    public java.lang.String getHAnsi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANSI$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hAnsi" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetHAnsi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(HANSI$4);
            return target;
        }
    }
    
    /**
     * True if has "hAnsi" attribute
     */
    public boolean isSetHAnsi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANSI$4) != null;
        }
    }
    
    /**
     * Sets the "hAnsi" attribute
     */
    public void setHAnsi(java.lang.String hAnsi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANSI$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANSI$4);
            }
            target.setStringValue(hAnsi);
        }
    }
    
    /**
     * Sets (as xml) the "hAnsi" attribute
     */
    public void xsetHAnsi(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString hAnsi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(HANSI$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(HANSI$4);
            }
            target.set(hAnsi);
        }
    }
    
    /**
     * Unsets the "hAnsi" attribute
     */
    public void unsetHAnsi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANSI$4);
        }
    }
    
    /**
     * Gets the "eastAsia" attribute
     */
    public java.lang.String getEastAsia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EASTASIA$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eastAsia" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetEastAsia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(EASTASIA$6);
            return target;
        }
    }
    
    /**
     * True if has "eastAsia" attribute
     */
    public boolean isSetEastAsia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EASTASIA$6) != null;
        }
    }
    
    /**
     * Sets the "eastAsia" attribute
     */
    public void setEastAsia(java.lang.String eastAsia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EASTASIA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EASTASIA$6);
            }
            target.setStringValue(eastAsia);
        }
    }
    
    /**
     * Sets (as xml) the "eastAsia" attribute
     */
    public void xsetEastAsia(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString eastAsia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(EASTASIA$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(EASTASIA$6);
            }
            target.set(eastAsia);
        }
    }
    
    /**
     * Unsets the "eastAsia" attribute
     */
    public void unsetEastAsia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EASTASIA$6);
        }
    }
    
    /**
     * Gets the "cs" attribute
     */
    public java.lang.String getCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CS$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cs" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(CS$8);
            return target;
        }
    }
    
    /**
     * True if has "cs" attribute
     */
    public boolean isSetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CS$8) != null;
        }
    }
    
    /**
     * Sets the "cs" attribute
     */
    public void setCs(java.lang.String cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CS$8);
            }
            target.setStringValue(cs);
        }
    }
    
    /**
     * Sets (as xml) the "cs" attribute
     */
    public void xsetCs(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(CS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(CS$8);
            }
            target.set(cs);
        }
    }
    
    /**
     * Unsets the "cs" attribute
     */
    public void unsetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CS$8);
        }
    }
    
    /**
     * Gets the "asciiTheme" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum getAsciiTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASCIITHEME$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "asciiTheme" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme xgetAsciiTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().find_attribute_user(ASCIITHEME$10);
            return target;
        }
    }
    
    /**
     * True if has "asciiTheme" attribute
     */
    public boolean isSetAsciiTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASCIITHEME$10) != null;
        }
    }
    
    /**
     * Sets the "asciiTheme" attribute
     */
    public void setAsciiTheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum asciiTheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASCIITHEME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASCIITHEME$10);
            }
            target.setEnumValue(asciiTheme);
        }
    }
    
    /**
     * Sets (as xml) the "asciiTheme" attribute
     */
    public void xsetAsciiTheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme asciiTheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().find_attribute_user(ASCIITHEME$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().add_attribute_user(ASCIITHEME$10);
            }
            target.set(asciiTheme);
        }
    }
    
    /**
     * Unsets the "asciiTheme" attribute
     */
    public void unsetAsciiTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASCIITHEME$10);
        }
    }
    
    /**
     * Gets the "hAnsiTheme" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum getHAnsiTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANSITHEME$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hAnsiTheme" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme xgetHAnsiTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().find_attribute_user(HANSITHEME$12);
            return target;
        }
    }
    
    /**
     * True if has "hAnsiTheme" attribute
     */
    public boolean isSetHAnsiTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANSITHEME$12) != null;
        }
    }
    
    /**
     * Sets the "hAnsiTheme" attribute
     */
    public void setHAnsiTheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum hAnsiTheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANSITHEME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANSITHEME$12);
            }
            target.setEnumValue(hAnsiTheme);
        }
    }
    
    /**
     * Sets (as xml) the "hAnsiTheme" attribute
     */
    public void xsetHAnsiTheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme hAnsiTheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().find_attribute_user(HANSITHEME$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().add_attribute_user(HANSITHEME$12);
            }
            target.set(hAnsiTheme);
        }
    }
    
    /**
     * Unsets the "hAnsiTheme" attribute
     */
    public void unsetHAnsiTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANSITHEME$12);
        }
    }
    
    /**
     * Gets the "eastAsiaTheme" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum getEastAsiaTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EASTASIATHEME$14);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "eastAsiaTheme" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme xgetEastAsiaTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().find_attribute_user(EASTASIATHEME$14);
            return target;
        }
    }
    
    /**
     * True if has "eastAsiaTheme" attribute
     */
    public boolean isSetEastAsiaTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EASTASIATHEME$14) != null;
        }
    }
    
    /**
     * Sets the "eastAsiaTheme" attribute
     */
    public void setEastAsiaTheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum eastAsiaTheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EASTASIATHEME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EASTASIATHEME$14);
            }
            target.setEnumValue(eastAsiaTheme);
        }
    }
    
    /**
     * Sets (as xml) the "eastAsiaTheme" attribute
     */
    public void xsetEastAsiaTheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme eastAsiaTheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().find_attribute_user(EASTASIATHEME$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().add_attribute_user(EASTASIATHEME$14);
            }
            target.set(eastAsiaTheme);
        }
    }
    
    /**
     * Unsets the "eastAsiaTheme" attribute
     */
    public void unsetEastAsiaTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EASTASIATHEME$14);
        }
    }
    
    /**
     * Gets the "cstheme" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum getCstheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSTHEME$16);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cstheme" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme xgetCstheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().find_attribute_user(CSTHEME$16);
            return target;
        }
    }
    
    /**
     * True if has "cstheme" attribute
     */
    public boolean isSetCstheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CSTHEME$16) != null;
        }
    }
    
    /**
     * Sets the "cstheme" attribute
     */
    public void setCstheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme.Enum cstheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSTHEME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CSTHEME$16);
            }
            target.setEnumValue(cstheme);
        }
    }
    
    /**
     * Sets (as xml) the "cstheme" attribute
     */
    public void xsetCstheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme cstheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().find_attribute_user(CSTHEME$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme)get_store().add_attribute_user(CSTHEME$16);
            }
            target.set(cstheme);
        }
    }
    
    /**
     * Unsets the "cstheme" attribute
     */
    public void unsetCstheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CSTHEME$16);
        }
    }
}

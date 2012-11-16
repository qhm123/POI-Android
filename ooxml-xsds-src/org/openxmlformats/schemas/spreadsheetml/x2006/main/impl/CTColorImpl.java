/*
 * XML Type:  CT_Color
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Color(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor
{
    
    public CTColorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTO$0 = 
        new javax.xml.namespace.QName("", "auto");
    private static final javax.xml.namespace.QName INDEXED$2 = 
        new javax.xml.namespace.QName("", "indexed");
    private static final javax.xml.namespace.QName RGB$4 = 
        new javax.xml.namespace.QName("", "rgb");
    private static final javax.xml.namespace.QName THEME$6 = 
        new javax.xml.namespace.QName("", "theme");
    private static final javax.xml.namespace.QName TINT$8 = 
        new javax.xml.namespace.QName("", "tint");
    
    
    /**
     * Gets the "auto" attribute
     */
    public boolean getAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTO$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "auto" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTO$0);
            return target;
        }
    }
    
    /**
     * True if has "auto" attribute
     */
    public boolean isSetAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTO$0) != null;
        }
    }
    
    /**
     * Sets the "auto" attribute
     */
    public void setAuto(boolean auto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTO$0);
            }
            target.setBooleanValue(auto);
        }
    }
    
    /**
     * Sets (as xml) the "auto" attribute
     */
    public void xsetAuto(org.apache.xmlbeans.XmlBoolean auto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTO$0);
            }
            target.set(auto);
        }
    }
    
    /**
     * Unsets the "auto" attribute
     */
    public void unsetAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTO$0);
        }
    }
    
    /**
     * Gets the "indexed" attribute
     */
    public long getIndexed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXED$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "indexed" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIndexed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INDEXED$2);
            return target;
        }
    }
    
    /**
     * True if has "indexed" attribute
     */
    public boolean isSetIndexed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDEXED$2) != null;
        }
    }
    
    /**
     * Sets the "indexed" attribute
     */
    public void setIndexed(long indexed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEXED$2);
            }
            target.setLongValue(indexed);
        }
    }
    
    /**
     * Sets (as xml) the "indexed" attribute
     */
    public void xsetIndexed(org.apache.xmlbeans.XmlUnsignedInt indexed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INDEXED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(INDEXED$2);
            }
            target.set(indexed);
        }
    }
    
    /**
     * Unsets the "indexed" attribute
     */
    public void unsetIndexed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDEXED$2);
        }
    }
    
    /**
     * Gets the "rgb" attribute
     */
    public byte[] getRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RGB$4);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rgb" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(RGB$4);
            return target;
        }
    }
    
    /**
     * True if has "rgb" attribute
     */
    public boolean isSetRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RGB$4) != null;
        }
    }
    
    /**
     * Sets the "rgb" attribute
     */
    public void setRgb(byte[] rgb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RGB$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RGB$4);
            }
            target.setByteArrayValue(rgb);
        }
    }
    
    /**
     * Sets (as xml) the "rgb" attribute
     */
    public void xsetRgb(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex rgb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(RGB$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().add_attribute_user(RGB$4);
            }
            target.set(rgb);
        }
    }
    
    /**
     * Unsets the "rgb" attribute
     */
    public void unsetRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RGB$4);
        }
    }
    
    /**
     * Gets the "theme" attribute
     */
    public long getTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEME$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "theme" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(THEME$6);
            return target;
        }
    }
    
    /**
     * True if has "theme" attribute
     */
    public boolean isSetTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THEME$6) != null;
        }
    }
    
    /**
     * Sets the "theme" attribute
     */
    public void setTheme(long theme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THEME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THEME$6);
            }
            target.setLongValue(theme);
        }
    }
    
    /**
     * Sets (as xml) the "theme" attribute
     */
    public void xsetTheme(org.apache.xmlbeans.XmlUnsignedInt theme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(THEME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(THEME$6);
            }
            target.set(theme);
        }
    }
    
    /**
     * Unsets the "theme" attribute
     */
    public void unsetTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THEME$6);
        }
    }
    
    /**
     * Gets the "tint" attribute
     */
    public double getTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TINT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TINT$8);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "tint" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TINT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(TINT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "tint" attribute
     */
    public boolean isSetTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TINT$8) != null;
        }
    }
    
    /**
     * Sets the "tint" attribute
     */
    public void setTint(double tint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TINT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TINT$8);
            }
            target.setDoubleValue(tint);
        }
    }
    
    /**
     * Sets (as xml) the "tint" attribute
     */
    public void xsetTint(org.apache.xmlbeans.XmlDouble tint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TINT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TINT$8);
            }
            target.set(tint);
        }
    }
    
    /**
     * Unsets the "tint" attribute
     */
    public void unsetTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TINT$8);
        }
    }
}

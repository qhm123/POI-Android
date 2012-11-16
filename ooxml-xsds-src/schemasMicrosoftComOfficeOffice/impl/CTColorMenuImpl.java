/*
 * XML Type:  CT_ColorMenu
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTColorMenu
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_ColorMenu(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTColorMenuImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTColorMenu
{
    
    public CTColorMenuImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName STROKECOLOR$2 = 
        new javax.xml.namespace.QName("", "strokecolor");
    private static final javax.xml.namespace.QName FILLCOLOR$4 = 
        new javax.xml.namespace.QName("", "fillcolor");
    private static final javax.xml.namespace.QName SHADOWCOLOR$6 = 
        new javax.xml.namespace.QName("", "shadowcolor");
    private static final javax.xml.namespace.QName EXTRUSIONCOLOR$8 = 
        new javax.xml.namespace.QName("", "extrusioncolor");
    
    
    /**
     * Gets the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt.Enum getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STExt.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt xgetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$0);
            return target;
        }
    }
    
    /**
     * True if has "ext" attribute
     */
    public boolean isSetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXT$0) != null;
        }
    }
    
    /**
     * Sets the "ext" attribute
     */
    public void setExt(schemasMicrosoftComVml.STExt.Enum ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXT$0);
            }
            target.setEnumValue(ext);
        }
    }
    
    /**
     * Sets (as xml) the "ext" attribute
     */
    public void xsetExt(schemasMicrosoftComVml.STExt ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STExt)get_store().add_attribute_user(EXT$0);
            }
            target.set(ext);
        }
    }
    
    /**
     * Unsets the "ext" attribute
     */
    public void unsetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXT$0);
        }
    }
    
    /**
     * Gets the "strokecolor" attribute
     */
    public java.lang.String getStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKECOLOR$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "strokecolor" attribute
     */
    public schemasMicrosoftComOfficeOffice.STColorType xgetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(STROKECOLOR$2);
            return target;
        }
    }
    
    /**
     * True if has "strokecolor" attribute
     */
    public boolean isSetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STROKECOLOR$2) != null;
        }
    }
    
    /**
     * Sets the "strokecolor" attribute
     */
    public void setStrokecolor(java.lang.String strokecolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKECOLOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STROKECOLOR$2);
            }
            target.setStringValue(strokecolor);
        }
    }
    
    /**
     * Sets (as xml) the "strokecolor" attribute
     */
    public void xsetStrokecolor(schemasMicrosoftComOfficeOffice.STColorType strokecolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(STROKECOLOR$2);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().add_attribute_user(STROKECOLOR$2);
            }
            target.set(strokecolor);
        }
    }
    
    /**
     * Unsets the "strokecolor" attribute
     */
    public void unsetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STROKECOLOR$2);
        }
    }
    
    /**
     * Gets the "fillcolor" attribute
     */
    public java.lang.String getFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    public schemasMicrosoftComOfficeOffice.STColorType xgetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(FILLCOLOR$4);
            return target;
        }
    }
    
    /**
     * True if has "fillcolor" attribute
     */
    public boolean isSetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLCOLOR$4) != null;
        }
    }
    
    /**
     * Sets the "fillcolor" attribute
     */
    public void setFillcolor(java.lang.String fillcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLCOLOR$4);
            }
            target.setStringValue(fillcolor);
        }
    }
    
    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    public void xsetFillcolor(schemasMicrosoftComOfficeOffice.STColorType fillcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(FILLCOLOR$4);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().add_attribute_user(FILLCOLOR$4);
            }
            target.set(fillcolor);
        }
    }
    
    /**
     * Unsets the "fillcolor" attribute
     */
    public void unsetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLCOLOR$4);
        }
    }
    
    /**
     * Gets the "shadowcolor" attribute
     */
    public java.lang.String getShadowcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHADOWCOLOR$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shadowcolor" attribute
     */
    public schemasMicrosoftComOfficeOffice.STColorType xgetShadowcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(SHADOWCOLOR$6);
            return target;
        }
    }
    
    /**
     * True if has "shadowcolor" attribute
     */
    public boolean isSetShadowcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHADOWCOLOR$6) != null;
        }
    }
    
    /**
     * Sets the "shadowcolor" attribute
     */
    public void setShadowcolor(java.lang.String shadowcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHADOWCOLOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHADOWCOLOR$6);
            }
            target.setStringValue(shadowcolor);
        }
    }
    
    /**
     * Sets (as xml) the "shadowcolor" attribute
     */
    public void xsetShadowcolor(schemasMicrosoftComOfficeOffice.STColorType shadowcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(SHADOWCOLOR$6);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().add_attribute_user(SHADOWCOLOR$6);
            }
            target.set(shadowcolor);
        }
    }
    
    /**
     * Unsets the "shadowcolor" attribute
     */
    public void unsetShadowcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHADOWCOLOR$6);
        }
    }
    
    /**
     * Gets the "extrusioncolor" attribute
     */
    public java.lang.String getExtrusioncolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONCOLOR$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extrusioncolor" attribute
     */
    public schemasMicrosoftComOfficeOffice.STColorType xgetExtrusioncolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(EXTRUSIONCOLOR$8);
            return target;
        }
    }
    
    /**
     * True if has "extrusioncolor" attribute
     */
    public boolean isSetExtrusioncolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTRUSIONCOLOR$8) != null;
        }
    }
    
    /**
     * Sets the "extrusioncolor" attribute
     */
    public void setExtrusioncolor(java.lang.String extrusioncolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONCOLOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTRUSIONCOLOR$8);
            }
            target.setStringValue(extrusioncolor);
        }
    }
    
    /**
     * Sets (as xml) the "extrusioncolor" attribute
     */
    public void xsetExtrusioncolor(schemasMicrosoftComOfficeOffice.STColorType extrusioncolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(EXTRUSIONCOLOR$8);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().add_attribute_user(EXTRUSIONCOLOR$8);
            }
            target.set(extrusioncolor);
        }
    }
    
    /**
     * Unsets the "extrusioncolor" attribute
     */
    public void unsetExtrusioncolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTRUSIONCOLOR$8);
        }
    }
}

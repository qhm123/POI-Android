/*
 * XML Type:  CT_Border
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.CTBorder
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord.impl;
/**
 * An XML CT_Border(@urn:schemas-microsoft-com:office:word).
 *
 * This is a complex type.
 */
public class CTBorderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeWord.CTBorder
{
    
    public CTBorderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName WIDTH$2 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName SHADOW$4 = 
        new javax.xml.namespace.QName("", "shadow");
    
    
    /**
     * Gets the "type" attribute
     */
    public schemasMicrosoftComOfficeWord.STBorderType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeWord.STBorderType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public schemasMicrosoftComOfficeWord.STBorderType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STBorderType target = null;
            target = (schemasMicrosoftComOfficeWord.STBorderType)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(schemasMicrosoftComOfficeWord.STBorderType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(schemasMicrosoftComOfficeWord.STBorderType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STBorderType target = null;
            target = (schemasMicrosoftComOfficeWord.STBorderType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.STBorderType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "width" attribute
     */
    public java.math.BigInteger getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "width" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(WIDTH$2);
            return target;
        }
    }
    
    /**
     * True if has "width" attribute
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WIDTH$2) != null;
        }
    }
    
    /**
     * Sets the "width" attribute
     */
    public void setWidth(java.math.BigInteger width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$2);
            }
            target.setBigIntegerValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "width" attribute
     */
    public void xsetWidth(org.apache.xmlbeans.XmlPositiveInteger width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(WIDTH$2);
            }
            target.set(width);
        }
    }
    
    /**
     * Unsets the "width" attribute
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WIDTH$2);
        }
    }
    
    /**
     * Gets the "shadow" attribute
     */
    public schemasMicrosoftComOfficeWord.STBorderShadow.Enum getShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHADOW$4);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeWord.STBorderShadow.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "shadow" attribute
     */
    public schemasMicrosoftComOfficeWord.STBorderShadow xgetShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STBorderShadow target = null;
            target = (schemasMicrosoftComOfficeWord.STBorderShadow)get_store().find_attribute_user(SHADOW$4);
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
            return get_store().find_attribute_user(SHADOW$4) != null;
        }
    }
    
    /**
     * Sets the "shadow" attribute
     */
    public void setShadow(schemasMicrosoftComOfficeWord.STBorderShadow.Enum shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHADOW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHADOW$4);
            }
            target.setEnumValue(shadow);
        }
    }
    
    /**
     * Sets (as xml) the "shadow" attribute
     */
    public void xsetShadow(schemasMicrosoftComOfficeWord.STBorderShadow shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STBorderShadow target = null;
            target = (schemasMicrosoftComOfficeWord.STBorderShadow)get_store().find_attribute_user(SHADOW$4);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.STBorderShadow)get_store().add_attribute_user(SHADOW$4);
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
            get_store().remove_attribute(SHADOW$4);
        }
    }
}

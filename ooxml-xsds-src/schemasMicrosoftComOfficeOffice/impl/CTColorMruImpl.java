/*
 * XML Type:  CT_ColorMru
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTColorMru
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_ColorMru(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTColorMruImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTColorMru
{
    
    public CTColorMruImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName COLORS$2 = 
        new javax.xml.namespace.QName("", "colors");
    
    
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
     * Gets the "colors" attribute
     */
    public java.lang.String getColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORS$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "colors" attribute
     */
    public org.apache.xmlbeans.XmlString xgetColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLORS$2);
            return target;
        }
    }
    
    /**
     * True if has "colors" attribute
     */
    public boolean isSetColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLORS$2) != null;
        }
    }
    
    /**
     * Sets the "colors" attribute
     */
    public void setColors(java.lang.String colors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLORS$2);
            }
            target.setStringValue(colors);
        }
    }
    
    /**
     * Sets (as xml) the "colors" attribute
     */
    public void xsetColors(org.apache.xmlbeans.XmlString colors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLORS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLORS$2);
            }
            target.set(colors);
        }
    }
    
    /**
     * Unsets the "colors" attribute
     */
    public void unsetColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLORS$2);
        }
    }
}

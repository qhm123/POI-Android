/*
 * An XML attribute type.
 * Localname: insetmode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.InsetmodeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one insetmode(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class InsetmodeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.InsetmodeAttribute
{
    
    public InsetmodeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSETMODE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "insetmode");
    
    
    /**
     * Gets the "insetmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STInsetMode.Enum getInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETMODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSETMODE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STInsetMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "insetmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STInsetMode xgetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STInsetMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().find_attribute_user(INSETMODE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_default_attribute_value(INSETMODE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "insetmode" attribute
     */
    public boolean isSetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSETMODE$0) != null;
        }
    }
    
    /**
     * Sets the "insetmode" attribute
     */
    public void setInsetmode(schemasMicrosoftComOfficeOffice.STInsetMode.Enum insetmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETMODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSETMODE$0);
            }
            target.setEnumValue(insetmode);
        }
    }
    
    /**
     * Sets (as xml) the "insetmode" attribute
     */
    public void xsetInsetmode(schemasMicrosoftComOfficeOffice.STInsetMode insetmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STInsetMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().find_attribute_user(INSETMODE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().add_attribute_user(INSETMODE$0);
            }
            target.set(insetmode);
        }
    }
    
    /**
     * Unsets the "insetmode" attribute
     */
    public void unsetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSETMODE$0);
        }
    }
}

/*
 * An XML attribute type.
 * Localname: allowincell
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.AllowincellAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one allowincell(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class AllowincellAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.AllowincellAttribute
{
    
    public AllowincellAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLOWINCELL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "allowincell");
    
    
    /**
     * Gets the "allowincell" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWINCELL$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowincell" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWINCELL$0);
            return target;
        }
    }
    
    /**
     * True if has "allowincell" attribute
     */
    public boolean isSetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWINCELL$0) != null;
        }
    }
    
    /**
     * Sets the "allowincell" attribute
     */
    public void setAllowincell(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum allowincell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWINCELL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWINCELL$0);
            }
            target.setEnumValue(allowincell);
        }
    }
    
    /**
     * Sets (as xml) the "allowincell" attribute
     */
    public void xsetAllowincell(schemasMicrosoftComOfficeOffice.STTrueFalse allowincell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWINCELL$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ALLOWINCELL$0);
            }
            target.set(allowincell);
        }
    }
    
    /**
     * Unsets the "allowincell" attribute
     */
    public void unsetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWINCELL$0);
        }
    }
}

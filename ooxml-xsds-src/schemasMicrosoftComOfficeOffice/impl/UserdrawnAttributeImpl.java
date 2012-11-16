/*
 * An XML attribute type.
 * Localname: userdrawn
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.UserdrawnAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one userdrawn(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class UserdrawnAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.UserdrawnAttribute
{
    
    public UserdrawnAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERDRAWN$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "userdrawn");
    
    
    /**
     * Gets the "userdrawn" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getUserdrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "userdrawn" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetUserdrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERDRAWN$0);
            return target;
        }
    }
    
    /**
     * True if has "userdrawn" attribute
     */
    public boolean isSetUserdrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERDRAWN$0) != null;
        }
    }
    
    /**
     * Sets the "userdrawn" attribute
     */
    public void setUserdrawn(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum userdrawn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERDRAWN$0);
            }
            target.setEnumValue(userdrawn);
        }
    }
    
    /**
     * Sets (as xml) the "userdrawn" attribute
     */
    public void xsetUserdrawn(schemasMicrosoftComOfficeOffice.STTrueFalse userdrawn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERDRAWN$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(USERDRAWN$0);
            }
            target.set(userdrawn);
        }
    }
    
    /**
     * Unsets the "userdrawn" attribute
     */
    public void unsetUserdrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERDRAWN$0);
        }
    }
}

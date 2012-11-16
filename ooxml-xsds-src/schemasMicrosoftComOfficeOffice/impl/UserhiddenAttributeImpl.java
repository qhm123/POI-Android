/*
 * An XML attribute type.
 * Localname: userhidden
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.UserhiddenAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one userhidden(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class UserhiddenAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.UserhiddenAttribute
{
    
    public UserhiddenAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERHIDDEN$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "userhidden");
    
    
    /**
     * Gets the "userhidden" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getUserhidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERHIDDEN$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "userhidden" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetUserhidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERHIDDEN$0);
            return target;
        }
    }
    
    /**
     * True if has "userhidden" attribute
     */
    public boolean isSetUserhidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERHIDDEN$0) != null;
        }
    }
    
    /**
     * Sets the "userhidden" attribute
     */
    public void setUserhidden(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum userhidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERHIDDEN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERHIDDEN$0);
            }
            target.setEnumValue(userhidden);
        }
    }
    
    /**
     * Sets (as xml) the "userhidden" attribute
     */
    public void xsetUserhidden(schemasMicrosoftComOfficeOffice.STTrueFalse userhidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERHIDDEN$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(USERHIDDEN$0);
            }
            target.set(userhidden);
        }
    }
    
    /**
     * Unsets the "userhidden" attribute
     */
    public void unsetUserhidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERHIDDEN$0);
        }
    }
}

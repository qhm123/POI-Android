/*
 * An XML attribute type.
 * Localname: forcedash
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ForcedashAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one forcedash(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ForcedashAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ForcedashAttribute
{
    
    public ForcedashAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORCEDASH$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "forcedash");
    
    
    /**
     * Gets the "forcedash" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEDASH$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "forcedash" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(FORCEDASH$0);
            return target;
        }
    }
    
    /**
     * True if has "forcedash" attribute
     */
    public boolean isSetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORCEDASH$0) != null;
        }
    }
    
    /**
     * Sets the "forcedash" attribute
     */
    public void setForcedash(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum forcedash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEDASH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORCEDASH$0);
            }
            target.setEnumValue(forcedash);
        }
    }
    
    /**
     * Sets (as xml) the "forcedash" attribute
     */
    public void xsetForcedash(schemasMicrosoftComOfficeOffice.STTrueFalse forcedash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(FORCEDASH$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(FORCEDASH$0);
            }
            target.set(forcedash);
        }
    }
    
    /**
     * Unsets the "forcedash" attribute
     */
    public void unsetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORCEDASH$0);
        }
    }
}

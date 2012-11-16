/*
 * An XML attribute type.
 * Localname: button
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ButtonAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one button(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ButtonAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ButtonAttribute
{
    
    public ButtonAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUTTON$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "button");
    
    
    /**
     * Gets the "button" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUTTON$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "button" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BUTTON$0);
            return target;
        }
    }
    
    /**
     * True if has "button" attribute
     */
    public boolean isSetButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BUTTON$0) != null;
        }
    }
    
    /**
     * Sets the "button" attribute
     */
    public void setButton(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum button)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUTTON$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUTTON$0);
            }
            target.setEnumValue(button);
        }
    }
    
    /**
     * Sets (as xml) the "button" attribute
     */
    public void xsetButton(schemasMicrosoftComOfficeOffice.STTrueFalse button)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BUTTON$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(BUTTON$0);
            }
            target.set(button);
        }
    }
    
    /**
     * Unsets the "button" attribute
     */
    public void unsetButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BUTTON$0);
        }
    }
}

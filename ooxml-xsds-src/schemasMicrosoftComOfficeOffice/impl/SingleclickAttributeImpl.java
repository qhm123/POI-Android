/*
 * An XML attribute type.
 * Localname: singleclick
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.SingleclickAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one singleclick(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class SingleclickAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.SingleclickAttribute
{
    
    public SingleclickAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINGLECLICK$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "singleclick");
    
    
    /**
     * Gets the "singleclick" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getSingleclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLECLICK$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "singleclick" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetSingleclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SINGLECLICK$0);
            return target;
        }
    }
    
    /**
     * True if has "singleclick" attribute
     */
    public boolean isSetSingleclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SINGLECLICK$0) != null;
        }
    }
    
    /**
     * Sets the "singleclick" attribute
     */
    public void setSingleclick(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum singleclick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLECLICK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SINGLECLICK$0);
            }
            target.setEnumValue(singleclick);
        }
    }
    
    /**
     * Sets (as xml) the "singleclick" attribute
     */
    public void xsetSingleclick(schemasMicrosoftComOfficeOffice.STTrueFalse singleclick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SINGLECLICK$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(SINGLECLICK$0);
            }
            target.set(singleclick);
        }
    }
    
    /**
     * Unsets the "singleclick" attribute
     */
    public void unsetSingleclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SINGLECLICK$0);
        }
    }
}

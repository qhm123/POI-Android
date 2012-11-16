/*
 * An XML attribute type.
 * Localname: hr
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.HrAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one hr(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class HrAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.HrAttribute
{
    
    public HrAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HR$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hr");
    
    
    /**
     * Gets the "hr" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getHr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HR$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hr" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetHr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HR$0);
            return target;
        }
    }
    
    /**
     * True if has "hr" attribute
     */
    public boolean isSetHr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HR$0) != null;
        }
    }
    
    /**
     * Sets the "hr" attribute
     */
    public void setHr(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HR$0);
            }
            target.setEnumValue(hr);
        }
    }
    
    /**
     * Sets (as xml) the "hr" attribute
     */
    public void xsetHr(schemasMicrosoftComOfficeOffice.STTrueFalse hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HR$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HR$0);
            }
            target.set(hr);
        }
    }
    
    /**
     * Unsets the "hr" attribute
     */
    public void unsetHr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HR$0);
        }
    }
}

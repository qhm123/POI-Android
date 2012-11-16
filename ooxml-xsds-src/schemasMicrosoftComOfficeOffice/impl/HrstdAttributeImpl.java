/*
 * An XML attribute type.
 * Localname: hrstd
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.HrstdAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one hrstd(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class HrstdAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.HrstdAttribute
{
    
    public HrstdAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HRSTD$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrstd");
    
    
    /**
     * Gets the "hrstd" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getHrstd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRSTD$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hrstd" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetHrstd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRSTD$0);
            return target;
        }
    }
    
    /**
     * True if has "hrstd" attribute
     */
    public boolean isSetHrstd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRSTD$0) != null;
        }
    }
    
    /**
     * Sets the "hrstd" attribute
     */
    public void setHrstd(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum hrstd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRSTD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRSTD$0);
            }
            target.setEnumValue(hrstd);
        }
    }
    
    /**
     * Sets (as xml) the "hrstd" attribute
     */
    public void xsetHrstd(schemasMicrosoftComOfficeOffice.STTrueFalse hrstd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRSTD$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HRSTD$0);
            }
            target.set(hrstd);
        }
    }
    
    /**
     * Unsets the "hrstd" attribute
     */
    public void unsetHrstd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRSTD$0);
        }
    }
}

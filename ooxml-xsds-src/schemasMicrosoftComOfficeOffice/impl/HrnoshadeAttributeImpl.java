/*
 * An XML attribute type.
 * Localname: hrnoshade
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.HrnoshadeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one hrnoshade(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class HrnoshadeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.HrnoshadeAttribute
{
    
    public HrnoshadeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HRNOSHADE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrnoshade");
    
    
    /**
     * Gets the "hrnoshade" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getHrnoshade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRNOSHADE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hrnoshade" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetHrnoshade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRNOSHADE$0);
            return target;
        }
    }
    
    /**
     * True if has "hrnoshade" attribute
     */
    public boolean isSetHrnoshade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRNOSHADE$0) != null;
        }
    }
    
    /**
     * Sets the "hrnoshade" attribute
     */
    public void setHrnoshade(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum hrnoshade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRNOSHADE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRNOSHADE$0);
            }
            target.setEnumValue(hrnoshade);
        }
    }
    
    /**
     * Sets (as xml) the "hrnoshade" attribute
     */
    public void xsetHrnoshade(schemasMicrosoftComOfficeOffice.STTrueFalse hrnoshade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRNOSHADE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HRNOSHADE$0);
            }
            target.set(hrnoshade);
        }
    }
    
    /**
     * Unsets the "hrnoshade" attribute
     */
    public void unsetHrnoshade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRNOSHADE$0);
        }
    }
}

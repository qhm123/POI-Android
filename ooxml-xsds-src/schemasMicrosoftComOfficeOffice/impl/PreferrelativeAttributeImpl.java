/*
 * An XML attribute type.
 * Localname: preferrelative
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.PreferrelativeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one preferrelative(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class PreferrelativeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.PreferrelativeAttribute
{
    
    public PreferrelativeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREFERRELATIVE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "preferrelative");
    
    
    /**
     * Gets the "preferrelative" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getPreferrelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERRELATIVE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "preferrelative" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetPreferrelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(PREFERRELATIVE$0);
            return target;
        }
    }
    
    /**
     * True if has "preferrelative" attribute
     */
    public boolean isSetPreferrelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREFERRELATIVE$0) != null;
        }
    }
    
    /**
     * Sets the "preferrelative" attribute
     */
    public void setPreferrelative(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum preferrelative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERRELATIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFERRELATIVE$0);
            }
            target.setEnumValue(preferrelative);
        }
    }
    
    /**
     * Sets (as xml) the "preferrelative" attribute
     */
    public void xsetPreferrelative(schemasMicrosoftComOfficeOffice.STTrueFalse preferrelative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(PREFERRELATIVE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(PREFERRELATIVE$0);
            }
            target.set(preferrelative);
        }
    }
    
    /**
     * Unsets the "preferrelative" attribute
     */
    public void unsetPreferrelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREFERRELATIVE$0);
        }
    }
}

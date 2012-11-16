/*
 * An XML attribute type.
 * Localname: oleicon
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.OleiconAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one oleicon(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class OleiconAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.OleiconAttribute
{
    
    public OleiconAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLEICON$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "oleicon");
    
    
    /**
     * Gets the "oleicon" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getOleicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLEICON$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "oleicon" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetOleicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(OLEICON$0);
            return target;
        }
    }
    
    /**
     * True if has "oleicon" attribute
     */
    public boolean isSetOleicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLEICON$0) != null;
        }
    }
    
    /**
     * Sets the "oleicon" attribute
     */
    public void setOleicon(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum oleicon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLEICON$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLEICON$0);
            }
            target.setEnumValue(oleicon);
        }
    }
    
    /**
     * Sets (as xml) the "oleicon" attribute
     */
    public void xsetOleicon(schemasMicrosoftComOfficeOffice.STTrueFalse oleicon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(OLEICON$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(OLEICON$0);
            }
            target.set(oleicon);
        }
    }
    
    /**
     * Unsets the "oleicon" attribute
     */
    public void unsetOleicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLEICON$0);
        }
    }
}

/*
 * An XML attribute type.
 * Localname: connecttype
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ConnecttypeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one connecttype(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ConnecttypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ConnecttypeAttribute
{
    
    public ConnecttypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTTYPE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "connecttype");
    
    
    /**
     * Gets the "connecttype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STConnectType.Enum getConnecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTTYPE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STConnectType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "connecttype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STConnectType xgetConnecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STConnectType target = null;
            target = (schemasMicrosoftComOfficeOffice.STConnectType)get_store().find_attribute_user(CONNECTTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "connecttype" attribute
     */
    public boolean isSetConnecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "connecttype" attribute
     */
    public void setConnecttype(schemasMicrosoftComOfficeOffice.STConnectType.Enum connecttype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTTYPE$0);
            }
            target.setEnumValue(connecttype);
        }
    }
    
    /**
     * Sets (as xml) the "connecttype" attribute
     */
    public void xsetConnecttype(schemasMicrosoftComOfficeOffice.STConnectType connecttype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STConnectType target = null;
            target = (schemasMicrosoftComOfficeOffice.STConnectType)get_store().find_attribute_user(CONNECTTYPE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STConnectType)get_store().add_attribute_user(CONNECTTYPE$0);
            }
            target.set(connecttype);
        }
    }
    
    /**
     * Unsets the "connecttype" attribute
     */
    public void unsetConnecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTTYPE$0);
        }
    }
}

/*
 * An XML attribute type.
 * Localname: connectortype
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ConnectortypeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one connectortype(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ConnectortypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ConnectortypeAttribute
{
    
    public ConnectortypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTORTYPE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "connectortype");
    
    
    /**
     * Gets the "connectortype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STConnectorType.Enum getConnectortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTORTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONNECTORTYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STConnectorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectortype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STConnectorType xgetConnectortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STConnectorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STConnectorType)get_store().find_attribute_user(CONNECTORTYPE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STConnectorType)get_default_attribute_value(CONNECTORTYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "connectortype" attribute
     */
    public boolean isSetConnectortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTORTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "connectortype" attribute
     */
    public void setConnectortype(schemasMicrosoftComOfficeOffice.STConnectorType.Enum connectortype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTORTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTORTYPE$0);
            }
            target.setEnumValue(connectortype);
        }
    }
    
    /**
     * Sets (as xml) the "connectortype" attribute
     */
    public void xsetConnectortype(schemasMicrosoftComOfficeOffice.STConnectorType connectortype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STConnectorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STConnectorType)get_store().find_attribute_user(CONNECTORTYPE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STConnectorType)get_store().add_attribute_user(CONNECTORTYPE$0);
            }
            target.set(connectortype);
        }
    }
    
    /**
     * Unsets the "connectortype" attribute
     */
    public void unsetConnectortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTORTYPE$0);
        }
    }
}

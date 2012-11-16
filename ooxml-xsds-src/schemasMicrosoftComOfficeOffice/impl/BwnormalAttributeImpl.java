/*
 * An XML attribute type.
 * Localname: bwnormal
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BwnormalAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one bwnormal(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BwnormalAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BwnormalAttribute
{
    
    public BwnormalAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BWNORMAL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwnormal");
    
    
    /**
     * Gets the "bwnormal" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWNORMAL$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWNORMAL$0);
            return target;
        }
    }
    
    /**
     * True if has "bwnormal" attribute
     */
    public boolean isSetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWNORMAL$0) != null;
        }
    }
    
    /**
     * Sets the "bwnormal" attribute
     */
    public void setBwnormal(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwnormal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWNORMAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWNORMAL$0);
            }
            target.setEnumValue(bwnormal);
        }
    }
    
    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    public void xsetBwnormal(schemasMicrosoftComOfficeOffice.STBWMode bwnormal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWNORMAL$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWNORMAL$0);
            }
            target.set(bwnormal);
        }
    }
    
    /**
     * Unsets the "bwnormal" attribute
     */
    public void unsetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWNORMAL$0);
        }
    }
}

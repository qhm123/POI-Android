/*
 * An XML attribute type.
 * Localname: hralign
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.HralignAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one hralign(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class HralignAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.HralignAttribute
{
    
    public HralignAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HRALIGN$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hralign");
    
    
    /**
     * Gets the "hralign" attribute
     */
    public schemasMicrosoftComOfficeOffice.STHrAlign.Enum getHralign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRALIGN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HRALIGN$0);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STHrAlign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hralign" attribute
     */
    public schemasMicrosoftComOfficeOffice.STHrAlign xgetHralign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STHrAlign target = null;
            target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().find_attribute_user(HRALIGN$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_default_attribute_value(HRALIGN$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "hralign" attribute
     */
    public boolean isSetHralign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRALIGN$0) != null;
        }
    }
    
    /**
     * Sets the "hralign" attribute
     */
    public void setHralign(schemasMicrosoftComOfficeOffice.STHrAlign.Enum hralign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRALIGN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRALIGN$0);
            }
            target.setEnumValue(hralign);
        }
    }
    
    /**
     * Sets (as xml) the "hralign" attribute
     */
    public void xsetHralign(schemasMicrosoftComOfficeOffice.STHrAlign hralign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STHrAlign target = null;
            target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().find_attribute_user(HRALIGN$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().add_attribute_user(HRALIGN$0);
            }
            target.set(hralign);
        }
    }
    
    /**
     * Unsets the "hralign" attribute
     */
    public void unsetHralign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRALIGN$0);
        }
    }
}

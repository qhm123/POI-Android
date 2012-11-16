/*
 * An XML attribute type.
 * Localname: bwmode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BwmodeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one bwmode(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BwmodeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BwmodeAttribute
{
    
    public BwmodeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BWMODE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwmode");
    
    
    /**
     * Gets the "bwmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWMODE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWMODE$0);
            return target;
        }
    }
    
    /**
     * True if has "bwmode" attribute
     */
    public boolean isSetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWMODE$0) != null;
        }
    }
    
    /**
     * Sets the "bwmode" attribute
     */
    public void setBwmode(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWMODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWMODE$0);
            }
            target.setEnumValue(bwmode);
        }
    }
    
    /**
     * Sets (as xml) the "bwmode" attribute
     */
    public void xsetBwmode(schemasMicrosoftComOfficeOffice.STBWMode bwmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWMODE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWMODE$0);
            }
            target.set(bwmode);
        }
    }
    
    /**
     * Unsets the "bwmode" attribute
     */
    public void unsetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWMODE$0);
        }
    }
}

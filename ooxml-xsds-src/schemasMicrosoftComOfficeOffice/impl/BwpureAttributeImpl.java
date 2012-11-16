/*
 * An XML attribute type.
 * Localname: bwpure
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BwpureAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one bwpure(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BwpureAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BwpureAttribute
{
    
    public BwpureAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BWPURE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwpure");
    
    
    /**
     * Gets the "bwpure" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWPURE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwpure" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWPURE$0);
            return target;
        }
    }
    
    /**
     * True if has "bwpure" attribute
     */
    public boolean isSetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWPURE$0) != null;
        }
    }
    
    /**
     * Sets the "bwpure" attribute
     */
    public void setBwpure(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwpure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWPURE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWPURE$0);
            }
            target.setEnumValue(bwpure);
        }
    }
    
    /**
     * Sets (as xml) the "bwpure" attribute
     */
    public void xsetBwpure(schemasMicrosoftComOfficeOffice.STBWMode bwpure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWPURE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWPURE$0);
            }
            target.set(bwpure);
        }
    }
    
    /**
     * Unsets the "bwpure" attribute
     */
    public void unsetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWPURE$0);
        }
    }
}

/*
 * An XML attribute type.
 * Localname: allowoverlap
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.AllowoverlapAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one allowoverlap(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class AllowoverlapAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.AllowoverlapAttribute
{
    
    public AllowoverlapAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLOWOVERLAP$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "allowoverlap");
    
    
    /**
     * Gets the "allowoverlap" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAllowoverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWOVERLAP$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowoverlap" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAllowoverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWOVERLAP$0);
            return target;
        }
    }
    
    /**
     * True if has "allowoverlap" attribute
     */
    public boolean isSetAllowoverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWOVERLAP$0) != null;
        }
    }
    
    /**
     * Sets the "allowoverlap" attribute
     */
    public void setAllowoverlap(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum allowoverlap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWOVERLAP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWOVERLAP$0);
            }
            target.setEnumValue(allowoverlap);
        }
    }
    
    /**
     * Sets (as xml) the "allowoverlap" attribute
     */
    public void xsetAllowoverlap(schemasMicrosoftComOfficeOffice.STTrueFalse allowoverlap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWOVERLAP$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ALLOWOVERLAP$0);
            }
            target.set(allowoverlap);
        }
    }
    
    /**
     * Unsets the "allowoverlap" attribute
     */
    public void unsetAllowoverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWOVERLAP$0);
        }
    }
}

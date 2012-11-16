/*
 * An XML attribute type.
 * Localname: oned
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.OnedAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one oned(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class OnedAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.OnedAttribute
{
    
    public OnedAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONED$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "oned");
    
    
    /**
     * Gets the "oned" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getOned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONED$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "oned" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetOned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ONED$0);
            return target;
        }
    }
    
    /**
     * True if has "oned" attribute
     */
    public boolean isSetOned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ONED$0) != null;
        }
    }
    
    /**
     * Sets the "oned" attribute
     */
    public void setOned(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum oned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONED$0);
            }
            target.setEnumValue(oned);
        }
    }
    
    /**
     * Sets (as xml) the "oned" attribute
     */
    public void xsetOned(schemasMicrosoftComOfficeOffice.STTrueFalse oned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ONED$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ONED$0);
            }
            target.set(oned);
        }
    }
    
    /**
     * Unsets the "oned" attribute
     */
    public void unsetOned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ONED$0);
        }
    }
}

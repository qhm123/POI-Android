/*
 * An XML attribute type.
 * Localname: doubleclicknotify
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.DoubleclicknotifyAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one doubleclicknotify(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class DoubleclicknotifyAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.DoubleclicknotifyAttribute
{
    
    public DoubleclicknotifyAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOUBLECLICKNOTIFY$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "doubleclicknotify");
    
    
    /**
     * Gets the "doubleclicknotify" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getDoubleclicknotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLECLICKNOTIFY$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "doubleclicknotify" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetDoubleclicknotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DOUBLECLICKNOTIFY$0);
            return target;
        }
    }
    
    /**
     * True if has "doubleclicknotify" attribute
     */
    public boolean isSetDoubleclicknotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOUBLECLICKNOTIFY$0) != null;
        }
    }
    
    /**
     * Sets the "doubleclicknotify" attribute
     */
    public void setDoubleclicknotify(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum doubleclicknotify)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLECLICKNOTIFY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOUBLECLICKNOTIFY$0);
            }
            target.setEnumValue(doubleclicknotify);
        }
    }
    
    /**
     * Sets (as xml) the "doubleclicknotify" attribute
     */
    public void xsetDoubleclicknotify(schemasMicrosoftComOfficeOffice.STTrueFalse doubleclicknotify)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DOUBLECLICKNOTIFY$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(DOUBLECLICKNOTIFY$0);
            }
            target.set(doubleclicknotify);
        }
    }
    
    /**
     * Unsets the "doubleclicknotify" attribute
     */
    public void unsetDoubleclicknotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOUBLECLICKNOTIFY$0);
        }
    }
}

/*
 * An XML attribute type.
 * Localname: bullet
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BulletAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one bullet(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BulletAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BulletAttribute
{
    
    public BulletAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BULLET$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bullet");
    
    
    /**
     * Gets the "bullet" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BULLET$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bullet" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BULLET$0);
            return target;
        }
    }
    
    /**
     * True if has "bullet" attribute
     */
    public boolean isSetBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BULLET$0) != null;
        }
    }
    
    /**
     * Sets the "bullet" attribute
     */
    public void setBullet(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum bullet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BULLET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BULLET$0);
            }
            target.setEnumValue(bullet);
        }
    }
    
    /**
     * Sets (as xml) the "bullet" attribute
     */
    public void xsetBullet(schemasMicrosoftComOfficeOffice.STTrueFalse bullet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BULLET$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(BULLET$0);
            }
            target.set(bullet);
        }
    }
    
    /**
     * Unsets the "bullet" attribute
     */
    public void unsetBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BULLET$0);
        }
    }
}

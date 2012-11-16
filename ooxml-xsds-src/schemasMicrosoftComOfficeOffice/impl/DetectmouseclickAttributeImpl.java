/*
 * An XML attribute type.
 * Localname: detectmouseclick
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.DetectmouseclickAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one detectmouseclick(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class DetectmouseclickAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.DetectmouseclickAttribute
{
    
    public DetectmouseclickAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETECTMOUSECLICK$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "detectmouseclick");
    
    
    /**
     * Gets the "detectmouseclick" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getDetectmouseclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETECTMOUSECLICK$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "detectmouseclick" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetDetectmouseclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DETECTMOUSECLICK$0);
            return target;
        }
    }
    
    /**
     * True if has "detectmouseclick" attribute
     */
    public boolean isSetDetectmouseclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DETECTMOUSECLICK$0) != null;
        }
    }
    
    /**
     * Sets the "detectmouseclick" attribute
     */
    public void setDetectmouseclick(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum detectmouseclick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETECTMOUSECLICK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETECTMOUSECLICK$0);
            }
            target.setEnumValue(detectmouseclick);
        }
    }
    
    /**
     * Sets (as xml) the "detectmouseclick" attribute
     */
    public void xsetDetectmouseclick(schemasMicrosoftComOfficeOffice.STTrueFalse detectmouseclick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DETECTMOUSECLICK$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(DETECTMOUSECLICK$0);
            }
            target.set(detectmouseclick);
        }
    }
    
    /**
     * Unsets the "detectmouseclick" attribute
     */
    public void unsetDetectmouseclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DETECTMOUSECLICK$0);
        }
    }
}

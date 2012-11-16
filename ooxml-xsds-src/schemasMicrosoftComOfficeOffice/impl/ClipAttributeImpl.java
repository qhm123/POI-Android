/*
 * An XML attribute type.
 * Localname: clip
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ClipAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one clip(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ClipAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ClipAttribute
{
    
    public ClipAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIP$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "clip");
    
    
    /**
     * Gets the "clip" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getClip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIP$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "clip" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetClip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CLIP$0);
            return target;
        }
    }
    
    /**
     * True if has "clip" attribute
     */
    public boolean isSetClip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLIP$0) != null;
        }
    }
    
    /**
     * Sets the "clip" attribute
     */
    public void setClip(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum clip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIP$0);
            }
            target.setEnumValue(clip);
        }
    }
    
    /**
     * Sets (as xml) the "clip" attribute
     */
    public void xsetClip(schemasMicrosoftComOfficeOffice.STTrueFalse clip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CLIP$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(CLIP$0);
            }
            target.set(clip);
        }
    }
    
    /**
     * Unsets the "clip" attribute
     */
    public void unsetClip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLIP$0);
        }
    }
}

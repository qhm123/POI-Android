/*
 * An XML attribute type.
 * Localname: gfxdata
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.GfxdataAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one gfxdata(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class GfxdataAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.GfxdataAttribute
{
    
    public GfxdataAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GFXDATA$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "gfxdata");
    
    
    /**
     * Gets the "gfxdata" attribute
     */
    public byte[] getGfxdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GFXDATA$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "gfxdata" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetGfxdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(GFXDATA$0);
            return target;
        }
    }
    
    /**
     * True if has "gfxdata" attribute
     */
    public boolean isSetGfxdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GFXDATA$0) != null;
        }
    }
    
    /**
     * Sets the "gfxdata" attribute
     */
    public void setGfxdata(byte[] gfxdata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GFXDATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GFXDATA$0);
            }
            target.setByteArrayValue(gfxdata);
        }
    }
    
    /**
     * Sets (as xml) the "gfxdata" attribute
     */
    public void xsetGfxdata(org.apache.xmlbeans.XmlBase64Binary gfxdata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(GFXDATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(GFXDATA$0);
            }
            target.set(gfxdata);
        }
    }
    
    /**
     * Unsets the "gfxdata" attribute
     */
    public void unsetGfxdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GFXDATA$0);
        }
    }
}

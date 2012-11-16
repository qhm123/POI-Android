/*
 * An XML attribute type.
 * Localname: hrpct
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.HrpctAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one hrpct(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class HrpctAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.HrpctAttribute
{
    
    public HrpctAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HRPCT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrpct");
    
    
    /**
     * Gets the "hrpct" attribute
     */
    public float getHrpct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRPCT$0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "hrpct" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetHrpct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(HRPCT$0);
            return target;
        }
    }
    
    /**
     * True if has "hrpct" attribute
     */
    public boolean isSetHrpct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRPCT$0) != null;
        }
    }
    
    /**
     * Sets the "hrpct" attribute
     */
    public void setHrpct(float hrpct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRPCT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRPCT$0);
            }
            target.setFloatValue(hrpct);
        }
    }
    
    /**
     * Sets (as xml) the "hrpct" attribute
     */
    public void xsetHrpct(org.apache.xmlbeans.XmlFloat hrpct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(HRPCT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(HRPCT$0);
            }
            target.set(hrpct);
        }
    }
    
    /**
     * Unsets the "hrpct" attribute
     */
    public void unsetHrpct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRPCT$0);
        }
    }
}

/*
 * An XML attribute type.
 * Localname: opacity2
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.Opacity2Attribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one opacity2(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class Opacity2AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.Opacity2Attribute
{
    
    public Opacity2AttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPACITY2$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "opacity2");
    
    
    /**
     * Gets the "opacity2" attribute
     */
    public java.lang.String getOpacity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY2$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "opacity2" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOpacity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY2$0);
            return target;
        }
    }
    
    /**
     * True if has "opacity2" attribute
     */
    public boolean isSetOpacity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPACITY2$0) != null;
        }
    }
    
    /**
     * Sets the "opacity2" attribute
     */
    public void setOpacity2(java.lang.String opacity2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY2$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPACITY2$0);
            }
            target.setStringValue(opacity2);
        }
    }
    
    /**
     * Sets (as xml) the "opacity2" attribute
     */
    public void xsetOpacity2(org.apache.xmlbeans.XmlString opacity2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY2$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OPACITY2$0);
            }
            target.set(opacity2);
        }
    }
    
    /**
     * Unsets the "opacity2" attribute
     */
    public void unsetOpacity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPACITY2$0);
        }
    }
}

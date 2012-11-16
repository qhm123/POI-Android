/*
 * An XML attribute type.
 * Localname: borderleftcolor
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BorderleftcolorAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one borderleftcolor(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BorderleftcolorAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BorderleftcolorAttribute
{
    
    public BorderleftcolorAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERLEFTCOLOR$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderleftcolor");
    
    
    /**
     * Gets the "borderleftcolor" attribute
     */
    public java.lang.String getBorderleftcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERLEFTCOLOR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "borderleftcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBorderleftcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERLEFTCOLOR$0);
            return target;
        }
    }
    
    /**
     * True if has "borderleftcolor" attribute
     */
    public boolean isSetBorderleftcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERLEFTCOLOR$0) != null;
        }
    }
    
    /**
     * Sets the "borderleftcolor" attribute
     */
    public void setBorderleftcolor(java.lang.String borderleftcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERLEFTCOLOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERLEFTCOLOR$0);
            }
            target.setStringValue(borderleftcolor);
        }
    }
    
    /**
     * Sets (as xml) the "borderleftcolor" attribute
     */
    public void xsetBorderleftcolor(org.apache.xmlbeans.XmlString borderleftcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERLEFTCOLOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERLEFTCOLOR$0);
            }
            target.set(borderleftcolor);
        }
    }
    
    /**
     * Unsets the "borderleftcolor" attribute
     */
    public void unsetBorderleftcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERLEFTCOLOR$0);
        }
    }
}
